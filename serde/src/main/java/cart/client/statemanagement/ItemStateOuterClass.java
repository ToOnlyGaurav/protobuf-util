// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/statemanagement/ItemState.proto

package cart.client.statemanagement;

public final class ItemStateOuterClass {
  private ItemStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+cart/client/statemanagement/ItemState." +
      "proto\022\033cart.client.statemanagement*I\n\tIt" +
      "emState\022\010\n\004COLD\020\000\022\013\n\007BUYABLE\020\001\022\023\n\017SERVIC" +
      "E_FAILURE\020\002\022\020\n\014INTERMEDIATE\020\003B\037\n\033cart.cl" +
      "ient.statemanagementP\001b\006proto3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
