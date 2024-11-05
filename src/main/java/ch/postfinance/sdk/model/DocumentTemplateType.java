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
import ch.postfinance.sdk.model.DocumentTemplateTypeGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DocumentTemplateType {
  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("feature")
  protected Long feature = null;

  
  @JsonProperty("group")
  protected DocumentTemplateTypeGroup group = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("title")
  protected Map<String, String> title = null;

  
  
   /**
   * The localized description of the document template type.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the document template type.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * The feature that this document template type belongs to.
   * @return feature
  **/
  @ApiModelProperty(value = "The feature that this document template type belongs to.")
  public Long getFeature() {
    return feature;
  }

  
   /**
   * The group that this document template type belongs to.
   * @return group
  **/
  @ApiModelProperty(value = "The group that this document template type belongs to.")
  public DocumentTemplateTypeGroup getGroup() {
    return group;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The localized title of the document template type.
   * @return title
  **/
  @ApiModelProperty(value = "The localized title of the document template type.")
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

