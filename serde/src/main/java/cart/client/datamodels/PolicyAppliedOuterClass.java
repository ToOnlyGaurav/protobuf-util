// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/datamodels/PolicyApplied.proto

package cart.client.datamodels;

public final class PolicyAppliedOuterClass {
  private PolicyAppliedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cart_client_datamodels_PolicyApplied_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cart_client_datamodels_PolicyApplied_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*cart/client/datamodels/PolicyApplied.p" +
      "roto\022\026cart.client.datamodels\032.cart/clien" +
      "t/datamodels/PolicyAppliedEnum.proto\"x\n\r" +
      "PolicyApplied\022\020\n\010policyId\030\001 \001(\t\022D\n\021polic" +
      "yAppliedEnum\030\002 \001(\0162).cart.client.datamod" +
      "els.PolicyAppliedEnum\022\017\n\007buyable\030\003 \001(\010B\032" +
      "\n\026cart.client.datamodelsP\001b\006proto3"
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
          cart.client.datamodels.PolicyAppliedEnumOuterClass.getDescriptor(),
        }, assigner);
    internal_static_cart_client_datamodels_PolicyApplied_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cart_client_datamodels_PolicyApplied_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cart_client_datamodels_PolicyApplied_descriptor,
        new java.lang.String[] { "PolicyId", "PolicyAppliedEnum", "Buyable", });
    cart.client.datamodels.PolicyAppliedEnumOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}