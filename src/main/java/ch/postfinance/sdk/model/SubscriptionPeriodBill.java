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
import ch.postfinance.sdk.model.SubscriptionPeriodBillState;
import ch.postfinance.sdk.model.SubscriptionVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionPeriodBill {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("effectivePeriodEndDate")
  protected OffsetDateTime effectivePeriodEndDate = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("periodStartDate")
  protected OffsetDateTime periodStartDate = null;

  
  @JsonProperty("plannedPeriodEndDate")
  protected OffsetDateTime plannedPeriodEndDate = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected SubscriptionPeriodBillState state = null;

  
  @JsonProperty("subscriptionVersion")
  protected SubscriptionVersion subscriptionVersion = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the period bill was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the period bill was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The date and time when the period actually ended.
   * @return effectivePeriodEndDate
  **/
  @ApiModelProperty(value = "The date and time when the period actually ended.")
  public OffsetDateTime getEffectivePeriodEndDate() {
    return effectivePeriodEndDate;
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
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The date and time when the period started.
   * @return periodStartDate
  **/
  @ApiModelProperty(value = "The date and time when the period started.")
  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
  }

  
   /**
   * The date and time when the period is planned to end.
   * @return plannedPeriodEndDate
  **/
  @ApiModelProperty(value = "The date and time when the period is planned to end.")
  public OffsetDateTime getPlannedPeriodEndDate() {
    return plannedPeriodEndDate;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionPeriodBillState getState() {
    return state;
  }

  
   /**
   * The subscription version that the period bill belongs to.
   * @return subscriptionVersion
  **/
  @ApiModelProperty(value = "The subscription version that the period bill belongs to.")
  public SubscriptionVersion getSubscriptionVersion() {
    return subscriptionVersion;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
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
    SubscriptionPeriodBill subscriptionPeriodBill = (SubscriptionPeriodBill) o;
    return Objects.equals(this.createdOn, subscriptionPeriodBill.createdOn) &&
        Objects.equals(this.effectivePeriodEndDate, subscriptionPeriodBill.effectivePeriodEndDate) &&
        Objects.equals(this.id, subscriptionPeriodBill.id) &&
        Objects.equals(this.language, subscriptionPeriodBill.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionPeriodBill.linkedSpaceId) &&
        Objects.equals(this.periodStartDate, subscriptionPeriodBill.periodStartDate) &&
        Objects.equals(this.plannedPeriodEndDate, subscriptionPeriodBill.plannedPeriodEndDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionPeriodBill.plannedPurgeDate) &&
        Objects.equals(this.state, subscriptionPeriodBill.state) &&
        Objects.equals(this.subscriptionVersion, subscriptionPeriodBill.subscriptionVersion) &&
        Objects.equals(this.version, subscriptionPeriodBill.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, effectivePeriodEndDate, id, language, linkedSpaceId, periodStartDate, plannedPeriodEndDate, plannedPurgeDate, state, subscriptionVersion, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPeriodBill {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    effectivePeriodEndDate: ").append(toIndentedString(effectivePeriodEndDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    plannedPeriodEndDate: ").append(toIndentedString(plannedPeriodEndDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
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

