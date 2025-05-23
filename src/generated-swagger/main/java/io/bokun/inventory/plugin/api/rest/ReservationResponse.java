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
import io.bokun.inventory.plugin.api.rest.FailedReservation;
import io.bokun.inventory.plugin.api.rest.SuccessfulReservation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReservationResponse
 */

public class ReservationResponse {
  @SerializedName("successfulReservation")
  private SuccessfulReservation successfulReservation = null;

  @SerializedName("failedReservation")
  private FailedReservation failedReservation = null;

  public ReservationResponse successfulReservation(SuccessfulReservation successfulReservation) {
    this.successfulReservation = successfulReservation;
    return this;
  }

   /**
   * Get successfulReservation
   * @return successfulReservation
  **/
  @ApiModelProperty(value = "")
  public SuccessfulReservation getSuccessfulReservation() {
    return successfulReservation;
  }

  public void setSuccessfulReservation(SuccessfulReservation successfulReservation) {
    this.successfulReservation = successfulReservation;
  }

  public ReservationResponse failedReservation(FailedReservation failedReservation) {
    this.failedReservation = failedReservation;
    return this;
  }

   /**
   * Get failedReservation
   * @return failedReservation
  **/
  @ApiModelProperty(value = "")
  public FailedReservation getFailedReservation() {
    return failedReservation;
  }

  public void setFailedReservation(FailedReservation failedReservation) {
    this.failedReservation = failedReservation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationResponse reservationResponse = (ReservationResponse) o;
    return Objects.equals(this.successfulReservation, reservationResponse.successfulReservation) &&
        Objects.equals(this.failedReservation, reservationResponse.failedReservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulReservation, failedReservation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationResponse {\n");
    
    sb.append("    successfulReservation: ").append(toIndentedString(successfulReservation)).append("\n");
    sb.append("    failedReservation: ").append(toIndentedString(failedReservation)).append("\n");
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

