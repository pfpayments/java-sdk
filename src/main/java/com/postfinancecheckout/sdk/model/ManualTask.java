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
import com.postfinancecheckout.sdk.model.ManualTaskState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A manual task requires a manual intervention by a human.
 */
public class ManualTask {
  
  @SerializedName("actions")
  protected List<Long> actions = null;

  
  @SerializedName("contextEntityId")
  protected Long contextEntityId = null;

  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("expiresOn")
  protected OffsetDateTime expiresOn = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("spaceId")
  protected Long spaceId = null;

  
  @SerializedName("state")
  protected ManualTaskState state = null;

  
  @SerializedName("type")
  protected Long type = null;

  
  
   /**
   * 
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public List<Long> getActions() {
    return actions;
  }

  
   /**
   * The context entity ID links the manual task to the entity which caused its creation.
   * @return contextEntityId
  **/
  @ApiModelProperty(value = "The context entity ID links the manual task to the entity which caused its creation.")
  public Long getContextEntityId() {
    return contextEntityId;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The expiry date indicates until when the manual task has to be executed.
   * @return expiresOn
  **/
  @ApiModelProperty(value = "The expiry date indicates until when the manual task has to be executed.")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
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
  public ManualTaskState getState() {
    return state;
  }

  
   /**
   * The type categorizes the manual task.
   * @return type
  **/
  @ApiModelProperty(value = "The type categorizes the manual task.")
  public Long getType() {
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
    ManualTask manualTask = (ManualTask) o;
    return Objects.equals(this.actions, manualTask.actions) &&
        Objects.equals(this.contextEntityId, manualTask.contextEntityId) &&
        Objects.equals(this.createdOn, manualTask.createdOn) &&
        Objects.equals(this.expiresOn, manualTask.expiresOn) &&
        Objects.equals(this.id, manualTask.id) &&
        Objects.equals(this.linkedSpaceId, manualTask.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, manualTask.plannedPurgeDate) &&
        Objects.equals(this.spaceId, manualTask.spaceId) &&
        Objects.equals(this.state, manualTask.state) &&
        Objects.equals(this.type, manualTask.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, contextEntityId, createdOn, expiresOn, id, linkedSpaceId, plannedPurgeDate, spaceId, state, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualTask {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    contextEntityId: ").append(toIndentedString(contextEntityId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

