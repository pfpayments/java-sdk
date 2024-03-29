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
import ch.postfinance.sdk.model.ShopifySubscription;
import ch.postfinance.sdk.model.ShopifySubscriptionSuspensionInitiator;
import ch.postfinance.sdk.model.ShopifySubscriptionSuspensionState;
import ch.postfinance.sdk.model.ShopifySubscriptionSuspensionType;
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

public class ShopifySubscriptionSuspension {
  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("endedBy")
  protected Long endedBy = null;

  
  @JsonProperty("endedOn")
  protected OffsetDateTime endedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("initiator")
  protected ShopifySubscriptionSuspensionInitiator initiator = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedEndDate")
  protected OffsetDateTime plannedEndDate = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  @JsonProperty("state")
  protected ShopifySubscriptionSuspensionState state = null;

  
  @JsonProperty("subscription")
  protected ShopifySubscription subscription = null;

  
  @JsonProperty("type")
  protected ShopifySubscriptionSuspensionType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return endedBy
  **/
  @ApiModelProperty(value = "")
  public Long getEndedBy() {
    return endedBy;
  }

  
   /**
   * 
   * @return endedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndedOn() {
    return endedOn;
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
   * 
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionSuspensionInitiator getInitiator() {
    return initiator;
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
   * 
   * @return plannedEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
  }

  
   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public ShopifySubscriptionSuspensionState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscription getSubscription() {
    return subscription;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionSuspensionType getType() {
    return type;
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
    ShopifySubscriptionSuspension shopifySubscriptionSuspension = (ShopifySubscriptionSuspension) o;
    return Objects.equals(this.createdBy, shopifySubscriptionSuspension.createdBy) &&
        Objects.equals(this.createdOn, shopifySubscriptionSuspension.createdOn) &&
        Objects.equals(this.endedBy, shopifySubscriptionSuspension.endedBy) &&
        Objects.equals(this.endedOn, shopifySubscriptionSuspension.endedOn) &&
        Objects.equals(this.id, shopifySubscriptionSuspension.id) &&
        Objects.equals(this.initiator, shopifySubscriptionSuspension.initiator) &&
        Objects.equals(this.linkedSpaceId, shopifySubscriptionSuspension.linkedSpaceId) &&
        Objects.equals(this.plannedEndDate, shopifySubscriptionSuspension.plannedEndDate) &&
        Objects.equals(this.shop, shopifySubscriptionSuspension.shop) &&
        Objects.equals(this.state, shopifySubscriptionSuspension.state) &&
        Objects.equals(this.subscription, shopifySubscriptionSuspension.subscription) &&
        Objects.equals(this.type, shopifySubscriptionSuspension.type) &&
        Objects.equals(this.version, shopifySubscriptionSuspension.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, endedBy, endedOn, id, initiator, linkedSpaceId, plannedEndDate, shop, state, subscription, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionSuspension {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    endedBy: ").append(toIndentedString(endedBy)).append("\n");
    sb.append("    endedOn: ").append(toIndentedString(endedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

