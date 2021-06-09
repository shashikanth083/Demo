package com.example.service.clientStream;

import com.example.calculator.CalculatorServiceGrpc;
import com.example.calculator.Input;
import com.example.calculator.Output;
import io.grpc.stub.StreamObserver;

public class ClientStreamingService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public StreamObserver<Input> sumAll(StreamObserver<Output> responseObserver) {
        return new InputStreamObserver(responseObserver);
    }

}
