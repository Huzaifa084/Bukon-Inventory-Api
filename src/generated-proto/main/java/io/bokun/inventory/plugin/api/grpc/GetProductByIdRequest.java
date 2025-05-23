// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_api.proto

package io.bokun.inventory.plugin.api.grpc;

/**
 * Protobuf type {@code io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest}
 */
public  final class GetProductByIdRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetProductByIdRequest, GetProductByIdRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest)
    GetProductByIdRequestOrBuilder {
  private GetProductByIdRequest() {
    parameters_ = emptyProtobufList();
    externalId_ = "";
  }
  public static final int PARAMETERS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue> parameters_;
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue> getParametersList() {
    return parameters_;
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  public java.util.List<? extends io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValueOrBuilder> 
      getParametersOrBuilderList() {
    return parameters_;
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  @java.lang.Override
  public int getParametersCount() {
    return parameters_.size();
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  @java.lang.Override
  public io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue getParameters(int index) {
    return parameters_.get(index);
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  public io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValueOrBuilder getParametersOrBuilder(
      int index) {
    return parameters_.get(index);
  }
  private void ensureParametersIsMutable() {
    com.google.protobuf.Internal.ProtobufList<io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue> tmp = parameters_;
    if (!tmp.isModifiable()) {
      parameters_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  private void setParameters(
      int index, io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue value) {
    value.getClass();
  ensureParametersIsMutable();
    parameters_.set(index, value);
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  private void addParameters(io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue value) {
    value.getClass();
  ensureParametersIsMutable();
    parameters_.add(value);
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  private void addParameters(
      int index, io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue value) {
    value.getClass();
  ensureParametersIsMutable();
    parameters_.add(index, value);
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  private void addAllParameters(
      java.lang.Iterable<? extends io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue> values) {
    ensureParametersIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, parameters_);
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  private void clearParameters() {
    parameters_ = emptyProtobufList();
  }
  /**
   * <pre>
   * plugin config parameters. Mandatory.
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
   */
  private void removeParameters(int index) {
    ensureParametersIsMutable();
    parameters_.remove(index);
  }

  public static final int EXTERNALID_FIELD_NUMBER = 2;
  private java.lang.String externalId_;
  /**
   * <pre>
   * reference to product id on the remote end. Mandatory
   * </pre>
   *
   * <code>string externalId = 2;</code>
   * @return The externalId.
   */
  @java.lang.Override
  public java.lang.String getExternalId() {
    return externalId_;
  }
  /**
   * <pre>
   * reference to product id on the remote end. Mandatory
   * </pre>
   *
   * <code>string externalId = 2;</code>
   * @return The bytes for externalId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(externalId_);
  }
  /**
   * <pre>
   * reference to product id on the remote end. Mandatory
   * </pre>
   *
   * <code>string externalId = 2;</code>
   * @param value The externalId to set.
   */
  private void setExternalId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    externalId_ = value;
  }
  /**
   * <pre>
   * reference to product id on the remote end. Mandatory
   * </pre>
   *
   * <code>string externalId = 2;</code>
   */
  private void clearExternalId() {
    
    externalId_ = getDefaultInstance().getExternalId();
  }
  /**
   * <pre>
   * reference to product id on the remote end. Mandatory
   * </pre>
   *
   * <code>string externalId = 2;</code>
   * @param value The bytes for externalId to set.
   */
  private void setExternalIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    externalId_ = value.toStringUtf8();
    
  }

  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest)
      io.bokun.inventory.plugin.api.grpc.GetProductByIdRequestOrBuilder {
    // Construct using io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    @java.lang.Override
    public java.util.List<io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue> getParametersList() {
      return java.util.Collections.unmodifiableList(
          instance.getParametersList());
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    @java.lang.Override
    public int getParametersCount() {
      return instance.getParametersCount();
    }/**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    @java.lang.Override
    public io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue getParameters(int index) {
      return instance.getParameters(index);
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder setParameters(
        int index, io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue value) {
      copyOnWrite();
      instance.setParameters(index, value);
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder setParameters(
        int index, io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue.Builder builderForValue) {
      copyOnWrite();
      instance.setParameters(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder addParameters(io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue value) {
      copyOnWrite();
      instance.addParameters(value);
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder addParameters(
        int index, io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue value) {
      copyOnWrite();
      instance.addParameters(index, value);
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder addParameters(
        io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue.Builder builderForValue) {
      copyOnWrite();
      instance.addParameters(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder addParameters(
        int index, io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue.Builder builderForValue) {
      copyOnWrite();
      instance.addParameters(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder addAllParameters(
        java.lang.Iterable<? extends io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue> values) {
      copyOnWrite();
      instance.addAllParameters(values);
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder clearParameters() {
      copyOnWrite();
      instance.clearParameters();
      return this;
    }
    /**
     * <pre>
     * plugin config parameters. Mandatory.
     * </pre>
     *
     * <code>repeated .io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue parameters = 1;</code>
     */
    public Builder removeParameters(int index) {
      copyOnWrite();
      instance.removeParameters(index);
      return this;
    }

    /**
     * <pre>
     * reference to product id on the remote end. Mandatory
     * </pre>
     *
     * <code>string externalId = 2;</code>
     * @return The externalId.
     */
    @java.lang.Override
    public java.lang.String getExternalId() {
      return instance.getExternalId();
    }
    /**
     * <pre>
     * reference to product id on the remote end. Mandatory
     * </pre>
     *
     * <code>string externalId = 2;</code>
     * @return The bytes for externalId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExternalIdBytes() {
      return instance.getExternalIdBytes();
    }
    /**
     * <pre>
     * reference to product id on the remote end. Mandatory
     * </pre>
     *
     * <code>string externalId = 2;</code>
     * @param value The externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalId(
        java.lang.String value) {
      copyOnWrite();
      instance.setExternalId(value);
      return this;
    }
    /**
     * <pre>
     * reference to product id on the remote end. Mandatory
     * </pre>
     *
     * <code>string externalId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalId() {
      copyOnWrite();
      instance.clearExternalId();
      return this;
    }
    /**
     * <pre>
     * reference to product id on the remote end. Mandatory
     * </pre>
     *
     * <code>string externalId = 2;</code>
     * @param value The bytes for externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setExternalIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "parameters_",
            io.bokun.inventory.common.api.grpc.PluginConfigurationParameterValue.class,
            "externalId_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest>(
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


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest)
  private static final io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest DEFAULT_INSTANCE;
  static {
    GetProductByIdRequest defaultInstance = new GetProductByIdRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetProductByIdRequest.class, defaultInstance);
  }

  public static io.bokun.inventory.plugin.api.grpc.GetProductByIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetProductByIdRequest> PARSER;

  public static com.google.protobuf.Parser<GetProductByIdRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

