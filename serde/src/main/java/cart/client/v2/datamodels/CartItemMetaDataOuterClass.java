// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/datamodels/CartItemMetaData.proto

package cart.client.v2.datamodels;

public final class CartItemMetaDataOuterClass {
  private CartItemMetaDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_CartItemMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_CartItemMetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_CartItemMetaData_servicesSelectedEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_CartItemMetaData_servicesSelectedEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_CartItemMetaData_dependentSvcVersionEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_CartItemMetaData_dependentSvcVersionEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_CartItemMetaData_productInfoAttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_CartItemMetaData_productInfoAttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0cart/client/v2/datamodels/CartItemMeta" +
      "Data.proto\022\031cart.client.v2.datamodels\032>c" +
      "art/client/modules/serviceability/Offers" +
      "ExchangeContext.proto\032:cart/client/datam" +
      "odels/metadata/ProductInfoAttribute.prot" +
      "o\0329cart/client/endpoints/common/meta/car" +
      "titem/Quantity.proto\032,cart/client/datamo" +
      "dels/ReservationInfo.proto\032;cart/client/" +
      "modules/serviceability/CartFulfilmentInf" +
      "o.proto\0321cart/client/modules/metadata/St" +
      "atusResponse.proto\0325cart/client/modules/" +
      "productinfo/MinimalItemInfo.proto\032Gcart/" +
      "client/v2/endpoints/common/meta/cartitem" +
      "/SelectedServiceInfo.proto\032<cart/client/" +
      "endpoints/common/meta/cartitem/ServiceTy" +
      "pe.proto\0329cart/client/modules/disbursal/" +
      "DisbursalItemResponse.proto\0326cart/client" +
      "/datamodels/metadata/DependentService.pr" +
      "oto\0328cart/client/modules/adjustments/Car" +
      "tItemAdjustment.proto\032;cart/client/modul" +
      "es/serviceability/ServiceAbilityInfo.pro" +
      "to\032;cart/client/modules/disbursal/respon" +
      "se/AttachMetadata.proto\"\204\014\n\020CartItemMeta" +
      "Data\022F\n\010quantity\030\001 \001(\01324.cart.client.end" +
      "points.common.meta.cartitem.Quantity\022R\n\022" +
      "serviceAbilityInfo\030\002 \001(\01326.cart.client.m" +
      "odules.serviceability.ServiceAbilityInfo" +
      "\022S\n\025disbursalItemResponse\030\003 \001(\01324.cart.c" +
      "lient.modules.disbursal.DisbursalItemRes" +
      "ponse\022\026\n\016freebieSummary\030\004 \001(\t\022R\n\017exchang" +
      "eContext\030\005 \001(\01329.cart.client.modules.ser" +
      "viceability.OffersExchangeContext\022N\n\016ful" +
      "filmentInfo\030\006 \001(\01326.cart.client.modules." +
      "serviceability.CartFulfilmentInfo\022[\n\020ser" +
      "vicesSelected\030\007 \003(\0132A.cart.client.v2.dat" +
      "amodels.CartItemMetaData.servicesSelecte" +
      "dEntry\022I\n\017minimalItemInfo\030\010 \001(\01320.cart.c" +
      "lient.modules.productinfo.MinimalItemInf" +
      "o\022D\n\016statusResponse\030\t \001(\0132,.cart.client." +
      "modules.metadata.StatusResponse\022K\n\016itemA" +
      "djustment\030\n \001(\01323.cart.client.modules.ad" +
      "justments.CartItemAdjustment\022a\n\023dependen" +
      "tSvcVersion\030\013 \003(\0132D.cart.client.v2.datam" +
      "odels.CartItemMetaData.dependentSvcVersi" +
      "onEntry\022e\n\025productInfoAttributes\030\014 \003(\0132F" +
      ".cart.client.v2.datamodels.CartItemMetaD" +
      "ata.productInfoAttributesEntry\022@\n\017reserv" +
      "ationInfo\030\r \001(\0132\'.cart.client.datamodels" +
      ".ReservationInfo\022N\n\016attachMetadata\030\016 \001(\013" +
      "26.cart.client.modules.disbursal.respons" +
      "e.AttachMetadata\022\035\n\025serviceabilityGroupI" +
      "d\030\017 \001(\t\032\260\001\n\025servicesSelectedEntry\022D\n\003key" +
      "\030\001 \001(\01627.cart.client.endpoints.common.me" +
      "ta.cartitem.ServiceType\022Q\n\005value\030\002 \001(\0132B" +
      ".cart.client.v2.endpoints.common.meta.ca" +
      "rtitem.SelectedServiceInfo\032i\n\030dependentS" +
      "vcVersionEntry\022>\n\003key\030\001 \001(\01621.cart.clien" +
      "t.datamodels.metadata.DependentService\022\r" +
      "\n\005value\030\002 \001(\t\032o\n\032productInfoAttributesEn" +
      "try\022B\n\003key\030\001 \001(\01625.cart.client.datamodel" +
      "s.metadata.ProductInfoAttribute\022\r\n\005value" +
      "\030\002 \001(\tB\035\n\031cart.client.v2.datamodelsP\001b\006p" +
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
          cart.client.modules.serviceability.OffersExchangeContextOuterClass.getDescriptor(),
          cart.client.datamodels.metadata.ProductInfoAttributeOuterClass.getDescriptor(),
          cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.getDescriptor(),
          cart.client.datamodels.ReservationInfoOuterClass.getDescriptor(),
          cart.client.modules.serviceability.CartFulfilmentInfoOuterClass.getDescriptor(),
          cart.client.modules.metadata.StatusResponseOuterClass.getDescriptor(),
          cart.client.modules.productinfo.MinimalItemInfoOuterClass.getDescriptor(),
          cart.client.v2.endpoints.common.meta.cartitem.SelectedServiceInfoOuterClass.getDescriptor(),
          cart.client.endpoints.common.meta.cartitem.ServiceTypeOuterClass.getDescriptor(),
          cart.client.modules.disbursal.DisbursalItemResponseOuterClass.getDescriptor(),
          cart.client.datamodels.metadata.DependentServiceOuterClass.getDescriptor(),
          cart.client.modules.adjustments.CartItemAdjustmentOuterClass.getDescriptor(),
          cart.client.modules.serviceability.ServiceAbilityInfoOuterClass.getDescriptor(),
          cart.client.modules.disbursal.response.AttachMetadataOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_v2_datamodels_CartItemMetaData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_v2_datamodels_CartItemMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_CartItemMetaData_descriptor,
        new java.lang.String[] { "Quantity", "ServiceAbilityInfo", "DisbursalItemResponse", "FreebieSummary", "ExchangeContext", "FulfilmentInfo", "ServicesSelected", "MinimalItemInfo", "StatusResponse", "ItemAdjustment", "DependentSvcVersion", "ProductInfoAttributes", "ReservationInfo", "AttachMetadata", "ServiceabilityGroupId", });
    internal_static_cart_client_v2_datamodels_CartItemMetaData_servicesSelectedEntry_descriptor =
      internal_static_cart_client_v2_datamodels_CartItemMetaData_descriptor.getNestedTypes().get(0);
    internal_static_cart_client_v2_datamodels_CartItemMetaData_servicesSelectedEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_CartItemMetaData_servicesSelectedEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_cart_client_v2_datamodels_CartItemMetaData_dependentSvcVersionEntry_descriptor =
      internal_static_cart_client_v2_datamodels_CartItemMetaData_descriptor.getNestedTypes().get(1);
    internal_static_cart_client_v2_datamodels_CartItemMetaData_dependentSvcVersionEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_CartItemMetaData_dependentSvcVersionEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_cart_client_v2_datamodels_CartItemMetaData_productInfoAttributesEntry_descriptor =
      internal_static_cart_client_v2_datamodels_CartItemMetaData_descriptor.getNestedTypes().get(2);
    internal_static_cart_client_v2_datamodels_CartItemMetaData_productInfoAttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_CartItemMetaData_productInfoAttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    cart.client.modules.serviceability.OffersExchangeContextOuterClass.getDescriptor();
    cart.client.datamodels.metadata.ProductInfoAttributeOuterClass.getDescriptor();
    cart.client.endpoints.common.meta.cartitem.QuantityOuterClass.getDescriptor();
    cart.client.datamodels.ReservationInfoOuterClass.getDescriptor();
    cart.client.modules.serviceability.CartFulfilmentInfoOuterClass.getDescriptor();
    cart.client.modules.metadata.StatusResponseOuterClass.getDescriptor();
    cart.client.modules.productinfo.MinimalItemInfoOuterClass.getDescriptor();
    cart.client.v2.endpoints.common.meta.cartitem.SelectedServiceInfoOuterClass.getDescriptor();
    cart.client.endpoints.common.meta.cartitem.ServiceTypeOuterClass.getDescriptor();
    cart.client.modules.disbursal.DisbursalItemResponseOuterClass.getDescriptor();
    cart.client.datamodels.metadata.DependentServiceOuterClass.getDescriptor();
    cart.client.modules.adjustments.CartItemAdjustmentOuterClass.getDescriptor();
    cart.client.modules.serviceability.ServiceAbilityInfoOuterClass.getDescriptor();
    cart.client.modules.disbursal.response.AttachMetadataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
