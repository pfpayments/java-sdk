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
import ch.postfinance.sdk.model.Account;
import ch.postfinance.sdk.model.FailureReason;
import ch.postfinance.sdk.model.PaymentContractState;
import ch.postfinance.sdk.model.PaymentContractType;
import ch.postfinance.sdk.model.User;
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

public class PaymentContract {
  
  @JsonProperty("account")
  protected Account account = null;

  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @JsonProperty("contractIdentifier")
  protected String contractIdentifier = null;

  
  @JsonProperty("contractType")
  protected PaymentContractType contractType = null;

  
  @JsonProperty("createdBy")
  protected User createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("lastModifiedDate")
  protected OffsetDateTime lastModifiedDate = null;

  
  @JsonProperty("rejectedOn")
  protected OffsetDateTime rejectedOn = null;

  
  @JsonProperty("rejectionReason")
  protected FailureReason rejectionReason = null;

  
  @JsonProperty("startTerminatingOn")
  protected OffsetDateTime startTerminatingOn = null;

  
  @JsonProperty("state")
  protected PaymentContractState state = null;

  
  @JsonProperty("terminatedBy")
  protected User terminatedBy = null;

  
  @JsonProperty("terminatedOn")
  protected OffsetDateTime terminatedOn = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  
   /**
   * 
   * @return activatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * 
   * @return contractIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getContractIdentifier() {
    return contractIdentifier;
  }

  
   /**
   * 
   * @return contractType
  **/
  @ApiModelProperty(value = "")
  public PaymentContractType getContractType() {
    return contractType;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public User getCreatedBy() {
    return createdBy;
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
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
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
   * The date and time when the object was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "The date and time when the object was last modified.")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  
   /**
   * 
   * @return rejectedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRejectedOn() {
    return rejectedOn;
  }

  
   /**
   * 
   * @return rejectionReason
  **/
  @ApiModelProperty(value = "")
  public FailureReason getRejectionReason() {
    return rejectionReason;
  }

  
   /**
   * 
   * @return startTerminatingOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTerminatingOn() {
    return startTerminatingOn;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public PaymentContractState getState() {
    return state;
  }

  
   /**
   * 
   * @return terminatedBy
  **/
  @ApiModelProperty(value = "")
  public User getTerminatedBy() {
    return terminatedBy;
  }

  
   /**
   * 
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
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
    PaymentContract paymentContract = (PaymentContract) o;
    return Objects.equals(this.account, paymentContract.account) &&
        Objects.equals(this.activatedOn, paymentContract.activatedOn) &&
        Objects.equals(this.contractIdentifier, paymentContract.contractIdentifier) &&
        Objects.equals(this.contractType, paymentContract.contractType) &&
        Objects.equals(this.createdBy, paymentContract.createdBy) &&
        Objects.equals(this.createdOn, paymentContract.createdOn) &&
        Objects.equals(this.externalId, paymentContract.externalId) &&
        Objects.equals(this.id, paymentContract.id) &&
        Objects.equals(this.lastModifiedDate, paymentContract.lastModifiedDate) &&
        Objects.equals(this.rejectedOn, paymentContract.rejectedOn) &&
        Objects.equals(this.rejectionReason, paymentContract.rejectionReason) &&
        Objects.equals(this.startTerminatingOn, paymentContract.startTerminatingOn) &&
        Objects.equals(this.state, paymentContract.state) &&
        Objects.equals(this.terminatedBy, paymentContract.terminatedBy) &&
        Objects.equals(this.terminatedOn, paymentContract.terminatedOn) &&
        Objects.equals(this.version, paymentContract.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, activatedOn, contractIdentifier, contractType, createdBy, createdOn, externalId, id, lastModifiedDate, rejectedOn, rejectionReason, startTerminatingOn, state, terminatedBy, terminatedOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContract {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    contractIdentifier: ").append(toIndentedString(contractIdentifier)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    rejectedOn: ").append(toIndentedString(rejectedOn)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    startTerminatingOn: ").append(toIndentedString(startTerminatingOn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
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

