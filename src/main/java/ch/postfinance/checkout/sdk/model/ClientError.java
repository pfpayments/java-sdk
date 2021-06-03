/**
* PostFinance Checkout SDK
*
* This library allows to interact with the PostFinance Checkout payment service.
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


package ch.postfinance.checkout.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import ch.postfinance.checkout.sdk.model.ClientErrorType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * An error that is returned as the result of a bad user request or a misconfiguration.
 */
@ApiModel(description = "An error that is returned as the result of a bad user request or a misconfiguration.")

public class ClientError {
  
  @JsonProperty("date")
  protected String date = null;

  
  @JsonProperty("defaultMessage")
  protected String defaultMessage = null;

  
  @JsonProperty("id")
  protected String id = null;

  
  @JsonProperty("message")
  protected String message = null;

  
  @JsonProperty("type")
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

