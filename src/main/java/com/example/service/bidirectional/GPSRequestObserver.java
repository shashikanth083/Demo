package com.example.service.bidirectional;

import com.example.gps.GPSRequest;
import com.example.gps.GPSResponse;
import io.grpc.stub.StreamObserver;

import java.time.Duration;
import java.time.LocalTime;

public class GPSRequestObserver implements StreamObserver<GPSRequest> {

    private final int totalDistance = 100;
    private LocalTime startTime = LocalTime.now();
    private int distanceTraveled;
    private final StreamObserver<GPSResponse> tripResponseStreamObserver;

    public GPSRequestObserver(StreamObserver<GPSResponse> tripResponseStreamObserver) {
        this.tripResponseStreamObserver = tripResponseStreamObserver;
    }

    @Override
    public void onNext(GPSRequest tripRequest) {
        this.distanceTraveled = Math.min(totalDistance, (this.distanceTraveled + tripRequest.getDistanceTravelled()));
        int remainingDistance = Math.max(0, (totalDistance - distanceTraveled));

        // the client has reached destination
        if(remainingDistance == 0){
            this.tripResponseStreamObserver.onNext(GPSResponse.getDefaultInstance());
            return;
        }
        if(distanceTraveled == totalDistance) {
            this.onError(new Throwable());
            return;
        }

        // client has not yet reached destination
        long elapsedDuration = Duration.between(this.startTime, LocalTime.now()).getSeconds();
        elapsedDuration = elapsedDuration < 1 ? 1 : elapsedDuration;
        double currentSpeed = (distanceTraveled * 1.0d) / elapsedDuration;
        int timeToReach = (int) (remainingDistance / currentSpeed);
        GPSResponse tripResponse = GPSResponse.newBuilder()
                .setRemainingDistance(remainingDistance)
                .setTimeToDestination(timeToReach)
                .build();
        this.tripResponseStreamObserver.onNext(tripResponse);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error: Already reached destination");
    }

    @Override
    public void onCompleted() {
        this.tripResponseStreamObserver.onCompleted();
        System.out.println("Client reached safely");
    }

}