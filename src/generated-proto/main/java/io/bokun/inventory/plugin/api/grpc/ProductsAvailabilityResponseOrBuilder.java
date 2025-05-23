// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin_api.proto

package io.bokun.inventory.plugin.api.grpc;

public interface ProductsAvailabilityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.plugin.api.grpc.ProductsAvailabilityResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * External product id. Mandatory.
   * </pre>
   *
   * <code>string productId = 1;</code>
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   * <pre>
   * External product id. Mandatory.
   * </pre>
   *
   * <code>string productId = 1;</code>
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <pre>
   * Whether the actual availability check was done. Some APIs might not support checking for multiple product availability over date range (instead
   * they typically support checking availability of one product and sometimes - for a very limited range only). As a workaround for this problem,
   * plugin might return fake availability response and then next step will clarify that. For fake responses, this should be set to false.
   * </pre>
   *
   * <code>bool actualCheckDone = 2;</code>
   * @return The actualCheckDone.
   */
  boolean getActualCheckDone();
}
