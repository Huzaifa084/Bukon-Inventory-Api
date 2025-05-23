/*
 * Channel Manager REST API
 * Channel Manager REST API. You can find out more about Channel Manager [here](https://www.bokun.io/sell/channel-manager).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bokun.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.bokun.inventory.plugin.api.rest;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProductsAvailabilityResponse
 */

public class ProductsAvailabilityResponse {
  @SerializedName("productId")
  private String productId = null;

  @SerializedName("actualCheckDone")
  private Boolean actualCheckDone = null;

  public ProductsAvailabilityResponse productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductsAvailabilityResponse actualCheckDone(Boolean actualCheckDone) {
    this.actualCheckDone = actualCheckDone;
    return this;
  }

   /**
   * Get actualCheckDone
   * @return actualCheckDone
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getActualCheckDone() {
    return actualCheckDone;
  }

  public void setActualCheckDone(Boolean actualCheckDone) {
    this.actualCheckDone = actualCheckDone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsAvailabilityResponse productsAvailabilityResponse = (ProductsAvailabilityResponse) o;
    return Objects.equals(this.productId, productsAvailabilityResponse.productId) &&
        Objects.equals(this.actualCheckDone, productsAvailabilityResponse.actualCheckDone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, actualCheckDone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsAvailabilityResponse {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    actualCheckDone: ").append(toIndentedString(actualCheckDone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

