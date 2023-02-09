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
import ch.postfinance.sdk.model.DeliveryIndicationDecisionReason;
import ch.postfinance.sdk.model.DeliveryIndicationState;
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

public class DeliveryIndication extends TransactionAwareEntity {
  
  @JsonProperty("automaticDecisionReason")
  protected DeliveryIndicationDecisionReason automaticDecisionReason = null;

  
  @JsonProperty("automaticallyDecidedOn")
  protected OffsetDateTime automaticallyDecidedOn = null;

  
  @JsonProperty("completion")
  protected Long completion = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("manualDecisionTimeoutOn")
  protected OffsetDateTime manualDecisionTimeoutOn = null;

  
  @JsonProperty("manuallyDecidedBy")
  protected Long manuallyDecidedBy = null;

  
  @JsonProperty("manuallyDecidedOn")
  protected OffsetDateTime manuallyDecidedOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected DeliveryIndicationState state = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  
   /**
   * 
   * @return automaticDecisionReason
  **/
  @ApiModelProperty(value = "")
  public DeliveryIndicationDecisionReason getAutomaticDecisionReason() {
    return automaticDecisionReason;
  }

  
   /**
   * 
   * @return automaticallyDecidedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAutomaticallyDecidedOn() {
    return automaticallyDecidedOn;
  }

  
   /**
   * 
   * @return completion
  **/
  @ApiModelProperty(value = "")
  public Long getCompletion() {
    return completion;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return manualDecisionTimeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getManualDecisionTimeoutOn() {
    return manualDecisionTimeoutOn;
  }

  
   /**
   * 
   * @return manuallyDecidedBy
  **/
  @ApiModelProperty(value = "")
  public Long getManuallyDecidedBy() {
    return manuallyDecidedBy;
  }

  
   /**
   * 
   * @return manuallyDecidedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getManuallyDecidedOn() {
    return manuallyDecidedOn;
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
  public DeliveryIndicationState getState() {
    return state;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryIndication deliveryIndication = (DeliveryIndication) o;
    return Objects.equals(this.id, deliveryIndication.id) &&
        Objects.equals(this.linkedSpaceId, deliveryIndication.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, deliveryIndication.linkedTransaction) &&
        Objects.equals(this.automaticDecisionReason, deliveryIndication.automaticDecisionReason) &&
        Objects.equals(this.automaticallyDecidedOn, deliveryIndication.automaticallyDecidedOn) &&
        Objects.equals(this.completion, deliveryIndication.completion) &&
        Objects.equals(this.createdOn, deliveryIndication.createdOn) &&
        Objects.equals(this.manualDecisionTimeoutOn, deliveryIndication.manualDecisionTimeoutOn) &&
        Objects.equals(this.manuallyDecidedBy, deliveryIndication.manuallyDecidedBy) &&
        Objects.equals(this.manuallyDecidedOn, deliveryIndication.manuallyDecidedOn) &&
        Objects.equals(this.plannedPurgeDate, deliveryIndication.plannedPurgeDate) &&
        Objects.equals(this.state, deliveryIndication.state) &&
        Objects.equals(this.timeoutOn, deliveryIndication.timeoutOn) &&
        Objects.equals(this.transaction, deliveryIndication.transaction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, automaticDecisionReason, automaticallyDecidedOn, completion, createdOn, manualDecisionTimeoutOn, manuallyDecidedBy, manuallyDecidedOn, plannedPurgeDate, state, timeoutOn, transaction, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryIndication {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    automaticDecisionReason: ").append(toIndentedString(automaticDecisionReason)).append("\n");
    sb.append("    automaticallyDecidedOn: ").append(toIndentedString(automaticallyDecidedOn)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    manualDecisionTimeoutOn: ").append(toIndentedString(manualDecisionTimeoutOn)).append("\n");
    sb.append("    manuallyDecidedBy: ").append(toIndentedString(manuallyDecidedBy)).append("\n");
    sb.append("    manuallyDecidedOn: ").append(toIndentedString(manuallyDecidedOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

