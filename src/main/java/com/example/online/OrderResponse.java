// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebook.proto

package com.example.online;

/**
 * Protobuf type {@code ecommerce.OrderResponse}
 */
public  final class OrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ecommerce.OrderResponse)
    OrderResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderResponse.newBuilder() to construct.
  private OrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderResponse() {
    orderStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            orderStatus_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.online.Ebook.internal_static_ecommerce_OrderResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.online.Ebook.internal_static_ecommerce_OrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.online.OrderResponse.class, com.example.online.OrderResponse.Builder.class);
  }

  public static final int ORDERSTATUS_FIELD_NUMBER = 1;
  private int orderStatus_;
  /**
   * <code>.ecommerce.Status orderStatus = 1;</code>
   */
  public int getOrderStatusValue() {
    return orderStatus_;
  }
  /**
   * <code>.ecommerce.Status orderStatus = 1;</code>
   */
  public com.example.online.Status getOrderStatus() {
    @SuppressWarnings("deprecation")
    com.example.online.Status result = com.example.online.Status.valueOf(orderStatus_);
    return result == null ? com.example.online.Status.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (orderStatus_ != com.example.online.Status.PAYMENT_RECEIVED.getNumber()) {
      output.writeEnum(1, orderStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderStatus_ != com.example.online.Status.PAYMENT_RECEIVED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, orderStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.online.OrderResponse)) {
      return super.equals(obj);
    }
    com.example.online.OrderResponse other = (com.example.online.OrderResponse) obj;

    boolean result = true;
    result = result && orderStatus_ == other.orderStatus_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + orderStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.online.OrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.online.OrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.online.OrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.online.OrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.online.OrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.online.OrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.online.OrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.online.OrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.online.OrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.online.OrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.online.OrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.online.OrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.online.OrderResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ecommerce.OrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ecommerce.OrderResponse)
      com.example.online.OrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.online.Ebook.internal_static_ecommerce_OrderResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.online.Ebook.internal_static_ecommerce_OrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.online.OrderResponse.class, com.example.online.OrderResponse.Builder.class);
    }

    // Construct using com.example.online.OrderResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.online.Ebook.internal_static_ecommerce_OrderResponse_descriptor;
    }

    @java.lang.Override
    public com.example.online.OrderResponse getDefaultInstanceForType() {
      return com.example.online.OrderResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.online.OrderResponse build() {
      com.example.online.OrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.online.OrderResponse buildPartial() {
      com.example.online.OrderResponse result = new com.example.online.OrderResponse(this);
      result.orderStatus_ = orderStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.online.OrderResponse) {
        return mergeFrom((com.example.online.OrderResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.online.OrderResponse other) {
      if (other == com.example.online.OrderResponse.getDefaultInstance()) return this;
      if (other.orderStatus_ != 0) {
        setOrderStatusValue(other.getOrderStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.online.OrderResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.online.OrderResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int orderStatus_ = 0;
    /**
     * <code>.ecommerce.Status orderStatus = 1;</code>
     */
    public int getOrderStatusValue() {
      return orderStatus_;
    }
    /**
     * <code>.ecommerce.Status orderStatus = 1;</code>
     */
    public Builder setOrderStatusValue(int value) {
      orderStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ecommerce.Status orderStatus = 1;</code>
     */
    public com.example.online.Status getOrderStatus() {
      @SuppressWarnings("deprecation")
      com.example.online.Status result = com.example.online.Status.valueOf(orderStatus_);
      return result == null ? com.example.online.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.ecommerce.Status orderStatus = 1;</code>
     */
    public Builder setOrderStatus(com.example.online.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      orderStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ecommerce.Status orderStatus = 1;</code>
     */
    public Builder clearOrderStatus() {
      
      orderStatus_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ecommerce.OrderResponse)
  }

  // @@protoc_insertion_point(class_scope:ecommerce.OrderResponse)
  private static final com.example.online.OrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.online.OrderResponse();
  }

  public static com.example.online.OrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<OrderResponse>() {
    @java.lang.Override
    public OrderResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.online.OrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

