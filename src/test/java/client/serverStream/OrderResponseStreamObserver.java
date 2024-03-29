package client.serverStream;

import com.example.online.OrderResponse;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;

public class OrderResponseStreamObserver implements StreamObserver<OrderResponse> {

    @Override
    public void onNext(OrderResponse orderResponse) {
        System.out.println(
                LocalDateTime.now() + " : " + orderResponse.getOrderStatus()
        );
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }

}
