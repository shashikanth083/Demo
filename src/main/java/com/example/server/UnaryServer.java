package com.example.server;

import com.example.service.unary.UnaryCalculatorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class UnaryServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        // build gRPC server
        Server server = ServerBuilder.forPort(6565)
                .addService(new UnaryCalculatorService())
                .build();

        // start
        server.start();

        // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("gRPC server is shutting down!");
            server.shutdown();
        }));

        server.awaitTermination();

    }

}
