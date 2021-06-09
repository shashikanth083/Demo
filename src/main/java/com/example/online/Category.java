// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebook.proto

package com.example.online;

/**
 * Protobuf enum {@code ecommerce.Category}
 */
public enum Category
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ELECTRONICS = 0;</code>
   */
  ELECTRONICS(0),
  /**
   * <code>EBOOKS = 1;</code>
   */
  EBOOKS(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ELECTRONICS = 0;</code>
   */
  public static final int ELECTRONICS_VALUE = 0;
  /**
   * <code>EBOOKS = 1;</code>
   */
  public static final int EBOOKS_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Category valueOf(int value) {
    return forNumber(value);
  }

  public static Category forNumber(int value) {
    switch (value) {
      case 0: return ELECTRONICS;
      case 1: return EBOOKS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Category>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Category> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Category>() {
          public Category findValueByNumber(int number) {
            return Category.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.online.Ebook.getDescriptor().getEnumTypes().get(0);
  }

  private static final Category[] VALUES = values();

  public static Category valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Category(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ecommerce.Category)
}
