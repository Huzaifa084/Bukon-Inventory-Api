// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: availability_service.proto

package io.bokun.inventory.service.availability.grpc;

public interface GetAvailableProductsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.service.availability.grpc.GetAvailableProductsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Available product. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   * @return Whether the bokunProduct field is set.
   */
  boolean hasBokunProduct();
  /**
   * <pre>
   * Available product. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   * @return The bokunProduct.
   */
  io.bokun.inventory.service.common.grpc.BokunProduct getBokunProduct();

  /**
   * <pre>
   * Whether this was properly checked (true) or faux (as remote API doesn't support wide range check). Mandatory.
   * </pre>
   *
   * <code>bool actualCheckDone = 2;</code>
   * @return The actualCheckDone.
   */
  boolean getActualCheckDone();
}
