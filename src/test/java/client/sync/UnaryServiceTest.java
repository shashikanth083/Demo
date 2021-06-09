package client.sync;

import com.example.calculator.CalculatorServiceGrpc;
import com.example.calculator.Input;
import com.example.calculator.Output;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnaryServiceTest {

    private ManagedChannel channel;
    private CalculatorServiceGrpc.CalculatorServiceBlockingStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("127.0.0.1", 6565)
                .usePlaintext()
                .build();
        this.clientStub = CalculatorServiceGrpc.newBlockingStub(channel);
    }

    @Test
    public void unaryServiceTest(){
        // build the request object
        Input input = Input.newBuilder()
                .setNumber(5)
                .build();

        // receive the response
        Output output = this.clientStub.findFactorial(input);

        //check the result
        System.out.println("factorial: " + output.getResult());
        Assert.assertEquals(120, output.getResult());
    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}