// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalWarningMessage.proto

package cart.client.modules.disbursal.response;

public final class DisbursalWarningMessageOuterClass {
  private DisbursalWarningMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDcart/client/modules/disbursal/response" +
      "/DisbursalWarningMessage.proto\022&cart.cli" +
      "ent.modules.disbursal.response\032>cart/cli" +
      "ent/modules/disbursal/enums/DisbursalWar" +
      "ningEnum.proto\"\270\001\n\027DisbursalWarningMessa" +
      "ge\022\026\n\016warningMessage\030\001 \001(\t\022\027\n\017affectedOf" +
      "ferId\030\002 \001(\t\022W\n\024disbursalWarningEnum\030\003 \001(" +
      "\01629.cart.client.modules.disbursal.enums." +
      "DisbursalWarningEnum\022\023\n\013externalIds\030\004 \003(" +
      "\tB*\n&cart.client.modules.disbursal.respo" +
      "nseP\001b\006proto3"
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
          cart.client.modules.disbursal.enums.DisbursalWarningEnumOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalWarningMessage_descriptor,
        new java.lang.String[] { "WarningMessage", "AffectedOfferId", "DisbursalWarningEnum", "ExternalIds", });
    cart.client.modules.disbursal.enums.DisbursalWarningEnumOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
