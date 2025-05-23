// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking_service.proto

package io.bokun.inventory.service.booking.grpc;

public interface CancelBookingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.service.booking.grpc.CancelBookingRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   * @return Whether the bokunProduct field is set.
   */
  boolean hasBokunProduct();
  /**
   * <pre>
   * product, *exactly* as used with CreateReservation request. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   * @return The bokunProduct.
   */
  io.bokun.inventory.service.common.grpc.BokunProduct getBokunProduct();

  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   * @return The bookingConfirmationCode.
   */
  java.lang.String getBookingConfirmationCode();
  /**
   * <pre>
   * Exactly as returned by io.bokun.inventory.common.api.grpc.SuccessfulBooking::bookingConfirmationCode. Mandatory.
   * </pre>
   *
   * <code>string bookingConfirmationCode = 2;</code>
   * @return The bytes for bookingConfirmationCode.
   */
  com.google.protobuf.ByteString
      getBookingConfirmationCodeBytes();

  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   * @return The agentCode.
   */
  java.lang.String getAgentCode();
  /**
   * <pre>
   * agent code if passed. Optional.
   * </pre>
   *
   * <code>string agentCode = 3;</code>
   * @return The bytes for agentCode.
   */
  com.google.protobuf.ByteString
      getAgentCodeBytes();
}
