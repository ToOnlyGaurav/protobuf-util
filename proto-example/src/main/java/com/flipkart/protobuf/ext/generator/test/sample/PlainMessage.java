// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plain_message.proto

package com.flipkart.protobuf.ext.generator.test.sample;

/**
 * Protobuf type {@code PlainMessage}
 */
public  final class PlainMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PlainMessage)
    PlainMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlainMessage.newBuilder() to construct.
  private PlainMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlainMessage() {
    double1_ = 0D;
    float1_ = 0F;
    int1_ = 0;
    long1_ = 0L;
    boolean1_ = false;
    string1_ = "";
    double2_ = 0D;
    float2_ = 0F;
    int2_ = 0;
    long2_ = 0L;
    boolean2_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlainMessage(
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
          case 9: {

            double1_ = input.readDouble();
            break;
          }
          case 21: {

            float1_ = input.readFloat();
            break;
          }
          case 24: {

            int1_ = input.readInt32();
            break;
          }
          case 32: {

            long1_ = input.readInt64();
            break;
          }
          case 40: {

            boolean1_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            string1_ = s;
            break;
          }
          case 57: {

            double2_ = input.readDouble();
            break;
          }
          case 69: {

            float2_ = input.readFloat();
            break;
          }
          case 72: {

            int2_ = input.readInt32();
            break;
          }
          case 80: {

            long2_ = input.readInt64();
            break;
          }
          case 88: {

            boolean2_ = input.readBool();
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
    return com.flipkart.protobuf.ext.generator.test.sample.PlainMessageOuterClass.internal_static_PlainMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.flipkart.protobuf.ext.generator.test.sample.PlainMessageOuterClass.internal_static_PlainMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.class, com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.Builder.class);
  }

  public static final int DOUBLE1_FIELD_NUMBER = 1;
  private double double1_;
  /**
   * <code>double double1 = 1;</code>
   */
  public double getDouble1() {
    return double1_;
  }

  public static final int FLOAT1_FIELD_NUMBER = 2;
  private float float1_;
  /**
   * <code>float float1 = 2;</code>
   */
  public float getFloat1() {
    return float1_;
  }

  public static final int INT1_FIELD_NUMBER = 3;
  private int int1_;
  /**
   * <code>int32 int1 = 3;</code>
   */
  public int getInt1() {
    return int1_;
  }

  public static final int LONG1_FIELD_NUMBER = 4;
  private long long1_;
  /**
   * <code>int64 long1 = 4;</code>
   */
  public long getLong1() {
    return long1_;
  }

  public static final int BOOLEAN1_FIELD_NUMBER = 5;
  private boolean boolean1_;
  /**
   * <code>bool boolean1 = 5;</code>
   */
  public boolean getBoolean1() {
    return boolean1_;
  }

  public static final int STRING1_FIELD_NUMBER = 6;
  private volatile java.lang.Object string1_;
  /**
   * <code>string string1 = 6;</code>
   */
  public java.lang.String getString1() {
    java.lang.Object ref = string1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      string1_ = s;
      return s;
    }
  }
  /**
   * <code>string string1 = 6;</code>
   */
  public com.google.protobuf.ByteString
      getString1Bytes() {
    java.lang.Object ref = string1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      string1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOUBLE2_FIELD_NUMBER = 7;
  private double double2_;
  /**
   * <code>double double2 = 7;</code>
   */
  public double getDouble2() {
    return double2_;
  }

  public static final int FLOAT2_FIELD_NUMBER = 8;
  private float float2_;
  /**
   * <code>float float2 = 8;</code>
   */
  public float getFloat2() {
    return float2_;
  }

  public static final int INT2_FIELD_NUMBER = 9;
  private int int2_;
  /**
   * <code>int32 int2 = 9;</code>
   */
  public int getInt2() {
    return int2_;
  }

  public static final int LONG2_FIELD_NUMBER = 10;
  private long long2_;
  /**
   * <code>int64 long2 = 10;</code>
   */
  public long getLong2() {
    return long2_;
  }

  public static final int BOOLEAN2_FIELD_NUMBER = 11;
  private boolean boolean2_;
  /**
   * <code>bool boolean2 = 11;</code>
   */
  public boolean getBoolean2() {
    return boolean2_;
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
    if (double1_ != 0D) {
      output.writeDouble(1, double1_);
    }
    if (float1_ != 0F) {
      output.writeFloat(2, float1_);
    }
    if (int1_ != 0) {
      output.writeInt32(3, int1_);
    }
    if (long1_ != 0L) {
      output.writeInt64(4, long1_);
    }
    if (boolean1_ != false) {
      output.writeBool(5, boolean1_);
    }
    if (!getString1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, string1_);
    }
    if (double2_ != 0D) {
      output.writeDouble(7, double2_);
    }
    if (float2_ != 0F) {
      output.writeFloat(8, float2_);
    }
    if (int2_ != 0) {
      output.writeInt32(9, int2_);
    }
    if (long2_ != 0L) {
      output.writeInt64(10, long2_);
    }
    if (boolean2_ != false) {
      output.writeBool(11, boolean2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (double1_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, double1_);
    }
    if (float1_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, float1_);
    }
    if (int1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, int1_);
    }
    if (long1_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, long1_);
    }
    if (boolean1_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, boolean1_);
    }
    if (!getString1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, string1_);
    }
    if (double2_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, double2_);
    }
    if (float2_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(8, float2_);
    }
    if (int2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, int2_);
    }
    if (long2_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, long2_);
    }
    if (boolean2_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, boolean2_);
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
    if (!(obj instanceof com.flipkart.protobuf.ext.generator.test.sample.PlainMessage)) {
      return super.equals(obj);
    }
    com.flipkart.protobuf.ext.generator.test.sample.PlainMessage other = (com.flipkart.protobuf.ext.generator.test.sample.PlainMessage) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getDouble1())
        == java.lang.Double.doubleToLongBits(
            other.getDouble1()));
    result = result && (
        java.lang.Float.floatToIntBits(getFloat1())
        == java.lang.Float.floatToIntBits(
            other.getFloat1()));
    result = result && (getInt1()
        == other.getInt1());
    result = result && (getLong1()
        == other.getLong1());
    result = result && (getBoolean1()
        == other.getBoolean1());
    result = result && getString1()
        .equals(other.getString1());
    result = result && (
        java.lang.Double.doubleToLongBits(getDouble2())
        == java.lang.Double.doubleToLongBits(
            other.getDouble2()));
    result = result && (
        java.lang.Float.floatToIntBits(getFloat2())
        == java.lang.Float.floatToIntBits(
            other.getFloat2()));
    result = result && (getInt2()
        == other.getInt2());
    result = result && (getLong2()
        == other.getLong2());
    result = result && (getBoolean2()
        == other.getBoolean2());
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
    hash = (37 * hash) + DOUBLE1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDouble1()));
    hash = (37 * hash) + FLOAT1_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFloat1());
    hash = (37 * hash) + INT1_FIELD_NUMBER;
    hash = (53 * hash) + getInt1();
    hash = (37 * hash) + LONG1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLong1());
    hash = (37 * hash) + BOOLEAN1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBoolean1());
    hash = (37 * hash) + STRING1_FIELD_NUMBER;
    hash = (53 * hash) + getString1().hashCode();
    hash = (37 * hash) + DOUBLE2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDouble2()));
    hash = (37 * hash) + FLOAT2_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFloat2());
    hash = (37 * hash) + INT2_FIELD_NUMBER;
    hash = (53 * hash) + getInt2();
    hash = (37 * hash) + LONG2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLong2());
    hash = (37 * hash) + BOOLEAN2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBoolean2());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parseFrom(
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
  public static Builder newBuilder(com.flipkart.protobuf.ext.generator.test.sample.PlainMessage prototype) {
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
   * Protobuf type {@code PlainMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PlainMessage)
      com.flipkart.protobuf.ext.generator.test.sample.PlainMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.flipkart.protobuf.ext.generator.test.sample.PlainMessageOuterClass.internal_static_PlainMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.flipkart.protobuf.ext.generator.test.sample.PlainMessageOuterClass.internal_static_PlainMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.class, com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.Builder.class);
    }

    // Construct using com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.newBuilder()
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
      double1_ = 0D;

      float1_ = 0F;

      int1_ = 0;

      long1_ = 0L;

      boolean1_ = false;

      string1_ = "";

      double2_ = 0D;

      float2_ = 0F;

      int2_ = 0;

      long2_ = 0L;

      boolean2_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.flipkart.protobuf.ext.generator.test.sample.PlainMessageOuterClass.internal_static_PlainMessage_descriptor;
    }

    @java.lang.Override
    public com.flipkart.protobuf.ext.generator.test.sample.PlainMessage getDefaultInstanceForType() {
      return com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.flipkart.protobuf.ext.generator.test.sample.PlainMessage build() {
      com.flipkart.protobuf.ext.generator.test.sample.PlainMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.flipkart.protobuf.ext.generator.test.sample.PlainMessage buildPartial() {
      com.flipkart.protobuf.ext.generator.test.sample.PlainMessage result = new com.flipkart.protobuf.ext.generator.test.sample.PlainMessage(this);
      result.double1_ = double1_;
      result.float1_ = float1_;
      result.int1_ = int1_;
      result.long1_ = long1_;
      result.boolean1_ = boolean1_;
      result.string1_ = string1_;
      result.double2_ = double2_;
      result.float2_ = float2_;
      result.int2_ = int2_;
      result.long2_ = long2_;
      result.boolean2_ = boolean2_;
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
      if (other instanceof com.flipkart.protobuf.ext.generator.test.sample.PlainMessage) {
        return mergeFrom((com.flipkart.protobuf.ext.generator.test.sample.PlainMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.flipkart.protobuf.ext.generator.test.sample.PlainMessage other) {
      if (other == com.flipkart.protobuf.ext.generator.test.sample.PlainMessage.getDefaultInstance()) return this;
      if (other.getDouble1() != 0D) {
        setDouble1(other.getDouble1());
      }
      if (other.getFloat1() != 0F) {
        setFloat1(other.getFloat1());
      }
      if (other.getInt1() != 0) {
        setInt1(other.getInt1());
      }
      if (other.getLong1() != 0L) {
        setLong1(other.getLong1());
      }
      if (other.getBoolean1() != false) {
        setBoolean1(other.getBoolean1());
      }
      if (!other.getString1().isEmpty()) {
        string1_ = other.string1_;
        onChanged();
      }
      if (other.getDouble2() != 0D) {
        setDouble2(other.getDouble2());
      }
      if (other.getFloat2() != 0F) {
        setFloat2(other.getFloat2());
      }
      if (other.getInt2() != 0) {
        setInt2(other.getInt2());
      }
      if (other.getLong2() != 0L) {
        setLong2(other.getLong2());
      }
      if (other.getBoolean2() != false) {
        setBoolean2(other.getBoolean2());
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
      com.flipkart.protobuf.ext.generator.test.sample.PlainMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.flipkart.protobuf.ext.generator.test.sample.PlainMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double double1_ ;
    /**
     * <code>double double1 = 1;</code>
     */
    public double getDouble1() {
      return double1_;
    }
    /**
     * <code>double double1 = 1;</code>
     */
    public Builder setDouble1(double value) {
      
      double1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double1 = 1;</code>
     */
    public Builder clearDouble1() {
      
      double1_ = 0D;
      onChanged();
      return this;
    }

    private float float1_ ;
    /**
     * <code>float float1 = 2;</code>
     */
    public float getFloat1() {
      return float1_;
    }
    /**
     * <code>float float1 = 2;</code>
     */
    public Builder setFloat1(float value) {
      
      float1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float float1 = 2;</code>
     */
    public Builder clearFloat1() {
      
      float1_ = 0F;
      onChanged();
      return this;
    }

    private int int1_ ;
    /**
     * <code>int32 int1 = 3;</code>
     */
    public int getInt1() {
      return int1_;
    }
    /**
     * <code>int32 int1 = 3;</code>
     */
    public Builder setInt1(int value) {
      
      int1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int1 = 3;</code>
     */
    public Builder clearInt1() {
      
      int1_ = 0;
      onChanged();
      return this;
    }

    private long long1_ ;
    /**
     * <code>int64 long1 = 4;</code>
     */
    public long getLong1() {
      return long1_;
    }
    /**
     * <code>int64 long1 = 4;</code>
     */
    public Builder setLong1(long value) {
      
      long1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 long1 = 4;</code>
     */
    public Builder clearLong1() {
      
      long1_ = 0L;
      onChanged();
      return this;
    }

    private boolean boolean1_ ;
    /**
     * <code>bool boolean1 = 5;</code>
     */
    public boolean getBoolean1() {
      return boolean1_;
    }
    /**
     * <code>bool boolean1 = 5;</code>
     */
    public Builder setBoolean1(boolean value) {
      
      boolean1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool boolean1 = 5;</code>
     */
    public Builder clearBoolean1() {
      
      boolean1_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object string1_ = "";
    /**
     * <code>string string1 = 6;</code>
     */
    public java.lang.String getString1() {
      java.lang.Object ref = string1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        string1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string string1 = 6;</code>
     */
    public com.google.protobuf.ByteString
        getString1Bytes() {
      java.lang.Object ref = string1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        string1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string1 = 6;</code>
     */
    public Builder setString1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      string1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string1 = 6;</code>
     */
    public Builder clearString1() {
      
      string1_ = getDefaultInstance().getString1();
      onChanged();
      return this;
    }
    /**
     * <code>string string1 = 6;</code>
     */
    public Builder setString1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      string1_ = value;
      onChanged();
      return this;
    }

    private double double2_ ;
    /**
     * <code>double double2 = 7;</code>
     */
    public double getDouble2() {
      return double2_;
    }
    /**
     * <code>double double2 = 7;</code>
     */
    public Builder setDouble2(double value) {
      
      double2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double2 = 7;</code>
     */
    public Builder clearDouble2() {
      
      double2_ = 0D;
      onChanged();
      return this;
    }

    private float float2_ ;
    /**
     * <code>float float2 = 8;</code>
     */
    public float getFloat2() {
      return float2_;
    }
    /**
     * <code>float float2 = 8;</code>
     */
    public Builder setFloat2(float value) {
      
      float2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float float2 = 8;</code>
     */
    public Builder clearFloat2() {
      
      float2_ = 0F;
      onChanged();
      return this;
    }

    private int int2_ ;
    /**
     * <code>int32 int2 = 9;</code>
     */
    public int getInt2() {
      return int2_;
    }
    /**
     * <code>int32 int2 = 9;</code>
     */
    public Builder setInt2(int value) {
      
      int2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int2 = 9;</code>
     */
    public Builder clearInt2() {
      
      int2_ = 0;
      onChanged();
      return this;
    }

    private long long2_ ;
    /**
     * <code>int64 long2 = 10;</code>
     */
    public long getLong2() {
      return long2_;
    }
    /**
     * <code>int64 long2 = 10;</code>
     */
    public Builder setLong2(long value) {
      
      long2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 long2 = 10;</code>
     */
    public Builder clearLong2() {
      
      long2_ = 0L;
      onChanged();
      return this;
    }

    private boolean boolean2_ ;
    /**
     * <code>bool boolean2 = 11;</code>
     */
    public boolean getBoolean2() {
      return boolean2_;
    }
    /**
     * <code>bool boolean2 = 11;</code>
     */
    public Builder setBoolean2(boolean value) {
      
      boolean2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool boolean2 = 11;</code>
     */
    public Builder clearBoolean2() {
      
      boolean2_ = false;
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


    // @@protoc_insertion_point(builder_scope:PlainMessage)
  }

  // @@protoc_insertion_point(class_scope:PlainMessage)
  private static final com.flipkart.protobuf.ext.generator.test.sample.PlainMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.flipkart.protobuf.ext.generator.test.sample.PlainMessage();
  }

  public static com.flipkart.protobuf.ext.generator.test.sample.PlainMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlainMessage>
      PARSER = new com.google.protobuf.AbstractParser<PlainMessage>() {
    @java.lang.Override
    public PlainMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlainMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlainMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlainMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.flipkart.protobuf.ext.generator.test.sample.PlainMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

