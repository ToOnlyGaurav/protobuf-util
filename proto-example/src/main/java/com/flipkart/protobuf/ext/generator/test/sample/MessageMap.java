// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_map.proto

package com.flipkart.protobuf.ext.generator.test.sample;

public final class MessageMap {
  private MessageMap() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageWithMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageWithMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageWithMap_Entry_stringToStringMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageWithMap_Entry_stringToStringMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageWithMap_Entry_stringToIntMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageWithMap_Entry_stringToIntMap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021message_map.proto\"\375\001\n\016MessageWithMap\022B" +
      "\n\021stringToStringMap\030\001 \003(\0132\'.MessageWithM" +
      "ap.Entry_stringToStringMap\022<\n\016stringToIn" +
      "tMap\030\002 \003(\0132$.MessageWithMap.Entry_string" +
      "ToIntMap\0325\n\027Entry_stringToStringMap\022\013\n\003k" +
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\0322\n\024Entry_stringT" +
      "oIntMap\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005B3\n/c" +
      "om.flipkart.protobuf.ext.generator.test." +
      "sampleP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MessageWithMap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MessageWithMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageWithMap_descriptor,
        new java.lang.String[] { "StringToStringMap", "StringToIntMap", });
    internal_static_MessageWithMap_Entry_stringToStringMap_descriptor =
      internal_static_MessageWithMap_descriptor.getNestedTypes().get(0);
    internal_static_MessageWithMap_Entry_stringToStringMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageWithMap_Entry_stringToStringMap_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_MessageWithMap_Entry_stringToIntMap_descriptor =
      internal_static_MessageWithMap_descriptor.getNestedTypes().get(1);
    internal_static_MessageWithMap_Entry_stringToIntMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageWithMap_Entry_stringToIntMap_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
