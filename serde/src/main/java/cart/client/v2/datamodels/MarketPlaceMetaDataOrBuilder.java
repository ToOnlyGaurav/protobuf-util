// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/v2/datamodels/MarketPlaceMetaData.proto

package cart.client.v2.datamodels;

public interface MarketPlaceMetaDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.v2.datamodels.MarketPlaceMetaData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.client.modules.serviceability.ServiceAbilityInfo serviceAbilityInfo = 1;</code>
   */
  boolean hasServiceAbilityInfo();
  /**
   * <code>.cart.client.modules.serviceability.ServiceAbilityInfo serviceAbilityInfo = 1;</code>
   */
  cart.client.modules.serviceability.ServiceAbilityInfo getServiceAbilityInfo();
  /**
   * <code>.cart.client.modules.serviceability.ServiceAbilityInfo serviceAbilityInfo = 1;</code>
   */
  cart.client.modules.serviceability.ServiceAbilityInfoOrBuilder getServiceAbilityInfoOrBuilder();

  /**
   * <code>.cart.client.v2.datamodels.MinimumBuyabilityInfo minimumBuyabilityInfo = 3;</code>
   */
  boolean hasMinimumBuyabilityInfo();
  /**
   * <code>.cart.client.v2.datamodels.MinimumBuyabilityInfo minimumBuyabilityInfo = 3;</code>
   */
  cart.client.v2.datamodels.MinimumBuyabilityInfo getMinimumBuyabilityInfo();
  /**
   * <code>.cart.client.v2.datamodels.MinimumBuyabilityInfo minimumBuyabilityInfo = 3;</code>
   */
  cart.client.v2.datamodels.MinimumBuyabilityInfoOrBuilder getMinimumBuyabilityInfoOrBuilder();

  /**
   * <code>bool isMarketPlaceServiceable = 4;</code>
   */
  boolean getIsMarketPlaceServiceable();

  /**
   * <code>.cart.client.modules.disbursal.response.OfferMessage offerD2RMessage = 6;</code>
   */
  boolean hasOfferD2RMessage();
  /**
   * <code>.cart.client.modules.disbursal.response.OfferMessage offerD2RMessage = 6;</code>
   */
  cart.client.modules.disbursal.response.OfferMessage getOfferD2RMessage();
  /**
   * <code>.cart.client.modules.disbursal.response.OfferMessage offerD2RMessage = 6;</code>
   */
  cart.client.modules.disbursal.response.OfferMessageOrBuilder getOfferD2RMessageOrBuilder();

  /**
   * <code>string d2RMessage = 7;</code>
   */
  java.lang.String getD2RMessage();
  /**
   * <code>string d2RMessage = 7;</code>
   */
  com.google.protobuf.ByteString
      getD2RMessageBytes();

  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry shippingD2R = 8;</code>
   */
  java.util.List<cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry> 
      getShippingD2RList();
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry shippingD2R = 8;</code>
   */
  cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry getShippingD2R(int index);
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry shippingD2R = 8;</code>
   */
  int getShippingD2RCount();
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry shippingD2R = 8;</code>
   */
  java.util.List<? extends cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntryOrBuilder> 
      getShippingD2ROrBuilderList();
  /**
   * <code>repeated .cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntry shippingD2R = 8;</code>
   */
  cart.client.v2.datamodels.MarketPlaceMetaData.shippingD2REntryOrBuilder getShippingD2ROrBuilder(
      int index);
}