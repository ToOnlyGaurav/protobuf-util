// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/datamodels/MarketPlaceInfo.proto

package cart.client.v2.datamodels;

public final class MarketPlaceInfoOuterClass {
  private MarketPlaceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_v2_datamodels_MarketPlaceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_v2_datamodels_MarketPlaceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/cart/client/v2/datamodels/MarketPlaceI" +
      "nfo.proto\022\031cart.client.v2.datamodels\032,ca" +
      "rt/client/v2/datamodels/CartItemInfo.pro" +
      "to\0323cart/client/v2/datamodels/MarketPlac" +
      "eMetaData.proto\032+cart/client/v2/datamode" +
      "ls/MarketPlace.proto\"\327\001\n\017MarketPlaceInfo" +
      "\022;\n\013marketPlace\030\001 \001(\0162&.cart.client.v2.d" +
      "atamodels.MarketPlace\022:\n\tcartItems\030\002 \003(\013" +
      "2\'.cart.client.v2.datamodels.CartItemInf" +
      "o\022K\n\023marketPlaceMetaData\030\003 \001(\0132..cart.cl" +
      "ient.v2.datamodels.MarketPlaceMetaDataB\035" +
      "\n\031cart.client.v2.datamodelsP\001b\006proto3"
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
          cart.client.v2.datamodels.CartItemInfoOuterClass.getDescriptor(),
          cart.client.v2.datamodels.MarketPlaceMetaDataOuterClass.getDescriptor(),
          cart.client.v2.datamodels.MarketPlaceOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_v2_datamodels_MarketPlaceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_v2_datamodels_MarketPlaceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_v2_datamodels_MarketPlaceInfo_descriptor,
        new java.lang.String[] { "MarketPlace", "CartItems", "MarketPlaceMetaData", });
    cart.client.v2.datamodels.CartItemInfoOuterClass.getDescriptor();
    cart.client.v2.datamodels.MarketPlaceMetaDataOuterClass.getDescriptor();
    cart.client.v2.datamodels.MarketPlaceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
