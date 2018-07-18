// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/datamodels/CartMetaData.proto

package cart.client.v2.datamodels;

public final class CartMetaDataOuterClass {
  private CartMetaDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_CartMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_CartMetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_CartMetaData_groupAdjustmentsMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_CartMetaData_groupAdjustmentsMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,cart/client/v2/datamodels/CartMetaData" +
      ".proto\022\031cart.client.v2.datamodels\0325cart/" +
      "client/endpoints/common/meta/cart/UserIn" +
      "fo.proto\0325cart/client/modules/adjustment" +
      "s/GroupAdjustment.proto\0320cart/client/mod" +
      "ules/adjustments/Adjustment.proto\032;cart/" +
      "client/endpoints/common/meta/cart/Source" +
      "CartInfo.proto\032;cart/client/modules/serv" +
      "iceability/ServiceAbilityInfo.proto\032=car" +
      "t/client/endpoints/common/meta/cart/User" +
      "Demographics.proto\032-cart/client/modules/" +
      "disbursal/PZDataBag.proto\032*cart/client/d" +
      "atamodels/PolicyApplied.proto\"\256\006\n\014CartMe" +
      "taData\022R\n\020userDemographics\030\001 \001(\01328.cart." +
      "client.endpoints.common.meta.cart.UserDe" +
      "mographics\022B\n\010userInfo\030\002 \001(\01320.cart.clie" +
      "nt.endpoints.common.meta.cart.UserInfo\022\036" +
      "\n\026isRegisteredFFCustomer\030\003 \001(\010\022N\n\016source" +
      "CartInfo\030\004 \001(\01326.cart.client.endpoints.c" +
      "ommon.meta.cart.SourceCartInfo\022;\n\tpzData" +
      "Bag\030\006 \001(\0132(.cart.client.modules.disbursa" +
      "l.PZDataBag\022\026\n\016offersCritical\030\007 \001(\010\022R\n\022s" +
      "erviceAbilityInfo\030\010 \001(\01326.cart.client.mo" +
      "dules.serviceability.ServiceAbilityInfo\022" +
      "I\n\024cartLevelAdjustments\030\n \003(\0132+.cart.cli" +
      "ent.modules.adjustments.Adjustment\022]\n\023gr" +
      "oupAdjustmentsMap\030\013 \003(\0132@.cart.client.v2" +
      ".datamodels.CartMetaData.groupAdjustment" +
      "sMapEntry\022@\n\021policyAppliedList\030\014 \003(\0132%.c" +
      "art.client.datamodels.PolicyApplied\022\027\n\017s" +
      "hippingPinCode\030\r \001(\t\032h\n\030groupAdjustments" +
      "MapEntry\022\013\n\003key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320.c" +
      "art.client.modules.adjustments.GroupAdju" +
      "stmentB\035\n\031cart.client.v2.datamodelsP\001b\006p" +
      "roto3"
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
          cart.client.endpoints.common.meta.cart.UserInfoOuterClass.getDescriptor(),
          cart.client.modules.adjustments.GroupAdjustmentOuterClass.getDescriptor(),
          cart.client.modules.adjustments.AdjustmentOuterClass.getDescriptor(),
          cart.client.endpoints.common.meta.cart.SourceCartInfoOuterClass.getDescriptor(),
          cart.client.modules.serviceability.ServiceAbilityInfoOuterClass.getDescriptor(),
          cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.getDescriptor(),
          cart.client.modules.disbursal.PZDataBagOuterClass.getDescriptor(),
          cart.client.datamodels.PolicyAppliedOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_v2_datamodels_CartMetaData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_v2_datamodels_CartMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_CartMetaData_descriptor,
        new java.lang.String[] { "UserDemographics", "UserInfo", "IsRegisteredFFCustomer", "SourceCartInfo", "PzDataBag", "OffersCritical", "ServiceAbilityInfo", "CartLevelAdjustments", "GroupAdjustmentsMap", "PolicyAppliedList", "ShippingPinCode", });
    internal_static_cart_client_v2_datamodels_CartMetaData_groupAdjustmentsMapEntry_descriptor =
      internal_static_cart_client_v2_datamodels_CartMetaData_descriptor.getNestedTypes().get(0);
    internal_static_cart_client_v2_datamodels_CartMetaData_groupAdjustmentsMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_CartMetaData_groupAdjustmentsMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    cart.client.endpoints.common.meta.cart.UserInfoOuterClass.getDescriptor();
    cart.client.modules.adjustments.GroupAdjustmentOuterClass.getDescriptor();
    cart.client.modules.adjustments.AdjustmentOuterClass.getDescriptor();
    cart.client.endpoints.common.meta.cart.SourceCartInfoOuterClass.getDescriptor();
    cart.client.modules.serviceability.ServiceAbilityInfoOuterClass.getDescriptor();
    cart.client.endpoints.common.meta.cart.UserDemographicsOuterClass.getDescriptor();
    cart.client.modules.disbursal.PZDataBagOuterClass.getDescriptor();
    cart.client.datamodels.PolicyAppliedOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}