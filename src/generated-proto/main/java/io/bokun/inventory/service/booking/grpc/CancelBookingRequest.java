// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking_service.proto

package io.bokun.inventory.service.booking.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.service.booking.grpc.CancelBookingRequest}
 */
public  final class CancelBookingRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CancelBookingRequest, CancelBookingRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.service.booking.grpc.CancelBookingRequest)
    CancelBookingRequestOrBuilder {
  private CancelBookingRequest() {
    bookingConfirmationCode_ = "";
    agentCode_ = "";
  }
  public static final int BOKUNPRODUCT_FIELD_NUMBER = 1;
  private io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct_;
  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   */
  @java.lang.Override
  public boolean hasBokunProduct() {
    return bokunProduct_ != null;
  }
  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.service.common.grpc.BokunProduct getBokunProduct() {
    return bokunProduct_ == null ? io.bokun.inventory.service.common.grpc.BokunProduct.getDefaultInstance() : bokunProduct_;
  }
  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   */
  private void setBokunProduct(io.bokun.inventory.service.common.grpc.BokunProduct value) {
    value.getClass();
  bokunProduct_ = value;
    
    }
  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeBokunProduct(io.bokun.inventory.service.common.grpc.BokunProduct value) {
    value.getClass();
  if (bokunProduct_ != null &&
        bokunProduct_ != io.bokun.inventory.service.common.grpc.BokunProduct.getDefaultInstance()) {
      bokunProduct_ =
        io.bokun.inventory.service.common.grpc.BokunProduct.newBuilder(bokunProduct_).mergeFrom(value).buildPartial();
    } else {
      bokunProduct_ = value;
    }
    
  }
  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   */
  private void clearBokunProduct() {  bokunProduct_ = null;
    
  }

  public static final int BOOKINGCONFIRMATIONCODE_FIELD_NUMBER = 2;
  private java.lang.String bookingConfirmationCode_;
  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   * @return The bookingConfirmationCode.
   */
  @java.lang.Override
  public java.lang.String getBookingConfirmationCode() {
    return bookingConfirmationCode_;
  }
  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   * @return The bytes for bookingConfirmationCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBookingConfirmationCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bookingConfirmationCode_);
  }
  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   * @param value The bookingConfirmationCode to set.
   */
  private void setBookingConfirmationCode(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    bookingConfirmationCode_ = value;
  }
  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   */
  private void clearBookingConfirmationCode() {
    
    bookingConfirmationCode_ = getDefaultInstance().getBookingConfirmationCode();
  }
  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   * @param value The bytes for bookingConfirmationCode to set.
   */
  private void setBookingConfirmationCodeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    bookingConfirmationCode_ = value.toStringUtf8();
    
  }

  public static final int AGENTCODE_FIELD_NUMBER = 3;
  private java.lang.String agentCode_;
  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   * @return The agentCode.
   */
  @java.lang.Override
  public java.lang.String getAgentCode() {
    return agentCode_;
  }
  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   * @return The bytes for agentCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(agentCode_);
  }
  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   * @param value The agentCode to set.
   */
  private void setAgentCode(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    agentCode_ = value;
  }
  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   */
  private void clearAgentCode() {
    
    agentCode_ = getDefaultInstance().getAgentCode();
  }
  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   * @param value The bytes for agentCode to set.
   */
  private void setAgentCodeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    agentCode_ = value.toStringUtf8();
    
  }

  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.service.booking.grpc.CancelBookingRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.service.booking.grpc.CancelBookingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.service.booking.grpc.CancelBookingRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.service.booking.grpc.CancelBookingRequest)
      io.bokun.inventory.service.booking.grpc.CancelBookingRequestOrBuilder {
    // Construct using io.bokun.inventory.service.booking.grpc.CancelBookingRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * product, *exactly* as used with CreateReservation request. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
     */
    @java.lang.Override
    public boolean hasBokunProduct() {
      return instance.hasBokunProduct();
    }
    /**
     * <pre>
     * product, *exactly* as used with CreateReservation request. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.service.common.grpc.BokunProduct getBokunProduct() {
      return instance.getBokunProduct();
    }
    /**
     * <pre>
     * product, *exactly* as used with CreateReservation request. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
     */
    public Builder setBokunProduct(io.bokun.inventory.service.common.grpc.BokunProduct value) {
      copyOnWrite();
      instance.setBokunProduct(value);
      return this;
      }
    /**
     * <pre>
     * product, *exactly* as used with CreateReservation request. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
     */
    public Builder setBokunProduct(
        io.bokun.inventory.service.common.grpc.BokunProduct.Builder builderForValue) {
      copyOnWrite();
      instance.setBokunProduct(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * product, *exactly* as used with CreateReservation request. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
     */
    public Builder mergeBokunProduct(io.bokun.inventory.service.common.grpc.BokunProduct value) {
      copyOnWrite();
      instance.mergeBokunProduct(value);
      return this;
    }
    /**
     * <pre>
     * product, *exactly* as used with CreateReservation request. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
     */
    public Builder clearBokunProduct() {  copyOnWrite();
      instance.clearBokunProduct();
      return this;
    }

    /**
     * <pre>
     * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
     * </pre>
     *
     * <code>string bookingConfirmationCode = 2;</code>
     * @return The bookingConfirmationCode.
     */
    @java.lang.Override
    public java.lang.String getBookingConfirmationCode() {
      return instance.getBookingConfirmationCode();
    }
    /**
     * <pre>
     * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
     * </pre>
     *
     * <code>string bookingConfirmationCode = 2;</code>
     * @return The bytes for bookingConfirmationCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBookingConfirmationCodeBytes() {
      return instance.getBookingConfirmationCodeBytes();
    }
    /**
     * <pre>
     * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
     * </pre>
     *
     * <code>string bookingConfirmationCode = 2;</code>
     * @param value The bookingConfirmationCode to set.
     * @return This builder for chaining.
     */
    public Builder setBookingConfirmationCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setBookingConfirmationCode(value);
      return this;
    }
    /**
     * <pre>
     * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
     * </pre>
     *
     * <code>string bookingConfirmationCode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBookingConfirmationCode() {
      copyOnWrite();
      instance.clearBookingConfirmationCode();
      return this;
    }
    /**
     * <pre>
     * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
     * </pre>
     *
     * <code>string bookingConfirmationCode = 2;</code>
     * @param value The bytes for bookingConfirmationCode to set.
     * @return This builder for chaining.
     */
    public Builder setBookingConfirmationCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBookingConfirmationCodeBytes(value);
      return this;
    }

    /**
     * <pre>
     * agent code if passed. Optional.
     * </pre>
     *
     * <code>string agentCode = 3;</code>
     * @return The agentCode.
     */
    @java.lang.Override
    public java.lang.String getAgentCode() {
      return instance.getAgentCode();
    }
    /**
     * <pre>
     * agent code if passed. Optional.
     * </pre>
     *
     * <code>string agentCode = 3;</code>
     * @return The bytes for agentCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAgentCodeBytes() {
      return instance.getAgentCodeBytes();
    }
    /**
     * <pre>
     * agent code if passed. Optional.
     * </pre>
     *
     * <code>string agentCode = 3;</code>
     * @param value The agentCode to set.
     * @return This builder for chaining.
     */
    public Builder setAgentCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setAgentCode(value);
      return this;
    }
    /**
     * <pre>
     * agent code if passed. Optional.
     * </pre>
     *
     * <code>string agentCode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentCode() {
      copyOnWrite();
      instance.clearAgentCode();
      return this;
    }
    /**
     * <pre>
     * agent code if passed. Optional.
     * </pre>
     *
     * <code>string agentCode = 3;</code>
     * @param value The bytes for agentCode to set.
     * @return This builder for chaining.
     */
    public Builder setAgentCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAgentCodeBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.service.booking.grpc.CancelBookingRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.service.booking.grpc.CancelBookingRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bokunProduct_",
            "bookingConfirmationCode_",
            "agentCode_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.service.booking.grpc.CancelBookingRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.service.booking.grpc.CancelBookingRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.service.booking.grpc.CancelBookingRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.service.booking.grpc.CancelBookingRequest)
  private static final io.bokun.inventory.service.booking.grpc.CancelBookingRequest DEFAULT_INSTANCE;
  static {
    CancelBookingRequest defaultInstance = new CancelBookingRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CancelBookingRequest.class, defaultInstance);
  }

  public static io.bokun.inventory.service.booking.grpc.CancelBookingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CancelBookingRequest> PARSER;

  public static com.google.protobuf.Parser<CancelBookingRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

