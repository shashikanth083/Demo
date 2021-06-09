package com.example.server;

import com.example.service.clientStream.ClientStreamingService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ClientStreamingServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        // build gRPC server
        Server server = ServerBuilder.forPort(6566)
                .addService(new ClientStreamingService())
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
