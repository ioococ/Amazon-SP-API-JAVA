/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Specifies the identifiers used to uniquely identify an item.
 */
@ApiModel(description = "Specifies the identifiers used to uniquely identify an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-30T12:29:48.923+08:00")
public class IdentifierType {
  @SerializedName("MarketplaceASIN")
  private ASINIdentifier marketplaceASIN = null;

  @SerializedName("SKUIdentifier")
  private SellerSKUIdentifier skUIdentifier = null;

  public IdentifierType marketplaceASIN(ASINIdentifier marketplaceASIN) {
    this.marketplaceASIN = marketplaceASIN;
    return this;
  }

   /**
   * Indicates the item is identified by MarketPlaceId and ASIN.
   * @return marketplaceASIN
  **/
  @ApiModelProperty(required = true, value = "Indicates the item is identified by MarketPlaceId and ASIN.")
  public ASINIdentifier getMarketplaceASIN() {
    return marketplaceASIN;
  }

  public void setMarketplaceASIN(ASINIdentifier marketplaceASIN) {
    this.marketplaceASIN = marketplaceASIN;
  }

  public IdentifierType skUIdentifier(SellerSKUIdentifier skUIdentifier) {
    this.skUIdentifier = skUIdentifier;
    return this;
  }

   /**
   * Indicates the item is identified by MarketPlaceId, SellerId, and SellerSKU.
   * @return skUIdentifier
  **/
  @ApiModelProperty(value = "Indicates the item is identified by MarketPlaceId, SellerId, and SellerSKU.")
  public SellerSKUIdentifier getSkUIdentifier() {
    return skUIdentifier;
  }

  public void setSkUIdentifier(SellerSKUIdentifier skUIdentifier) {
    this.skUIdentifier = skUIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierType identifierType = (IdentifierType) o;
    return Objects.equals(this.marketplaceASIN, identifierType.marketplaceASIN) &&
        Objects.equals(this.skUIdentifier, identifierType.skUIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceASIN, skUIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierType {\n");

    sb.append("    marketplaceASIN: ").append(toIndentedString(marketplaceASIN)).append("\n");
    sb.append("    skUIdentifier: ").append(toIndentedString(skUIdentifier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

