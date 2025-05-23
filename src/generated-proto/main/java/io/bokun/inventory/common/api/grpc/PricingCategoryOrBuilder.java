// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

public interface PricingCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.common.api.grpc.PricingCategory)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * id for pricing category. Mandatory.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * id for pricing category. Mandatory.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Label for pricing category. Mandatory.
   * </pre>
   *
   * <code>string label = 2;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Label for pricing category. Mandatory.
   * </pre>
   *
   * <code>string label = 2;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * Least possible age for qualifying for this price category. Optional.
   * </pre>
   *
   * <code>int32 minAge = 3;</code>
   * @return The minAge.
   */
  int getMinAge();

  /**
   * <pre>
   * Max possible age for qualifying for this price category. Optional.
   * </pre>
   *
   * <code>int32 maxAge = 4;</code>
   * @return The maxAge.
   */
  int getMaxAge();
}
