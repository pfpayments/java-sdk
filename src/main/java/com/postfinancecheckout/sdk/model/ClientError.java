/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.postfinancecheckout.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.postfinancecheckout.sdk.model.ClientErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * An error that is returned as the result of a bad user request or a misconfiguration.
 */
public class ClientError {
  
  @SerializedName("date")
  protected String date = null;

  
  @SerializedName("defaultMessage")
  protected String defaultMessage = null;

  
  @SerializedName("id")
  protected String id = null;

  
  @SerializedName("message")
  protected String message = null;

  
  @SerializedName("type")
  protected ClientErrorType type = null;

  
  
   /**
   * Date when an error has occurred.
   * @return date
  **/
  @ApiModelProperty(value = "Date when an error has occurred.")
  public String getDate() {
    return date;
  }

  
   /**
   * The error message which is translated into the default language (i.e. English).
   * @return defaultMessage
  **/
  @ApiModelProperty(value = "The error message which is translated into the default language (i.e. English).")
  public String getDefaultMessage() {
    return defaultMessage;
  }

  
   /**
   * Unique identifier of an error.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of an error.")
  public String getId() {
    return id;
  }

  
   /**
   * The error message which is translated in into the language of the client.
   * @return message
  **/
  @ApiModelProperty(value = "The error message which is translated in into the language of the client.")
  public String getMessage() {
    return message;
  }

  
   /**
   * The type of the client error.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the client error.")
  public ClientErrorType getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientError clientError = (ClientError) o;
    return Objects.equals(this.date, clientError.date) &&
        Objects.equals(this.defaultMessage, clientError.defaultMessage) &&
        Objects.equals(this.id, clientError.id) &&
        Objects.equals(this.message, clientError.message) &&
        Objects.equals(this.type, clientError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, defaultMessage, id, message, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientError {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

