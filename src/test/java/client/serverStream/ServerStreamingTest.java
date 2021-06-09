package client.serverStream;

import com.example.online.Category;
import com.example.online.OnlineServiceGrpc;
import com.example.online.OrderRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServerStreamingTest {

    private ManagedChannel channel;
    private OnlineServiceGrpc.OnlineServiceStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 6567)
                .usePlaintext()
                .build();
        this.clientStub = OnlineServiceGrpc.newStub(channel);
    }

    @Test
    public void bookStreamingTest() throws InterruptedException {
        OrderRequest ebook = OrderRequest.newBuilder().setOrderCategory(Category.EBOOKS).build();
        this.clientStub.placeOrder(ebook, new OrderResponseStreamObserver());
    }

    @Test
    public void electronicStreamingTest() throws InterruptedException {
        OrderRequest electronic = OrderRequest.newBuilder().setOrderCategory(Category.ELECTRONICS).build();
        this.clientStub.placeOrder(electronic, new OrderResponseStreamObserver());
    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}
