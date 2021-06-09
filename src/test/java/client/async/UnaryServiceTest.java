package client.async;

import com.example.calculator.CalculatorServiceGrpc;
import com.example.calculator.Input;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnaryServiceTest {

    private ManagedChannel channel;
    private CalculatorServiceGrpc.CalculatorServiceStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        this.clientStub = CalculatorServiceGrpc.newStub(channel);
    }

    @Test
    public void unaryServiceTest(){
        // build the request object
        Input input = Input.newBuilder()
                .setNumber(5)
                .build();

        // receive the response
        this.clientStub.findFactorial(input, new OutputStreamObserver());


    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}
