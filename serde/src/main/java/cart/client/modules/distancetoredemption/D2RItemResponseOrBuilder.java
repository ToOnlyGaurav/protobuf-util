// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/client/modules/distancetoredemption/D2RItemResponse.proto

package cart.client.modules.distancetoredemption;

public interface D2RItemResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cart.client.modules.distancetoredemption.D2RItemResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
   */
  int getSourceValue();
  /**
   * <code>.cart.client.modules.distancetoredemption.D2RSource source = 1;</code>
   */
  cart.client.modules.distancetoredemption.D2RSource getSource();

  /**
   * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
   */
  boolean hasProductContext();
  /**
   * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
   */
  cart.client.modules.distancetoredemption.ProductContext getProductContext();
  /**
   * <code>.cart.client.modules.distancetoredemption.ProductContext productContext = 2;</code>
   */
  cart.client.modules.distancetoredemption.ProductContextOrBuilder getProductContextOrBuilder();

  /**
   * <code>string caseType = 3;</code>
   */
  java.lang.String getCaseType();
  /**
   * <code>string caseType = 3;</code>
   */
  com.google.protobuf.ByteString
      getCaseTypeBytes();

  /**
   * <code>string displayText = 4;</code>
   */
  java.lang.String getDisplayText();
  /**
   * <code>string displayText = 4;</code>
   */
  com.google.protobuf.ByteString
      getDisplayTextBytes();

  /**
   * <code>string promotionId = 5;</code>
   */
  java.lang.String getPromotionId();
  /**
   * <code>string promotionId = 5;</code>
   */
  com.google.protobuf.ByteString
      getPromotionIdBytes();

  /**
   * <code>string promotionPageURL = 6;</code>
   */
  java.lang.String getPromotionPageURL();
  /**
   * <code>string promotionPageURL = 6;</code>
   */
  com.google.protobuf.ByteString
      getPromotionPageURLBytes();
}
