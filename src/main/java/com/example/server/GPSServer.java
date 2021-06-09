package com.example.server;

import com.example.service.bidirectional.NavigationService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GPSServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        // build gRPC server
        Server server = ServerBuilder.forPort(6568)
                .addService(new NavigationService())
                .build();

        // start
        server.start();

        // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("GPS is shutting down!");
            server.shutdown();
        }));

        server.awaitTermination();

    }

}
