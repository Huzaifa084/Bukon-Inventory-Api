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
import io.bokun.inventory.plugin.api.rest.ExtraBooking;
import io.bokun.inventory.plugin.api.rest.Passenger;
import io.bokun.inventory.plugin.api.rest.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reservation
 */

public class Reservation {
  @SerializedName("rateId")
  private String rateId = null;

  @SerializedName("passengers")
  private List<Passenger> passengers = new ArrayList<Passenger>();

  @SerializedName("pricePerBooking")
  private Price pricePerBooking = null;

  @SerializedName("extraBooking")
  private List<ExtraBooking> extraBooking = null;

  public Reservation rateId(String rateId) {
    this.rateId = rateId;
    return this;
  }

   /**
   * Get rateId
   * @return rateId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRateId() {
    return rateId;
  }

  public void setRateId(String rateId) {
    this.rateId = rateId;
  }

  public Reservation passengers(List<Passenger> passengers) {
    this.passengers = passengers;
    return this;
  }

  public Reservation addPassengersItem(Passenger passengersItem) {
    this.passengers.add(passengersItem);
    return this;
  }

   /**
   * Get passengers
   * @return passengers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Passenger> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }

  public Reservation pricePerBooking(Price pricePerBooking) {
    this.pricePerBooking = pricePerBooking;
    return this;
  }

   /**
   * Get pricePerBooking
   * @return pricePerBooking
  **/
  @ApiModelProperty(value = "")
  public Price getPricePerBooking() {
    return pricePerBooking;
  }

  public void setPricePerBooking(Price pricePerBooking) {
    this.pricePerBooking = pricePerBooking;
  }

  public Reservation extraBooking(List<ExtraBooking> extraBooking) {
    this.extraBooking = extraBooking;
    return this;
  }

  public Reservation addExtraBookingItem(ExtraBooking extraBookingItem) {
    if (this.extraBooking == null) {
      this.extraBooking = new ArrayList<ExtraBooking>();
    }
    this.extraBooking.add(extraBookingItem);
    return this;
  }

   /**
   * Get extraBooking
   * @return extraBooking
  **/
  @ApiModelProperty(value = "")
  public List<ExtraBooking> getExtraBooking() {
    return extraBooking;
  }

  public void setExtraBooking(List<ExtraBooking> extraBooking) {
    this.extraBooking = extraBooking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservation reservation = (Reservation) o;
    return Objects.equals(this.rateId, reservation.rateId) &&
        Objects.equals(this.passengers, reservation.passengers) &&
        Objects.equals(this.pricePerBooking, reservation.pricePerBooking) &&
        Objects.equals(this.extraBooking, reservation.extraBooking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateId, passengers, pricePerBooking, extraBooking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
    sb.append("    pricePerBooking: ").append(toIndentedString(pricePerBooking)).append("\n");
    sb.append("    extraBooking: ").append(toIndentedString(extraBooking)).append("\n");
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

