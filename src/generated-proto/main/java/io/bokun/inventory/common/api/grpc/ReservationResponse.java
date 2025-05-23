// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.common.api.grpc.ReservationResponse}
 */
public  final class ReservationResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ReservationResponse, ReservationResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.common.api.grpc.ReservationResponse)
    ReservationResponseOrBuilder {
  private ReservationResponse() {
  }
  private int reservationResultCase_ = 0;
  private java.lang.Object reservationResult_;
  public enum ReservationResultCase {
    SUCCESSFULRESERVATION(1),
    FAILEDRESERVATION(2),
    RESERVATIONRESULT_NOT_SET(0);
    private final int value;
    private ReservationResultCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReservationResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ReservationResultCase forNumber(int value) {
      switch (value) {
        case 1: return SUCCESSFULRESERVATION;
        case 2: return FAILEDRESERVATION;
        case 0: return RESERVATIONRESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ReservationResultCase
  getReservationResultCase() {
    return ReservationResultCase.forNumber(
        reservationResultCase_);
  }

  private void clearReservationResult() {
    reservationResultCase_ = 0;
    reservationResult_ = null;
  }

  public static final int SUCCESSFULRESERVATION_FIELD_NUMBER = 1;
  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
   */
  @java.lang.Override
  public boolean hasSuccessfulReservation() {
    return reservationResultCase_ == 1;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.SuccessfulReservation getSuccessfulReservation() {
    if (reservationResultCase_ == 1) {
       return (io.bokun.inventory.common.api.grpc.SuccessfulReservation) reservationResult_;
    }
    return io.bokun.inventory.common.api.grpc.SuccessfulReservation.getDefaultInstance();
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
   */
  private void setSuccessfulReservation(io.bokun.inventory.common.api.grpc.SuccessfulReservation value) {
    value.getClass();
  reservationResult_ = value;
    reservationResultCase_ = 1;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
   */
  private void mergeSuccessfulReservation(io.bokun.inventory.common.api.grpc.SuccessfulReservation value) {
    value.getClass();
  if (reservationResultCase_ == 1 &&
        reservationResult_ != io.bokun.inventory.common.api.grpc.SuccessfulReservation.getDefaultInstance()) {
      reservationResult_ = io.bokun.inventory.common.api.grpc.SuccessfulReservation.newBuilder((io.bokun.inventory.common.api.grpc.SuccessfulReservation) reservationResult_)
          .mergeFrom(value).buildPartial();
    } else {
      reservationResult_ = value;
    }
    reservationResultCase_ = 1;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
   */
  private void clearSuccessfulReservation() {
    if (reservationResultCase_ == 1) {
      reservationResultCase_ = 0;
      reservationResult_ = null;
    }
  }

  public static final int FAILEDRESERVATION_FIELD_NUMBER = 2;
  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
   */
  @java.lang.Override
  public boolean hasFailedReservation() {
    return reservationResultCase_ == 2;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.FailedReservation getFailedReservation() {
    if (reservationResultCase_ == 2) {
       return (io.bokun.inventory.common.api.grpc.FailedReservation) reservationResult_;
    }
    return io.bokun.inventory.common.api.grpc.FailedReservation.getDefaultInstance();
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
   */
  private void setFailedReservation(io.bokun.inventory.common.api.grpc.FailedReservation value) {
    value.getClass();
  reservationResult_ = value;
    reservationResultCase_ = 2;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
   */
  private void mergeFailedReservation(io.bokun.inventory.common.api.grpc.FailedReservation value) {
    value.getClass();
  if (reservationResultCase_ == 2 &&
        reservationResult_ != io.bokun.inventory.common.api.grpc.FailedReservation.getDefaultInstance()) {
      reservationResult_ = io.bokun.inventory.common.api.grpc.FailedReservation.newBuilder((io.bokun.inventory.common.api.grpc.FailedReservation) reservationResult_)
          .mergeFrom(value).buildPartial();
    } else {
      reservationResult_ = value;
    }
    reservationResultCase_ = 2;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
   */
  private void clearFailedReservation() {
    if (reservationResultCase_ == 2) {
      reservationResultCase_ = 0;
      reservationResult_ = null;
    }
  }

  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.ReservationResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.common.api.grpc.ReservationResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.common.api.grpc.ReservationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.common.api.grpc.ReservationResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.common.api.grpc.ReservationResponse)
      io.bokun.inventory.common.api.grpc.ReservationResponseOrBuilder {
    // Construct using io.bokun.inventory.common.api.grpc.ReservationResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ReservationResultCase
        getReservationResultCase() {
      return instance.getReservationResultCase();
    }

    public Builder clearReservationResult() {
      copyOnWrite();
      instance.clearReservationResult();
      return this;
    }


    /**
     * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
     */
    @java.lang.Override
    public boolean hasSuccessfulReservation() {
      return instance.hasSuccessfulReservation();
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.SuccessfulReservation getSuccessfulReservation() {
      return instance.getSuccessfulReservation();
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
     */
    public Builder setSuccessfulReservation(io.bokun.inventory.common.api.grpc.SuccessfulReservation value) {
      copyOnWrite();
      instance.setSuccessfulReservation(value);
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
     */
    public Builder setSuccessfulReservation(
        io.bokun.inventory.common.api.grpc.SuccessfulReservation.Builder builderForValue) {
      copyOnWrite();
      instance.setSuccessfulReservation(builderForValue.build());
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
     */
    public Builder mergeSuccessfulReservation(io.bokun.inventory.common.api.grpc.SuccessfulReservation value) {
      copyOnWrite();
      instance.mergeSuccessfulReservation(value);
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.SuccessfulReservation successfulReservation = 1;</code>
     */
    public Builder clearSuccessfulReservation() {
      copyOnWrite();
      instance.clearSuccessfulReservation();
      return this;
    }

    /**
     * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
     */
    @java.lang.Override
    public boolean hasFailedReservation() {
      return instance.hasFailedReservation();
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.FailedReservation getFailedReservation() {
      return instance.getFailedReservation();
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
     */
    public Builder setFailedReservation(io.bokun.inventory.common.api.grpc.FailedReservation value) {
      copyOnWrite();
      instance.setFailedReservation(value);
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
     */
    public Builder setFailedReservation(
        io.bokun.inventory.common.api.grpc.FailedReservation.Builder builderForValue) {
      copyOnWrite();
      instance.setFailedReservation(builderForValue.build());
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
     */
    public Builder mergeFailedReservation(io.bokun.inventory.common.api.grpc.FailedReservation value) {
      copyOnWrite();
      instance.mergeFailedReservation(value);
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.FailedReservation failedReservation = 2;</code>
     */
    public Builder clearFailedReservation() {
      copyOnWrite();
      instance.clearFailedReservation();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.common.api.grpc.ReservationResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.common.api.grpc.ReservationResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "reservationResult_",
            "reservationResultCase_",
            io.bokun.inventory.common.api.grpc.SuccessfulReservation.class,
            io.bokun.inventory.common.api.grpc.FailedReservation.class,
          };
          java.lang.String info =
              "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<" +
              "\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.common.api.grpc.ReservationResponse> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.common.api.grpc.ReservationResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.common.api.grpc.ReservationResponse>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.common.api.grpc.ReservationResponse)
  private static final io.bokun.inventory.common.api.grpc.ReservationResponse DEFAULT_INSTANCE;
  static {
    ReservationResponse defaultInstance = new ReservationResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ReservationResponse.class, defaultInstance);
  }

  public static io.bokun.inventory.common.api.grpc.ReservationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ReservationResponse> PARSER;

  public static com.google.protobuf.Parser<ReservationResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

