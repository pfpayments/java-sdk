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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class RestCountryState {
  
  @JsonProperty("code")
  protected String code = null;

  
  @JsonProperty("country")
  protected String country = null;

  
  @JsonProperty("countryCode")
  protected String countryCode = null;

  
  @JsonProperty("id")
  protected String id = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  
   /**
   * The state&#39;s code used within addresses.
   * @return code
  **/
  @ApiModelProperty(value = "The state's code used within addresses.")
  public String getCode() {
    return code;
  }

  
   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  
   /**
   * The two-letter code of the state&#39;s country (ISO 3166-1 alpha-2 format).
   * @return countryCode
  **/
  @ApiModelProperty(value = "The two-letter code of the state's country (ISO 3166-1 alpha-2 format).")
  public String getCountryCode() {
    return countryCode;
  }

  
   /**
   * The state&#39;s code in ISO 3166-2 format.
   * @return id
  **/
  @ApiModelProperty(value = "The state's code in ISO 3166-2 format.")
  public String getId() {
    return id;
  }

  
   /**
   * The name of the state.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the state.")
  public String getName() {
    return name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCountryState restCountryState = (RestCountryState) o;
    return Objects.equals(this.code, restCountryState.code) &&
        Objects.equals(this.country, restCountryState.country) &&
        Objects.equals(this.countryCode, restCountryState.countryCode) &&
        Objects.equals(this.id, restCountryState.id) &&
        Objects.equals(this.name, restCountryState.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, country, countryCode, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCountryState {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

