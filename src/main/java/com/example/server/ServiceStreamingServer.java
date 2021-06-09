package com.example.server;

import com.example.service.bidirectional.NavigationService;
import com.example.service.serverStream.GetOnlineService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServiceStreamingServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        // build gRPC server
        Server server = ServerBuilder.forPort(6567)
                .addService(new GetOnlineService())
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
