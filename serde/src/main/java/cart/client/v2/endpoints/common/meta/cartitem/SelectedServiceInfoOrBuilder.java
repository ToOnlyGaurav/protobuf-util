// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/endpoints/common/meta/cartitem/SelectedServiceInfo.proto

package cart.client.v2.endpoints.common.meta.cartitem;

public interface SelectedServiceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.v2.endpoints.common.meta.cartitem.SelectedServiceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.client.endpoints.common.meta.cartitem.ServiceType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.cart.client.endpoints.common.meta.cartitem.ServiceType type = 1;</code>
   */
  cart.client.endpoints.common.meta.cartitem.ServiceType getType();

  /**
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.cart.client.endpoints.common.meta.Giftwrap gwInfo = 3;</code>
   */
  boolean hasGwInfo();
  /**
   * <code>.cart.client.endpoints.common.meta.Giftwrap gwInfo = 3;</code>
   */
  cart.client.endpoints.common.meta.Giftwrap getGwInfo();
  /**
   * <code>.cart.client.endpoints.common.meta.Giftwrap gwInfo = 3;</code>
   */
  cart.client.endpoints.common.meta.GiftwrapOrBuilder getGwInfoOrBuilder();

  /**
   * <code>.cart.client.endpoints.common.meta.cartitem.UpdatedBy updatedBy = 4;</code>
   */
  int getUpdatedByValue();
  /**
   * <code>.cart.client.endpoints.common.meta.cartitem.UpdatedBy updatedBy = 4;</code>
   */
  cart.client.endpoints.common.meta.cartitem.UpdatedBy getUpdatedBy();

  /**
   * <code>.cart.client.modules.serviceability.Slot slot = 5;</code>
   */
  boolean hasSlot();
  /**
   * <code>.cart.client.modules.serviceability.Slot slot = 5;</code>
   */
  cart.client.modules.serviceability.Slot getSlot();
  /**
   * <code>.cart.client.modules.serviceability.Slot slot = 5;</code>
   */
  cart.client.modules.serviceability.SlotOrBuilder getSlotOrBuilder();
}