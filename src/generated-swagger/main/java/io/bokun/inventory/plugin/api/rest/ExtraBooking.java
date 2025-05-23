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
import io.bokun.inventory.plugin.api.rest.ExtraPricingType;
import io.bokun.inventory.plugin.api.rest.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExtraBooking
 */

public class ExtraBooking {
  @SerializedName("extraId")
  private String extraId = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("pricingType")
  private ExtraPricingType pricingType = null;

  @SerializedName("price")
  private Price price = null;

  public ExtraBooking extraId(String extraId) {
    this.extraId = extraId;
    return this;
  }

   /**
   * Get extraId
   * @return extraId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getExtraId() {
    return extraId;
  }

  public void setExtraId(String extraId) {
    this.extraId = extraId;
  }

  public ExtraBooking amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ExtraBooking pricingType(ExtraPricingType pricingType) {
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Get pricingType
   * @return pricingType
  **/
  @ApiModelProperty(required = true, value = "")
  public ExtraPricingType getPricingType() {
    return pricingType;
  }

  public void setPricingType(ExtraPricingType pricingType) {
    this.pricingType = pricingType;
  }

  public ExtraBooking price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraBooking extraBooking = (ExtraBooking) o;
    return Objects.equals(this.extraId, extraBooking.extraId) &&
        Objects.equals(this.amount, extraBooking.amount) &&
        Objects.equals(this.pricingType, extraBooking.pricingType) &&
        Objects.equals(this.price, extraBooking.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraId, amount, pricingType, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraBooking {\n");
    
    sb.append("    extraId: ").append(toIndentedString(extraId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

