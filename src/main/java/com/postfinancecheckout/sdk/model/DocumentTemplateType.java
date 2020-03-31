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
import com.postfinancecheckout.sdk.model.DocumentTemplateTypeGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class DocumentTemplateType {
  
  @SerializedName("description")
  protected Map<String, String> description = null;

  
  @SerializedName("feature")
  protected Long feature = null;

  
  @SerializedName("group")
  protected DocumentTemplateTypeGroup group = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("title")
  protected Map<String, String> title = null;

  
  
   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return feature
  **/
  @ApiModelProperty(value = "")
  public Long getFeature() {
    return feature;
  }

  
   /**
   * 
   * @return group
  **/
  @ApiModelProperty(value = "")
  public DocumentTemplateTypeGroup getGroup() {
    return group;
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
   * @return title
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTitle() {
    return title;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplateType documentTemplateType = (DocumentTemplateType) o;
    return Objects.equals(this.description, documentTemplateType.description) &&
        Objects.equals(this.feature, documentTemplateType.feature) &&
        Objects.equals(this.group, documentTemplateType.group) &&
        Objects.equals(this.id, documentTemplateType.id) &&
        Objects.equals(this.title, documentTemplateType.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feature, group, id, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplateType {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

