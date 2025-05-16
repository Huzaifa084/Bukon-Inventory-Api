package io.bokun.inventory.service.provisioning.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: provisioning_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProvisioningServiceGrpc {

  private ProvisioningServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.bokun.inventory.service.provisioning.grpc.ProvisioningService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest,
      io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse> getGetBuildInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBuildInfo",
      requestType = io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest.class,
      responseType = io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest,
      io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse> getGetBuildInfoMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest, io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse> getGetBuildInfoMethod;
    if ((getGetBuildInfoMethod = ProvisioningServiceGrpc.getGetBuildInfoMethod) == null) {
      synchronized (ProvisioningServiceGrpc.class) {
        if ((getGetBuildInfoMethod = ProvisioningServiceGrpc.getGetBuildInfoMethod) == null) {
          ProvisioningServiceGrpc.getGetBuildInfoMethod = getGetBuildInfoMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest, io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBuildInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProvisioningServiceMethodDescriptorSupplier("GetBuildInfo"))
              .build();
        }
      }
    }
    return getGetBuildInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProvisioningServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceStub>() {
        @java.lang.Override
        public ProvisioningServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProvisioningServiceStub(channel, callOptions);
        }
      };
    return ProvisioningServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProvisioningServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceBlockingStub>() {
        @java.lang.Override
        public ProvisioningServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProvisioningServiceBlockingStub(channel, callOptions);
        }
      };
    return ProvisioningServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProvisioningServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceFutureStub>() {
        @java.lang.Override
        public ProvisioningServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProvisioningServiceFutureStub(channel, callOptions);
        }
      };
    return ProvisioningServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns IS build information
     * </pre>
     */
    default void getBuildInfo(io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBuildInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProvisioningService.
   */
  public static abstract class ProvisioningServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProvisioningServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProvisioningService.
   */
  public static final class ProvisioningServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProvisioningServiceStub> {
    private ProvisioningServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisioningServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProvisioningServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns IS build information
     * </pre>
     */
    public void getBuildInfo(io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBuildInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProvisioningService.
   */
  public static final class ProvisioningServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProvisioningServiceBlockingStub> {
    private ProvisioningServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisioningServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProvisioningServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns IS build information
     * </pre>
     */
    public io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse getBuildInfo(io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBuildInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProvisioningService.
   */
  public static final class ProvisioningServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProvisioningServiceFutureStub> {
    private ProvisioningServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisioningServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProvisioningServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns IS build information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse> getBuildInfo(
        io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBuildInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BUILD_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BUILD_INFO:
          serviceImpl.getBuildInfo((io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetBuildInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.provisioning.grpc.GetBuildInfoRequest,
              io.bokun.inventory.service.provisioning.grpc.GetBuildInfoResponse>(
                service, METHODID_GET_BUILD_INFO)))
        .build();
  }

  private static abstract class ProvisioningServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProvisioningServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bokun.inventory.service.provisioning.grpc.ProvisioningServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProvisioningService");
    }
  }

  private static final class ProvisioningServiceFileDescriptorSupplier
      extends ProvisioningServiceBaseDescriptorSupplier {
    ProvisioningServiceFileDescriptorSupplier() {}
  }

  private static final class ProvisioningServiceMethodDescriptorSupplier
      extends ProvisioningServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProvisioningServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProvisioningServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProvisioningServiceFileDescriptorSupplier())
              .addMethod(getGetBuildInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
