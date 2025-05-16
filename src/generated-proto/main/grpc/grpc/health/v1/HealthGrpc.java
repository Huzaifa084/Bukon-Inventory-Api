package grpc.health.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: health_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HealthGrpc {

  private HealthGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.health.v1.Health";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.health.v1.HealthService.HealthCheckRequest,
      grpc.health.v1.HealthService.HealthCheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = grpc.health.v1.HealthService.HealthCheckRequest.class,
      responseType = grpc.health.v1.HealthService.HealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.health.v1.HealthService.HealthCheckRequest,
      grpc.health.v1.HealthService.HealthCheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<grpc.health.v1.HealthService.HealthCheckRequest, grpc.health.v1.HealthService.HealthCheckResponse> getCheckMethod;
    if ((getCheckMethod = HealthGrpc.getCheckMethod) == null) {
      synchronized (HealthGrpc.class) {
        if ((getCheckMethod = HealthGrpc.getCheckMethod) == null) {
          HealthGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<grpc.health.v1.HealthService.HealthCheckRequest, grpc.health.v1.HealthService.HealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.health.v1.HealthService.HealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.health.v1.HealthService.HealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.health.v1.HealthService.ListHealthyPluginsRequest,
      grpc.health.v1.HealthService.PluginDefinitionId> getListHealthyPluginsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHealthyPlugins",
      requestType = grpc.health.v1.HealthService.ListHealthyPluginsRequest.class,
      responseType = grpc.health.v1.HealthService.PluginDefinitionId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.health.v1.HealthService.ListHealthyPluginsRequest,
      grpc.health.v1.HealthService.PluginDefinitionId> getListHealthyPluginsMethod() {
    io.grpc.MethodDescriptor<grpc.health.v1.HealthService.ListHealthyPluginsRequest, grpc.health.v1.HealthService.PluginDefinitionId> getListHealthyPluginsMethod;
    if ((getListHealthyPluginsMethod = HealthGrpc.getListHealthyPluginsMethod) == null) {
      synchronized (HealthGrpc.class) {
        if ((getListHealthyPluginsMethod = HealthGrpc.getListHealthyPluginsMethod) == null) {
          HealthGrpc.getListHealthyPluginsMethod = getListHealthyPluginsMethod =
              io.grpc.MethodDescriptor.<grpc.health.v1.HealthService.ListHealthyPluginsRequest, grpc.health.v1.HealthService.PluginDefinitionId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHealthyPlugins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.health.v1.HealthService.ListHealthyPluginsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.health.v1.HealthService.PluginDefinitionId.getDefaultInstance()))
              .setSchemaDescriptor(new HealthMethodDescriptorSupplier("ListHealthyPlugins"))
              .build();
        }
      }
    }
    return getListHealthyPluginsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthStub>() {
        @java.lang.Override
        public HealthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthStub(channel, callOptions);
        }
      };
    return HealthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthBlockingStub>() {
        @java.lang.Override
        public HealthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthBlockingStub(channel, callOptions);
        }
      };
    return HealthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthFutureStub>() {
        @java.lang.Override
        public HealthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthFutureStub(channel, callOptions);
        }
      };
    return HealthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void check(grpc.health.v1.HealthService.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthService.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * List definitions which are not only registered but also available. This works hand-in-hand with PluginService::listDefinitions
     * </pre>
     */
    default void listHealthyPlugins(grpc.health.v1.HealthService.ListHealthyPluginsRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthService.PluginDefinitionId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHealthyPluginsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Health.
   */
  public static abstract class HealthImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HealthGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Health.
   */
  public static final class HealthStub
      extends io.grpc.stub.AbstractAsyncStub<HealthStub> {
    private HealthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthStub(channel, callOptions);
    }

    /**
     */
    public void check(grpc.health.v1.HealthService.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthService.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List definitions which are not only registered but also available. This works hand-in-hand with PluginService::listDefinitions
     * </pre>
     */
    public void listHealthyPlugins(grpc.health.v1.HealthService.ListHealthyPluginsRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthService.PluginDefinitionId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListHealthyPluginsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Health.
   */
  public static final class HealthBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HealthBlockingStub> {
    private HealthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.health.v1.HealthService.HealthCheckResponse check(grpc.health.v1.HealthService.HealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List definitions which are not only registered but also available. This works hand-in-hand with PluginService::listDefinitions
     * </pre>
     */
    public java.util.Iterator<grpc.health.v1.HealthService.PluginDefinitionId> listHealthyPlugins(
        grpc.health.v1.HealthService.ListHealthyPluginsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListHealthyPluginsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Health.
   */
  public static final class HealthFutureStub
      extends io.grpc.stub.AbstractFutureStub<HealthFutureStub> {
    private HealthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.health.v1.HealthService.HealthCheckResponse> check(
        grpc.health.v1.HealthService.HealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_LIST_HEALTHY_PLUGINS = 1;

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
        case METHODID_CHECK:
          serviceImpl.check((grpc.health.v1.HealthService.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<grpc.health.v1.HealthService.HealthCheckResponse>) responseObserver);
          break;
        case METHODID_LIST_HEALTHY_PLUGINS:
          serviceImpl.listHealthyPlugins((grpc.health.v1.HealthService.ListHealthyPluginsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.health.v1.HealthService.PluginDefinitionId>) responseObserver);
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
          getCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.health.v1.HealthService.HealthCheckRequest,
              grpc.health.v1.HealthService.HealthCheckResponse>(
                service, METHODID_CHECK)))
        .addMethod(
          getListHealthyPluginsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              grpc.health.v1.HealthService.ListHealthyPluginsRequest,
              grpc.health.v1.HealthService.PluginDefinitionId>(
                service, METHODID_LIST_HEALTHY_PLUGINS)))
        .build();
  }

  private static abstract class HealthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.health.v1.HealthService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Health");
    }
  }

  private static final class HealthFileDescriptorSupplier
      extends HealthBaseDescriptorSupplier {
    HealthFileDescriptorSupplier() {}
  }

  private static final class HealthMethodDescriptorSupplier
      extends HealthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HealthMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HealthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .addMethod(getListHealthyPluginsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
