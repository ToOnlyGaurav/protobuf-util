// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalPBOOfferDetail.proto

package cart.client.modules.disbursal.response;

public final class DisbursalPBOOfferDetailOuterClass {
  private DisbursalPBOOfferDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_metadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_metadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDcart/client/modules/disbursal/response" +
      "/DisbursalPBOOfferDetail.proto\022&cart.cli" +
      "ent.modules.disbursal.response\"\321\001\n\027Disbu" +
      "rsalPBOOfferDetail\022\017\n\007offerId\030\001 \001(\t\022_\n\010m" +
      "etadata\030\002 \003(\0132M.cart.client.modules.disb" +
      "ursal.response.DisbursalPBOOfferDetail.m" +
      "etadataEntry\022\027\n\017offerItemAmount\030\003 \001(\005\032+\n" +
      "\rmetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\tB*\n&cart.client.modules.disbursal.resp" +
      "onseP\001b\006proto3"
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
    internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_descriptor,
        new java.lang.String[] { "OfferId", "Metadata", "OfferItemAmount", });
    internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_metadataEntry_descriptor =
      internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_descriptor.getNestedTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_metadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalPBOOfferDetail_metadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
