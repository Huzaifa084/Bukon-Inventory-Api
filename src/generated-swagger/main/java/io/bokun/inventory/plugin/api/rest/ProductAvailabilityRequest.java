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
import io.bokun.inventory.plugin.api.rest.DatePeriod;
import io.bokun.inventory.plugin.api.rest.PluginConfigurationParameterValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductAvailabilityRequest
 */

public class ProductAvailabilityRequest {
  @SerializedName("range")
  private DatePeriod range = null;

  @SerializedName("productId")
  private String productId = null;

  @SerializedName("parameters")
  private List<PluginConfigurationParameterValue> parameters = new ArrayList<PluginConfigurationParameterValue>();

  public ProductAvailabilityRequest range(DatePeriod range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(required = true, value = "")
  public DatePeriod getRange() {
    return range;
  }

  public void setRange(DatePeriod range) {
    this.range = range;
  }

  public ProductAvailabilityRequest productId(String productId) {
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

  public ProductAvailabilityRequest parameters(List<PluginConfigurationParameterValue> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ProductAvailabilityRequest addParametersItem(PluginConfigurationParameterValue parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PluginConfigurationParameterValue> getParameters() {
    return parameters;
  }

  public void setParameters(List<PluginConfigurationParameterValue> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAvailabilityRequest productAvailabilityRequest = (ProductAvailabilityRequest) o;
    return Objects.equals(this.range, productAvailabilityRequest.range) &&
        Objects.equals(this.productId, productAvailabilityRequest.productId) &&
        Objects.equals(this.parameters, productAvailabilityRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, productId, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAvailabilityRequest {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

