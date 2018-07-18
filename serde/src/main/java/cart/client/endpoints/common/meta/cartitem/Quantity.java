// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/endpoints/common/meta/cartitem/Quantity.proto

package cart.client.endpoints.common.meta.cartitem;

/**
 * Protobuf type {@code cart.client.endpoints.common.meta.cartitem.Quantity}
 */
public  final class Quantity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cart.client.endpoints.common.meta.cartitem.Quantity)
    QuantityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Quantity.newBuilder() to construct.
  private Quantity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Quantity() {
    value_ = 0;
    iNITQUANTITY_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Quantity(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            value_ = input.readInt32();
            break;
          }
          case 16: {

            iNITQUANTITY_ = input.readInt32();
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
    return cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.internal_static_cart_client_endpoints_common_meta_cartitem_Quantity_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.internal_static_cart_client_endpoints_common_meta_cartitem_Quantity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cart.client.endpoints.common.meta.cartitem.Quantity.class, cart.client.endpoints.common.meta.cartitem.Quantity.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private int value_;
  /**
   * <code>int32 value = 1;</code>
   */
  public int getValue() {
    return value_;
  }

  public static final int INIT_QUANTITY_FIELD_NUMBER = 2;
  private int iNITQUANTITY_;
  /**
   * <code>int32 INIT_QUANTITY = 2;</code>
   */
  public int getINITQUANTITY() {
    return iNITQUANTITY_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (value_ != 0) {
      output.writeInt32(1, value_);
    }
    if (iNITQUANTITY_ != 0) {
      output.writeInt32(2, iNITQUANTITY_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, value_);
    }
    if (iNITQUANTITY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, iNITQUANTITY_);
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
    if (!(obj instanceof cart.client.endpoints.common.meta.cartitem.Quantity)) {
      return super.equals(obj);
    }
    cart.client.endpoints.common.meta.cartitem.Quantity other = (cart.client.endpoints.common.meta.cartitem.Quantity) obj;

    boolean result = true;
    result = result && (getValue()
        == other.getValue());
    result = result && (getINITQUANTITY()
        == other.getINITQUANTITY());
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue();
    hash = (37 * hash) + INIT_QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getINITQUANTITY();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cart.client.endpoints.common.meta.cartitem.Quantity parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cart.client.endpoints.common.meta.cartitem.Quantity prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code cart.client.endpoints.common.meta.cartitem.Quantity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cart.client.endpoints.common.meta.cartitem.Quantity)
      cart.client.endpoints.common.meta.cartitem.QuantityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.internal_static_cart_client_endpoints_common_meta_cartitem_Quantity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.internal_static_cart_client_endpoints_common_meta_cartitem_Quantity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cart.client.endpoints.common.meta.cartitem.Quantity.class, cart.client.endpoints.common.meta.cartitem.Quantity.Builder.class);
    }

    // Construct using cart.client.endpoints.common.meta.cartitem.Quantity.newBuilder()
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
    public Builder clear() {
      super.clear();
      value_ = 0;

      iNITQUANTITY_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.internal_static_cart_client_endpoints_common_meta_cartitem_Quantity_descriptor;
    }

    public cart.client.endpoints.common.meta.cartitem.Quantity getDefaultInstanceForType() {
      return cart.client.endpoints.common.meta.cartitem.Quantity.getDefaultInstance();
    }

    public cart.client.endpoints.common.meta.cartitem.Quantity build() {
      cart.client.endpoints.common.meta.cartitem.Quantity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cart.client.endpoints.common.meta.cartitem.Quantity buildPartial() {
      cart.client.endpoints.common.meta.cartitem.Quantity result = new cart.client.endpoints.common.meta.cartitem.Quantity(this);
      result.value_ = value_;
      result.iNITQUANTITY_ = iNITQUANTITY_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cart.client.endpoints.common.meta.cartitem.Quantity) {
        return mergeFrom((cart.client.endpoints.common.meta.cartitem.Quantity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cart.client.endpoints.common.meta.cartitem.Quantity other) {
      if (other == cart.client.endpoints.common.meta.cartitem.Quantity.getDefaultInstance()) return this;
      if (other.getValue() != 0) {
        setValue(other.getValue());
      }
      if (other.getINITQUANTITY() != 0) {
        setINITQUANTITY(other.getINITQUANTITY());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cart.client.endpoints.common.meta.cartitem.Quantity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cart.client.endpoints.common.meta.cartitem.Quantity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int value_ ;
    /**
     * <code>int32 value = 1;</code>
     */
    public int getValue() {
      return value_;
    }
    /**
     * <code>int32 value = 1;</code>
     */
    public Builder setValue(int value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 value = 1;</code>
     */
    public Builder clearValue() {
      
      value_ = 0;
      onChanged();
      return this;
    }

    private int iNITQUANTITY_ ;
    /**
     * <code>int32 INIT_QUANTITY = 2;</code>
     */
    public int getINITQUANTITY() {
      return iNITQUANTITY_;
    }
    /**
     * <code>int32 INIT_QUANTITY = 2;</code>
     */
    public Builder setINITQUANTITY(int value) {
      
      iNITQUANTITY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 INIT_QUANTITY = 2;</code>
     */
    public Builder clearINITQUANTITY() {
      
      iNITQUANTITY_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cart.client.endpoints.common.meta.cartitem.Quantity)
  }

  // @@protoc_insertion_point(class_scope:cart.client.endpoints.common.meta.cartitem.Quantity)
  private static final cart.client.endpoints.common.meta.cartitem.Quantity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cart.client.endpoints.common.meta.cartitem.Quantity();
  }

  public static cart.client.endpoints.common.meta.cartitem.Quantity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Quantity>
      PARSER = new com.google.protobuf.AbstractParser<Quantity>() {
    public Quantity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Quantity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Quantity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Quantity> getParserForType() {
    return PARSER;
  }

  public cart.client.endpoints.common.meta.cartitem.Quantity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
