// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_service.proto

package io.bokun.inventory.service.plugin.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest}
 */
public  final class ListConfiguredPluginsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListConfiguredPluginsRequest, ListConfiguredPluginsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest)
    ListConfiguredPluginsRequestOrBuilder {
  private ListConfiguredPluginsRequest() {
  }
  public static final int VENDORID_FIELD_NUMBER = 1;
  private long vendorId_;
  /**
   * <pre>
   * mandatory
   * </pre>
   *
   * <code>int64 vendorId = 1;</code>
   * @return The vendorId.
   */
  @java.lang.Override
  public long getVendorId() {
    return vendorId_;
  }
  /**
   * <pre>
   * mandatory
   * </pre>
   *
   * <code>int64 vendorId = 1;</code>
   * @param value The vendorId to set.
   */
  private void setVendorId(long value) {
    
    vendorId_ = value;
  }
  /**
   * <pre>
   * mandatory
   * </pre>
   *
   * <code>int64 vendorId = 1;</code>
   */
  private void clearVendorId() {
    
    vendorId_ = 0L;
  }

  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest)
      io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequestOrBuilder {
    // Construct using io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * mandatory
     * </pre>
     *
     * <code>int64 vendorId = 1;</code>
     * @return The vendorId.
     */
    @java.lang.Override
    public long getVendorId() {
      return instance.getVendorId();
    }
    /**
     * <pre>
     * mandatory
     * </pre>
     *
     * <code>int64 vendorId = 1;</code>
     * @param value The vendorId to set.
     * @return This builder for chaining.
     */
    public Builder setVendorId(long value) {
      copyOnWrite();
      instance.setVendorId(value);
      return this;
    }
    /**
     * <pre>
     * mandatory
     * </pre>
     *
     * <code>int64 vendorId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVendorId() {
      copyOnWrite();
      instance.clearVendorId();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "vendorId_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest)
  private static final io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest DEFAULT_INSTANCE;
  static {
    ListConfiguredPluginsRequest defaultInstance = new ListConfiguredPluginsRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListConfiguredPluginsRequest.class, defaultInstance);
  }

  public static io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListConfiguredPluginsRequest> PARSER;

  public static com.google.protobuf.Parser<ListConfiguredPluginsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

