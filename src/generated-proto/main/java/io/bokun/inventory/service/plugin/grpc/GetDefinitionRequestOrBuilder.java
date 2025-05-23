// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_service.proto

package io.bokun.inventory.service.plugin.grpc;

public interface GetDefinitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.service.plugin.grpc.GetDefinitionRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * id of plugin to get definition for. Mandatory.
   * </pre>
   *
   * <code>string pluginDefinitionId = 1;</code>
   * @return The pluginDefinitionId.
   */
  java.lang.String getPluginDefinitionId();
  /**
   * <pre>
   * id of plugin to get definition for. Mandatory.
   * </pre>
   *
   * <code>string pluginDefinitionId = 1;</code>
   * @return The bytes for pluginDefinitionId.
   */
  com.google.protobuf.ByteString
      getPluginDefinitionIdBytes();

  /**
   * <pre>
   * Whether to use cached data from Inventory Service only and do not reach out to the external plugin to fetch the definition anew.
   * Defaults to false, meaning extra call to the plugin is made.
   * </pre>
   *
   * <code>bool useCachedDataOnly = 2;</code>
   * @return The useCachedDataOnly.
   */
  boolean getUseCachedDataOnly();
}
