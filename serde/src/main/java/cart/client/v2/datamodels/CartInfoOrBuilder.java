// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/datamodels/CartInfo.proto

package cart.client.v2.datamodels;

public interface CartInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.v2.datamodels.CartInfo)
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
   * <code>.cart.client.endpoints.common.enums.CartDomainName domain = 2;</code>
   */
  int getDomainValue();
  /**
   * <code>.cart.client.endpoints.common.enums.CartDomainName domain = 2;</code>
   */
  cart.client.endpoints.common.enums.CartDomainName getDomain();

  /**
   * <code>.cart.client.endpoints.common.enums.CartAssocType assocType = 3;</code>
   */
  int getAssocTypeValue();
  /**
   * <code>.cart.client.endpoints.common.enums.CartAssocType assocType = 3;</code>
   */
  cart.client.endpoints.common.enums.CartAssocType getAssocType();

  /**
   * <code>string assocId = 4;</code>
   */
  java.lang.String getAssocId();
  /**
   * <code>string assocId = 4;</code>
   */
  com.google.protobuf.ByteString
      getAssocIdBytes();

  /**
   * <code>int64 version = 5;</code>
   */
  long getVersion();

  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceInfo marketPlaceInfoList = 6;</code>
   */
  java.util.List<cart.client.v2.datamodels.MarketPlaceInfo> 
      getMarketPlaceInfoListList();
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceInfo marketPlaceInfoList = 6;</code>
   */
  cart.client.v2.datamodels.MarketPlaceInfo getMarketPlaceInfoList(int index);
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceInfo marketPlaceInfoList = 6;</code>
   */
  int getMarketPlaceInfoListCount();
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceInfo marketPlaceInfoList = 6;</code>
   */
  java.util.List<? extends cart.client.v2.datamodels.MarketPlaceInfoOrBuilder> 
      getMarketPlaceInfoListOrBuilderList();
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceInfo marketPlaceInfoList = 6;</code>
   */
  cart.client.v2.datamodels.MarketPlaceInfoOrBuilder getMarketPlaceInfoListOrBuilder(
      int index);

  /**
   * <code>.cart.client.v2.datamodels.CartMetaData cartMetaData = 7;</code>
   */
  boolean hasCartMetaData();
  /**
   * <code>.cart.client.v2.datamodels.CartMetaData cartMetaData = 7;</code>
   */
  cart.client.v2.datamodels.CartMetaData getCartMetaData();
  /**
   * <code>.cart.client.v2.datamodels.CartMetaData cartMetaData = 7;</code>
   */
  cart.client.v2.datamodels.CartMetaDataOrBuilder getCartMetaDataOrBuilder();
}