// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

public interface CancelBookingResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.common.api.grpc.CancelBookingResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulCancellation successfulCancellation = 1;</code>
   * @return Whether the successfulCancellation field is set.
   */
  boolean hasSuccessfulCancellation();
  /**
   * <code>.io.bokun.inventory.common.api.grpc.SuccessfulCancellation successfulCancellation = 1;</code>
   * @return The successfulCancellation.
   */
  io.bokun.inventory.common.api.grpc.SuccessfulCancellation getSuccessfulCancellation();

  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedCancellation failedCancellation = 2;</code>
   * @return Whether the failedCancellation field is set.
   */
  boolean hasFailedCancellation();
  /**
   * <code>.io.bokun.inventory.common.api.grpc.FailedCancellation failedCancellation = 2;</code>
   * @return The failedCancellation.
   */
  io.bokun.inventory.common.api.grpc.FailedCancellation getFailedCancellation();

  public io.bokun.inventory.common.api.grpc.CancelBookingResponse.CancellationResultCase getCancellationResultCase();
}
