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
import ch.postfinance.checkout.sdk.model.CreationEntityState;
import ch.postfinance.checkout.sdk.model.ResourcePath;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A document template contains the customizations for a particular document template type.
 */
@ApiModel(description = "A document template contains the customizations for a particular document template type.")

public class DocumentTemplate {
  
  @JsonProperty("defaultTemplate")
  protected Boolean defaultTemplate = null;

  
  @JsonProperty("deliveryEnabled")
  protected Boolean deliveryEnabled = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("spaceId")
  protected Long spaceId = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("templateResource")
  protected ResourcePath templateResource = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The default document template is used whenever no specific template is specified for a particular template type.
   * @return defaultTemplate
  **/
  @ApiModelProperty(value = "The default document template is used whenever no specific template is specified for a particular template type.")
  public Boolean isDefaultTemplate() {
    return defaultTemplate;
  }

  
   /**
   * 
   * @return deliveryEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeliveryEnabled() {
    return deliveryEnabled;
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return spaceId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceId() {
    return spaceId;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * 
   * @return templateResource
  **/
  @ApiModelProperty(value = "")
  public ResourcePath getTemplateResource() {
    return templateResource;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Long getType() {
    return type;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplate documentTemplate = (DocumentTemplate) o;
    return Objects.equals(this.defaultTemplate, documentTemplate.defaultTemplate) &&
        Objects.equals(this.deliveryEnabled, documentTemplate.deliveryEnabled) &&
        Objects.equals(this.id, documentTemplate.id) &&
        Objects.equals(this.linkedSpaceId, documentTemplate.linkedSpaceId) &&
        Objects.equals(this.name, documentTemplate.name) &&
        Objects.equals(this.plannedPurgeDate, documentTemplate.plannedPurgeDate) &&
        Objects.equals(this.spaceId, documentTemplate.spaceId) &&
        Objects.equals(this.state, documentTemplate.state) &&
        Objects.equals(this.templateResource, documentTemplate.templateResource) &&
        Objects.equals(this.type, documentTemplate.type) &&
        Objects.equals(this.version, documentTemplate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTemplate, deliveryEnabled, id, linkedSpaceId, name, plannedPurgeDate, spaceId, state, templateResource, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplate {\n");
    
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    deliveryEnabled: ").append(toIndentedString(deliveryEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    templateResource: ").append(toIndentedString(templateResource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

