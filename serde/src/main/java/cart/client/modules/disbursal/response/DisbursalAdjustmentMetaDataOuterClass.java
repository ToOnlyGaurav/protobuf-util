// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalAdjustmentMetaData.proto

package cart.client.modules.disbursal.response;

public final class DisbursalAdjustmentMetaDataOuterClass {
  private DisbursalAdjustmentMetaDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_adjustmentMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_adjustmentMetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHcart/client/modules/disbursal/response" +
      "/DisbursalAdjustmentMetaData.proto\022&cart" +
      ".client.modules.disbursal.response\032\031goog" +
      "le/protobuf/any.proto\"\343\001\n\033DisbursalAdjus" +
      "tmentMetaData\022w\n\022adjustmentMetadata\030\001 \003(" +
      "\0132[.cart.client.modules.disbursal.respon" +
      "se.DisbursalAdjustmentMetaData.adjustmen" +
      "tMetadataEntry\032K\n\027adjustmentMetadataEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022#\n\005value\030\002 \001(\0132\024.google.p" +
      "rotobuf.AnyB*\n&cart.client.modules.disbu" +
      "rsal.responseP\001b\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_descriptor,
        new java.lang.String[] { "AdjustmentMetadata", });
    internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_adjustmentMetadataEntry_descriptor =
      internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_descriptor.getNestedTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_adjustmentMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalAdjustmentMetaData_adjustmentMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
