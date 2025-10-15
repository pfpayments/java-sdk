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
import ch.postfinance.sdk.model.BillingCycleModel;
import ch.postfinance.sdk.model.Subscription;
import ch.postfinance.sdk.model.SubscriptionComponentConfiguration;
import ch.postfinance.sdk.model.SubscriptionProductVersion;
import ch.postfinance.sdk.model.SubscriptionVersionState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionVersion {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @JsonProperty("billingCurrency")
  protected String billingCurrency = null;

  
  @JsonProperty("billingCycleModel")
  protected BillingCycleModel billingCycleModel = null;

  
  @JsonProperty("componentConfigurations")
  protected List<SubscriptionComponentConfiguration> componentConfigurations = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("expectedLastPeriodEnd")
  protected OffsetDateTime expectedLastPeriodEnd = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("plannedTerminationDate")
  protected OffsetDateTime plannedTerminationDate = null;

  
  @JsonProperty("productVersion")
  protected SubscriptionProductVersion productVersion = null;

  
  @JsonProperty("state")
  protected SubscriptionVersionState state = null;

  
  @JsonProperty("subscription")
  protected Subscription subscription = null;

  
  @JsonProperty("terminatedOn")
  protected OffsetDateTime terminatedOn = null;

  
  @JsonProperty("terminatingOn")
  protected OffsetDateTime terminatingOn = null;

  
  @JsonProperty("terminationIssuedOn")
  protected OffsetDateTime terminationIssuedOn = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the subscription version was activated.
   * @return activatedOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription version was activated.")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * The three-letter code (ISO 4217 format) of the currency used to invoice the customer. Must be one of the currencies supported by the product.
   * @return billingCurrency
  **/
  @ApiModelProperty(value = "The three-letter code (ISO 4217 format) of the currency used to invoice the customer. Must be one of the currencies supported by the product.")
  public String getBillingCurrency() {
    return billingCurrency;
  }

  
   /**
   * 
   * @return billingCycleModel
  **/
  @ApiModelProperty(value = "")
  public BillingCycleModel getBillingCycleModel() {
    return billingCycleModel;
  }

  
   /**
   * The configurations of the subscription&#39;s components.
   * @return componentConfigurations
  **/
  @ApiModelProperty(value = "The configurations of the subscription's components.")
  public List<SubscriptionComponentConfiguration> getComponentConfigurations() {
    return componentConfigurations;
  }

  
   /**
   * The date and time when the subscription version was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription version was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The date and time when the last period is expected to end.
   * @return expectedLastPeriodEnd
  **/
  @ApiModelProperty(value = "The date and time when the last period is expected to end.")
  public OffsetDateTime getExpectedLastPeriodEnd() {
    return expectedLastPeriodEnd;
  }

  
   /**
   * The date and time when the subscription version failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription version failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The date and time when the termination of the subscription version is planned.
   * @return plannedTerminationDate
  **/
  @ApiModelProperty(value = "The date and time when the termination of the subscription version is planned.")
  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }

  
   /**
   * The product version that is subscribed to.
   * @return productVersion
  **/
  @ApiModelProperty(value = "The product version that is subscribed to.")
  public SubscriptionProductVersion getProductVersion() {
    return productVersion;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionVersionState getState() {
    return state;
  }

  
   /**
   * The subscription that this version belongs to.
   * @return subscription
  **/
  @ApiModelProperty(value = "The subscription that this version belongs to.")
  public Subscription getSubscription() {
    return subscription;
  }

  
   /**
   * The date and time when the subscription version was terminated.
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription version was terminated.")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }

  
   /**
   * The date and time when the termination of the subscription version started.
   * @return terminatingOn
  **/
  @ApiModelProperty(value = "The date and time when the termination of the subscription version started.")
  public OffsetDateTime getTerminatingOn() {
    return terminatingOn;
  }

  
   /**
   * The date and time when the termination of the subscription version was issued.
   * @return terminationIssuedOn
  **/
  @ApiModelProperty(value = "The date and time when the termination of the subscription version was issued.")
  public OffsetDateTime getTerminationIssuedOn() {
    return terminationIssuedOn;
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
    SubscriptionVersion subscriptionVersion = (SubscriptionVersion) o;
    return Objects.equals(this.activatedOn, subscriptionVersion.activatedOn) &&
        Objects.equals(this.billingCurrency, subscriptionVersion.billingCurrency) &&
        Objects.equals(this.billingCycleModel, subscriptionVersion.billingCycleModel) &&
        Objects.equals(this.componentConfigurations, subscriptionVersion.componentConfigurations) &&
        Objects.equals(this.createdOn, subscriptionVersion.createdOn) &&
        Objects.equals(this.expectedLastPeriodEnd, subscriptionVersion.expectedLastPeriodEnd) &&
        Objects.equals(this.failedOn, subscriptionVersion.failedOn) &&
        Objects.equals(this.id, subscriptionVersion.id) &&
        Objects.equals(this.language, subscriptionVersion.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionVersion.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, subscriptionVersion.plannedPurgeDate) &&
        Objects.equals(this.plannedTerminationDate, subscriptionVersion.plannedTerminationDate) &&
        Objects.equals(this.productVersion, subscriptionVersion.productVersion) &&
        Objects.equals(this.state, subscriptionVersion.state) &&
        Objects.equals(this.subscription, subscriptionVersion.subscription) &&
        Objects.equals(this.terminatedOn, subscriptionVersion.terminatedOn) &&
        Objects.equals(this.terminatingOn, subscriptionVersion.terminatingOn) &&
        Objects.equals(this.terminationIssuedOn, subscriptionVersion.terminationIssuedOn) &&
        Objects.equals(this.version, subscriptionVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, billingCurrency, billingCycleModel, componentConfigurations, createdOn, expectedLastPeriodEnd, failedOn, id, language, linkedSpaceId, plannedPurgeDate, plannedTerminationDate, productVersion, state, subscription, terminatedOn, terminatingOn, terminationIssuedOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionVersion {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    billingCycleModel: ").append(toIndentedString(billingCycleModel)).append("\n");
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expectedLastPeriodEnd: ").append(toIndentedString(expectedLastPeriodEnd)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
    sb.append("    terminationIssuedOn: ").append(toIndentedString(terminationIssuedOn)).append("\n");
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

