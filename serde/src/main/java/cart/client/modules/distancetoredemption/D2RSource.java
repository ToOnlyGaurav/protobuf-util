// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/distancetoredemption/D2RSource.proto

package cart.client.modules.distancetoredemption;

/**
 * Protobuf enum {@code cart.client.modules.distancetoredemption.D2RSource}
 */
public enum D2RSource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PromiseInfo = 0;</code>
   */
  PromiseInfo(0),
  /**
   * <code>Santa = 1;</code>
   */
  Santa(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PromiseInfo = 0;</code>
   */
  public static final int PromiseInfo_VALUE = 0;
  /**
   * <code>Santa = 1;</code>
   */
  public static final int Santa_VALUE = 1;


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
  public static D2RSource valueOf(int value) {
    return forNumber(value);
  }

  public static D2RSource forNumber(int value) {
    switch (value) {
      case 0: return PromiseInfo;
      case 1: return Santa;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<D2RSource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      D2RSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<D2RSource>() {
          public D2RSource findValueByNumber(int number) {
            return D2RSource.forNumber(number);
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
    return cart.client.modules.distancetoredemption.D2RSourceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final D2RSource[] VALUES = values();

  public static D2RSource valueOf(
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

  private D2RSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cart.client.modules.distancetoredemption.D2RSource)
}

