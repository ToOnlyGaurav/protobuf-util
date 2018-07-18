// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/OfferAdjustmentType.proto

package cart.client.modules.disbursal.response;

/**
 * Protobuf enum {@code cart.client.modules.disbursal.response.OfferAdjustmentType}
 */
public enum OfferAdjustmentType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PROMOTION_DISCOUNT = 0;</code>
   */
  PROMOTION_DISCOUNT(0),
  /**
   * <code>FREEBIE_DISCOUNT = 1;</code>
   */
  FREEBIE_DISCOUNT(1),
  /**
   * <code>EXCHANGE_DISCOUNT = 2;</code>
   */
  EXCHANGE_DISCOUNT(2),
  /**
   * <code>DEFERRED_DISCOUNT = 3;</code>
   */
  DEFERRED_DISCOUNT(3),
  /**
   * <code>EMI_DISCOUNT = 4;</code>
   */
  EMI_DISCOUNT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PROMOTION_DISCOUNT = 0;</code>
   */
  public static final int PROMOTION_DISCOUNT_VALUE = 0;
  /**
   * <code>FREEBIE_DISCOUNT = 1;</code>
   */
  public static final int FREEBIE_DISCOUNT_VALUE = 1;
  /**
   * <code>EXCHANGE_DISCOUNT = 2;</code>
   */
  public static final int EXCHANGE_DISCOUNT_VALUE = 2;
  /**
   * <code>DEFERRED_DISCOUNT = 3;</code>
   */
  public static final int DEFERRED_DISCOUNT_VALUE = 3;
  /**
   * <code>EMI_DISCOUNT = 4;</code>
   */
  public static final int EMI_DISCOUNT_VALUE = 4;


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
  public static OfferAdjustmentType valueOf(int value) {
    return forNumber(value);
  }

  public static OfferAdjustmentType forNumber(int value) {
    switch (value) {
      case 0: return PROMOTION_DISCOUNT;
      case 1: return FREEBIE_DISCOUNT;
      case 2: return EXCHANGE_DISCOUNT;
      case 3: return DEFERRED_DISCOUNT;
      case 4: return EMI_DISCOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OfferAdjustmentType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OfferAdjustmentType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OfferAdjustmentType>() {
          public OfferAdjustmentType findValueByNumber(int number) {
            return OfferAdjustmentType.forNumber(number);
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
    return cart.client.modules.disbursal.response.OfferAdjustmentTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final OfferAdjustmentType[] VALUES = values();

  public static OfferAdjustmentType valueOf(
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

  private OfferAdjustmentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.disbursal.response.OfferAdjustmentType)
}
