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
import ch.postfinance.sdk.model.BillingConfiguration;
import ch.postfinance.sdk.model.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionUpdateRequest {
  
  @JsonProperty("billingConfiguration")
  protected BillingConfiguration billingConfiguration = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("items")
  protected List<Item> items = null;

  
  @JsonProperty("storeOrderConfirmationEmailEnabled")
  protected Boolean storeOrderConfirmationEmailEnabled = null;

  
  @JsonProperty("subscriberSuspensionAllowed")
  protected Boolean subscriberSuspensionAllowed = null;

  
  
  public ShopifySubscriptionUpdateRequest billingConfiguration(BillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * 
   * @return billingConfiguration
  **/
  @ApiModelProperty(value = "")
  public BillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }

  public void setBillingConfiguration(BillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }

  
  public ShopifySubscriptionUpdateRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public ShopifySubscriptionUpdateRequest items(List<Item> items) {
    this.items = items;
    return this;
  }

  public ShopifySubscriptionUpdateRequest addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  
  public ShopifySubscriptionUpdateRequest storeOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
    this.storeOrderConfirmationEmailEnabled = storeOrderConfirmationEmailEnabled;
    return this;
  }

   /**
   * 
   * @return storeOrderConfirmationEmailEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isStoreOrderConfirmationEmailEnabled() {
    return storeOrderConfirmationEmailEnabled;
  }

  public void setStoreOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
    this.storeOrderConfirmationEmailEnabled = storeOrderConfirmationEmailEnabled;
  }

  
  public ShopifySubscriptionUpdateRequest subscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
    this.subscriberSuspensionAllowed = subscriberSuspensionAllowed;
    return this;
  }

   /**
   * 
   * @return subscriberSuspensionAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriberSuspensionAllowed() {
    return subscriberSuspensionAllowed;
  }

  public void setSubscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
    this.subscriberSuspensionAllowed = subscriberSuspensionAllowed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionUpdateRequest shopifySubscriptionUpdateRequest = (ShopifySubscriptionUpdateRequest) o;
    return Objects.equals(this.billingConfiguration, shopifySubscriptionUpdateRequest.billingConfiguration) &&
        Objects.equals(this.id, shopifySubscriptionUpdateRequest.id) &&
        Objects.equals(this.items, shopifySubscriptionUpdateRequest.items) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionUpdateRequest.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionUpdateRequest.subscriberSuspensionAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingConfiguration, id, items, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionUpdateRequest {\n");
    
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
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

