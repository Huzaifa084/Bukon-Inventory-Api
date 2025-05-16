package io.bokun.inventory.service.product.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: product_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.bokun.inventory.service.product.grpc.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.SearchProductsRequest,
      io.bokun.inventory.common.api.grpc.BasicProductInfo> getSearchProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchProducts",
      requestType = io.bokun.inventory.service.product.grpc.SearchProductsRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.BasicProductInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.SearchProductsRequest,
      io.bokun.inventory.common.api.grpc.BasicProductInfo> getSearchProductsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.SearchProductsRequest, io.bokun.inventory.common.api.grpc.BasicProductInfo> getSearchProductsMethod;
    if ((getSearchProductsMethod = ProductServiceGrpc.getSearchProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSearchProductsMethod = ProductServiceGrpc.getSearchProductsMethod) == null) {
          ProductServiceGrpc.getSearchProductsMethod = getSearchProductsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.product.grpc.SearchProductsRequest, io.bokun.inventory.common.api.grpc.BasicProductInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.SearchProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.BasicProductInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("SearchProducts"))
              .build();
        }
      }
    }
    return getSearchProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.GetProductByIdRequest,
      io.bokun.inventory.common.api.grpc.ProductDescription> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductById",
      requestType = io.bokun.inventory.service.product.grpc.GetProductByIdRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ProductDescription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.GetProductByIdRequest,
      io.bokun.inventory.common.api.grpc.ProductDescription> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.GetProductByIdRequest, io.bokun.inventory.common.api.grpc.ProductDescription> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
          ProductServiceGrpc.getGetProductByIdMethod = getGetProductByIdMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.product.grpc.GetProductByIdRequest, io.bokun.inventory.common.api.grpc.ProductDescription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.GetProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ProductDescription.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductById"))
              .build();
        }
      }
    }
    return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.ProductMapping,
      io.bokun.inventory.service.product.grpc.ProductMapping> getUpsertProductMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertProductMapping",
      requestType = io.bokun.inventory.service.product.grpc.ProductMapping.class,
      responseType = io.bokun.inventory.service.product.grpc.ProductMapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.ProductMapping,
      io.bokun.inventory.service.product.grpc.ProductMapping> getUpsertProductMappingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.ProductMapping, io.bokun.inventory.service.product.grpc.ProductMapping> getUpsertProductMappingMethod;
    if ((getUpsertProductMappingMethod = ProductServiceGrpc.getUpsertProductMappingMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpsertProductMappingMethod = ProductServiceGrpc.getUpsertProductMappingMethod) == null) {
          ProductServiceGrpc.getUpsertProductMappingMethod = getUpsertProductMappingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.product.grpc.ProductMapping, io.bokun.inventory.service.product.grpc.ProductMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertProductMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.ProductMapping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.ProductMapping.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("UpsertProductMapping"))
              .build();
        }
      }
    }
    return getUpsertProductMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.GetProductMappingsRequest,
      io.bokun.inventory.service.product.grpc.ProductMapping> getGetProductMappingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductMappings",
      requestType = io.bokun.inventory.service.product.grpc.GetProductMappingsRequest.class,
      responseType = io.bokun.inventory.service.product.grpc.ProductMapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.GetProductMappingsRequest,
      io.bokun.inventory.service.product.grpc.ProductMapping> getGetProductMappingsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.GetProductMappingsRequest, io.bokun.inventory.service.product.grpc.ProductMapping> getGetProductMappingsMethod;
    if ((getGetProductMappingsMethod = ProductServiceGrpc.getGetProductMappingsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductMappingsMethod = ProductServiceGrpc.getGetProductMappingsMethod) == null) {
          ProductServiceGrpc.getGetProductMappingsMethod = getGetProductMappingsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.product.grpc.GetProductMappingsRequest, io.bokun.inventory.service.product.grpc.ProductMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductMappings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.GetProductMappingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.ProductMapping.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductMappings"))
              .build();
        }
      }
    }
    return getGetProductMappingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.ProductMappingIdentifier,
      io.bokun.inventory.common.api.grpc.Empty> getDeleteProductMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProductMapping",
      requestType = io.bokun.inventory.service.product.grpc.ProductMappingIdentifier.class,
      responseType = io.bokun.inventory.common.api.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.ProductMappingIdentifier,
      io.bokun.inventory.common.api.grpc.Empty> getDeleteProductMappingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.product.grpc.ProductMappingIdentifier, io.bokun.inventory.common.api.grpc.Empty> getDeleteProductMappingMethod;
    if ((getDeleteProductMappingMethod = ProductServiceGrpc.getDeleteProductMappingMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductMappingMethod = ProductServiceGrpc.getDeleteProductMappingMethod) == null) {
          ProductServiceGrpc.getDeleteProductMappingMethod = getDeleteProductMappingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.product.grpc.ProductMappingIdentifier, io.bokun.inventory.common.api.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProductMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.product.grpc.ProductMappingIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProductMapping"))
              .build();
        }
      }
    }
    return getDeleteProductMappingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Searches for available products.
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    default void searchProducts(io.bokun.inventory.service.product.grpc.SearchProductsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.BasicProductInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    default void getProductById(io.bokun.inventory.service.product.grpc.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductDescription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Inserts or updates product mapping.
     * </pre>
     */
    default void upsertProductMapping(io.bokun.inventory.service.product.grpc.ProductMapping request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.product.grpc.ProductMapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertProductMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all mappings (or selected mappings for given products) for a given vendor.
     * </pre>
     */
    default void getProductMappings(io.bokun.inventory.service.product.grpc.GetProductMappingsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.product.grpc.ProductMapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMappingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes product mapping.
     * </pre>
     */
    default void deleteProductMapping(io.bokun.inventory.service.product.grpc.ProductMappingIdentifier request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMappingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for available products.
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    public void searchProducts(io.bokun.inventory.service.product.grpc.SearchProductsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.BasicProductInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    public void getProductById(io.bokun.inventory.service.product.grpc.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductDescription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Inserts or updates product mapping.
     * </pre>
     */
    public void upsertProductMapping(io.bokun.inventory.service.product.grpc.ProductMapping request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.product.grpc.ProductMapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertProductMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all mappings (or selected mappings for given products) for a given vendor.
     * </pre>
     */
    public void getProductMappings(io.bokun.inventory.service.product.grpc.GetProductMappingsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.product.grpc.ProductMapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductMappingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes product mapping.
     * </pre>
     */
    public void deleteProductMapping(io.bokun.inventory.service.product.grpc.ProductMappingIdentifier request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMappingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for available products.
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.common.api.grpc.BasicProductInfo> searchProducts(
        io.bokun.inventory.service.product.grpc.SearchProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ProductDescription getProductById(io.bokun.inventory.service.product.grpc.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Inserts or updates product mapping.
     * </pre>
     */
    public io.bokun.inventory.service.product.grpc.ProductMapping upsertProductMapping(io.bokun.inventory.service.product.grpc.ProductMapping request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertProductMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all mappings (or selected mappings for given products) for a given vendor.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.service.product.grpc.ProductMapping> getProductMappings(
        io.bokun.inventory.service.product.grpc.GetProductMappingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductMappingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes product mapping.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.Empty deleteProductMapping(io.bokun.inventory.service.product.grpc.ProductMappingIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMappingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * Returned ids (of products, rates, pricing categories, etc.) are always external.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ProductDescription> getProductById(
        io.bokun.inventory.service.product.grpc.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Inserts or updates product mapping.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.service.product.grpc.ProductMapping> upsertProductMapping(
        io.bokun.inventory.service.product.grpc.ProductMapping request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertProductMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes product mapping.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.Empty> deleteProductMapping(
        io.bokun.inventory.service.product.grpc.ProductMappingIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMappingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT_BY_ID = 1;
  private static final int METHODID_UPSERT_PRODUCT_MAPPING = 2;
  private static final int METHODID_GET_PRODUCT_MAPPINGS = 3;
  private static final int METHODID_DELETE_PRODUCT_MAPPING = 4;

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
        case METHODID_SEARCH_PRODUCTS:
          serviceImpl.searchProducts((io.bokun.inventory.service.product.grpc.SearchProductsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.BasicProductInfo>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((io.bokun.inventory.service.product.grpc.GetProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductDescription>) responseObserver);
          break;
        case METHODID_UPSERT_PRODUCT_MAPPING:
          serviceImpl.upsertProductMapping((io.bokun.inventory.service.product.grpc.ProductMapping) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.product.grpc.ProductMapping>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_MAPPINGS:
          serviceImpl.getProductMappings((io.bokun.inventory.service.product.grpc.GetProductMappingsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.product.grpc.ProductMapping>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_MAPPING:
          serviceImpl.deleteProductMapping((io.bokun.inventory.service.product.grpc.ProductMappingIdentifier) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty>) responseObserver);
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
          getSearchProductsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.service.product.grpc.SearchProductsRequest,
              io.bokun.inventory.common.api.grpc.BasicProductInfo>(
                service, METHODID_SEARCH_PRODUCTS)))
        .addMethod(
          getGetProductByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.product.grpc.GetProductByIdRequest,
              io.bokun.inventory.common.api.grpc.ProductDescription>(
                service, METHODID_GET_PRODUCT_BY_ID)))
        .addMethod(
          getUpsertProductMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.product.grpc.ProductMapping,
              io.bokun.inventory.service.product.grpc.ProductMapping>(
                service, METHODID_UPSERT_PRODUCT_MAPPING)))
        .addMethod(
          getGetProductMappingsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.service.product.grpc.GetProductMappingsRequest,
              io.bokun.inventory.service.product.grpc.ProductMapping>(
                service, METHODID_GET_PRODUCT_MAPPINGS)))
        .addMethod(
          getDeleteProductMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.product.grpc.ProductMappingIdentifier,
              io.bokun.inventory.common.api.grpc.Empty>(
                service, METHODID_DELETE_PRODUCT_MAPPING)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bokun.inventory.service.product.grpc.ProductServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getSearchProductsMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getUpsertProductMappingMethod())
              .addMethod(getGetProductMappingsMethod())
              .addMethod(getDeleteProductMappingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
