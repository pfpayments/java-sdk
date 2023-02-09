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
import ch.postfinance.sdk.model.ChargeState;
import ch.postfinance.sdk.model.ChargeType;
import ch.postfinance.sdk.model.FailureReason;
import ch.postfinance.sdk.model.Transaction;
import ch.postfinance.sdk.model.TransactionAwareEntity;
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

public class Charge extends TransactionAwareEntity {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected ChargeState state = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("type")
  protected ChargeType type = null;

  
  @JsonProperty("userFailureMessage")
  protected String userFailureMessage = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date on which the charge was created on.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date on which the charge was created on.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
  public FailureReason getFailureReason() {
    return failureReason;
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public ChargeState getState() {
    return state;
  }

  
   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * 
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ChargeType getType() {
    return type;
  }

  
   /**
   * The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.
   * @return userFailureMessage
  **/
  @ApiModelProperty(value = "The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.")
  public String getUserFailureMessage() {
    return userFailureMessage;
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
    Charge charge = (Charge) o;
    return Objects.equals(this.id, charge.id) &&
        Objects.equals(this.linkedSpaceId, charge.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, charge.linkedTransaction) &&
        Objects.equals(this.createdOn, charge.createdOn) &&
        Objects.equals(this.failureReason, charge.failureReason) &&
        Objects.equals(this.language, charge.language) &&
        Objects.equals(this.plannedPurgeDate, charge.plannedPurgeDate) &&
        Objects.equals(this.spaceViewId, charge.spaceViewId) &&
        Objects.equals(this.state, charge.state) &&
        Objects.equals(this.timeZone, charge.timeZone) &&
        Objects.equals(this.timeoutOn, charge.timeoutOn) &&
        Objects.equals(this.transaction, charge.transaction) &&
        Objects.equals(this.type, charge.type) &&
        Objects.equals(this.userFailureMessage, charge.userFailureMessage) &&
        Objects.equals(this.version, charge.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, createdOn, failureReason, language, plannedPurgeDate, spaceViewId, state, timeZone, timeoutOn, transaction, type, userFailureMessage, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
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

