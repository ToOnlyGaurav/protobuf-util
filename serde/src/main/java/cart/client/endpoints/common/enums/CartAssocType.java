// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/endpoints/common/enums/CartAssocType.proto

package cart.client.endpoints.common.enums;

/**
 * Protobuf enum {@code cart.client.endpoints.common.enums.CartAssocType}
 */
public enum CartAssocType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACCOUNT = 0;</code>
   */
  ACCOUNT(0),
  /**
   * <code>ACCOUNT_TN = 1;</code>
   */
  ACCOUNT_TN(1),
  /**
   * <code>SESSION = 2;</code>
   */
  SESSION(2),
  /**
   * <code>CHECKOUT = 4;</code>
   */
  CHECKOUT(4),
  /**
   * <code>SAVE_FOR_LATER = 5;</code>
   */
  SAVE_FOR_LATER(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACCOUNT = 0;</code>
   */
  public static final int ACCOUNT_VALUE = 0;
  /**
   * <code>ACCOUNT_TN = 1;</code>
   */
  public static final int ACCOUNT_TN_VALUE = 1;
  /**
   * <code>SESSION = 2;</code>
   */
  public static final int SESSION_VALUE = 2;
  /**
   * <code>CHECKOUT = 4;</code>
   */
  public static final int CHECKOUT_VALUE = 4;
  /**
   * <code>SAVE_FOR_LATER = 5;</code>
   */
  public static final int SAVE_FOR_LATER_VALUE = 5;


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
  public static CartAssocType valueOf(int value) {
    return forNumber(value);
  }

  public static CartAssocType forNumber(int value) {
    switch (value) {
      case 0: return ACCOUNT;
      case 1: return ACCOUNT_TN;
      case 2: return SESSION;
      case 4: return CHECKOUT;
      case 5: return SAVE_FOR_LATER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CartAssocType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CartAssocType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CartAssocType>() {
          public CartAssocType findValueByNumber(int number) {
            return CartAssocType.forNumber(number);
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
    return cart.client.endpoints.common.enums.CartAssocTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final CartAssocType[] VALUES = values();

  public static CartAssocType valueOf(
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

  private CartAssocType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.endpoints.common.enums.CartAssocType)
}

