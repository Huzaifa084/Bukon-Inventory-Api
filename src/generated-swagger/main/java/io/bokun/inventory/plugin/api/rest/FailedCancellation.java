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
 * FailedCancellation
 */

public class FailedCancellation {
  @SerializedName("cancellationError")
  private String cancellationError = null;

  public FailedCancellation cancellationError(String cancellationError) {
    this.cancellationError = cancellationError;
    return this;
  }

   /**
   * Get cancellationError
   * @return cancellationError
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCancellationError() {
    return cancellationError;
  }

  public void setCancellationError(String cancellationError) {
    this.cancellationError = cancellationError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedCancellation failedCancellation = (FailedCancellation) o;
    return Objects.equals(this.cancellationError, failedCancellation.cancellationError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedCancellation {\n");
    
    sb.append("    cancellationError: ").append(toIndentedString(cancellationError)).append("\n");
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

