package com.example.gps;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: gps.proto")
public final class NavigationServiceGrpc {

  private NavigationServiceGrpc() {}

  public static final String SERVICE_NAME = "gps.NavigationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.gps.GPSRequest,
      com.example.gps.GPSResponse> getNavigateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "navigate",
      requestType = com.example.gps.GPSRequest.class,
      responseType = com.example.gps.GPSResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.gps.GPSRequest,
      com.example.gps.GPSResponse> getNavigateMethod() {
    io.grpc.MethodDescriptor<com.example.gps.GPSRequest, com.example.gps.GPSResponse> getNavigateMethod;
    if ((getNavigateMethod = NavigationServiceGrpc.getNavigateMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getNavigateMethod = NavigationServiceGrpc.getNavigateMethod) == null) {
          NavigationServiceGrpc.getNavigateMethod = getNavigateMethod = 
              io.grpc.MethodDescriptor.<com.example.gps.GPSRequest, com.example.gps.GPSResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gps.NavigationService", "navigate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.gps.GPSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.gps.GPSResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("navigate"))
                  .build();
          }
        }
     }
     return getNavigateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NavigationServiceStub newStub(io.grpc.Channel channel) {
    return new NavigationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NavigationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NavigationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NavigationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NavigationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NavigationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * grpc bidirectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.gps.GPSRequest> navigate(
        io.grpc.stub.StreamObserver<com.example.gps.GPSResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getNavigateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNavigateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.gps.GPSRequest,
                com.example.gps.GPSResponse>(
                  this, METHODID_NAVIGATE)))
          .build();
    }
  }

  /**
   */
  public static final class NavigationServiceStub extends io.grpc.stub.AbstractStub<NavigationServiceStub> {
    private NavigationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NavigationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NavigationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * grpc bidirectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.gps.GPSRequest> navigate(
        io.grpc.stub.StreamObserver<com.example.gps.GPSResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getNavigateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NavigationServiceBlockingStub extends io.grpc.stub.AbstractStub<NavigationServiceBlockingStub> {
    private NavigationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NavigationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NavigationServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class NavigationServiceFutureStub extends io.grpc.stub.AbstractStub<NavigationServiceFutureStub> {
    private NavigationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NavigationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NavigationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NAVIGATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NavigationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NavigationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NAVIGATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.navigate(
              (io.grpc.stub.StreamObserver<com.example.gps.GPSResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NavigationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NavigationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.gps.Gps.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NavigationService");
    }
  }

  private static final class NavigationServiceFileDescriptorSupplier
      extends NavigationServiceBaseDescriptorSupplier {
    NavigationServiceFileDescriptorSupplier() {}
  }

  private static final class NavigationServiceMethodDescriptorSupplier
      extends NavigationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NavigationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NavigationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NavigationServiceFileDescriptorSupplier())
              .addMethod(getNavigateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
