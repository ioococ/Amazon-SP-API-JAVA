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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ItemOffersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-30T12:29:48.923+08:00")
public class ItemOffersResponse {
  @SerializedName("headers")
  private HttpResponseHeaders headers = null;

  @SerializedName("status")
  private GetOffersHttpStatusLine status = null;

  @SerializedName("body")
  private GetOffersResponse body = null;

  @SerializedName("request")
  private ItemOffersRequestParams request = null;

  public ItemOffersResponse headers(HttpResponseHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public HttpResponseHeaders getHeaders() {
    return headers;
  }

  public void setHeaders(HttpResponseHeaders headers) {
    this.headers = headers;
  }

  public ItemOffersResponse status(GetOffersHttpStatusLine status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetOffersHttpStatusLine getStatus() {
    return status;
  }

  public void setStatus(GetOffersHttpStatusLine status) {
    this.status = status;
  }

  public ItemOffersResponse body(GetOffersResponse body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "")
  public GetOffersResponse getBody() {
    return body;
  }

  public void setBody(GetOffersResponse body) {
    this.body = body;
  }

  public ItemOffersResponse request(ItemOffersRequestParams request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemOffersRequestParams getRequest() {
    return request;
  }

  public void setRequest(ItemOffersRequestParams request) {
    this.request = request;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemOffersResponse itemOffersResponse = (ItemOffersResponse) o;
    return Objects.equals(this.headers, itemOffersResponse.headers) &&
        Objects.equals(this.status, itemOffersResponse.status) &&
        Objects.equals(this.body, itemOffersResponse.body) &&
        Objects.equals(this.request, itemOffersResponse.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, status, body, request);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemOffersResponse {\n");

    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

