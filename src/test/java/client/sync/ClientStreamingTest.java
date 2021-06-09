package client.sync;

import client.async.OutputStreamObserver;
import com.example.calculator.CalculatorServiceGrpc;
import com.example.calculator.Input;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientStreamingTest {

    private ManagedChannel channel;
    private CalculatorServiceGrpc.CalculatorServiceStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 6566)
                .usePlaintext()
                .build();
        this.clientStub = CalculatorServiceGrpc.newStub(channel);
    }

    @Test
    public void clientStreamingSumTest() throws InterruptedException {

        // pass the output stream observer & receive the input stream observer
        StreamObserver<Input> inputStreamObserver = this.clientStub.sumAll(new OutputStreamObserver());

        for (int i = 0; i <= 100; i++) {
            // build the request object
            Input input = Input.newBuilder()
                    .setNumber(i)
                    .build();
            // pass the request object via input stream observer
            inputStreamObserver.onNext(input);
        }

        // client side is done. this method makes the server respond with the sum value
        inputStreamObserver.onCompleted();
        System.out.println(inputStreamObserver.toString());


    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}
