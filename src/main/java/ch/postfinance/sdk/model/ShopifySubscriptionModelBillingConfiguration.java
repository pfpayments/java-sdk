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
import ch.postfinance.sdk.model.ShopifySubscriptionBillingIntervalUnit;
import ch.postfinance.sdk.model.ShopifySubscriptionWeekday;
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

public class ShopifySubscriptionModelBillingConfiguration {
  
  @JsonProperty("billingDayOfMonth")
  protected Integer billingDayOfMonth = null;

  
  @JsonProperty("billingIntervalAmount")
  protected Integer billingIntervalAmount = null;

  
  @JsonProperty("billingIntervalUnit")
  protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit = null;

  
  @JsonProperty("billingReferenceDate")
  protected OffsetDateTime billingReferenceDate = null;

  
  @JsonProperty("billingWeekday")
  protected ShopifySubscriptionWeekday billingWeekday = null;

  
  @JsonProperty("maximalBillingCycles")
  protected Integer maximalBillingCycles = null;

  
  @JsonProperty("maximalSuspendableCycles")
  protected Integer maximalSuspendableCycles = null;

  
  @JsonProperty("minimalBillingCycles")
  protected Integer minimalBillingCycles = null;

  
  @JsonProperty("terminationBillingCycles")
  protected Integer terminationBillingCycles = null;

  
  
  public ShopifySubscriptionModelBillingConfiguration billingDayOfMonth(Integer billingDayOfMonth) {
    this.billingDayOfMonth = billingDayOfMonth;
    return this;
  }

   /**
   * Define the day of the month on which the recurring orders should be created.
   * @return billingDayOfMonth
  **/
  @ApiModelProperty(value = "Define the day of the month on which the recurring orders should be created.")
  public Integer getBillingDayOfMonth() {
    return billingDayOfMonth;
  }

  public void setBillingDayOfMonth(Integer billingDayOfMonth) {
    this.billingDayOfMonth = billingDayOfMonth;
  }

  
  public ShopifySubscriptionModelBillingConfiguration billingIntervalAmount(Integer billingIntervalAmount) {
    this.billingIntervalAmount = billingIntervalAmount;
    return this;
  }

