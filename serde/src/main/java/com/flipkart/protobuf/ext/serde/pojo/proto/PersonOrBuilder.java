// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/CartInfo.proto

package com.flipkart.protobuf.ext.serde.pojo.proto;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .Person.PhoneNumber phoneNumber = 4;</code>
   */
  java.util.List<com.flipkart.protobuf.ext.serde.pojo.proto.Person.PhoneNumber> 
      getPhoneNumberList();
  /**
   * <code>repeated .Person.PhoneNumber phoneNumber = 4;</code>
   */
  com.flipkart.protobuf.ext.serde.pojo.proto.Person.PhoneNumber getPhoneNumber(int index);
  /**
   * <code>repeated .Person.PhoneNumber phoneNumber = 4;</code>
   */
  int getPhoneNumberCount();
  /**
   * <code>repeated .Person.PhoneNumber phoneNumber = 4;</code>
   */
  java.util.List<? extends com.flipkart.protobuf.ext.serde.pojo.proto.Person.PhoneNumberOrBuilder> 
      getPhoneNumberOrBuilderList();
  /**
   * <code>repeated .Person.PhoneNumber phoneNumber = 4;</code>
   */
  com.flipkart.protobuf.ext.serde.pojo.proto.Person.PhoneNumberOrBuilder getPhoneNumberOrBuilder(
      int index);
}