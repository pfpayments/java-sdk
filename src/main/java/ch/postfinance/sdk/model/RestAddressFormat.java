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


package ch.postfinance.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import ch.postfinance.sdk.model.RestAddressFormatField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class RestAddressFormat {
  
  @JsonProperty("postCodeExamples")
  protected List<String> postCodeExamples = null;

  
  @JsonProperty("postCodeRegex")
  protected String postCodeRegex = null;

  
  @JsonProperty("requiredFields")
  protected List<RestAddressFormatField> requiredFields = null;

  
  @JsonProperty("usedFields")
  protected List<RestAddressFormatField> usedFields = null;

  
  
   /**
   * A list of sample post codes.
   * @return postCodeExamples
  **/
  @ApiModelProperty(value = "A list of sample post codes.")
  public List<String> getPostCodeExamples() {
    return postCodeExamples;
  }

  
   /**
   * The regular expression to validate post codes.
   * @return postCodeRegex
  **/
  @ApiModelProperty(value = "The regular expression to validate post codes.")
  public String getPostCodeRegex() {
    return postCodeRegex;
  }

  
   /**
   * The fields that are required in the address format.
   * @return requiredFields
  **/
  @ApiModelProperty(value = "The fields that are required in the address format.")
  public List<RestAddressFormatField> getRequiredFields() {
    return requiredFields;
  }

  
   /**
   * The fields that are used in the address format.
   * @return usedFields
  **/
  @ApiModelProperty(value = "The fields that are used in the address format.")
  public List<RestAddressFormatField> getUsedFields() {
    return usedFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestAddressFormat restAddressFormat = (RestAddressFormat) o;
    return Objects.equals(this.postCodeExamples, restAddressFormat.postCodeExamples) &&
        Objects.equals(this.postCodeRegex, restAddressFormat.postCodeRegex) &&
        Objects.equals(this.requiredFields, restAddressFormat.requiredFields) &&
        Objects.equals(this.usedFields, restAddressFormat.usedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postCodeExamples, postCodeRegex, requiredFields, usedFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestAddressFormat {\n");
    
    sb.append("    postCodeExamples: ").append(toIndentedString(postCodeExamples)).append("\n");
    sb.append("    postCodeRegex: ").append(toIndentedString(postCodeRegex)).append("\n");
    sb.append("    requiredFields: ").append(toIndentedString(requiredFields)).append("\n");
    sb.append("    usedFields: ").append(toIndentedString(usedFields)).append("\n");
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

