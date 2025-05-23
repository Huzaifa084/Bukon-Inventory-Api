// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_service.proto

package io.bokun.inventory.service.plugin.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest}
 */
public  final class DeletePluginConfigurationRequest extends
    com.google.protobuf.GeneratedMessageLite<
        DeletePluginConfigurationRequest, DeletePluginConfigurationRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest)
    DeletePluginConfigurationRequestOrBuilder {
  private DeletePluginConfigurationRequest() {
    pluginId_ = "";
  }
  public static final int VENDORID_FIELD_NUMBER = 1;
  private long vendorId_;
  /**
   * <code>int64 vendorId = 1;</code>
   * @return The vendorId.
   */
  @java.lang.Override
  public long getVendorId() {
    return vendorId_;
  }
  /**
   * <code>int64 vendorId = 1;</code>
   * @param value The vendorId to set.
   */
  private void setVendorId(long value) {
    
    vendorId_ = value;
  }
  /**
   * <code>int64 vendorId = 1;</code>
   */
  private void clearVendorId() {
    
    vendorId_ = 0L;
  }

  public static final int PLUGINID_FIELD_NUMBER = 2;
  private java.lang.String pluginId_;
  /**
   * <code>string pluginId = 2;</code>
   * @return The pluginId.
   */
  @java.lang.Override
  public java.lang.String getPluginId() {
    return pluginId_;
  }
  /**
   * <code>string pluginId = 2;</code>
   * @return The bytes for pluginId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPluginIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(pluginId_);
  }
  /**
   * <code>string pluginId = 2;</code>
   * @param value The pluginId to set.
   */
  private void setPluginId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    pluginId_ = value;
  }
  /**
   * <code>string pluginId = 2;</code>
   */
  private void clearPluginId() {
    
    pluginId_ = getDefaultInstance().getPluginId();
  }
  /**
   * <code>string pluginId = 2;</code>
   * @param value The bytes for pluginId to set.
   */
  private void setPluginIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    pluginId_ = value.toStringUtf8();
    
  }

  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest)
      io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequestOrBuilder {
    // Construct using io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int64 vendorId = 1;</code>
     * @return The vendorId.
     */
    @java.lang.Override
    public long getVendorId() {
      return instance.getVendorId();
    }
    /**
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
     * <code>int64 vendorId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVendorId() {
      copyOnWrite();
      instance.clearVendorId();
      return this;
    }

    /**
     * <code>string pluginId = 2;</code>
     * @return The pluginId.
     */
    @java.lang.Override
    public java.lang.String getPluginId() {
      return instance.getPluginId();
    }
    /**
     * <code>string pluginId = 2;</code>
     * @return The bytes for pluginId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPluginIdBytes() {
      return instance.getPluginIdBytes();
    }
    /**
     * <code>string pluginId = 2;</code>
     * @param value The pluginId to set.
     * @return This builder for chaining.
     */
    public Builder setPluginId(
        java.lang.String value) {
      copyOnWrite();
      instance.setPluginId(value);
      return this;
    }
    /**
     * <code>string pluginId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPluginId() {
      copyOnWrite();
      instance.clearPluginId();
      return this;
    }
    /**
     * <code>string pluginId = 2;</code>
     * @param value The bytes for pluginId to set.
     * @return This builder for chaining.
     */
    public Builder setPluginIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPluginIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "vendorId_",
            "pluginId_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest)
  private static final io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest DEFAULT_INSTANCE;
  static {
    DeletePluginConfigurationRequest defaultInstance = new DeletePluginConfigurationRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DeletePluginConfigurationRequest.class, defaultInstance);
  }

  public static io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DeletePluginConfigurationRequest> PARSER;

  public static com.google.protobuf.Parser<DeletePluginConfigurationRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

