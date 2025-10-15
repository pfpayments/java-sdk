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
import ch.postfinance.sdk.model.SubscriptionProductState;
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
 * AbstractSubscriptionProductActive
 */

public class AbstractSubscriptionProductActive {
  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<Long> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("failedPaymentSuspensionPeriod")
  protected String failedPaymentSuspensionPeriod = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("productLocked")
  protected Boolean productLocked = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  @JsonProperty("state")
  protected SubscriptionProductState state = null;

  
  
  public AbstractSubscriptionProductActive allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractSubscriptionProductActive addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * The payment methods that can be used to subscribe to this product. If none are selected, no restriction is applied.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The payment methods that can be used to subscribe to this product. If none are selected, no restriction is applied.")
  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  
  public AbstractSubscriptionProductActive failedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
    this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
    return this;
  }

   /**
   * The period after which a subscription that has been suspended due to a failed payment is terminated.
   * @return failedPaymentSuspensionPeriod
  **/
  @ApiModelProperty(value = "The period after which a subscription that has been suspended due to a failed payment is terminated.")
  public String getFailedPaymentSuspensionPeriod() {
    return failedPaymentSuspensionPeriod;
  }

  public void setFailedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
    this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
  }

  
  public AbstractSubscriptionProductActive name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the product.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the product.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public AbstractSubscriptionProductActive productLocked(Boolean productLocked) {
    this.productLocked = productLocked;
    return this;
  }

   /**
   * Whether subscriptions can be switched to or from this product, or whether they are locked in.
   * @return productLocked
  **/
  @ApiModelProperty(value = "Whether subscriptions can be switched to or from this product, or whether they are locked in.")
  public Boolean isProductLocked() {
    return productLocked;
  }

  public void setProductLocked(Boolean productLocked) {
    this.productLocked = productLocked;
  }

  
  public AbstractSubscriptionProductActive sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * When listing products, they can be sorted by this number.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "When listing products, they can be sorted by this number.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  public AbstractSubscriptionProductActive state(SubscriptionProductState state) {
    this.state = state;
    return this;
  }

   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionProductState getState() {
    return state;
  }

  public void setState(SubscriptionProductState state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractSubscriptionProductActive abstractSubscriptionProductActive = (AbstractSubscriptionProductActive) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, abstractSubscriptionProductActive.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.failedPaymentSuspensionPeriod, abstractSubscriptionProductActive.failedPaymentSuspensionPeriod) &&
        Objects.equals(this.name, abstractSubscriptionProductActive.name) &&
        Objects.equals(this.productLocked, abstractSubscriptionProductActive.productLocked) &&
        Objects.equals(this.sortOrder, abstractSubscriptionProductActive.sortOrder) &&
        Objects.equals(this.state, abstractSubscriptionProductActive.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, name, productLocked, sortOrder, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractSubscriptionProductActive {\n");
    
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productLocked: ").append(toIndentedString(productLocked)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

