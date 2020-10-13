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


package com.postfinancecheckout.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.postfinancecheckout.sdk.model.AbstractTransactionPending;
import com.postfinancecheckout.sdk.model.AddressCreate;
import com.postfinancecheckout.sdk.model.CustomersPresence;
import com.postfinancecheckout.sdk.model.Environment;
import com.postfinancecheckout.sdk.model.LineItemCreate;
import com.postfinancecheckout.sdk.model.PaymentMethodBrand;
import com.postfinancecheckout.sdk.model.TokenizationMode;
import com.postfinancecheckout.sdk.model.TransactionCompletionBehavior;
import com.postfinancecheckout.sdk.model.TransactionEnvironmentSelectionStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionCreate extends AbstractTransactionPending {
  
  @JsonProperty("autoConfirmationEnabled")
  protected Boolean autoConfirmationEnabled = null;

  
  @JsonProperty("billingAddress")
  protected AddressCreate billingAddress = null;

  
  @JsonProperty("chargeRetryEnabled")
  protected Boolean chargeRetryEnabled = null;

  
  @JsonProperty("customersPresence")
  protected CustomersPresence customersPresence = null;

  
  @JsonProperty("deviceSessionIdentifier")
  protected String deviceSessionIdentifier = null;

  
  @JsonProperty("emailsDisabled")
  protected Boolean emailsDisabled = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("environmentSelectionStrategy")
  protected TransactionEnvironmentSelectionStrategy environmentSelectionStrategy = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = new ArrayList<>();

  
  @JsonProperty("shippingAddress")
  protected AddressCreate shippingAddress = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("token")
  protected Long token = null;

  
  
  public TransactionCreate autoConfirmationEnabled(Boolean autoConfirmationEnabled) {
    this.autoConfirmationEnabled = autoConfirmationEnabled;
    return this;
  }

   /**
   * When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.
   * @return autoConfirmationEnabled
  **/
  @ApiModelProperty(value = "When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.")
  public Boolean isAutoConfirmationEnabled() {
    return autoConfirmationEnabled;
  }

  public void setAutoConfirmationEnabled(Boolean autoConfirmationEnabled) {
    this.autoConfirmationEnabled = autoConfirmationEnabled;
  }

  
  public TransactionCreate billingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public AddressCreate getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public TransactionCreate chargeRetryEnabled(Boolean chargeRetryEnabled) {
    this.chargeRetryEnabled = chargeRetryEnabled;
    return this;
  }

   /**
   * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
   * @return chargeRetryEnabled
  **/
  @ApiModelProperty(value = "When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.")
  public Boolean isChargeRetryEnabled() {
    return chargeRetryEnabled;
  }

  public void setChargeRetryEnabled(Boolean chargeRetryEnabled) {
    this.chargeRetryEnabled = chargeRetryEnabled;
  }

  
  public TransactionCreate customersPresence(CustomersPresence customersPresence) {
    this.customersPresence = customersPresence;
    return this;
  }

   /**
   * The customer&#39;s presence indicates what kind of authentication methods can be used during the authorization of the transaction. If no value is provided, &#39;Virtually Present&#39; is used by default.
   * @return customersPresence
  **/
  @ApiModelProperty(value = "The customer's presence indicates what kind of authentication methods can be used during the authorization of the transaction. If no value is provided, 'Virtually Present' is used by default.")
  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }

  public void setCustomersPresence(CustomersPresence customersPresence) {
    this.customersPresence = customersPresence;
  }

  
  public TransactionCreate deviceSessionIdentifier(String deviceSessionIdentifier) {
    this.deviceSessionIdentifier = deviceSessionIdentifier;
    return this;
  }

   /**
   * The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.
   * @return deviceSessionIdentifier
  **/
  @ApiModelProperty(value = "The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.")
  public String getDeviceSessionIdentifier() {
    return deviceSessionIdentifier;
  }

  public void setDeviceSessionIdentifier(String deviceSessionIdentifier) {
    this.deviceSessionIdentifier = deviceSessionIdentifier;
  }

  
  public TransactionCreate emailsDisabled(Boolean emailsDisabled) {
    this.emailsDisabled = emailsDisabled;
    return this;
  }

   /**
   * Flag indicating whether email sending is disabled for this particular transaction. Defaults to false.
   * @return emailsDisabled
  **/
  @ApiModelProperty(value = "Flag indicating whether email sending is disabled for this particular transaction. Defaults to false.")
  public Boolean isEmailsDisabled() {
    return emailsDisabled;
  }

  public void setEmailsDisabled(Boolean emailsDisabled) {
    this.emailsDisabled = emailsDisabled;
  }

  
  public TransactionCreate environment(Environment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  
  public TransactionCreate environmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
    this.environmentSelectionStrategy = environmentSelectionStrategy;
    return this;
  }

   /**
   * The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.
   * @return environmentSelectionStrategy
  **/
  @ApiModelProperty(value = "The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.")
  public TransactionEnvironmentSelectionStrategy getEnvironmentSelectionStrategy() {
    return environmentSelectionStrategy;
  }

  public void setEnvironmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
    this.environmentSelectionStrategy = environmentSelectionStrategy;
  }

  
  public TransactionCreate lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TransactionCreate addLineItemsItem(LineItemCreate lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public TransactionCreate shippingAddress(AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public AddressCreate getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public TransactionCreate spaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
    return this;
  }

   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  public void setSpaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
  }

  
  public TransactionCreate token(Long token) {
    this.token = token;
    return this;
  }

   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Long getToken() {
    return token;
  }

  public void setToken(Long token) {
    this.token = token;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCreate transactionCreate = (TransactionCreate) o;
    return Objects.equals(this.autoConfirmationEnabled, transactionCreate.autoConfirmationEnabled) &&
        Objects.equals(this.billingAddress, transactionCreate.billingAddress) &&
        Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) &&
        Objects.equals(this.customersPresence, transactionCreate.customersPresence) &&
        Objects.equals(this.deviceSessionIdentifier, transactionCreate.deviceSessionIdentifier) &&
        Objects.equals(this.emailsDisabled, transactionCreate.emailsDisabled) &&
        Objects.equals(this.environment, transactionCreate.environment) &&
        Objects.equals(this.environmentSelectionStrategy, transactionCreate.environmentSelectionStrategy) &&
        Objects.equals(this.lineItems, transactionCreate.lineItems) &&
        Objects.equals(this.shippingAddress, transactionCreate.shippingAddress) &&
        Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
        Objects.equals(this.token, transactionCreate.token) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoConfirmationEnabled, billingAddress, chargeRetryEnabled, customersPresence, deviceSessionIdentifier, emailsDisabled, environment, environmentSelectionStrategy, lineItems, shippingAddress, spaceViewId, token, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
    sb.append("    emailsDisabled: ").append(toIndentedString(emailsDisabled)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

