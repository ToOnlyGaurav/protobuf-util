// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/serviceability/ServiceabilityHoliday.proto

package cart.client.modules.serviceability;

public interface ServiceabilityHolidayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.serviceability.ServiceabilityHoliday)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp holidayDate = 1;</code>
   */
  boolean hasHolidayDate();
  /**
   * <code>.google.protobuf.Timestamp holidayDate = 1;</code>
   */
  com.google.protobuf.Timestamp getHolidayDate();
  /**
   * <code>.google.protobuf.Timestamp holidayDate = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getHolidayDateOrBuilder();

  /**
   * <code>string reason = 2;</code>
   */
  java.lang.String getReason();
  /**
   * <code>string reason = 2;</code>
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <code>.cart.client.modules.serviceability.enums.HolidayTypeEnum holidayTypeEnum = 3;</code>
   */
  int getHolidayTypeEnumValue();
  /**
   * <code>.cart.client.modules.serviceability.enums.HolidayTypeEnum holidayTypeEnum = 3;</code>
   */
  cart.client.modules.serviceability.enums.HolidayTypeEnum getHolidayTypeEnum();
}
