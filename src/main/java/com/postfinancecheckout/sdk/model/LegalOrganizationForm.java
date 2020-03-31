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
import com.postfinancecheckout.sdk.model.LocalizedString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class LegalOrganizationForm {
  
  @SerializedName("country")
  protected String country = null;

  
  @SerializedName("description")
  protected List<LocalizedString> description = null;

  
  @SerializedName("englishDescription")
  protected String englishDescription = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("shortcut")
  protected List<LocalizedString> shortcut = null;

  
  
   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  
   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public List<LocalizedString> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return englishDescription
  **/
  @ApiModelProperty(value = "")
  public String getEnglishDescription() {
    return englishDescription;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return shortcut
  **/
  @ApiModelProperty(value = "")
  public List<LocalizedString> getShortcut() {
    return shortcut;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalOrganizationForm legalOrganizationForm = (LegalOrganizationForm) o;
    return Objects.equals(this.country, legalOrganizationForm.country) &&
        Objects.equals(this.description, legalOrganizationForm.description) &&
        Objects.equals(this.englishDescription, legalOrganizationForm.englishDescription) &&
        Objects.equals(this.id, legalOrganizationForm.id) &&
        Objects.equals(this.shortcut, legalOrganizationForm.shortcut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, description, englishDescription, id, shortcut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalOrganizationForm {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    englishDescription: ").append(toIndentedString(englishDescription)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
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

