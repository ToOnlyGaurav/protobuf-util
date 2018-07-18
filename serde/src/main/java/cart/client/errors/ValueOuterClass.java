// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/errors/Value.proto

package cart.client.errors;

public final class ValueOuterClass {
  private ValueOuterClass() {}
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
      "\n\036cart/client/errors/Value.proto\022\022cart.c" +
      "lient.errors*\307\022\n\005Value\022\010\n\004INIT\020\000\022\t\n\005VALI" +
      "D\020\001\022\024\n\020NOT_AVAILABLE_PE\020\002\022\024\n\020INACTIVE_LI" +
      "STING\020\003\022\025\n\021NOT_AVAILABLE_CMS\020\004\022\021\n\rITEM_O" +
      "BSOLETE\020\005\022\021\n\rITEM_FILTERED\020\006\022\023\n\017ALREADY_" +
      "PRESENT\020\007\022\020\n\014OUT_OF_STOCK\020\010\022\024\n\020QUANTITY_" +
      "REVISED\020\t\022\027\n\023QUANTITY_REVISED_PE\020\n\022$\n QU" +
      "ANTITY_REVISED_PRODUCT_SERVICE\020\013\022\023\n\017NOT_" +
      "SERVICEABLE\020\014\022\016\n\nCREATE_EXC\020\r\022\016\n\nUPDATE_" +
      "EXC\020\016\022\016\n\nINSERT_EXC\020\017\022\016\n\nSELECT_EXC\020\020\022\022\n" +
      "\016VERSION_SELECT\020\021\022\020\n\014CAS_MISMATCH\020\022\022\016\n\nD" +
      "ELETE_EXC\020\023\022\020\n\014NO_KEY_FOUND\020\024\022\021\n\rDUPLICA" +
      "TE_KEY\020\025\022\027\n\023RESOLVE_FROM_ID_EXC\020\026\022\031\n\025RES" +
      "OLVE_FROM_META_EXC\020\027\022\024\n\020NO_PROFILE_FOUND" +
      "\020\030\022\027\n\023NO_PROFILE_ID_FOUND\020\031\022\026\n\022TRANSACTI" +
      "ON_FAILED\020\032\022#\n\037DEFAULT_ACTION_RESOLVER_N" +
      "OT_SET\020\033\022\024\n\020RESOLVER_NOT_SET\020\034\022\034\n\030IMPLEM" +
      "ENTATION_NOT_FOUND\020\035\022\032\n\026NOT_PRESENT_FOR_" +
      "UPDATE\020\036\022\032\n\026NOT_PRESENT_FOR_DELETE\020\037\022\022\n\016" +
      "INVALID_ITEMID\020 \022&\n\"QUANTITY_REVISED_PRE" +
      "DEFINED_SOURCE\020!\022\020\n\014ITEM_IS_FREE\020\"\022\023\n\017SH" +
      "ARD_NOT_FOUND\020#\022\030\n\024CANNOT_RESOLVE_SHARD\020" +
      "$\022\033\n\027ITEM_NOT_IN_PE_RESPONSE\020%\022\033\n\027CART_I" +
      "TEM_SIZE_EXCEEDED\020&\022\034\n\030ITEM_WITH_RESTRIC" +
      "TED_QTY\020\'\022 \n\034DATA_STORE_RESOLUTION_FAILE" +
      "D\020(\022\035\n\031REQUEST_RESOLUTION_FAILED\020)\022\023\n\017IN" +
      "VALID_REQUEST\020*\022\022\n\016TIER_NOT_FOUND\020+\022\020\n\014T" +
      "IER_UPDATED\020,\022\032\n\026GIFTWRAP_NOT_AVAILABLE\020" +
      "-\022\031\n\025GIFTWRAP_INFO_UPDATED\020.\022\024\n\020NOT_LIVE" +
      "_LISTING\020/\022\035\n\031INSUFFICIENT_INFO_LISTING\020" +
      "0\022 \n\034CONVERT_VALIDATION_EXCEPTION\0201\022\030\n\024T" +
      "ASK_HANDLER_FAILURE\0202\022\032\n\026CART_SERVICE_EX" +
      "CEPTION\0203\022\036\n\032CART_PERSISTENCE_EXCEPTION\020" +
      "4\022\022\n\016JSON_EXCEPTION\0205\022\034\n\030INVALID_ENTITY_" +
      "EXCEPTION\0206\022\032\n\026CART_RUNTIME_EXCEPTION\0207\022" +
      "\024\n\020CONFIG_EXCEPTION\0208\022\026\n\022COMPRESSION_FAI" +
      "LED\0209\022\030\n\024DECOMPRESSION_FAILED\020:\022\032\n\026METAD" +
      "ATA_UPDATE_FAILED\020;\022\024\n\020METADATA_UPDATED\020" +
      "<\022\026\n\022METADATA_NOT_VALID\020=\022\037\n\033ROLLBACK_RE" +
      "SERVATION_FAILED\020>\022\023\n\017ITEM_WAITLISTED\020?\022" +
      "\022\n\016NOT_RESERVABLE\020@\022\026\n\022WAITLIST_AVAILABL" +
      "E\020A\022\027\n\023RESERVATION_EXPIRED\020B\022\035\n\031INSUFFIC" +
      "IENT_INFO_PRICING\020C\022\035\n\031CHANNEL_BASED_RES" +
      "TRICTION\020D\022\032\n\026PINCODE_NOT_RESERVABLE\020E\022 " +
      "\n\034CHILD_RELATIONSHIP_NOT_VALID\020F\022\034\n\030NOT_" +
      "INDEPENDENT_SELLABLE\020G\022\030\n\024NOT_VALID_FOR_" +
      "UPDATE\020H\022\035\n\031PRESENT_IN_ANOTHER_PARENT\020I\022" +
      "!\n\035QUANTITY_REVISED_PARENT_CHILD\020J\022\024\n\020PA" +
      "RENT_NOT_VALID\020K\022\031\n\025PARENT_NOT_SERVICABL" +
      "E\020L\022\033\n\027IS_INDEPENDENT_SELLABLE\020M\022\031\n\025PARE" +
      "NT_DOES_NOT_EXIST\020N\022\"\n\036PARENT_ITEM_NOT_I" +
      "N_PE_RESPONSE\020O\022\032\n\026SHIELD_RESTRICTED_ITE" +
      "M\020P\022\033\n\027QUANTITY_REVISED_SHIELD\020Q\022\031\n\025NOT_" +
      "ELIGIBLE_FOR_SALE\020R\022\031\n\025RESERVATION_NOT_V" +
      "ALID\020S\022\031\n\025MIGRATION_NOT_ALLOWED\020T\022\026\n\022WAI" +
      "TLISTING_FAILED\020U\022\021\n\rITEM_ALLOTTED\020V\022\025\n\021" +
      "ITEM_NOT_ALLOTTED\020W\022\030\n\024RESERVATION_REQUI" +
      "RED\020X\022\027\n\023NOT_AVAILABLE_SANTA\020Y\022\034\n\030ZULU_M" +
      "ARKETPLACE_CHANGED\020Z\022\033\n\027MARKETPLACE_NOT_" +
      "ALLOWED\020[\022\037\n\033RESERVATION_ALREADY_AVAILED" +
      "\020\\\022\032\n\026NOT_RESERVABLE_PINCODE\020]B\026\n\022cart.c" +
      "lient.errorsP\001b\006proto3"
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