   /**
   * 
   * @return billingIntervalAmount
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingIntervalAmount() {
    return billingIntervalAmount;
  }

  public void setBillingIntervalAmount(Integer billingIntervalAmount) {
    this.billingIntervalAmount = billingIntervalAmount;
  }

  
  public ShopifySubscriptionModelBillingConfiguration billingIntervalUnit(ShopifySubscriptionBillingIntervalUnit billingIntervalUnit) {
    this.billingIntervalUnit = billingIntervalUnit;
    return this;
  }

   /**
   * Define how frequently recurring orders should be created.
   * @return billingIntervalUnit
  **/
  @ApiModelProperty(value = "Define how frequently recurring orders should be created.")
  public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
    return billingIntervalUnit;
  }

  public void setBillingIntervalUnit(ShopifySubscriptionBillingIntervalUnit billingIntervalUnit) {
    this.billingIntervalUnit = billingIntervalUnit;
  }

  
  public ShopifySubscriptionModelBillingConfiguration billingReferenceDate(OffsetDateTime billingReferenceDate) {
    this.billingReferenceDate = billingReferenceDate;
    return this;
  }

   /**
   * This date will be used as basis to calculate the dates of recurring orders.
   * @return billingReferenceDate
  **/
  @ApiModelProperty(value = "This date will be used as basis to calculate the dates of recurring orders.")
  public OffsetDateTime getBillingReferenceDate() {
    return billingReferenceDate;
  }

  public void setBillingReferenceDate(OffsetDateTime billingReferenceDate) {
    this.billingReferenceDate = billingReferenceDate;
  }

  
  public ShopifySubscriptionModelBillingConfiguration billingWeekday(ShopifySubscriptionWeekday billingWeekday) {
    this.billingWeekday = billingWeekday;
    return this;
  }

   /**
   * Define the weekday on which the recurring orders should be created.
   * @return billingWeekday
  **/
  @ApiModelProperty(value = "Define the weekday on which the recurring orders should be created.")
  public ShopifySubscriptionWeekday getBillingWeekday() {
    return billingWeekday;
  }

  public void setBillingWeekday(ShopifySubscriptionWeekday billingWeekday) {
    this.billingWeekday = billingWeekday;
  }

  
  public ShopifySubscriptionModelBillingConfiguration maximalBillingCycles(Integer maximalBillingCycles) {
    this.maximalBillingCycles = maximalBillingCycles;
    return this;
  }

   /**
   * Define the maximum number of orders the subscription will run for.
   * @return maximalBillingCycles
  **/
  @ApiModelProperty(value = "Define the maximum number of orders the subscription will run for.")
  public Integer getMaximalBillingCycles() {
    return maximalBillingCycles;
  }

  public void setMaximalBillingCycles(Integer maximalBillingCycles) {
    this.maximalBillingCycles = maximalBillingCycles;
  }

  
  public ShopifySubscriptionModelBillingConfiguration maximalSuspendableCycles(Integer maximalSuspendableCycles) {
    this.maximalSuspendableCycles = maximalSuspendableCycles;
    return this;
  }

   /**
   * Define the maximum number of orders the subscription can be suspended for at a time.
   * @return maximalSuspendableCycles
  **/
  @ApiModelProperty(value = "Define the maximum number of orders the subscription can be suspended for at a time.")
  public Integer getMaximalSuspendableCycles() {
    return maximalSuspendableCycles;
  }

  public void setMaximalSuspendableCycles(Integer maximalSuspendableCycles) {
    this.maximalSuspendableCycles = maximalSuspendableCycles;
  }

  
  public ShopifySubscriptionModelBillingConfiguration minimalBillingCycles(Integer minimalBillingCycles) {
    this.minimalBillingCycles = minimalBillingCycles;
    return this;
  }

   /**
   * Define the minimal number of orders the subscription will run for.
   * @return minimalBillingCycles
  **/
  @ApiModelProperty(value = "Define the minimal number of orders the subscription will run for.")
  public Integer getMinimalBillingCycles() {
    return minimalBillingCycles;
  }

  public void setMinimalBillingCycles(Integer minimalBillingCycles) {
    this.minimalBillingCycles = minimalBillingCycles;
  }

  
  public ShopifySubscriptionModelBillingConfiguration terminationBillingCycles(Integer terminationBillingCycles) {
    this.terminationBillingCycles = terminationBillingCycles;
    return this;
  }

   /**
   * Define the number of orders the subscription will keep running for after its termination has been requested.
   * @return terminationBillingCycles
  **/
  @ApiModelProperty(value = "Define the number of orders the subscription will keep running for after its termination has been requested.")
  public Integer getTerminationBillingCycles() {
    return terminationBillingCycles;
  }

  public void setTerminationBillingCycles(Integer terminationBillingCycles) {
    this.terminationBillingCycles = terminationBillingCycles;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionModelBillingConfiguration shopifySubscriptionModelBillingConfiguration = (ShopifySubscriptionModelBillingConfiguration) o;
    return Objects.equals(this.billingDayOfMonth, shopifySubscriptionModelBillingConfiguration.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionModelBillingConfiguration.billingIntervalAmount) &&
        Objects.equals(this.billingIntervalUnit, shopifySubscriptionModelBillingConfiguration.billingIntervalUnit) &&
        Objects.equals(this.billingReferenceDate, shopifySubscriptionModelBillingConfiguration.billingReferenceDate) &&
        Objects.equals(this.billingWeekday, shopifySubscriptionModelBillingConfiguration.billingWeekday) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionModelBillingConfiguration.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionModelBillingConfiguration.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionModelBillingConfiguration.minimalBillingCycles) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionModelBillingConfiguration.terminationBillingCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingReferenceDate, billingWeekday, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, terminationBillingCycles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionModelBillingConfiguration {\n");
    
    sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
    sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
    sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
    sb.append("    billingReferenceDate: ").append(toIndentedString(billingReferenceDate)).append("\n");
    sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
    sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
    sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
    sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
    sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
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

