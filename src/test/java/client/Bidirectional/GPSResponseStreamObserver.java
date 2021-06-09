package client.Bidirectional;

import com.example.gps.GPSRequest;
import com.example.gps.GPSResponse;
import com.google.common.util.concurrent.Uninterruptibles;
import io.grpc.stub.StreamObserver;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class GPSResponseStreamObserver implements StreamObserver<GPSResponse> {

    private StreamObserver<GPSRequest> requestStreamObserver;

    @Override
    public void onNext(GPSResponse gpsResponse) {
        if(gpsResponse.getRemainingDistance() > 0){
            this.drive();
            this.print(gpsResponse);
        }else{
            this.requestStreamObserver.onCompleted();
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        System.out.println("Trip Completed");
    }

    public void startTrip(StreamObserver<GPSRequest> requestStreamObserver){
        this.requestStreamObserver = requestStreamObserver;
        this.drive();
    }

    private void drive(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        GPSRequest tripRequest = GPSRequest.newBuilder().setDistanceTravelled(ThreadLocalRandom.current().nextInt(1, 10)).build();
        requestStreamObserver.onNext(tripRequest);
    }

    private void print(GPSResponse tripResponse){
        System.out.println(LocalTime.now() + ": Remaining Distance : " + tripResponse.getRemainingDistance());
        System.out.println(LocalTime.now() + ": Time To Reach (sec): " + tripResponse.getTimeToDestination());
        System.out.println("------------------------------");
    }

}