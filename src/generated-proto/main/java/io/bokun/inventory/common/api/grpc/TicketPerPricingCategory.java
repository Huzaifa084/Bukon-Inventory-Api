// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.common.api.grpc.TicketPerPricingCategory}
 */
public  final class TicketPerPricingCategory extends
    com.google.protobuf.GeneratedMessageLite<
        TicketPerPricingCategory, TicketPerPricingCategory.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.common.api.grpc.TicketPerPricingCategory)
    TicketPerPricingCategoryOrBuilder {
  private TicketPerPricingCategory() {
    pricingCategory_ = "";
  }
  public static final int PRICINGCATEGORY_FIELD_NUMBER = 1;
  private java.lang.String pricingCategory_;
  /**
   * <pre>
   * for which pricing category this ticket is for? May be unset if
   * </pre>
   *
   * <code>string pricingCategory = 1;</code>
   * @return The pricingCategory.
   */
  @java.lang.Override
  public java.lang.String getPricingCategory() {
    return pricingCategory_;
  }
  /**
   * <pre>
   * for which pricing category this ticket is for? May be unset if
   * </pre>
   *
   * <code>string pricingCategory = 1;</code>
   * @return The bytes for pricingCategory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPricingCategoryBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(pricingCategory_);
  }
  /**
   * <pre>
   * for which pricing category this ticket is for? May be unset if
   * </pre>
   *
   * <code>string pricingCategory = 1;</code>
   * @param value The pricingCategory to set.
   */
  private void setPricingCategory(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    pricingCategory_ = value;
  }
  /**
   * <pre>
   * for which pricing category this ticket is for? May be unset if
   * </pre>
   *
   * <code>string pricingCategory = 1;</code>
   */
  private void clearPricingCategory() {
    
    pricingCategory_ = getDefaultInstance().getPricingCategory();
  }
  /**
   * <pre>
   * for which pricing category this ticket is for? May be unset if
   * </pre>
   *
   * <code>string pricingCategory = 1;</code>
   * @param value The bytes for pricingCategory to set.
   */
  private void setPricingCategoryBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    pricingCategory_ = value.toStringUtf8();
    
  }

  public static final int TICKET_FIELD_NUMBER = 2;
  private io.bokun.inventory.common.api.grpc.Ticket ticket_;
  /**
   * <pre>
   * ticket for above mentioned pricing category. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
   */
  @java.lang.Override
  public boolean hasTicket() {
    return ticket_ != null;
  }
  /**
   * <pre>
   * ticket for above mentioned pricing category. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.Ticket getTicket() {
    return ticket_ == null ? io.bokun.inventory.common.api.grpc.Ticket.getDefaultInstance() : ticket_;
  }
  /**
   * <pre>
   * ticket for above mentioned pricing category. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
   */
  private void setTicket(io.bokun.inventory.common.api.grpc.Ticket value) {
    value.getClass();
  ticket_ = value;
    
    }
  /**
   * <pre>
   * ticket for above mentioned pricing category. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTicket(io.bokun.inventory.common.api.grpc.Ticket value) {
    value.getClass();
  if (ticket_ != null &&
        ticket_ != io.bokun.inventory.common.api.grpc.Ticket.getDefaultInstance()) {
      ticket_ =
        io.bokun.inventory.common.api.grpc.Ticket.newBuilder(ticket_).mergeFrom(value).buildPartial();
    } else {
      ticket_ = value;
    }
    
  }
  /**
   * <pre>
   * ticket for above mentioned pricing category. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
   */
  private void clearTicket() {  ticket_ = null;
    
  }

  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.common.api.grpc.TicketPerPricingCategory prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.common.api.grpc.TicketPerPricingCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.common.api.grpc.TicketPerPricingCategory, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.common.api.grpc.TicketPerPricingCategory)
      io.bokun.inventory.common.api.grpc.TicketPerPricingCategoryOrBuilder {
    // Construct using io.bokun.inventory.common.api.grpc.TicketPerPricingCategory.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * for which pricing category this ticket is for? May be unset if
     * </pre>
     *
     * <code>string pricingCategory = 1;</code>
     * @return The pricingCategory.
     */
    @java.lang.Override
    public java.lang.String getPricingCategory() {
      return instance.getPricingCategory();
    }
    /**
     * <pre>
     * for which pricing category this ticket is for? May be unset if
     * </pre>
     *
     * <code>string pricingCategory = 1;</code>
     * @return The bytes for pricingCategory.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPricingCategoryBytes() {
      return instance.getPricingCategoryBytes();
    }
    /**
     * <pre>
     * for which pricing category this ticket is for? May be unset if
     * </pre>
     *
     * <code>string pricingCategory = 1;</code>
     * @param value The pricingCategory to set.
     * @return This builder for chaining.
     */
    public Builder setPricingCategory(
        java.lang.String value) {
      copyOnWrite();
      instance.setPricingCategory(value);
      return this;
    }
    /**
     * <pre>
     * for which pricing category this ticket is for? May be unset if
     * </pre>
     *
     * <code>string pricingCategory = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPricingCategory() {
      copyOnWrite();
      instance.clearPricingCategory();
      return this;
    }
    /**
     * <pre>
     * for which pricing category this ticket is for? May be unset if
     * </pre>
     *
     * <code>string pricingCategory = 1;</code>
     * @param value The bytes for pricingCategory to set.
     * @return This builder for chaining.
     */
    public Builder setPricingCategoryBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPricingCategoryBytes(value);
      return this;
    }

    /**
     * <pre>
     * ticket for above mentioned pricing category. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
     */
    @java.lang.Override
    public boolean hasTicket() {
      return instance.hasTicket();
    }
    /**
     * <pre>
     * ticket for above mentioned pricing category. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.Ticket getTicket() {
      return instance.getTicket();
    }
    /**
     * <pre>
     * ticket for above mentioned pricing category. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
     */
    public Builder setTicket(io.bokun.inventory.common.api.grpc.Ticket value) {
      copyOnWrite();
      instance.setTicket(value);
      return this;
      }
    /**
     * <pre>
     * ticket for above mentioned pricing category. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
     */
    public Builder setTicket(
        io.bokun.inventory.common.api.grpc.Ticket.Builder builderForValue) {
      copyOnWrite();
      instance.setTicket(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * ticket for above mentioned pricing category. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
     */
    public Builder mergeTicket(io.bokun.inventory.common.api.grpc.Ticket value) {
      copyOnWrite();
      instance.mergeTicket(value);
      return this;
    }
    /**
     * <pre>
     * ticket for above mentioned pricing category. Mandatory.
     * </pre>
     *
     * <code>.io.bokun.inventory.common.api.grpc.Ticket ticket = 2;</code>
     */
    public Builder clearTicket() {  copyOnWrite();
      instance.clearTicket();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.common.api.grpc.TicketPerPricingCategory)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.common.api.grpc.TicketPerPricingCategory();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "pricingCategory_",
            "ticket_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.common.api.grpc.TicketPerPricingCategory> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.common.api.grpc.TicketPerPricingCategory.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.common.api.grpc.TicketPerPricingCategory>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.common.api.grpc.TicketPerPricingCategory)
  private static final io.bokun.inventory.common.api.grpc.TicketPerPricingCategory DEFAULT_INSTANCE;
  static {
    TicketPerPricingCategory defaultInstance = new TicketPerPricingCategory();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TicketPerPricingCategory.class, defaultInstance);
  }

  public static io.bokun.inventory.common.api.grpc.TicketPerPricingCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TicketPerPricingCategory> PARSER;

  public static com.google.protobuf.Parser<TicketPerPricingCategory> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

