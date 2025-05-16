package io.bokun.inventory.plugin.api.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: plugin_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PluginApiGrpc {

  private PluginApiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.bokun.inventory.plugin.api.grpc.PluginApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.common.api.grpc.Empty,
      io.bokun.inventory.plugin.api.grpc.PluginDefinition> getGetDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefinition",
      requestType = io.bokun.inventory.common.api.grpc.Empty.class,
      responseType = io.bokun.inventory.plugin.api.grpc.PluginDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.common.api.grpc.Empty,
      io.bokun.inventory.plugin.api.grpc.PluginDefinition> getGetDefinitionMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.common.api.grpc.Empty, io.bokun.inventory.plugin.api.grpc.PluginDefinition> getGetDefinitionMethod;
    if ((getGetDefinitionMethod = PluginApiGrpc.getGetDefinitionMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getGetDefinitionMethod = PluginApiGrpc.getGetDefinitionMethod) == null) {
          PluginApiGrpc.getGetDefinitionMethod = getGetDefinitionMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.common.api.grpc.Empty, io.bokun.inventory.plugin.api.grpc.PluginDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.PluginDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("GetDefinition"))
              .build();
        }
      }
    }
    return getGetDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.SearchProductsRequest,
      io.bokun.inventory.common.api.grpc.BasicProductInfo> getSearchProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchProducts",
      requestType = io.bokun.inventory.plugin.api.grpc.SearchProductsRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.BasicProductInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.SearchProductsRequest,
      io.bokun.inventory.common.api.grpc.BasicProductInfo> getSearchProductsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.SearchProductsRequest, io.bokun.inventory.common.api.grpc.BasicProductInfo> getSearchProductsMethod;
    if ((getSearchProductsMethod = PluginApiGrpc.getSearchProductsMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getSearchProductsMethod = PluginApiGrpc.getSearchProductsMethod) == null) {
          PluginApiGrpc.getSearchProductsMethod = getSearchProductsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.SearchProductsRequest, io.bokun.inventory.common.api.grpc.BasicProductInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.SearchProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.BasicProductInfo.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("SearchProducts"))
              .build();
        }
      }
    }
    return getSearchProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest,
      io.bokun.inventory.common.api.grpc.ProductDescription> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductById",
      requestType = io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ProductDescription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest,
      io.bokun.inventory.common.api.grpc.ProductDescription> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest, io.bokun.inventory.common.api.grpc.ProductDescription> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = PluginApiGrpc.getGetProductByIdMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getGetProductByIdMethod = PluginApiGrpc.getGetProductByIdMethod) == null) {
          PluginApiGrpc.getGetProductByIdMethod = getGetProductByIdMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest, io.bokun.inventory.common.api.grpc.ProductDescription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ProductDescription.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("GetProductById"))
              .build();
        }
      }
    }
    return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest,
      io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse> getGetAvailableProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableProducts",
      requestType = io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest.class,
      responseType = io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest,
      io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse> getGetAvailableProductsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest, io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse> getGetAvailableProductsMethod;
    if ((getGetAvailableProductsMethod = PluginApiGrpc.getGetAvailableProductsMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getGetAvailableProductsMethod = PluginApiGrpc.getGetAvailableProductsMethod) == null) {
          PluginApiGrpc.getGetAvailableProductsMethod = getGetAvailableProductsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest, io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("GetAvailableProducts"))
              .build();
        }
      }
    }
    return getGetAvailableProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest,
      io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getGetProductAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductAvailability",
      requestType = io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest,
      io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getGetProductAvailabilityMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest, io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getGetProductAvailabilityMethod;
    if ((getGetProductAvailabilityMethod = PluginApiGrpc.getGetProductAvailabilityMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getGetProductAvailabilityMethod = PluginApiGrpc.getGetProductAvailabilityMethod) == null) {
          PluginApiGrpc.getGetProductAvailabilityMethod = getGetProductAvailabilityMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest, io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("GetProductAvailability"))
              .build();
        }
      }
    }
    return getGetProductAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ReservationRequest,
      io.bokun.inventory.common.api.grpc.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = io.bokun.inventory.plugin.api.grpc.ReservationRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ReservationRequest,
      io.bokun.inventory.common.api.grpc.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ReservationRequest, io.bokun.inventory.common.api.grpc.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = PluginApiGrpc.getCreateReservationMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getCreateReservationMethod = PluginApiGrpc.getCreateReservationMethod) == null) {
          PluginApiGrpc.getCreateReservationMethod = getCreateReservationMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.ReservationRequest, io.bokun.inventory.common.api.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("CreateReservation"))
              .build();
        }
      }
    }
    return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CancelReservationRequest,
      io.bokun.inventory.common.api.grpc.CancelReservationResponse> getCancelReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelReservation",
      requestType = io.bokun.inventory.plugin.api.grpc.CancelReservationRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.CancelReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CancelReservationRequest,
      io.bokun.inventory.common.api.grpc.CancelReservationResponse> getCancelReservationMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CancelReservationRequest, io.bokun.inventory.common.api.grpc.CancelReservationResponse> getCancelReservationMethod;
    if ((getCancelReservationMethod = PluginApiGrpc.getCancelReservationMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getCancelReservationMethod = PluginApiGrpc.getCancelReservationMethod) == null) {
          PluginApiGrpc.getCancelReservationMethod = getCancelReservationMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.CancelReservationRequest, io.bokun.inventory.common.api.grpc.CancelReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.CancelReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.CancelReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("CancelReservation"))
              .build();
        }
      }
    }
    return getCancelReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest,
      io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getConfirmBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmBooking",
      requestType = io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ConfirmBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest,
      io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getConfirmBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest, io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getConfirmBookingMethod;
    if ((getConfirmBookingMethod = PluginApiGrpc.getConfirmBookingMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getConfirmBookingMethod = PluginApiGrpc.getConfirmBookingMethod) == null) {
          PluginApiGrpc.getConfirmBookingMethod = getConfirmBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest, io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ConfirmBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("ConfirmBooking"))
              .build();
        }
      }
    }
    return getConfirmBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest,
      io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getCreateAndConfirmBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAndConfirmBooking",
      requestType = io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ConfirmBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest,
      io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getCreateAndConfirmBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest, io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getCreateAndConfirmBookingMethod;
    if ((getCreateAndConfirmBookingMethod = PluginApiGrpc.getCreateAndConfirmBookingMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getCreateAndConfirmBookingMethod = PluginApiGrpc.getCreateAndConfirmBookingMethod) == null) {
          PluginApiGrpc.getCreateAndConfirmBookingMethod = getCreateAndConfirmBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest, io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAndConfirmBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ConfirmBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("CreateAndConfirmBooking"))
              .build();
        }
      }
    }
    return getCreateAndConfirmBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CancelBookingRequest,
      io.bokun.inventory.common.api.grpc.CancelBookingResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBooking",
      requestType = io.bokun.inventory.plugin.api.grpc.CancelBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.CancelBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CancelBookingRequest,
      io.bokun.inventory.common.api.grpc.CancelBookingResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.CancelBookingRequest, io.bokun.inventory.common.api.grpc.CancelBookingResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = PluginApiGrpc.getCancelBookingMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getCancelBookingMethod = PluginApiGrpc.getCancelBookingMethod) == null) {
          PluginApiGrpc.getCancelBookingMethod = getCancelBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.CancelBookingRequest, io.bokun.inventory.common.api.grpc.CancelBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.CancelBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.CancelBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("CancelBooking"))
              .build();
        }
      }
    }
    return getCancelBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.AmendBookingRequest,
      io.bokun.inventory.common.api.grpc.AmendBookingResponse> getAmendBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AmendBooking",
      requestType = io.bokun.inventory.plugin.api.grpc.AmendBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.AmendBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.AmendBookingRequest,
      io.bokun.inventory.common.api.grpc.AmendBookingResponse> getAmendBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.plugin.api.grpc.AmendBookingRequest, io.bokun.inventory.common.api.grpc.AmendBookingResponse> getAmendBookingMethod;
    if ((getAmendBookingMethod = PluginApiGrpc.getAmendBookingMethod) == null) {
      synchronized (PluginApiGrpc.class) {
        if ((getAmendBookingMethod = PluginApiGrpc.getAmendBookingMethod) == null) {
          PluginApiGrpc.getAmendBookingMethod = getAmendBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.plugin.api.grpc.AmendBookingRequest, io.bokun.inventory.common.api.grpc.AmendBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AmendBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.plugin.api.grpc.AmendBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.AmendBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginApiMethodDescriptorSupplier("AmendBooking"))
              .build();
        }
      }
    }
    return getAmendBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PluginApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginApiStub>() {
        @java.lang.Override
        public PluginApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginApiStub(channel, callOptions);
        }
      };
    return PluginApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PluginApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginApiBlockingStub>() {
        @java.lang.Override
        public PluginApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginApiBlockingStub(channel, callOptions);
        }
      };
    return PluginApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PluginApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginApiFutureStub>() {
        @java.lang.Override
        public PluginApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginApiFutureStub(channel, callOptions);
        }
      };
    return PluginApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Provide plugin definition information (what features etc this plugin supports).
     * </pre>
     */
    default void getDefinition(io.bokun.inventory.common.api.grpc.Empty request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.plugin.api.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return information about products of the remote system this plugin is connecting to (as opposed to Bokun products).
     * This call is required in order to link Bokun- and remote system-configured products together.
     * </pre>
     */
    default void searchProducts(io.bokun.inventory.plugin.api.grpc.SearchProductsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.BasicProductInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * </pre>
     */
    default void getProductById(io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductDescription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * A set of product ids provided, return their availability over given date range.
     * This will return a subset of product IDs passed on via ProductAvailabilityRequest.
     * Note: even though request contains capacity and date range, for a matching product it is enough to have availabilities for *some* dates over
     * requested period. Subsequent GetProductAvailability request will clarify precise dates and capacities.
     * Note (2): implementing APIs might not support checking of multi-products across vast periods. For this, it might be enough to check opening
     * hours or general availability as GetProductAvailability will clarify that at a later stage anyway (even though resulting poorer UX).
     * </pre>
     */
    default void getAvailableProducts(io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get availability of a particular product over a date range.
     * This request shoud follow GetAvailableProducts and provide more details on precise dates/times for each product as well as capacity for each date.
     * This call, however, is for a single product only (as opposed to GetAvailableProducts) which checks many products but only does a basic shallow check.
     * </pre>
     */
    default void getProductAvailability(io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductAvailabilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * This call secures necessary resource(s), such as activity time slot which can later become a booking.
     * The reservation should be held for some limited time, and reverted back to being available if the booking is not confirmed.
     * The two step process (this method + ConfirmBooking) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS, otherwise
     * CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    default void createReservation(io.bokun.inventory.plugin.api.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * This call allows the reseller to indicate that previously made reservation should be cancelled.
     * It is not strictly required to implement this method; in which case the receiving end should automatically proceed with cancellations after
     * certain time period elapses. The length of such period may change from reseller to reseller but we recommend using 30 minutes for now.
     * Implementing this method allows more efficient resource management as reserved seats can be unblocked somewhat earlier.
     * Both PluginCapability::SUPPORTS_RESERVATIONS and PluginCapability::SUPPORTS_RESERVATION_CANCELLATION must be present in your plugin definition
     * in order to enable calls to this method.
     * </pre>
     */
    default void cancelReservation(io.bokun.inventory.plugin.api.grpc.CancelReservationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS,
     * otherwise CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    default void confirmBooking(io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * This creates reservation and makes a booking in one step.
     * This method is only called by the platform if PluginDefinition::capabilities does not contain SUPPORTS_RESERVATIONS value.
     * Otherwise, two step process (CreateReservation + ConfirmBooking) is used, which is the recommended option.
     * </pre>
     */
    default void createAndConfirmBooking(io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAndConfirmBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    default void cancelBooking(io.bokun.inventory.plugin.api.grpc.CancelBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelBookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows to amend existing confirmed (non-cancelled) booking.
     * Implementing this method is optional.
     * Not implementing this method results:
     * - your system not receiving amendments from those sales channels which support it (e.g. Viator).
     * - Bokun responding positively to such amendments from incoming sources without relaying this information further.
     * Amendment result may or may not be successful, e.g. if the new date is sold out then it is perfectly legal to fail such amendment.
     * NOTE: booking amendment might be invoked without prior availability check. It is responsibility of the plugin to ensure that all conditions
     * are met (sufficient availability, pickup if applicable, etc.).
     * When exactly is this method called? Bókun considers this method for cases when booking elements such as travel date, extra, PAX, pickup etc. is
     * changed for existing confirmed booking. This applies to everything except change of rate or product, in which case a new booking is created and
     * original booking gets cancelled. These are the only supported amendment use cases:
     * * Viator SAPI
     * * Bókun's /booking.json/edit REST endpoint
     * </pre>
     */
    default void amendBooking(io.bokun.inventory.plugin.api.grpc.AmendBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.AmendBookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAmendBookingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PluginApi.
   */
  public static abstract class PluginApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PluginApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PluginApi.
   */
  public static final class PluginApiStub
      extends io.grpc.stub.AbstractAsyncStub<PluginApiStub> {
    private PluginApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provide plugin definition information (what features etc this plugin supports).
     * </pre>
     */
    public void getDefinition(io.bokun.inventory.common.api.grpc.Empty request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.plugin.api.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return information about products of the remote system this plugin is connecting to (as opposed to Bokun products).
     * This call is required in order to link Bokun- and remote system-configured products together.
     * </pre>
     */
    public void searchProducts(io.bokun.inventory.plugin.api.grpc.SearchProductsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.BasicProductInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * </pre>
     */
    public void getProductById(io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductDescription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A set of product ids provided, return their availability over given date range.
     * This will return a subset of product IDs passed on via ProductAvailabilityRequest.
     * Note: even though request contains capacity and date range, for a matching product it is enough to have availabilities for *some* dates over
     * requested period. Subsequent GetProductAvailability request will clarify precise dates and capacities.
     * Note (2): implementing APIs might not support checking of multi-products across vast periods. For this, it might be enough to check opening
     * hours or general availability as GetProductAvailability will clarify that at a later stage anyway (even though resulting poorer UX).
     * </pre>
     */
    public void getAvailableProducts(io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAvailableProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get availability of a particular product over a date range.
     * This request shoud follow GetAvailableProducts and provide more details on precise dates/times for each product as well as capacity for each date.
     * This call, however, is for a single product only (as opposed to GetAvailableProducts) which checks many products but only does a basic shallow check.
     * </pre>
     */
    public void getProductAvailability(io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This call secures necessary resource(s), such as activity time slot which can later become a booking.
     * The reservation should be held for some limited time, and reverted back to being available if the booking is not confirmed.
     * The two step process (this method + ConfirmBooking) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS, otherwise
     * CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    public void createReservation(io.bokun.inventory.plugin.api.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This call allows the reseller to indicate that previously made reservation should be cancelled.
     * It is not strictly required to implement this method; in which case the receiving end should automatically proceed with cancellations after
     * certain time period elapses. The length of such period may change from reseller to reseller but we recommend using 30 minutes for now.
     * Implementing this method allows more efficient resource management as reserved seats can be unblocked somewhat earlier.
     * Both PluginCapability::SUPPORTS_RESERVATIONS and PluginCapability::SUPPORTS_RESERVATION_CANCELLATION must be present in your plugin definition
     * in order to enable calls to this method.
     * </pre>
     */
    public void cancelReservation(io.bokun.inventory.plugin.api.grpc.CancelReservationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS,
     * otherwise CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    public void confirmBooking(io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This creates reservation and makes a booking in one step.
     * This method is only called by the platform if PluginDefinition::capabilities does not contain SUPPORTS_RESERVATIONS value.
     * Otherwise, two step process (CreateReservation + ConfirmBooking) is used, which is the recommended option.
     * </pre>
     */
    public void createAndConfirmBooking(io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAndConfirmBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    public void cancelBooking(io.bokun.inventory.plugin.api.grpc.CancelBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelBookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows to amend existing confirmed (non-cancelled) booking.
     * Implementing this method is optional.
     * Not implementing this method results:
     * - your system not receiving amendments from those sales channels which support it (e.g. Viator).
     * - Bokun responding positively to such amendments from incoming sources without relaying this information further.
     * Amendment result may or may not be successful, e.g. if the new date is sold out then it is perfectly legal to fail such amendment.
     * NOTE: booking amendment might be invoked without prior availability check. It is responsibility of the plugin to ensure that all conditions
     * are met (sufficient availability, pickup if applicable, etc.).
     * When exactly is this method called? Bókun considers this method for cases when booking elements such as travel date, extra, PAX, pickup etc. is
     * changed for existing confirmed booking. This applies to everything except change of rate or product, in which case a new booking is created and
     * original booking gets cancelled. These are the only supported amendment use cases:
     * * Viator SAPI
     * * Bókun's /booking.json/edit REST endpoint
     * </pre>
     */
    public void amendBooking(io.bokun.inventory.plugin.api.grpc.AmendBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.AmendBookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAmendBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PluginApi.
   */
  public static final class PluginApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PluginApiBlockingStub> {
    private PluginApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provide plugin definition information (what features etc this plugin supports).
     * </pre>
     */
    public io.bokun.inventory.plugin.api.grpc.PluginDefinition getDefinition(io.bokun.inventory.common.api.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return information about products of the remote system this plugin is connecting to (as opposed to Bokun products).
     * This call is required in order to link Bokun- and remote system-configured products together.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.common.api.grpc.BasicProductInfo> searchProducts(
        io.bokun.inventory.plugin.api.grpc.SearchProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ProductDescription getProductById(io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A set of product ids provided, return their availability over given date range.
     * This will return a subset of product IDs passed on via ProductAvailabilityRequest.
     * Note: even though request contains capacity and date range, for a matching product it is enough to have availabilities for *some* dates over
     * requested period. Subsequent GetProductAvailability request will clarify precise dates and capacities.
     * Note (2): implementing APIs might not support checking of multi-products across vast periods. For this, it might be enough to check opening
     * hours or general availability as GetProductAvailability will clarify that at a later stage anyway (even though resulting poorer UX).
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse> getAvailableProducts(
        io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAvailableProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get availability of a particular product over a date range.
     * This request shoud follow GetAvailableProducts and provide more details on precise dates/times for each product as well as capacity for each date.
     * This call, however, is for a single product only (as opposed to GetAvailableProducts) which checks many products but only does a basic shallow check.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse> getProductAvailability(
        io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This call secures necessary resource(s), such as activity time slot which can later become a booking.
     * The reservation should be held for some limited time, and reverted back to being available if the booking is not confirmed.
     * The two step process (this method + ConfirmBooking) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS, otherwise
     * CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ReservationResponse createReservation(io.bokun.inventory.plugin.api.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This call allows the reseller to indicate that previously made reservation should be cancelled.
     * It is not strictly required to implement this method; in which case the receiving end should automatically proceed with cancellations after
     * certain time period elapses. The length of such period may change from reseller to reseller but we recommend using 30 minutes for now.
     * Implementing this method allows more efficient resource management as reserved seats can be unblocked somewhat earlier.
     * Both PluginCapability::SUPPORTS_RESERVATIONS and PluginCapability::SUPPORTS_RESERVATION_CANCELLATION must be present in your plugin definition
     * in order to enable calls to this method.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.CancelReservationResponse cancelReservation(io.bokun.inventory.plugin.api.grpc.CancelReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS,
     * otherwise CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ConfirmBookingResponse confirmBooking(io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This creates reservation and makes a booking in one step.
     * This method is only called by the platform if PluginDefinition::capabilities does not contain SUPPORTS_RESERVATIONS value.
     * Otherwise, two step process (CreateReservation + ConfirmBooking) is used, which is the recommended option.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ConfirmBookingResponse createAndConfirmBooking(io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAndConfirmBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.CancelBookingResponse cancelBooking(io.bokun.inventory.plugin.api.grpc.CancelBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows to amend existing confirmed (non-cancelled) booking.
     * Implementing this method is optional.
     * Not implementing this method results:
     * - your system not receiving amendments from those sales channels which support it (e.g. Viator).
     * - Bokun responding positively to such amendments from incoming sources without relaying this information further.
     * Amendment result may or may not be successful, e.g. if the new date is sold out then it is perfectly legal to fail such amendment.
     * NOTE: booking amendment might be invoked without prior availability check. It is responsibility of the plugin to ensure that all conditions
     * are met (sufficient availability, pickup if applicable, etc.).
     * When exactly is this method called? Bókun considers this method for cases when booking elements such as travel date, extra, PAX, pickup etc. is
     * changed for existing confirmed booking. This applies to everything except change of rate or product, in which case a new booking is created and
     * original booking gets cancelled. These are the only supported amendment use cases:
     * * Viator SAPI
     * * Bókun's /booking.json/edit REST endpoint
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.AmendBookingResponse amendBooking(io.bokun.inventory.plugin.api.grpc.AmendBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAmendBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PluginApi.
   */
  public static final class PluginApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<PluginApiFutureStub> {
    private PluginApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provide plugin definition information (what features etc this plugin supports).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.plugin.api.grpc.PluginDefinition> getDefinition(
        io.bokun.inventory.common.api.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns detailed product information by given id (ids refer to ProductDescription::id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ProductDescription> getProductById(
        io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * This call secures necessary resource(s), such as activity time slot which can later become a booking.
     * The reservation should be held for some limited time, and reverted back to being available if the booking is not confirmed.
     * The two step process (this method + ConfirmBooking) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS, otherwise
     * CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ReservationResponse> createReservation(
        io.bokun.inventory.plugin.api.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * This call allows the reseller to indicate that previously made reservation should be cancelled.
     * It is not strictly required to implement this method; in which case the receiving end should automatically proceed with cancellations after
     * certain time period elapses. The length of such period may change from reseller to reseller but we recommend using 30 minutes for now.
     * Implementing this method allows more efficient resource management as reserved seats can be unblocked somewhat earlier.
     * Both PluginCapability::SUPPORTS_RESERVATIONS and PluginCapability::SUPPORTS_RESERVATION_CANCELLATION must be present in your plugin definition
     * in order to enable calls to this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.CancelReservationResponse> cancelReservation(
        io.bokun.inventory.plugin.api.grpc.CancelReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is only called if PluginDefinition::capabilities contains SUPPORTS_RESERVATIONS,
     * otherwise CreateAndConfirmBooking method is used instead of both.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> confirmBooking(
        io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * This creates reservation and makes a booking in one step.
     * This method is only called by the platform if PluginDefinition::capabilities does not contain SUPPORTS_RESERVATIONS value.
     * Otherwise, two step process (CreateReservation + ConfirmBooking) is used, which is the recommended option.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> createAndConfirmBooking(
        io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAndConfirmBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.CancelBookingResponse> cancelBooking(
        io.bokun.inventory.plugin.api.grpc.CancelBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows to amend existing confirmed (non-cancelled) booking.
     * Implementing this method is optional.
     * Not implementing this method results:
     * - your system not receiving amendments from those sales channels which support it (e.g. Viator).
     * - Bokun responding positively to such amendments from incoming sources without relaying this information further.
     * Amendment result may or may not be successful, e.g. if the new date is sold out then it is perfectly legal to fail such amendment.
     * NOTE: booking amendment might be invoked without prior availability check. It is responsibility of the plugin to ensure that all conditions
     * are met (sufficient availability, pickup if applicable, etc.).
     * When exactly is this method called? Bókun considers this method for cases when booking elements such as travel date, extra, PAX, pickup etc. is
     * changed for existing confirmed booking. This applies to everything except change of rate or product, in which case a new booking is created and
     * original booking gets cancelled. These are the only supported amendment use cases:
     * * Viator SAPI
     * * Bókun's /booking.json/edit REST endpoint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.AmendBookingResponse> amendBooking(
        io.bokun.inventory.plugin.api.grpc.AmendBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAmendBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEFINITION = 0;
  private static final int METHODID_SEARCH_PRODUCTS = 1;
  private static final int METHODID_GET_PRODUCT_BY_ID = 2;
  private static final int METHODID_GET_AVAILABLE_PRODUCTS = 3;
  private static final int METHODID_GET_PRODUCT_AVAILABILITY = 4;
  private static final int METHODID_CREATE_RESERVATION = 5;
  private static final int METHODID_CANCEL_RESERVATION = 6;
  private static final int METHODID_CONFIRM_BOOKING = 7;
  private static final int METHODID_CREATE_AND_CONFIRM_BOOKING = 8;
  private static final int METHODID_CANCEL_BOOKING = 9;
  private static final int METHODID_AMEND_BOOKING = 10;

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
        case METHODID_GET_DEFINITION:
          serviceImpl.getDefinition((io.bokun.inventory.common.api.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.plugin.api.grpc.PluginDefinition>) responseObserver);
          break;
        case METHODID_SEARCH_PRODUCTS:
          serviceImpl.searchProducts((io.bokun.inventory.plugin.api.grpc.SearchProductsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.BasicProductInfo>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductDescription>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_PRODUCTS:
          serviceImpl.getAvailableProducts((io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_AVAILABILITY:
          serviceImpl.getProductAvailability((io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((io.bokun.inventory.plugin.api.grpc.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_CANCEL_RESERVATION:
          serviceImpl.cancelReservation((io.bokun.inventory.plugin.api.grpc.CancelReservationRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelReservationResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_BOOKING:
          serviceImpl.confirmBooking((io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>) responseObserver);
          break;
        case METHODID_CREATE_AND_CONFIRM_BOOKING:
          serviceImpl.createAndConfirmBooking((io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((io.bokun.inventory.plugin.api.grpc.CancelBookingRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelBookingResponse>) responseObserver);
          break;
        case METHODID_AMEND_BOOKING:
          serviceImpl.amendBooking((io.bokun.inventory.plugin.api.grpc.AmendBookingRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.AmendBookingResponse>) responseObserver);
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
          getGetDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.common.api.grpc.Empty,
              io.bokun.inventory.plugin.api.grpc.PluginDefinition>(
                service, METHODID_GET_DEFINITION)))
        .addMethod(
          getSearchProductsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.SearchProductsRequest,
              io.bokun.inventory.common.api.grpc.BasicProductInfo>(
                service, METHODID_SEARCH_PRODUCTS)))
        .addMethod(
          getGetProductByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest,
              io.bokun.inventory.common.api.grpc.ProductDescription>(
                service, METHODID_GET_PRODUCT_BY_ID)))
        .addMethod(
          getGetAvailableProductsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityRequest,
              io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse>(
                service, METHODID_GET_AVAILABLE_PRODUCTS)))
        .addMethod(
          getGetProductAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.ProductAvailabilityRequest,
              io.bokun.inventory.common.api.grpc.ProductAvailabilityWithRatesResponse>(
                service, METHODID_GET_PRODUCT_AVAILABILITY)))
        .addMethod(
          getCreateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.ReservationRequest,
              io.bokun.inventory.common.api.grpc.ReservationResponse>(
                service, METHODID_CREATE_RESERVATION)))
        .addMethod(
          getCancelReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.CancelReservationRequest,
              io.bokun.inventory.common.api.grpc.CancelReservationResponse>(
                service, METHODID_CANCEL_RESERVATION)))
        .addMethod(
          getConfirmBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.ConfirmBookingRequest,
              io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>(
                service, METHODID_CONFIRM_BOOKING)))
        .addMethod(
          getCreateAndConfirmBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.CreateConfirmBookingRequest,
              io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>(
                service, METHODID_CREATE_AND_CONFIRM_BOOKING)))
        .addMethod(
          getCancelBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.CancelBookingRequest,
              io.bokun.inventory.common.api.grpc.CancelBookingResponse>(
                service, METHODID_CANCEL_BOOKING)))
        .addMethod(
          getAmendBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.plugin.api.grpc.AmendBookingRequest,
              io.bokun.inventory.common.api.grpc.AmendBookingResponse>(
                service, METHODID_AMEND_BOOKING)))
        .build();
  }

  private static abstract class PluginApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PluginApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bokun.inventory.plugin.api.grpc.PluginApiOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PluginApi");
    }
  }

  private static final class PluginApiFileDescriptorSupplier
      extends PluginApiBaseDescriptorSupplier {
    PluginApiFileDescriptorSupplier() {}
  }

  private static final class PluginApiMethodDescriptorSupplier
      extends PluginApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PluginApiMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PluginApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PluginApiFileDescriptorSupplier())
              .addMethod(getGetDefinitionMethod())
              .addMethod(getSearchProductsMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getGetAvailableProductsMethod())
              .addMethod(getGetProductAvailabilityMethod())
              .addMethod(getCreateReservationMethod())
              .addMethod(getCancelReservationMethod())
              .addMethod(getConfirmBookingMethod())
              .addMethod(getCreateAndConfirmBookingMethod())
              .addMethod(getCancelBookingMethod())
              .addMethod(getAmendBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
