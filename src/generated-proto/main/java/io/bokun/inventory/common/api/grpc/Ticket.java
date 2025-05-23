// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.common.api.grpc.Ticket}
 */
public  final class Ticket extends
    com.google.protobuf.GeneratedMessageLite<
        Ticket, Ticket.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.common.api.grpc.Ticket)
    TicketOrBuilder {
  private Ticket() {
  }
  private int ticketCase_ = 0;
  private java.lang.Object ticket_;
  public enum TicketCase {
    BINARYTICKET(1),
    QRTICKET(2),
    DATAMATRIXTICKET(3),
    TICKET_NOT_SET(0);
    private final int value;
    private TicketCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TicketCase valueOf(int value) {
      return forNumber(value);
    }

    public static TicketCase forNumber(int value) {
      switch (value) {
        case 1: return BINARYTICKET;
        case 2: return QRTICKET;
        case 3: return DATAMATRIXTICKET;
        case 0: return TICKET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public TicketCase
  getTicketCase() {
    return TicketCase.forNumber(
        ticketCase_);
  }

  private void clearTicket() {
    ticketCase_ = 0;
    ticket_ = null;
  }

  public static final int BINARYTICKET_FIELD_NUMBER = 1;
  /**
   * <pre>
   * &#64;see TicketType#BINARY
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
   */
  @java.lang.Override
  public boolean hasBinaryTicket() {
    return ticketCase_ == 1;
  }
  /**
   * <pre>
   * &#64;see TicketType#BINARY
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.BinaryTicket getBinaryTicket() {
    if (ticketCase_ == 1) {
       return (io.bokun.inventory.common.api.grpc.BinaryTicket) ticket_;
    }
    return io.bokun.inventory.common.api.grpc.BinaryTicket.getDefaultInstance();
  }
  /**
   * <pre>
   * &#64;see TicketType#BINARY
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
   */
  private void setBinaryTicket(io.bokun.inventory.common.api.grpc.BinaryTicket value) {
    value.getClass();
  ticket_ = value;
    ticketCase_ = 1;
  }
  /**
   * <pre>
   * &#64;see TicketType#BINARY
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
   */
  private void mergeBinaryTicket(io.bokun.inventory.common.api.grpc.BinaryTicket value) {
    value.getClass();
  if (ticketCase_ == 1 &&
        ticket_ != io.bokun.inventory.common.api.grpc.BinaryTicket.getDefaultInstance()) {
      ticket_ = io.bokun.inventory.common.api.grpc.BinaryTicket.newBuilder((io.bokun.inventory.common.api.grpc.BinaryTicket) ticket_)
          .mergeFrom(value).buildPartial();
    } else {
      ticket_ = value;
    }
    ticketCase_ = 1;
  }
  /**
   * <pre>
   * &#64;see TicketType#BINARY
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
   */
  private void clearBinaryTicket() {
    if (ticketCase_ == 1) {
      ticketCase_ = 0;
      ticket_ = null;
    }
  }

  public static final int QRTICKET_FIELD_NUMBER = 2;
  /**
   * <pre>
   * &#64;see TicketType#QR_CODE
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
   */
  @java.lang.Override
  public boolean hasQrTicket() {
    return ticketCase_ == 2;
  }
  /**
   * <pre>
   * &#64;see TicketType#QR_CODE
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.QrTicket getQrTicket() {
    if (ticketCase_ == 2) {
       return (io.bokun.inventory.common.api.grpc.QrTicket) ticket_;
    }
    return io.bokun.inventory.common.api.grpc.QrTicket.getDefaultInstance();
  }
  /**
   * <pre>
   * &#64;see TicketType#QR_CODE
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
   */
  private void setQrTicket(io.bokun.inventory.common.api.grpc.QrTicket value) {
    value.getClass();
  ticket_ = value;
    ticketCase_ = 2;
  }
  /**
   * <pre>
   * &#64;see TicketType#QR_CODE
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
   */
  private void mergeQrTicket(io.bokun.inventory.common.api.grpc.QrTicket value) {
    value.getClass();
  if (ticketCase_ == 2 &&
        ticket_ != io.bokun.inventory.common.api.grpc.QrTicket.getDefaultInstance()) {
      ticket_ = io.bokun.inventory.common.api.grpc.QrTicket.newBuilder((io.bokun.inventory.common.api.grpc.QrTicket) ticket_)
          .mergeFrom(value).buildPartial();
    } else {
      ticket_ = value;
    }
    ticketCase_ = 2;
  }
  /**
   * <pre>
   * &#64;see TicketType#QR_CODE
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
   */
  private void clearQrTicket() {
    if (ticketCase_ == 2) {
      ticketCase_ = 0;
      ticket_ = null;
    }
  }

  public static final int DATAMATRIXTICKET_FIELD_NUMBER = 3;
  /**
   * <pre>
   * &#64;see TicketType#DATA_MATRIX
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
   */
  @java.lang.Override
  public boolean hasDataMatrixTicket() {
    return ticketCase_ == 3;
  }
  /**
   * <pre>
   * &#64;see TicketType#DATA_MATRIX
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.DataMatrixTicket getDataMatrixTicket() {
    if (ticketCase_ == 3) {
       return (io.bokun.inventory.common.api.grpc.DataMatrixTicket) ticket_;
    }
    return io.bokun.inventory.common.api.grpc.DataMatrixTicket.getDefaultInstance();
  }
  /**
   * <pre>
   * &#64;see TicketType#DATA_MATRIX
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
   */
  private void setDataMatrixTicket(io.bokun.inventory.common.api.grpc.DataMatrixTicket value) {
    value.getClass();
  ticket_ = value;
    ticketCase_ = 3;
  }
  /**
   * <pre>
   * &#64;see TicketType#DATA_MATRIX
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
   */
  private void mergeDataMatrixTicket(io.bokun.inventory.common.api.grpc.DataMatrixTicket value) {
    value.getClass();
  if (ticketCase_ == 3 &&
        ticket_ != io.bokun.inventory.common.api.grpc.DataMatrixTicket.getDefaultInstance()) {
      ticket_ = io.bokun.inventory.common.api.grpc.DataMatrixTicket.newBuilder((io.bokun.inventory.common.api.grpc.DataMatrixTicket) ticket_)
          .mergeFrom(value).buildPartial();
    } else {
      ticket_ = value;
    }
    ticketCase_ = 3;
  }
  /**
   * <pre>
   * &#64;see TicketType#DATA_MATRIX
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
   */
  private void clearDataMatrixTicket() {
    if (ticketCase_ == 3) {
      ticketCase_ = 0;
      ticket_ = null;
    }
  }

  public static final int EXPIRYDATE_FIELD_NUMBER = 4;
  private io.bokun.inventory.common.api.grpc.Date expiryDate_;
  /**
   * <pre>
   * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
   */
  @java.lang.Override
  public boolean hasExpiryDate() {
    return expiryDate_ != null;
  }
  /**
   * <pre>
   * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.Date getExpiryDate() {
    return expiryDate_ == null ? io.bokun.inventory.common.api.grpc.Date.getDefaultInstance() : expiryDate_;
  }
  /**
   * <pre>
   * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
   */
  private void setExpiryDate(io.bokun.inventory.common.api.grpc.Date value) {
    value.getClass();
  expiryDate_ = value;
    
    }
  /**
   * <pre>
   * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeExpiryDate(io.bokun.inventory.common.api.grpc.Date value) {
    value.getClass();
  if (expiryDate_ != null &&
        expiryDate_ != io.bokun.inventory.common.api.grpc.Date.getDefaultInstance()) {
      expiryDate_ =
        io.bokun.inventory.common.api.grpc.Date.newBuilder(expiryDate_).mergeFrom(value).buildPartial();
    } else {
      expiryDate_ = value;
    }
    
  }
  /**
   * <pre>
   * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
   */
  private void clearExpiryDate() {  expiryDate_ = null;
    
  }

  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.Ticket parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.common.api.grpc.Ticket prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.common.api.grpc.Ticket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.common.api.grpc.Ticket, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.common.api.grpc.Ticket)
      io.bokun.inventory.common.api.grpc.TicketOrBuilder {
    // Construct using io.bokun.inventory.common.api.grpc.Ticket.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public TicketCase
        getTicketCase() {
      return instance.getTicketCase();
    }

    public Builder clearTicket() {
      copyOnWrite();
      instance.clearTicket();
      return this;
    }


    /**
     * <pre>
     * &#64;see TicketType#BINARY
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
     */
    @java.lang.Override
    public boolean hasBinaryTicket() {
      return instance.hasBinaryTicket();
    }
    /**
     * <pre>
     * &#64;see TicketType#BINARY
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.BinaryTicket getBinaryTicket() {
      return instance.getBinaryTicket();
    }
    /**
     * <pre>
     * &#64;see TicketType#BINARY
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
     */
    public Builder setBinaryTicket(io.bokun.inventory.common.api.grpc.BinaryTicket value) {
      copyOnWrite();
      instance.setBinaryTicket(value);
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#BINARY
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
     */
    public Builder setBinaryTicket(
        io.bokun.inventory.common.api.grpc.BinaryTicket.Builder builderForValue) {
      copyOnWrite();
      instance.setBinaryTicket(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#BINARY
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
     */
    public Builder mergeBinaryTicket(io.bokun.inventory.common.api.grpc.BinaryTicket value) {
      copyOnWrite();
      instance.mergeBinaryTicket(value);
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#BINARY
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.BinaryTicket binaryTicket = 1;</code>
     */
    public Builder clearBinaryTicket() {
      copyOnWrite();
      instance.clearBinaryTicket();
      return this;
    }

    /**
     * <pre>
     * &#64;see TicketType#QR_CODE
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
     */
    @java.lang.Override
    public boolean hasQrTicket() {
      return instance.hasQrTicket();
    }
    /**
     * <pre>
     * &#64;see TicketType#QR_CODE
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.QrTicket getQrTicket() {
      return instance.getQrTicket();
    }
    /**
     * <pre>
     * &#64;see TicketType#QR_CODE
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
     */
    public Builder setQrTicket(io.bokun.inventory.common.api.grpc.QrTicket value) {
      copyOnWrite();
      instance.setQrTicket(value);
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#QR_CODE
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
     */
    public Builder setQrTicket(
        io.bokun.inventory.common.api.grpc.QrTicket.Builder builderForValue) {
      copyOnWrite();
      instance.setQrTicket(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#QR_CODE
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
     */
    public Builder mergeQrTicket(io.bokun.inventory.common.api.grpc.QrTicket value) {
      copyOnWrite();
      instance.mergeQrTicket(value);
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#QR_CODE
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.QrTicket qrTicket = 2;</code>
     */
    public Builder clearQrTicket() {
      copyOnWrite();
      instance.clearQrTicket();
      return this;
    }

    /**
     * <pre>
     * &#64;see TicketType#DATA_MATRIX
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
     */
    @java.lang.Override
    public boolean hasDataMatrixTicket() {
      return instance.hasDataMatrixTicket();
    }
    /**
     * <pre>
     * &#64;see TicketType#DATA_MATRIX
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.DataMatrixTicket getDataMatrixTicket() {
      return instance.getDataMatrixTicket();
    }
    /**
     * <pre>
     * &#64;see TicketType#DATA_MATRIX
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
     */
    public Builder setDataMatrixTicket(io.bokun.inventory.common.api.grpc.DataMatrixTicket value) {
      copyOnWrite();
      instance.setDataMatrixTicket(value);
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#DATA_MATRIX
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
     */
    public Builder setDataMatrixTicket(
        io.bokun.inventory.common.api.grpc.DataMatrixTicket.Builder builderForValue) {
      copyOnWrite();
      instance.setDataMatrixTicket(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#DATA_MATRIX
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
     */
    public Builder mergeDataMatrixTicket(io.bokun.inventory.common.api.grpc.DataMatrixTicket value) {
      copyOnWrite();
      instance.mergeDataMatrixTicket(value);
      return this;
    }
    /**
     * <pre>
     * &#64;see TicketType#DATA_MATRIX
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.DataMatrixTicket dataMatrixTicket = 3;</code>
     */
    public Builder clearDataMatrixTicket() {
      copyOnWrite();
      instance.clearDataMatrixTicket();
      return this;
    }

    /**
     * <pre>
     * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
     */
    @java.lang.Override
    public boolean hasExpiryDate() {
      return instance.hasExpiryDate();
    }
    /**
     * <pre>
     * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.Date getExpiryDate() {
      return instance.getExpiryDate();
    }
    /**
     * <pre>
     * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
     */
    public Builder setExpiryDate(io.bokun.inventory.common.api.grpc.Date value) {
      copyOnWrite();
      instance.setExpiryDate(value);
      return this;
      }
    /**
     * <pre>
     * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
     */
    public Builder setExpiryDate(
        io.bokun.inventory.common.api.grpc.Date.Builder builderForValue) {
      copyOnWrite();
      instance.setExpiryDate(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
     */
    public Builder mergeExpiryDate(io.bokun.inventory.common.api.grpc.Date value) {
      copyOnWrite();
      instance.mergeExpiryDate(value);
      return this;
    }
    /**
     * <pre>
     * For when ticket expiry dates are dynamic in the plugin and should override the one set in the platform. Optional.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Date expiryDate = 4;</code>
     */
    public Builder clearExpiryDate() {  copyOnWrite();
      instance.clearExpiryDate();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.common.api.grpc.Ticket)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.common.api.grpc.Ticket();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "ticket_",
            "ticketCase_",
            io.bokun.inventory.common.api.grpc.BinaryTicket.class,
            io.bokun.inventory.common.api.grpc.QrTicket.class,
            io.bokun.inventory.common.api.grpc.DataMatrixTicket.class,
            "expiryDate_",
          };
          java.lang.String info =
              "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<" +
              "\u0000\u0003<\u0000\u0004\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.common.api.grpc.Ticket> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.common.api.grpc.Ticket.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.common.api.grpc.Ticket>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.common.api.grpc.Ticket)
  private static final io.bokun.inventory.common.api.grpc.Ticket DEFAULT_INSTANCE;
  static {
    Ticket defaultInstance = new Ticket();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Ticket.class, defaultInstance);
  }

  public static io.bokun.inventory.common.api.grpc.Ticket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Ticket> PARSER;

  public static com.google.protobuf.Parser<Ticket> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

