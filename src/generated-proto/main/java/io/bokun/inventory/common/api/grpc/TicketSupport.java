// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

/**
 * <pre>
 * A list of all possible ticketing options for a product.
 * </pre>
 *
 * Protobuf enum {@code io.bokun.inventory.common.api.grpc.TicketSupport}
 */
public enum TicketSupport
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Should not be used explicitly.
   * </pre>
   *
   * <code>UNASSIGNED_TICKET_SUPPORT = 0;</code>
   */
  UNASSIGNED_TICKET_SUPPORT(0),
  /**
   * <pre>
   * Request to issue a ticket per each passenger when booking.
   * </pre>
   *
   * <code>TICKET_PER_PERSON = 1;</code>
   */
  TICKET_PER_PERSON(1),
  /**
   * <pre>
   * Request to issue a single ticket for all passengers when booking.
   * </pre>
   *
   * <code>TICKET_PER_BOOKING = 2;</code>
   */
  TICKET_PER_BOOKING(2),
  /**
   * <pre>
   * No tickets required. Should be used when 3rd party does not require, provide or support tickets.
   * </pre>
   *
   * <code>TICKETS_NOT_REQUIRED = 3;</code>
   */
  TICKETS_NOT_REQUIRED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Should not be used explicitly.
   * </pre>
   *
   * <code>UNASSIGNED_TICKET_SUPPORT = 0;</code>
   */
  public static final int UNASSIGNED_TICKET_SUPPORT_VALUE = 0;
  /**
   * <pre>
   * Request to issue a ticket per each passenger when booking.
   * </pre>
   *
   * <code>TICKET_PER_PERSON = 1;</code>
   */
  public static final int TICKET_PER_PERSON_VALUE = 1;
  /**
   * <pre>
   * Request to issue a single ticket for all passengers when booking.
   * </pre>
   *
   * <code>TICKET_PER_BOOKING = 2;</code>
   */
  public static final int TICKET_PER_BOOKING_VALUE = 2;
  /**
   * <pre>
   * No tickets required. Should be used when 3rd party does not require, provide or support tickets.
   * </pre>
   *
   * <code>TICKETS_NOT_REQUIRED = 3;</code>
   */
  public static final int TICKETS_NOT_REQUIRED_VALUE = 3;


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
  public static TicketSupport valueOf(int value) {
    return forNumber(value);
  }

  public static TicketSupport forNumber(int value) {
    switch (value) {
      case 0: return UNASSIGNED_TICKET_SUPPORT;
      case 1: return TICKET_PER_PERSON;
      case 2: return TICKET_PER_BOOKING;
      case 3: return TICKETS_NOT_REQUIRED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TicketSupport>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TicketSupport> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TicketSupport>() {
          @java.lang.Override
          public TicketSupport findValueByNumber(int number) {
            return TicketSupport.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return TicketSupportVerifier.INSTANCE;
  }

  private static final class TicketSupportVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TicketSupportVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return TicketSupport.forNumber(number) != null;
          }
        };

  private final int value;

  private TicketSupport(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.bokun.inventory.common.api.grpc.TicketSupport)
}

