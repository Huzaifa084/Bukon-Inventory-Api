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
import io.bokun.inventory.plugin.api.rest.FailedReservationCancellation;
import io.bokun.inventory.plugin.api.rest.SuccessfulReservationCancellation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CancelReservationResponse
 */

public class CancelReservationResponse {
  @SerializedName("successfulReservationCancellation")
  private SuccessfulReservationCancellation successfulReservationCancellation = null;

  @SerializedName("failedReservationCancellation")
  private FailedReservationCancellation failedReservationCancellation = null;

  public CancelReservationResponse successfulReservationCancellation(SuccessfulReservationCancellation successfulReservationCancellation) {
    this.successfulReservationCancellation = successfulReservationCancellation;
    return this;
  }

   /**
   * Get successfulReservationCancellation
   * @return successfulReservationCancellation
  **/
  @ApiModelProperty(value = "")
  public SuccessfulReservationCancellation getSuccessfulReservationCancellation() {
    return successfulReservationCancellation;
  }

  public void setSuccessfulReservationCancellation(SuccessfulReservationCancellation successfulReservationCancellation) {
    this.successfulReservationCancellation = successfulReservationCancellation;
  }

  public CancelReservationResponse failedReservationCancellation(FailedReservationCancellation failedReservationCancellation) {
    this.failedReservationCancellation = failedReservationCancellation;
    return this;
  }

   /**
   * Get failedReservationCancellation
   * @return failedReservationCancellation
  **/
  @ApiModelProperty(value = "")
  public FailedReservationCancellation getFailedReservationCancellation() {
    return failedReservationCancellation;
  }

  public void setFailedReservationCancellation(FailedReservationCancellation failedReservationCancellation) {
    this.failedReservationCancellation = failedReservationCancellation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelReservationResponse cancelReservationResponse = (CancelReservationResponse) o;
    return Objects.equals(this.successfulReservationCancellation, cancelReservationResponse.successfulReservationCancellation) &&
        Objects.equals(this.failedReservationCancellation, cancelReservationResponse.failedReservationCancellation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulReservationCancellation, failedReservationCancellation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelReservationResponse {\n");
    
    sb.append("    successfulReservationCancellation: ").append(toIndentedString(successfulReservationCancellation)).append("\n");
    sb.append("    failedReservationCancellation: ").append(toIndentedString(failedReservationCancellation)).append("\n");
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

