package com.example.service.bidirectional;

import com.example.gps.GPSRequest;
import com.example.gps.GPSResponse;
import com.example.gps.NavigationServiceGrpc;
import io.grpc.stub.StreamObserver;

public class NavigationService extends NavigationServiceGrpc.NavigationServiceImplBase {

    @Override
    public StreamObserver<GPSRequest> navigate(StreamObserver<GPSResponse> responseObserver) {
        return new GPSRequestObserver(responseObserver);
    }

}