// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.bokun.inventory.common.api.grpc;

/**
 * <pre>
 * Extranet user who made booking. Used in Booking.bookingSource
 * </pre>
 *
 * Protobuf type {@code io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser}
 */
public  final class BookingSourceExtranetUser extends
    com.google.protobuf.GeneratedMessageLite<
        BookingSourceExtranetUser, BookingSourceExtranetUser.Builder> implements
    // @@protoc_insertion_point(message_implements:io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser)
    BookingSourceExtranetUserOrBuilder {
  private BookingSourceExtranetUser() {
    email_ = "";
    fullName_ = "";
  }
  public static final int EMAIL_FIELD_NUMBER = 1;
  private java.lang.String email_;
  /**
   * <pre>
   * User email/username. Mandatory
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    return email_;
  }
  /**
   * <pre>
   * User email/username. Mandatory
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(email_);
  }
  /**
   * <pre>
   * User email/username. Mandatory
   * </pre>
   *
   * <code>string email = 1;</code>
   * @param value The email to set.
   */
  private void setEmail(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    email_ = value;
  }
  /**
   * <pre>
   * User email/username. Mandatory
   * </pre>
   *
   * <code>string email = 1;</code>
   */
  private void clearEmail() {
    
    email_ = getDefaultInstance().getEmail();
  }
  /**
   * <pre>
   * User email/username. Mandatory
   * </pre>
   *
   * <code>string email = 1;</code>
   * @param value The bytes for email to set.
   */
  private void setEmailBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    email_ = value.toStringUtf8();
    
  }

  public static final int FULLNAME_FIELD_NUMBER = 2;
  private java.lang.String fullName_;
  /**
   * <pre>
   * User full name. Mandatory
   * </pre>
   *
   * <code>string fullName = 2;</code>
   * @return The fullName.
   */
  @java.lang.Override
  public java.lang.String getFullName() {
    return fullName_;
  }
  /**
   * <pre>
   * User full name. Mandatory
   * </pre>
   *
   * <code>string fullName = 2;</code>
   * @return The bytes for fullName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFullNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(fullName_);
  }
  /**
   * <pre>
   * User full name. Mandatory
   * </pre>
   *
   * <code>string fullName = 2;</code>
   * @param value The fullName to set.
   */
  private void setFullName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    fullName_ = value;
  }
  /**
   * <pre>
   * User full name. Mandatory
   * </pre>
   *
   * <code>string fullName = 2;</code>
   */
  private void clearFullName() {
    
    fullName_ = getDefaultInstance().getFullName();
  }
  /**
   * <pre>
   * User full name. Mandatory
   * </pre>
   *
   * <code>string fullName = 2;</code>
   * @param value The bytes for fullName to set.
   */
  private void setFullNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    fullName_ = value.toStringUtf8();
    
  }

  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Extranet user who made booking. Used in Booking.bookingSource
   * </pre>
   *
   * Protobuf type {@code io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser, Builder> implements
      // @@protoc_insertion_point(builder_implements:io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser)
      io.bokun.inventory.common.api.grpc.BookingSourceExtranetUserOrBuilder {
    // Construct using io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * User email/username. Mandatory
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      return instance.getEmail();
    }
    /**
     * <pre>
     * User email/username. Mandatory
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      return instance.getEmailBytes();
    }
    /**
     * <pre>
     * User email/username. Mandatory
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      copyOnWrite();
      instance.setEmail(value);
      return this;
    }
    /**
     * <pre>
     * User email/username. Mandatory
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      copyOnWrite();
      instance.clearEmail();
      return this;
    }
    /**
     * <pre>
     * User email/username. Mandatory
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEmailBytes(value);
      return this;
    }

    /**
     * <pre>
     * User full name. Mandatory
     * </pre>
     *
     * <code>string fullName = 2;</code>
     * @return The fullName.
     */
    @java.lang.Override
    public java.lang.String getFullName() {
      return instance.getFullName();
    }
    /**
     * <pre>
     * User full name. Mandatory
     * </pre>
     *
     * <code>string fullName = 2;</code>
     * @return The bytes for fullName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFullNameBytes() {
      return instance.getFullNameBytes();
    }
    /**
     * <pre>
     * User full name. Mandatory
     * </pre>
     *
     * <code>string fullName = 2;</code>
     * @param value The fullName to set.
     * @return This builder for chaining.
     */
    public Builder setFullName(
        java.lang.String value) {
      copyOnWrite();
      instance.setFullName(value);
      return this;
    }
    /**
     * <pre>
     * User full name. Mandatory
     * </pre>
     *
     * <code>string fullName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullName() {
      copyOnWrite();
      instance.clearFullName();
      return this;
    }
    /**
     * <pre>
     * User full name. Mandatory
     * </pre>
     *
     * <code>string fullName = 2;</code>
     * @param value The bytes for fullName to set.
     * @return This builder for chaining.
     */
    public Builder setFullNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFullNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "email_",
            "fullName_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser> parser = PARSER;
        if (parser == null) {
          synchronized (io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser)
  private static final io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser DEFAULT_INSTANCE;
  static {
    BookingSourceExtranetUser defaultInstance = new BookingSourceExtranetUser();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      BookingSourceExtranetUser.class, defaultInstance);
  }

  public static io.bokun.inventory.common.api.grpc.BookingSourceExtranetUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BookingSourceExtranetUser> PARSER;

  public static com.google.protobuf.Parser<BookingSourceExtranetUser> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

