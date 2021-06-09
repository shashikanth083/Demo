package client.Bidirectional;

import com.example.gps.GPSRequest;
import com.example.gps.NavigationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BiDirectionalStreamingTest {

    private ManagedChannel channel;
    private NavigationServiceGrpc.NavigationServiceStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 6568)
                .usePlaintext()
                .build();
        this.clientStub = NavigationServiceGrpc.newStub(channel);
    }

    @Test
    public void tripTest() throws InterruptedException {
        GPSResponseStreamObserver tripResponseStreamObserver = new GPSResponseStreamObserver();
        StreamObserver<GPSRequest> requestStreamObserver = this.clientStub.navigate(tripResponseStreamObserver);
        tripResponseStreamObserver.startTrip(requestStreamObserver);
    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}
