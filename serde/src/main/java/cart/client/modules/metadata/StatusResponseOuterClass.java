// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/metadata/StatusResponse.proto

package cart.client.modules.metadata;

public final class StatusResponseOuterClass {
  private StatusResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_modules_metadata_StatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_modules_metadata_StatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1cart/client/modules/metadata/StatusRes" +
      "ponse.proto\022\034cart.client.modules.metadat" +
      "a\032\036cart/client/errors/Value.proto\032+cart/" +
      "client/statemanagement/ItemState.proto\"\237" +
      "\001\n\016StatusResponse\022-\n\nstatusCode\030\001 \001(\0162\031." +
      "cart.client.errors.Value\0229\n\titemState\030\002 " +
      "\001(\0162&.cart.client.statemanagement.ItemSt" +
      "ate\022\017\n\007message\030\003 \001(\t\022\022\n\nhasChanged\030\004 \001(\010" +
      "B \n\034cart.client.modules.metadataP\001b\006prot" +
      "o3"
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
          cart.client.errors.ValueOuterClass.getDescriptor(),
          cart.client.statemanagement.ItemStateOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_modules_metadata_StatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_modules_metadata_StatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_modules_metadata_StatusResponse_descriptor,
        new java.lang.String[] { "StatusCode", "ItemState", "Message", "HasChanged", });
    cart.client.errors.ValueOuterClass.getDescriptor();
    cart.client.statemanagement.ItemStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
