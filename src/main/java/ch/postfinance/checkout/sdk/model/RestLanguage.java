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

public class RestLanguage {
  
  @JsonProperty("countryCode")
  protected String countryCode = null;

  
  @JsonProperty("ietfCode")
  protected String ietfCode = null;

  
  @JsonProperty("iso2Code")
  protected String iso2Code = null;

  
  @JsonProperty("iso3Code")
  protected String iso3Code = null;

  
  @JsonProperty("pluralExpression")
  protected String pluralExpression = null;

  
  @JsonProperty("primaryOfGroup")
  protected Boolean primaryOfGroup = null;

  
  
   /**
   * The country code represents the region of the language as a 2 letter ISO code.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country code represents the region of the language as a 2 letter ISO code.")
  public String getCountryCode() {
    return countryCode;
  }

  
   /**
   * The IETF code represents the language as the two letter ISO code including the region (e.g. en-US).
   * @return ietfCode
  **/
  @ApiModelProperty(value = "The IETF code represents the language as the two letter ISO code including the region (e.g. en-US).")
  public String getIetfCode() {
    return ietfCode;
  }

  
   /**
   * The ISO 2 letter code represents the language with two letters.
   * @return iso2Code
  **/
  @ApiModelProperty(value = "The ISO 2 letter code represents the language with two letters.")
  public String getIso2Code() {
    return iso2Code;
  }

  
   /**
   * The ISO 3 letter code represents the language with three letters.
   * @return iso3Code
  **/
  @ApiModelProperty(value = "The ISO 3 letter code represents the language with three letters.")
  public String getIso3Code() {
    return iso3Code;
  }

  
   /**
   * The plural expression defines how to map a plural into the language index. This expression is used to determine the plural form for the translations.
   * @return pluralExpression
  **/
  @ApiModelProperty(value = "The plural expression defines how to map a plural into the language index. This expression is used to determine the plural form for the translations.")
  public String getPluralExpression() {
    return pluralExpression;
  }

  
   /**
   * The primary language of a group indicates whether a language is the primary language of a group of languages. The group is determine by the ISO 2 letter code.
   * @return primaryOfGroup
  **/
  @ApiModelProperty(value = "The primary language of a group indicates whether a language is the primary language of a group of languages. The group is determine by the ISO 2 letter code.")
  public Boolean isPrimaryOfGroup() {
    return primaryOfGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestLanguage restLanguage = (RestLanguage) o;
    return Objects.equals(this.countryCode, restLanguage.countryCode) &&
        Objects.equals(this.ietfCode, restLanguage.ietfCode) &&
        Objects.equals(this.iso2Code, restLanguage.iso2Code) &&
        Objects.equals(this.iso3Code, restLanguage.iso3Code) &&
        Objects.equals(this.pluralExpression, restLanguage.pluralExpression) &&
        Objects.equals(this.primaryOfGroup, restLanguage.primaryOfGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, ietfCode, iso2Code, iso3Code, pluralExpression, primaryOfGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestLanguage {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    ietfCode: ").append(toIndentedString(ietfCode)).append("\n");
    sb.append("    iso2Code: ").append(toIndentedString(iso2Code)).append("\n");
    sb.append("    iso3Code: ").append(toIndentedString(iso3Code)).append("\n");
    sb.append("    pluralExpression: ").append(toIndentedString(pluralExpression)).append("\n");
    sb.append("    primaryOfGroup: ").append(toIndentedString(primaryOfGroup)).append("\n");
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

