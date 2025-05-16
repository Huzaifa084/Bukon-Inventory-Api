package io.bokun.inventory.service.booking.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: booking_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.bokun.inventory.service.booking.grpc.BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.ReservationRequest,
      io.bokun.inventory.common.api.grpc.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = io.bokun.inventory.service.booking.grpc.ReservationRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.ReservationRequest,
      io.bokun.inventory.common.api.grpc.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.ReservationRequest, io.bokun.inventory.common.api.grpc.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = BookingServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCreateReservationMethod = BookingServiceGrpc.getCreateReservationMethod) == null) {
          BookingServiceGrpc.getCreateReservationMethod = getCreateReservationMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.booking.grpc.ReservationRequest, io.bokun.inventory.common.api.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.booking.grpc.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CreateReservation"))
              .build();
        }
      }
    }
    return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.CancelReservationRequest,
      io.bokun.inventory.common.api.grpc.CancelReservationResponse> getCancelReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelReservation",
      requestType = io.bokun.inventory.service.booking.grpc.CancelReservationRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.CancelReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.CancelReservationRequest,
      io.bokun.inventory.common.api.grpc.CancelReservationResponse> getCancelReservationMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.CancelReservationRequest, io.bokun.inventory.common.api.grpc.CancelReservationResponse> getCancelReservationMethod;
    if ((getCancelReservationMethod = BookingServiceGrpc.getCancelReservationMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCancelReservationMethod = BookingServiceGrpc.getCancelReservationMethod) == null) {
          BookingServiceGrpc.getCancelReservationMethod = getCancelReservationMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.booking.grpc.CancelReservationRequest, io.bokun.inventory.common.api.grpc.CancelReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.booking.grpc.CancelReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.CancelReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CancelReservation"))
              .build();
        }
      }
    }
    return getCancelReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest,
      io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getConfirmBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmBooking",
      requestType = io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.ConfirmBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest,
      io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getConfirmBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest, io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> getConfirmBookingMethod;
    if ((getConfirmBookingMethod = BookingServiceGrpc.getConfirmBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getConfirmBookingMethod = BookingServiceGrpc.getConfirmBookingMethod) == null) {
          BookingServiceGrpc.getConfirmBookingMethod = getConfirmBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest, io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.ConfirmBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("ConfirmBooking"))
              .build();
        }
      }
    }
    return getConfirmBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.CancelBookingRequest,
      io.bokun.inventory.common.api.grpc.CancelBookingResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBooking",
      requestType = io.bokun.inventory.service.booking.grpc.CancelBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.CancelBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.CancelBookingRequest,
      io.bokun.inventory.common.api.grpc.CancelBookingResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.CancelBookingRequest, io.bokun.inventory.common.api.grpc.CancelBookingResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = BookingServiceGrpc.getCancelBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCancelBookingMethod = BookingServiceGrpc.getCancelBookingMethod) == null) {
          BookingServiceGrpc.getCancelBookingMethod = getCancelBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.booking.grpc.CancelBookingRequest, io.bokun.inventory.common.api.grpc.CancelBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.booking.grpc.CancelBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.CancelBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CancelBooking"))
              .build();
        }
      }
    }
    return getCancelBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.AmendBookingRequest,
      io.bokun.inventory.common.api.grpc.AmendBookingResponse> getAmendBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AmendBooking",
      requestType = io.bokun.inventory.service.booking.grpc.AmendBookingRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.AmendBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.AmendBookingRequest,
      io.bokun.inventory.common.api.grpc.AmendBookingResponse> getAmendBookingMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.booking.grpc.AmendBookingRequest, io.bokun.inventory.common.api.grpc.AmendBookingResponse> getAmendBookingMethod;
    if ((getAmendBookingMethod = BookingServiceGrpc.getAmendBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getAmendBookingMethod = BookingServiceGrpc.getAmendBookingMethod) == null) {
          BookingServiceGrpc.getAmendBookingMethod = getAmendBookingMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.booking.grpc.AmendBookingRequest, io.bokun.inventory.common.api.grpc.AmendBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AmendBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.booking.grpc.AmendBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.AmendBookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("AmendBooking"))
              .build();
        }
      }
    }
    return getAmendBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub>() {
        @java.lang.Override
        public BookingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceStub(channel, callOptions);
        }
      };
    return BookingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub>() {
        @java.lang.Override
        public BookingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceBlockingStub(channel, callOptions);
        }
      };
    return BookingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub>() {
        @java.lang.Override
        public BookingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceFutureStub(channel, callOptions);
        }
      };
    return BookingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Reserve capacity for a product for limited time. Please using blocking API for this as the result of this is atomic: all requests should either
     * succeed or fail; there can be no half/success.
     * The two step process (this method + ConfirmBooking) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    default void createReservation(io.bokun.inventory.service.booking.grpc.ReservationRequest request,
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
    default void cancelReservation(io.bokun.inventory.service.booking.grpc.CancelReservationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    default void confirmBooking(io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    default void cancelBooking(io.bokun.inventory.service.booking.grpc.CancelBookingRequest request,
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
     * </pre>
     */
    default void amendBooking(io.bokun.inventory.service.booking.grpc.AmendBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.AmendBookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAmendBookingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookingService.
   */
  public static abstract class BookingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookingService.
   */
  public static final class BookingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookingServiceStub> {
    private BookingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reserve capacity for a product for limited time. Please using blocking API for this as the result of this is atomic: all requests should either
     * succeed or fail; there can be no half/success.
     * The two step process (this method + ConfirmBooking) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    public void createReservation(io.bokun.inventory.service.booking.grpc.ReservationRequest request,
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
    public void cancelReservation(io.bokun.inventory.service.booking.grpc.CancelReservationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    public void confirmBooking(io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    public void cancelBooking(io.bokun.inventory.service.booking.grpc.CancelBookingRequest request,
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
     * </pre>
     */
    public void amendBooking(io.bokun.inventory.service.booking.grpc.AmendBookingRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.AmendBookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAmendBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookingService.
   */
  public static final class BookingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reserve capacity for a product for limited time. Please using blocking API for this as the result of this is atomic: all requests should either
     * succeed or fail; there can be no half/success.
     * The two step process (this method + ConfirmBooking) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ReservationResponse createReservation(io.bokun.inventory.service.booking.grpc.ReservationRequest request) {
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
    public io.bokun.inventory.common.api.grpc.CancelReservationResponse cancelReservation(io.bokun.inventory.service.booking.grpc.CancelReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.ConfirmBookingResponse confirmBooking(io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.CancelBookingResponse cancelBooking(io.bokun.inventory.service.booking.grpc.CancelBookingRequest request) {
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
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.AmendBookingResponse amendBooking(io.bokun.inventory.service.booking.grpc.AmendBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAmendBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookingService.
   */
  public static final class BookingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reserve capacity for a product for limited time. Please using blocking API for this as the result of this is atomic: all requests should either
     * succeed or fail; there can be no half/success.
     * The two step process (this method + ConfirmBooking) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ReservationResponse> createReservation(
        io.bokun.inventory.service.booking.grpc.ReservationRequest request) {
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
        io.bokun.inventory.service.booking.grpc.CancelReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Once reserved, proceed with booking.
     * The two step process (CreateReservation + this method) is always called from the platform. If PluginDefinition::capabilities does not support
     * SUPPORTS_RESERVATIONS, inventory service will mock this call into one transaction. However this is transparent from the plaform side which
     * always makes two calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse> confirmBooking(
        io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Once booked, a booking may be cancelled using booking ref number.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.CancelBookingResponse> cancelBooking(
        io.bokun.inventory.service.booking.grpc.CancelBookingRequest request) {
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
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.AmendBookingResponse> amendBooking(
        io.bokun.inventory.service.booking.grpc.AmendBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAmendBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_CANCEL_RESERVATION = 1;
  private static final int METHODID_CONFIRM_BOOKING = 2;
  private static final int METHODID_CANCEL_BOOKING = 3;
  private static final int METHODID_AMEND_BOOKING = 4;

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
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((io.bokun.inventory.service.booking.grpc.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_CANCEL_RESERVATION:
          serviceImpl.cancelReservation((io.bokun.inventory.service.booking.grpc.CancelReservationRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelReservationResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_BOOKING:
          serviceImpl.confirmBooking((io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((io.bokun.inventory.service.booking.grpc.CancelBookingRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.CancelBookingResponse>) responseObserver);
          break;
        case METHODID_AMEND_BOOKING:
          serviceImpl.amendBooking((io.bokun.inventory.service.booking.grpc.AmendBookingRequest) request,
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
          getCreateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.booking.grpc.ReservationRequest,
              io.bokun.inventory.common.api.grpc.ReservationResponse>(
                service, METHODID_CREATE_RESERVATION)))
        .addMethod(
          getCancelReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.booking.grpc.CancelReservationRequest,
              io.bokun.inventory.common.api.grpc.CancelReservationResponse>(
                service, METHODID_CANCEL_RESERVATION)))
        .addMethod(
          getConfirmBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.booking.grpc.ConfirmBookingRequest,
              io.bokun.inventory.common.api.grpc.ConfirmBookingResponse>(
                service, METHODID_CONFIRM_BOOKING)))
        .addMethod(
          getCancelBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.booking.grpc.CancelBookingRequest,
              io.bokun.inventory.common.api.grpc.CancelBookingResponse>(
                service, METHODID_CANCEL_BOOKING)))
        .addMethod(
          getAmendBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.booking.grpc.AmendBookingRequest,
              io.bokun.inventory.common.api.grpc.AmendBookingResponse>(
                service, METHODID_AMEND_BOOKING)))
        .build();
  }

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bokun.inventory.service.booking.grpc.BookingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getCancelReservationMethod())
              .addMethod(getConfirmBookingMethod())
              .addMethod(getCancelBookingMethod())
              .addMethod(getAmendBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
