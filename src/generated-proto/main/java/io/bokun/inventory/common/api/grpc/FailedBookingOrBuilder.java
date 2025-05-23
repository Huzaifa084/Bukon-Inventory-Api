// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

public interface FailedBookingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.common.api.grpc.FailedBooking)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Error message telling why this request has failed. Optional - remote end is not required to explicitly tell the reason of failure
   * </pre>
   *
   * <code>string bookingError = 1;</code>
   * @return The bookingError.
   */
  java.lang.String getBookingError();
  /**
   * <pre>
   * Error message telling why this request has failed. Optional - remote end is not required to explicitly tell the reason of failure
   * </pre>
   *
   * <code>string bookingError = 1;</code>
   * @return The bytes for bookingError.
   */
  com.google.protobuf.ByteString
      getBookingErrorBytes();
}
