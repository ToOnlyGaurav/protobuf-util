// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalOffer.proto

package cart.client.modules.disbursal.response;

public final class DisbursalOfferOuterClass {
  private DisbursalOfferOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalOffer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalOffer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;cart/client/modules/disbursal/response" +
      "/DisbursalOffer.proto\022&cart.client.modul" +
      "es.disbursal.response\032Jcart/client/modul" +
      "es/disbursal/response/DisbursalNetAdjust" +
      "mentDetails.proto\032Ccart/client/modules/d" +
      "isbursal/enums/DisbursalGiveAwayTypeEnum" +
      ".proto\032>cart/client/modules/disbursal/en" +
      "ums/DisbursalBasedOnEnum.proto\032Ccart/cli" +
      "ent/modules/disbursal/response/Disbursal" +
      "OfferMetaData.proto\0329cart/client/modules" +
      "/disbursal/response/OfferMessage.proto\032C" +
      "cart/client/modules/disbursal/enums/Disb" +
      "ursalApplicableOnEnum.proto\"\352\004\n\016Disbursa" +
      "lOffer\022\017\n\007offerId\030\001 \001(\t\022J\n\007basedOn\030\002 \001(\016" +
      "29.cart.client.modules.disbursal.enums.D" +
      "isbursalBasedOnEnum\022T\n\014applicableOn\030\003 \001(" +
      "\0162>.cart.client.modules.disbursal.enums." +
      "DisbursalApplicableOnEnum\022T\n\014giveAwayTyp" +
      "e\030\004 \001(\0162>.cart.client.modules.disbursal." +
      "enums.DisbursalGiveAwayTypeEnum\022\025\n\risCon" +
      "ditional\030\005 \001(\010\022l\n\035disbursalNetAdjustment" +
      "Details\030\006 \001(\0132E.cart.client.modules.disb" +
      "ursal.response.DisbursalNetAdjustmentDet" +
      "ails\022U\n\rofferMetaData\030\007 \001(\0132>.cart.clien" +
      "t.modules.disbursal.response.DisbursalOf" +
      "ferMetaData\022\026\n\016discountAmount\030\010 \001(\001\022J\n\014o" +
      "fferMessage\030\t \001(\01324.cart.client.modules." +
      "disbursal.response.OfferMessage\022\017\n\007messa" +
      "ge\030\n \001(\tB*\n&cart.client.modules.disbursa" +
      "l.responseP\001b\006proto3"
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
          cart.client.modules.disbursal.response.DisbursalNetAdjustmentDetailsOuterClass.getDescriptor(),
          cart.client.modules.disbursal.enums.DisbursalGiveAwayTypeEnumOuterClass.getDescriptor(),
          cart.client.modules.disbursal.enums.DisbursalBasedOnEnumOuterClass.getDescriptor(),
          cart.client.modules.disbursal.response.DisbursalOfferMetaDataOuterClass.getDescriptor(),
          cart.client.modules.disbursal.response.OfferMessageOuterClass.getDescriptor(),
          cart.client.modules.disbursal.enums.DisbursalApplicableOnEnumOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_disbursal_response_DisbursalOffer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalOffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalOffer_descriptor,
        new java.lang.String[] { "OfferId", "BasedOn", "ApplicableOn", "GiveAwayType", "IsConditional", "DisbursalNetAdjustmentDetails", "OfferMetaData", "DiscountAmount", "OfferMessage", "Message", });
    cart.client.modules.disbursal.response.DisbursalNetAdjustmentDetailsOuterClass.getDescriptor();
    cart.client.modules.disbursal.enums.DisbursalGiveAwayTypeEnumOuterClass.getDescriptor();
    cart.client.modules.disbursal.enums.DisbursalBasedOnEnumOuterClass.getDescriptor();
    cart.client.modules.disbursal.response.DisbursalOfferMetaDataOuterClass.getDescriptor();
    cart.client.modules.disbursal.response.OfferMessageOuterClass.getDescriptor();
    cart.client.modules.disbursal.enums.DisbursalApplicableOnEnumOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
