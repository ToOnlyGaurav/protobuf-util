// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/disbursal/response/DisbursalFreebieDetails.proto

package cart.client.modules.disbursal.response;

public final class DisbursalFreebieDetailsOuterClass {
  private DisbursalFreebieDetailsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_disbursal_response_DisbursalFreebieDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_disbursal_response_DisbursalFreebieDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDcart/client/modules/disbursal/response" +
      "/DisbursalFreebieDetails.proto\022&cart.cli" +
      "ent.modules.disbursal.response\"O\n\027Disbur" +
      "salFreebieDetails\022\021\n\tlistingId\030\001 \001(\t\022\017\n\007" +
      "summary\030\002 \001(\t\022\020\n\010quantity\030\003 \001(\005B*\n&cart." +
      "client.modules.disbursal.responseP\001b\006pro" +
      "to3"
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
    internal_static_cart_client_modules_disbursal_response_DisbursalFreebieDetails_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_disbursal_response_DisbursalFreebieDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_disbursal_response_DisbursalFreebieDetails_descriptor,
        new java.lang.String[] { "ListingId", "Summary", "Quantity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
