// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_service.proto

package io.bokun.inventory.service.plugin.grpc;

/**
 * <pre>
 * Transport protocol each plugin implements
 * </pre>
 *
 * Protobuf enum {@code io.bokun.inventory.service.plugin.grpc.PluginTransport}
 */
public enum PluginTransport
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UNASSIGNED_PLUGIN_TRANSPORT = 0;</code>
   */
  UNASSIGNED_PLUGIN_TRANSPORT(0),
  /**
   * <code>GRPC = 1;</code>
   */
  GRPC(1),
  /**
   * <code>REST = 2;</code>
   */
  REST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNASSIGNED_PLUGIN_TRANSPORT = 0;</code>
   */
  public static final int UNASSIGNED_PLUGIN_TRANSPORT_VALUE = 0;
  /**
   * <code>GRPC = 1;</code>
   */
  public static final int GRPC_VALUE = 1;
  /**
   * <code>REST = 2;</code>
   */
  public static final int REST_VALUE = 2;


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PluginTransport valueOf(int value) {
    return forNumber(value);
  }

  public static PluginTransport forNumber(int value) {
    switch (value) {
      case 0: return UNASSIGNED_PLUGIN_TRANSPORT;
      case 1: return GRPC;
      case 2: return REST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PluginTransport>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PluginTransport> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PluginTransport>() {
          @java.lang.Override
          public PluginTransport findValueByNumber(int number) {
            return PluginTransport.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return PluginTransportVerifier.INSTANCE;
  }

  private static final class PluginTransportVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new PluginTransportVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return PluginTransport.forNumber(number) != null;
          }
        };

  private final int value;

  private PluginTransport(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.bokun.inventory.service.plugin.grpc.PluginTransport)
}

