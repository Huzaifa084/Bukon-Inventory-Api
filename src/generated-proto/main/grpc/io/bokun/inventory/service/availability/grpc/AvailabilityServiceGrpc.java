package io.bokun.inventory.service.availability.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: availability_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AvailabilityServiceGrpc {

  private AvailabilityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.bokun.inventory.service.availability.grpc.AvailabilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest,
      io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse> getGetAvailableProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableProducts",
      requestType = io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest.class,
      responseType = io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest,
      io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse> getGetAvailableProductsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest, io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse> getGetAvailableProductsMethod;
    if ((getGetAvailableProductsMethod = AvailabilityServiceGrpc.getGetAvailableProductsMethod) == null) {
      synchronized (AvailabilityServiceGrpc.class) {
        if ((getGetAvailableProductsMethod = AvailabilityServiceGrpc.getGetAvailableProductsMethod) == null) {
          AvailabilityServiceGrpc.getGetAvailableProductsMethod = getGetAvailableProductsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest, io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AvailabilityServiceMethodDescriptorSupplier("GetAvailableProducts"))
              .build();
        }
      }
    }
    return getGetAvailableProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest,
      io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getGetProductAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductAvailability",
      requestType = io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest,
      io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getGetProductAvailabilityMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest, io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getGetProductAvailabilityMethod;
    if ((getGetProductAvailabilityMethod = AvailabilityServiceGrpc.getGetProductAvailabilityMethod) == null) {
      synchronized (AvailabilityServiceGrpc.class) {
        if ((getGetProductAvailabilityMethod = AvailabilityServiceGrpc.getGetProductAvailabilityMethod) == null) {
          AvailabilityServiceGrpc.getGetProductAvailabilityMethod = getGetProductAvailabilityMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest, io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AvailabilityServiceMethodDescriptorSupplier("GetProductAvailability"))
              .build();
        }
      }
    }
    return getGetProductAvailabilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AvailabilityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AvailabilityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AvailabilityServiceStub>() {
        @java.lang.Override
        public AvailabilityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AvailabilityServiceStub(channel, callOptions);
        }
      };
    return AvailabilityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AvailabilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AvailabilityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AvailabilityServiceBlockingStub>() {
        @java.lang.Override
        public AvailabilityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AvailabilityServiceBlockingStub(channel, callOptions);
        }
      };
    return AvailabilityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AvailabilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AvailabilityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AvailabilityServiceFutureStub>() {
        @java.lang.Override
        public AvailabilityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AvailabilityServiceFutureStub(channel, callOptions);
        }
      };
    return AvailabilityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get available products (of specific type) over a date range, supplying a set of Bokun product IDs.
     * Returned set of Bokun product IDs will refer to available products; this will be a subset of requested products.
     * </pre>
     */
    default void getAvailableProducts(io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get detailed info about requested single Bokun product.
     * This returns not only available dates/time but also pickup times as well as pricing for requested range.
     * </pre>
     */
    default void getProductAvailability(io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductAvailabilityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AvailabilityService.
   */
  public static abstract class AvailabilityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AvailabilityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AvailabilityService.
   */
  public static final class AvailabilityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AvailabilityServiceStub> {
    private AvailabilityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailabilityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AvailabilityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available products (of specific type) over a date range, supplying a set of Bokun product IDs.
     * Returned set of Bokun product IDs will refer to available products; this will be a subset of requested products.
     * </pre>
     */
    public void getAvailableProducts(io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAvailableProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get detailed info about requested single Bokun product.
     * This returns not only available dates/time but also pickup times as well as pricing for requested range.
     * </pre>
     */
    public void getProductAvailability(io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AvailabilityService.
   */
  public static final class AvailabilityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AvailabilityServiceBlockingStub> {
    private AvailabilityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailabilityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AvailabilityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available products (of specific type) over a date range, supplying a set of Bokun product IDs.
     * Returned set of Bokun product IDs will refer to available products; this will be a subset of requested products.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse> getAvailableProducts(
        io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAvailableProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get detailed info about requested single Bokun product.
     * This returns not only available dates/time but also pickup times as well as pricing for requested range.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getProductAvailability(
        io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AvailabilityService.
   */
  public static final class AvailabilityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AvailabilityServiceFutureStub> {
    private AvailabilityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailabilityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AvailabilityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_AVAILABLE_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT_AVAILABILITY = 1;

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
        case METHODID_GET_AVAILABLE_PRODUCTS:
          serviceImpl.getAvailableProducts((io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_AVAILABILITY:
          serviceImpl.getProductAvailability((io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse>) responseObserver);
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
          getGetAvailableProductsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.service.availability.grpc.GetAvailableProductsRequest,
              io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse>(
                service, METHODID_GET_AVAILABLE_PRODUCTS)))
        .addMethod(
          getGetProductAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.service.availability.grpc.GetProductAvailabilityRequest,
              io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse>(
                service, METHODID_GET_PRODUCT_AVAILABILITY)))
        .build();
  }

  private static abstract class AvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AvailabilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bokun.inventory.service.availability.grpc.AvailabilityServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AvailabilityService");
    }
  }

  private static final class AvailabilityServiceFileDescriptorSupplier
      extends AvailabilityServiceBaseDescriptorSupplier {
    AvailabilityServiceFileDescriptorSupplier() {}
  }

  private static final class AvailabilityServiceMethodDescriptorSupplier
      extends AvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AvailabilityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AvailabilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AvailabilityServiceFileDescriptorSupplier())
              .addMethod(getGetAvailableProductsMethod())
              .addMethod(getGetProductAvailabilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
