// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_api.proto

package io.bokun.inventory.plugin.api.grpc;

/**
 * <pre>
 * Parameters used to configure supported plugin(s)
 * </pre>
 *
 * Protobuf type {@code io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter}
 */
public  final class PluginConfigurationParameter extends
    com.google.protobuf.GeneratedMessageLite<
        PluginConfigurationParameter, PluginConfigurationParameter.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter)
    PluginConfigurationParameterOrBuilder {
  private PluginConfigurationParameter() {
    name_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * names should be unique
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * names should be unique
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * names should be unique
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * names should be unique
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * names should be unique
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.PluginParameterDataType getType() {
    io.bokun.inventory.common.api.grpc.PluginParameterDataType result = io.bokun.inventory.common.api.grpc.PluginParameterDataType.forNumber(type_);
    return result == null ? io.bokun.inventory.common.api.grpc.PluginParameterDataType.UNRECOGNIZED : result;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
   * @param value The enum numeric value on the wire for type to set.
   */
  private void setTypeValue(int value) {
      type_ = value;
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
   * @param value The type to set.
   */
  private void setType(io.bokun.inventory.common.api.grpc.PluginParameterDataType value) {
    type_ = value.getNumber();
    
  }
  /**
   * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
   */
  private void clearType() {
    
    type_ = 0;
  }

  public static final int REQUIRED_FIELD_NUMBER = 3;
  private boolean required_;
  /**
   * <code>bool required = 3;</code>
   * @return The required.
   */
  @java.lang.Override
  public boolean getRequired() {
    return required_;
  }
  /**
   * <code>bool required = 3;</code>
   * @param value The required to set.
   */
  private void setRequired(boolean value) {
    
    required_ = value;
  }
  /**
   * <code>bool required = 3;</code>
   */
  private void clearRequired() {
    
    required_ = false;
  }

  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Parameters used to configure supported plugin(s)
   * </pre>
   *
   * Protobuf type {@code io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter)
      io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameterOrBuilder {
    // Construct using io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * names should be unique
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * names should be unique
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * names should be unique
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * names should be unique
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * names should be unique
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return instance.getTypeValue();
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      copyOnWrite();
      instance.setTypeValue(value);
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.PluginParameterDataType getType() {
      return instance.getType();
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setType(io.bokun.inventory.common.api.grpc.PluginParameterDataType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>.io.bokun.inventory.common.api.grpc.PluginParameterDataType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <code>bool required = 3;</code>
     * @return The required.
     */
    @java.lang.Override
    public boolean getRequired() {
      return instance.getRequired();
    }
    /**
     * <code>bool required = 3;</code>
     * @param value The required to set.
     * @return This builder for chaining.
     */
    public Builder setRequired(boolean value) {
      copyOnWrite();
      instance.setRequired(value);
      return this;
    }
    /**
     * <code>bool required = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequired() {
      copyOnWrite();
      instance.clearRequired();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "type_",
            "required_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f" +
              "\u0003\u0007";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter)
  private static final io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter DEFAULT_INSTANCE;
  static {
    PluginConfigurationParameter defaultInstance = new PluginConfigurationParameter();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PluginConfigurationParameter.class, defaultInstance);
  }

  public static io.bokun.inventory.plugin.api.grpc.PluginConfigurationParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PluginConfigurationParameter> PARSER;

  public static com.google.protobuf.Parser<PluginConfigurationParameter> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

