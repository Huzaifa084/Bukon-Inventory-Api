// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

public interface SuccessfulAmendmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.common.api.grpc.SuccessfulAmendment)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Confirmation code of amendment operation, if different from confirmation step. Optional.
   * If set, Bokun will replace the reference by archiving the old reference sent with confirmation response and inserting this one instead.
   * If unset, old reference number will be kept.
   * </pre>
   *
   * <code>string amendmentConfirmationCode = 1;</code>
   * @return The amendmentConfirmationCode.
   */
  java.lang.String getAmendmentConfirmationCode();
  /**
   * <pre>
   * Confirmation code of amendment operation, if different from confirmation step. Optional.
   * If set, Bokun will replace the reference by archiving the old reference sent with confirmation response and inserting this one instead.
   * If unset, old reference number will be kept.
   * </pre>
   *
   * <code>string amendmentConfirmationCode = 1;</code>
   * @return The bytes for amendmentConfirmationCode.
   */
  com.google.protobuf.ByteString
      getAmendmentConfirmationCodeBytes();

  /**
   * <pre>
   * Set if tickets were requested per passenger (yet delivered per pricing category).
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.TicketsPerPricingCategory ticketsPerPassenger = 2;</code>
   * @return Whether the ticketsPerPassenger field is set.
   */
  boolean hasTicketsPerPassenger();
  /**
   * <pre>
   * Set if tickets were requested per passenger (yet delivered per pricing category).
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.TicketsPerPricingCategory ticketsPerPassenger = 2;</code>
   * @return The ticketsPerPassenger.
   */
  io.bokun.inventory.common.api.grpc.TicketsPerPricingCategory getTicketsPerPassenger();

  /**
   * <pre>
   * Set if a single ticket-per-booking was requested.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket bookingTicket = 3;</code>
   * @return Whether the bookingTicket field is set.
   */
  boolean hasBookingTicket();
  /**
   * <pre>
   * Set if a single ticket-per-booking was requested.
   * </pre>
   *
   * <code>.io.bokun.inventory.common.api.grpc.Ticket bookingTicket = 3;</code>
   * @return The bookingTicket.
   */
  io.bokun.inventory.common.api.grpc.Ticket getBookingTicket();

  public io.bokun.inventory.common.api.grpc.SuccessfulAmendment.TicketsCase getTicketsCase();
}
