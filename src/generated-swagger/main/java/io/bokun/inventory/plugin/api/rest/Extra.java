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
 * Extra
 */

public class Extra {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("optional")
  private Boolean optional = null;

  @SerializedName("maxPerBooking")
  private Integer maxPerBooking = null;

  @SerializedName("limitByPax")
  private Boolean limitByPax = null;

  @SerializedName("increasesCapacity")
  private Boolean increasesCapacity = null;

  public Extra id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Extra title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Extra description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Extra optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Get optional
   * @return optional
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public Extra maxPerBooking(Integer maxPerBooking) {
    this.maxPerBooking = maxPerBooking;
    return this;
  }

   /**
   * Get maxPerBooking
   * @return maxPerBooking
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxPerBooking() {
    return maxPerBooking;
  }

  public void setMaxPerBooking(Integer maxPerBooking) {
    this.maxPerBooking = maxPerBooking;
  }

  public Extra limitByPax(Boolean limitByPax) {
    this.limitByPax = limitByPax;
    return this;
  }

   /**
   * Get limitByPax
   * @return limitByPax
  **/
  @ApiModelProperty(value = "")
  public Boolean getLimitByPax() {
    return limitByPax;
  }

  public void setLimitByPax(Boolean limitByPax) {
    this.limitByPax = limitByPax;
  }

  public Extra increasesCapacity(Boolean increasesCapacity) {
    this.increasesCapacity = increasesCapacity;
    return this;
  }

   /**
   * Get increasesCapacity
   * @return increasesCapacity
  **/
  @ApiModelProperty(value = "")
  public Boolean getIncreasesCapacity() {
    return increasesCapacity;
  }

  public void setIncreasesCapacity(Boolean increasesCapacity) {
    this.increasesCapacity = increasesCapacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extra extra = (Extra) o;
    return Objects.equals(this.id, extra.id) &&
        Objects.equals(this.title, extra.title) &&
        Objects.equals(this.description, extra.description) &&
        Objects.equals(this.optional, extra.optional) &&
        Objects.equals(this.maxPerBooking, extra.maxPerBooking) &&
        Objects.equals(this.limitByPax, extra.limitByPax) &&
        Objects.equals(this.increasesCapacity, extra.increasesCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, optional, maxPerBooking, limitByPax, increasesCapacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extra {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    maxPerBooking: ").append(toIndentedString(maxPerBooking)).append("\n");
    sb.append("    limitByPax: ").append(toIndentedString(limitByPax)).append("\n");
    sb.append("    increasesCapacity: ").append(toIndentedString(increasesCapacity)).append("\n");
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

