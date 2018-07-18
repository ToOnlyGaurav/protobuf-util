// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/datamodels/CartItemInfo.proto

package cart.client.v2.datamodels;

public interface CartItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.v2.datamodels.CartItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string cartId = 2;</code>
   */
  java.lang.String getCartId();
  /**
   * <code>string cartId = 2;</code>
   */
  com.google.protobuf.ByteString
      getCartIdBytes();

  /**
   * <code>.cart.client.endpoints.common.enums.CartItemAddedAgainst itemAddedAgainst = 3;</code>
   */
  int getItemAddedAgainstValue();
  /**
   * <code>.cart.client.endpoints.common.enums.CartItemAddedAgainst itemAddedAgainst = 3;</code>
   */
  cart.client.endpoints.common.enums.CartItemAddedAgainst getItemAddedAgainst();

  /**
   * <code>string itemSource = 4;</code>
   */
  java.lang.String getItemSource();
  /**
   * <code>string itemSource = 4;</code>
   */
  com.google.protobuf.ByteString
      getItemSourceBytes();

  /**
   * <code>string itemId = 5;</code>
   */
  java.lang.String getItemId();
  /**
   * <code>string itemId = 5;</code>
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>string isDeleted = 6;</code>
   */
  java.lang.String getIsDeleted();
  /**
   * <code>string isDeleted = 6;</code>
   */
  com.google.protobuf.ByteString
      getIsDeletedBytes();

  /**
   * <code>.google.protobuf.Timestamp addedDateTime = 7;</code>
   */
  boolean hasAddedDateTime();
  /**
   * <code>.google.protobuf.Timestamp addedDateTime = 7;</code>
   */
  com.google.protobuf.Timestamp getAddedDateTime();
  /**
   * <code>.google.protobuf.Timestamp addedDateTime = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getAddedDateTimeOrBuilder();

  /**
   * <code>.cart.client.v2.datamodels.CartItemMetaData cartItemMetaData = 8;</code>
   */
  boolean hasCartItemMetaData();
  /**
   * <code>.cart.client.v2.datamodels.CartItemMetaData cartItemMetaData = 8;</code>
   */
  cart.client.v2.datamodels.CartItemMetaData getCartItemMetaData();
  /**
   * <code>.cart.client.v2.datamodels.CartItemMetaData cartItemMetaData = 8;</code>
   */
  cart.client.v2.datamodels.CartItemMetaDataOrBuilder getCartItemMetaDataOrBuilder();

  /**
   * <code>string parentContext = 9;</code>
   */
  java.lang.String getParentContext();
  /**
   * <code>string parentContext = 9;</code>
   */
  com.google.protobuf.ByteString
      getParentContextBytes();

  /**
   * <code>string parentCartItemId = 10;</code>
   */
  java.lang.String getParentCartItemId();
  /**
   * <code>string parentCartItemId = 10;</code>
   */
  com.google.protobuf.ByteString
      getParentCartItemIdBytes();

  /**
   * <code>.cart.client.v2.datamodels.MarketPlace marketPlaceId = 11;</code>
   */
  int getMarketPlaceIdValue();
  /**
   * <code>.cart.client.v2.datamodels.MarketPlace marketPlaceId = 11;</code>
   */
  cart.client.v2.datamodels.MarketPlace getMarketPlaceId();
}