package io.bokun.inventory.service.plugin.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: plugin_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PluginServiceGrpc {

  private PluginServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.bokun.inventory.service.plugin.grpc.PluginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginUrl,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getRegisterPluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPlugin",
      requestType = io.bokun.inventory.service.plugin.grpc.PluginUrl.class,
      responseType = io.bokun.inventory.service.plugin.grpc.PluginDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginUrl,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getRegisterPluginMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginUrl, io.bokun.inventory.service.plugin.grpc.PluginDefinition> getRegisterPluginMethod;
    if ((getRegisterPluginMethod = PluginServiceGrpc.getRegisterPluginMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getRegisterPluginMethod = PluginServiceGrpc.getRegisterPluginMethod) == null) {
          PluginServiceGrpc.getRegisterPluginMethod = getRegisterPluginMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.PluginUrl, io.bokun.inventory.service.plugin.grpc.PluginDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("RegisterPlugin"))
              .build();
        }
      }
    }
    return getRegisterPluginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.MovePluginRequest,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getMovePluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MovePlugin",
      requestType = io.bokun.inventory.service.plugin.grpc.MovePluginRequest.class,
      responseType = io.bokun.inventory.service.plugin.grpc.PluginDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.MovePluginRequest,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getMovePluginMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.MovePluginRequest, io.bokun.inventory.service.plugin.grpc.PluginDefinition> getMovePluginMethod;
    if ((getMovePluginMethod = PluginServiceGrpc.getMovePluginMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getMovePluginMethod = PluginServiceGrpc.getMovePluginMethod) == null) {
          PluginServiceGrpc.getMovePluginMethod = getMovePluginMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.MovePluginRequest, io.bokun.inventory.service.plugin.grpc.PluginDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MovePlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.MovePluginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("MovePlugin"))
              .build();
        }
      }
    }
    return getMovePluginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest,
      io.bokun.inventory.common.api.grpc.Empty> getUnregisterPluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterPlugin",
      requestType = io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest,
      io.bokun.inventory.common.api.grpc.Empty> getUnregisterPluginMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest, io.bokun.inventory.common.api.grpc.Empty> getUnregisterPluginMethod;
    if ((getUnregisterPluginMethod = PluginServiceGrpc.getUnregisterPluginMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getUnregisterPluginMethod = PluginServiceGrpc.getUnregisterPluginMethod) == null) {
          PluginServiceGrpc.getUnregisterPluginMethod = getUnregisterPluginMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest, io.bokun.inventory.common.api.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterPlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("UnregisterPlugin"))
              .build();
        }
      }
    }
    return getUnregisterPluginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getListDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDefinitions",
      requestType = io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest.class,
      responseType = io.bokun.inventory.service.plugin.grpc.PluginDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getListDefinitionsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest, io.bokun.inventory.service.plugin.grpc.PluginDefinition> getListDefinitionsMethod;
    if ((getListDefinitionsMethod = PluginServiceGrpc.getListDefinitionsMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getListDefinitionsMethod = PluginServiceGrpc.getListDefinitionsMethod) == null) {
          PluginServiceGrpc.getListDefinitionsMethod = getListDefinitionsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest, io.bokun.inventory.service.plugin.grpc.PluginDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("ListDefinitions"))
              .build();
        }
      }
    }
    return getListDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getGetDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefinition",
      requestType = io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest.class,
      responseType = io.bokun.inventory.service.plugin.grpc.PluginDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest,
      io.bokun.inventory.service.plugin.grpc.PluginDefinition> getGetDefinitionMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest, io.bokun.inventory.service.plugin.grpc.PluginDefinition> getGetDefinitionMethod;
    if ((getGetDefinitionMethod = PluginServiceGrpc.getGetDefinitionMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getGetDefinitionMethod = PluginServiceGrpc.getGetDefinitionMethod) == null) {
          PluginServiceGrpc.getGetDefinitionMethod = getGetDefinitionMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest, io.bokun.inventory.service.plugin.grpc.PluginDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("GetDefinition"))
              .build();
        }
      }
    }
    return getGetDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginConfiguration,
      io.bokun.inventory.common.api.grpc.Empty> getConfigurePluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigurePlugin",
      requestType = io.bokun.inventory.service.plugin.grpc.PluginConfiguration.class,
      responseType = io.bokun.inventory.common.api.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginConfiguration,
      io.bokun.inventory.common.api.grpc.Empty> getConfigurePluginMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.PluginConfiguration, io.bokun.inventory.common.api.grpc.Empty> getConfigurePluginMethod;
    if ((getConfigurePluginMethod = PluginServiceGrpc.getConfigurePluginMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getConfigurePluginMethod = PluginServiceGrpc.getConfigurePluginMethod) == null) {
          PluginServiceGrpc.getConfigurePluginMethod = getConfigurePluginMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.PluginConfiguration, io.bokun.inventory.common.api.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigurePlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginConfiguration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("ConfigurePlugin"))
              .build();
        }
      }
    }
    return getConfigurePluginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest,
      io.bokun.inventory.service.plugin.grpc.PluginConfiguration> getListConfiguredPluginsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConfiguredPlugins",
      requestType = io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest.class,
      responseType = io.bokun.inventory.service.plugin.grpc.PluginConfiguration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest,
      io.bokun.inventory.service.plugin.grpc.PluginConfiguration> getListConfiguredPluginsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest, io.bokun.inventory.service.plugin.grpc.PluginConfiguration> getListConfiguredPluginsMethod;
    if ((getListConfiguredPluginsMethod = PluginServiceGrpc.getListConfiguredPluginsMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getListConfiguredPluginsMethod = PluginServiceGrpc.getListConfiguredPluginsMethod) == null) {
          PluginServiceGrpc.getListConfiguredPluginsMethod = getListConfiguredPluginsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest, io.bokun.inventory.service.plugin.grpc.PluginConfiguration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConfiguredPlugins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.PluginConfiguration.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("ListConfiguredPlugins"))
              .build();
        }
      }
    }
    return getListConfiguredPluginsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest,
      io.bokun.inventory.common.api.grpc.Empty> getDeleteConfiguredPluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConfiguredPlugin",
      requestType = io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest,
      io.bokun.inventory.common.api.grpc.Empty> getDeleteConfiguredPluginMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest, io.bokun.inventory.common.api.grpc.Empty> getDeleteConfiguredPluginMethod;
    if ((getDeleteConfiguredPluginMethod = PluginServiceGrpc.getDeleteConfiguredPluginMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getDeleteConfiguredPluginMethod = PluginServiceGrpc.getDeleteConfiguredPluginMethod) == null) {
          PluginServiceGrpc.getDeleteConfiguredPluginMethod = getDeleteConfiguredPluginMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest, io.bokun.inventory.common.api.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConfiguredPlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("DeleteConfiguredPlugin"))
              .build();
        }
      }
    }
    return getDeleteConfiguredPluginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest,
      io.bokun.inventory.common.api.grpc.Empty> getLinkPluginToVendorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkPluginToVendors",
      requestType = io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest.class,
      responseType = io.bokun.inventory.common.api.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest,
      io.bokun.inventory.common.api.grpc.Empty> getLinkPluginToVendorsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest, io.bokun.inventory.common.api.grpc.Empty> getLinkPluginToVendorsMethod;
    if ((getLinkPluginToVendorsMethod = PluginServiceGrpc.getLinkPluginToVendorsMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getLinkPluginToVendorsMethod = PluginServiceGrpc.getLinkPluginToVendorsMethod) == null) {
          PluginServiceGrpc.getLinkPluginToVendorsMethod = getLinkPluginToVendorsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest, io.bokun.inventory.common.api.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkPluginToVendors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.common.api.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("LinkPluginToVendors"))
              .build();
        }
      }
    }
    return getLinkPluginToVendorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest,
      io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse> getGetPluginVendorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPluginVendors",
      requestType = io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest.class,
      responseType = io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest,
      io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse> getGetPluginVendorsMethod() {
    io.grpc.MethodDescriptor<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest, io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse> getGetPluginVendorsMethod;
    if ((getGetPluginVendorsMethod = PluginServiceGrpc.getGetPluginVendorsMethod) == null) {
      synchronized (PluginServiceGrpc.class) {
        if ((getGetPluginVendorsMethod = PluginServiceGrpc.getGetPluginVendorsMethod) == null) {
          PluginServiceGrpc.getGetPluginVendorsMethod = getGetPluginVendorsMethod =
              io.grpc.MethodDescriptor.<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest, io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPluginVendors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PluginServiceMethodDescriptorSupplier("GetPluginVendors"))
              .build();
        }
      }
    }
    return getGetPluginVendorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PluginServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginServiceStub>() {
        @java.lang.Override
        public PluginServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginServiceStub(channel, callOptions);
        }
      };
    return PluginServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PluginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginServiceBlockingStub>() {
        @java.lang.Override
        public PluginServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginServiceBlockingStub(channel, callOptions);
        }
      };
    return PluginServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PluginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginServiceFutureStub>() {
        @java.lang.Override
        public PluginServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginServiceFutureStub(channel, callOptions);
        }
      };
    return PluginServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Registers a new plugin to the system by given url
     * </pre>
     */
    default void registerPlugin(io.bokun.inventory.service.plugin.grpc.PluginUrl request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPluginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves plugin to a new URL
     * </pre>
     */
    default void movePlugin(io.bokun.inventory.service.plugin.grpc.MovePluginRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMovePluginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unregisters existing plugin from the system by given url which was previously registered with RegisterPlugin
     * </pre>
     */
    default void unregisterPlugin(io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterPluginMethod(), responseObserver);
    }

    /**
     * <pre>
     * List definitions.
     * </pre>
     */
    default void listDefinitions(io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns plugin definition by given id.
     * </pre>
     */
    default void getDefinition(io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure existing plugin for a given vendor.
     * </pre>
     */
    default void configurePlugin(io.bokun.inventory.service.plugin.grpc.PluginConfiguration request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigurePluginMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all configured plugins for given vendor
     * </pre>
     */
    default void listConfiguredPlugins(io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginConfiguration> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConfiguredPluginsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete configured plugin for a vendor
     * </pre>
     */
    default void deleteConfiguredPlugin(io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConfiguredPluginMethod(), responseObserver);
    }

    /**
     */
    default void linkPluginToVendors(io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkPluginToVendorsMethod(), responseObserver);
    }

    /**
     */
    default void getPluginVendors(io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPluginVendorsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PluginService.
   */
  public static abstract class PluginServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PluginServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PluginService.
   */
  public static final class PluginServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PluginServiceStub> {
    private PluginServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new plugin to the system by given url
     * </pre>
     */
    public void registerPlugin(io.bokun.inventory.service.plugin.grpc.PluginUrl request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPluginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves plugin to a new URL
     * </pre>
     */
    public void movePlugin(io.bokun.inventory.service.plugin.grpc.MovePluginRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMovePluginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unregisters existing plugin from the system by given url which was previously registered with RegisterPlugin
     * </pre>
     */
    public void unregisterPlugin(io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterPluginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List definitions.
     * </pre>
     */
    public void listDefinitions(io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns plugin definition by given id.
     * </pre>
     */
    public void getDefinition(io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure existing plugin for a given vendor.
     * </pre>
     */
    public void configurePlugin(io.bokun.inventory.service.plugin.grpc.PluginConfiguration request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigurePluginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all configured plugins for given vendor
     * </pre>
     */
    public void listConfiguredPlugins(io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginConfiguration> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListConfiguredPluginsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete configured plugin for a vendor
     * </pre>
     */
    public void deleteConfiguredPlugin(io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConfiguredPluginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void linkPluginToVendors(io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkPluginToVendorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPluginVendors(io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest request,
        io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPluginVendorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PluginService.
   */
  public static final class PluginServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PluginServiceBlockingStub> {
    private PluginServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new plugin to the system by given url
     * </pre>
     */
    public io.bokun.inventory.service.plugin.grpc.PluginDefinition registerPlugin(io.bokun.inventory.service.plugin.grpc.PluginUrl request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPluginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves plugin to a new URL
     * </pre>
     */
    public io.bokun.inventory.service.plugin.grpc.PluginDefinition movePlugin(io.bokun.inventory.service.plugin.grpc.MovePluginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMovePluginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unregisters existing plugin from the system by given url which was previously registered with RegisterPlugin
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.Empty unregisterPlugin(io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterPluginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List definitions.
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.service.plugin.grpc.PluginDefinition> listDefinitions(
        io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns plugin definition by given id.
     * </pre>
     */
    public io.bokun.inventory.service.plugin.grpc.PluginDefinition getDefinition(io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure existing plugin for a given vendor.
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.Empty configurePlugin(io.bokun.inventory.service.plugin.grpc.PluginConfiguration request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigurePluginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all configured plugins for given vendor
     * </pre>
     */
    public java.util.Iterator<io.bokun.inventory.service.plugin.grpc.PluginConfiguration> listConfiguredPlugins(
        io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListConfiguredPluginsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete configured plugin for a vendor
     * </pre>
     */
    public io.bokun.inventory.common.api.grpc.Empty deleteConfiguredPlugin(io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConfiguredPluginMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.bokun.inventory.common.api.grpc.Empty linkPluginToVendors(io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkPluginToVendorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse getPluginVendors(io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPluginVendorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PluginService.
   */
  public static final class PluginServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PluginServiceFutureStub> {
    private PluginServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new plugin to the system by given url
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.service.plugin.grpc.PluginDefinition> registerPlugin(
        io.bokun.inventory.service.plugin.grpc.PluginUrl request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPluginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves plugin to a new URL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.service.plugin.grpc.PluginDefinition> movePlugin(
        io.bokun.inventory.service.plugin.grpc.MovePluginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMovePluginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unregisters existing plugin from the system by given url which was previously registered with RegisterPlugin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.Empty> unregisterPlugin(
        io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterPluginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns plugin definition by given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.service.plugin.grpc.PluginDefinition> getDefinition(
        io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure existing plugin for a given vendor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.Empty> configurePlugin(
        io.bokun.inventory.service.plugin.grpc.PluginConfiguration request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigurePluginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete configured plugin for a vendor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.Empty> deleteConfiguredPlugin(
        io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConfiguredPluginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.common.api.grpc.Empty> linkPluginToVendors(
        io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkPluginToVendorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse> getPluginVendors(
        io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPluginVendorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PLUGIN = 0;
  private static final int METHODID_MOVE_PLUGIN = 1;
  private static final int METHODID_UNREGISTER_PLUGIN = 2;
  private static final int METHODID_LIST_DEFINITIONS = 3;
  private static final int METHODID_GET_DEFINITION = 4;
  private static final int METHODID_CONFIGURE_PLUGIN = 5;
  private static final int METHODID_LIST_CONFIGURED_PLUGINS = 6;
  private static final int METHODID_DELETE_CONFIGURED_PLUGIN = 7;
  private static final int METHODID_LINK_PLUGIN_TO_VENDORS = 8;
  private static final int METHODID_GET_PLUGIN_VENDORS = 9;

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
        case METHODID_REGISTER_PLUGIN:
          serviceImpl.registerPlugin((io.bokun.inventory.service.plugin.grpc.PluginUrl) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition>) responseObserver);
          break;
        case METHODID_MOVE_PLUGIN:
          serviceImpl.movePlugin((io.bokun.inventory.service.plugin.grpc.MovePluginRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition>) responseObserver);
          break;
        case METHODID_UNREGISTER_PLUGIN:
          serviceImpl.unregisterPlugin((io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty>) responseObserver);
          break;
        case METHODID_LIST_DEFINITIONS:
          serviceImpl.listDefinitions((io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition>) responseObserver);
          break;
        case METHODID_GET_DEFINITION:
          serviceImpl.getDefinition((io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginDefinition>) responseObserver);
          break;
        case METHODID_CONFIGURE_PLUGIN:
          serviceImpl.configurePlugin((io.bokun.inventory.service.plugin.grpc.PluginConfiguration) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty>) responseObserver);
          break;
        case METHODID_LIST_CONFIGURED_PLUGINS:
          serviceImpl.listConfiguredPlugins((io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.PluginConfiguration>) responseObserver);
          break;
        case METHODID_DELETE_CONFIGURED_PLUGIN:
          serviceImpl.deleteConfiguredPlugin((io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty>) responseObserver);
          break;
        case METHODID_LINK_PLUGIN_TO_VENDORS:
          serviceImpl.linkPluginToVendors((io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.common.api.grpc.Empty>) responseObserver);
          break;
        case METHODID_GET_PLUGIN_VENDORS:
          serviceImpl.getPluginVendors((io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest) request,
              (io.grpc.stub.StreamObserver<io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse>) responseObserver);
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
          getRegisterPluginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.PluginUrl,
              io.bokun.inventory.service.plugin.grpc.PluginDefinition>(
                service, METHODID_REGISTER_PLUGIN)))
        .addMethod(
          getMovePluginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.MovePluginRequest,
              io.bokun.inventory.service.plugin.grpc.PluginDefinition>(
                service, METHODID_MOVE_PLUGIN)))
        .addMethod(
          getUnregisterPluginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.PluginUnregistrationRequest,
              io.bokun.inventory.common.api.grpc.Empty>(
                service, METHODID_UNREGISTER_PLUGIN)))
        .addMethod(
          getListDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.ListDefinitionsRequest,
              io.bokun.inventory.service.plugin.grpc.PluginDefinition>(
                service, METHODID_LIST_DEFINITIONS)))
        .addMethod(
          getGetDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest,
              io.bokun.inventory.service.plugin.grpc.PluginDefinition>(
                service, METHODID_GET_DEFINITION)))
        .addMethod(
          getConfigurePluginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.PluginConfiguration,
              io.bokun.inventory.common.api.grpc.Empty>(
                service, METHODID_CONFIGURE_PLUGIN)))
        .addMethod(
          getListConfiguredPluginsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.ListConfiguredPluginsRequest,
              io.bokun.inventory.service.plugin.grpc.PluginConfiguration>(
                service, METHODID_LIST_CONFIGURED_PLUGINS)))
        .addMethod(
          getDeleteConfiguredPluginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.DeletePluginConfigurationRequest,
              io.bokun.inventory.common.api.grpc.Empty>(
                service, METHODID_DELETE_CONFIGURED_PLUGIN)))
        .addMethod(
          getLinkPluginToVendorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.LinkPluginToVendorsRequest,
              io.bokun.inventory.common.api.grpc.Empty>(
                service, METHODID_LINK_PLUGIN_TO_VENDORS)))
        .addMethod(
          getGetPluginVendorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.bokun.inventory.service.plugin.grpc.GetPluginVendorsRequest,
              io.bokun.inventory.service.plugin.grpc.GetPluginVendorsResponse>(
                service, METHODID_GET_PLUGIN_VENDORS)))
        .build();
  }

  private static abstract class PluginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PluginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bokun.inventory.service.plugin.grpc.PluginServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PluginService");
    }
  }

  private static final class PluginServiceFileDescriptorSupplier
      extends PluginServiceBaseDescriptorSupplier {
    PluginServiceFileDescriptorSupplier() {}
  }

  private static final class PluginServiceMethodDescriptorSupplier
      extends PluginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PluginServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PluginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PluginServiceFileDescriptorSupplier())
              .addMethod(getRegisterPluginMethod())
              .addMethod(getMovePluginMethod())
              .addMethod(getUnregisterPluginMethod())
              .addMethod(getListDefinitionsMethod())
              .addMethod(getGetDefinitionMethod())
              .addMethod(getConfigurePluginMethod())
              .addMethod(getListConfiguredPluginsMethod())
              .addMethod(getDeleteConfiguredPluginMethod())
              .addMethod(getLinkPluginToVendorsMethod())
              .addMethod(getGetPluginVendorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
