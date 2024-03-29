package com.example.service.unary;

import com.example.calculator.CalculatorServiceGrpc;
import com.example.calculator.Input;
import com.example.calculator.Output;
import io.grpc.stub.StreamObserver;

public class UnaryCalculatorService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void findFactorial(Input request, StreamObserver<Output> responseObserver) {
        int input = request.getNumber();

        long result = this.factorial(input);

        Output output = Output.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(output);
        responseObserver.onCompleted();
    }

    private long factorial(int number){
        if(number == 0)
            return 1;
        return number * factorial(number - 1);
    }

}