// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking_service.proto

package io.bokun.inventory.service.booking.grpc;

public interface ReservationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.service.booking.grpc.ReservationRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Product to reserve. Mandatory
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   * @return Whether the bokunProduct field is set.
   */
  boolean hasBokunProduct();
  /**
   * <pre>
   * Product to reserve. Mandatory
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 1;</code>
   * @return The bokunProduct.
   */
  io.bokun.inventory.service.common.grpc.BokunProduct getBokunProduct();

  /**
   * <pre>
   * Information pertaining to reservation. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.booking.grpc.ReservationData reservationData = 2;</code>
   * @return Whether the reservationData field is set.
   */
  boolean hasReservationData();
  /**
   * <pre>
   * Information pertaining to reservation. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.booking.grpc.ReservationData reservationData = 2;</code>
   * @return The reservationData.
   */
  io.bokun.inventory.service.booking.grpc.ReservationData getReservationData();
}
