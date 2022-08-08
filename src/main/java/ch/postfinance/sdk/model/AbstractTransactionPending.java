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
import ch.postfinance.sdk.model.AddressCreate;
import ch.postfinance.sdk.model.LineItemCreate;
import ch.postfinance.sdk.model.TokenizationMode;
import ch.postfinance.sdk.model.TransactionCompletionBehavior;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractTransactionPending
 */

public class AbstractTransactionPending {
  
  @JsonProperty("allowedPaymentMethodBrands")
  protected List<Long> allowedPaymentMethodBrands = null;

  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<Long> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("billingAddress")
  protected AddressCreate billingAddress = null;

  
  @JsonProperty("completionBehavior")
  protected TransactionCompletionBehavior completionBehavior = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("customerEmailAddress")
  protected String customerEmailAddress = null;

  
  @JsonProperty("customerId")
  protected String customerId = null;

  
  @JsonProperty("failedUrl")
  protected String failedUrl = null;

  
  @JsonProperty("invoiceMerchantReference")
  protected String invoiceMerchantReference = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = null;

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("shippingAddress")
  protected AddressCreate shippingAddress = null;

  
  @JsonProperty("shippingMethod")
  protected String shippingMethod = null;

  
  @JsonProperty("successUrl")
  protected String successUrl = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("token")
  protected Long token = null;

  
  @JsonProperty("tokenizationMode")
  protected TokenizationMode tokenizationMode = null;

  
  
  public AbstractTransactionPending allowedPaymentMethodBrands(List<Long> allowedPaymentMethodBrands) {
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
    return this;
  }

  public AbstractTransactionPending addAllowedPaymentMethodBrandsItem(Long allowedPaymentMethodBrandsItem) {
    if (this.allowedPaymentMethodBrands == null) {
      this.allowedPaymentMethodBrands = new ArrayList<>();
    }
    this.allowedPaymentMethodBrands.add(allowedPaymentMethodBrandsItem);
    return this;
  }

   /**
   * 
   * @return allowedPaymentMethodBrands
  **/
  @ApiModelProperty(value = "")
  public List<Long> getAllowedPaymentMethodBrands() {
    return allowedPaymentMethodBrands;
  }

  public void setAllowedPaymentMethodBrands(List<Long> allowedPaymentMethodBrands) {
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
  }

  
  public AbstractTransactionPending allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractTransactionPending addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * 
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  
  public AbstractTransactionPending billingAddress(AddressCreate billingAddress) {
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

  
  public AbstractTransactionPending completionBehavior(TransactionCompletionBehavior completionBehavior) {
    this.completionBehavior = completionBehavior;
    return this;
  }

   /**
   * The completion behavior controls when the transaction is completed.
   * @return completionBehavior
  **/
  @ApiModelProperty(value = "The completion behavior controls when the transaction is completed.")
  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }

  public void setCompletionBehavior(TransactionCompletionBehavior completionBehavior) {
    this.completionBehavior = completionBehavior;
  }

  
  public AbstractTransactionPending currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  public AbstractTransactionPending customerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
    return this;
  }

   /**
   * The customer email address is the email address of the customer. If no email address is provided on the shipping or billing address this address is used.
   * @return customerEmailAddress
  **/
  @ApiModelProperty(value = "The customer email address is the email address of the customer. If no email address is provided on the shipping or billing address this address is used.")
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  
  public AbstractTransactionPending customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * 
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public AbstractTransactionPending failedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
    return this;
  }

   /**
   * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
   * @return failedUrl
  **/
  @ApiModelProperty(value = "The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.")
  public String getFailedUrl() {
    return failedUrl;
  }

  public void setFailedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
  }

  
  public AbstractTransactionPending invoiceMerchantReference(String invoiceMerchantReference) {
    this.invoiceMerchantReference = invoiceMerchantReference;
    return this;
  }

   /**
   * 
   * @return invoiceMerchantReference
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }

  public void setInvoiceMerchantReference(String invoiceMerchantReference) {
    this.invoiceMerchantReference = invoiceMerchantReference;
  }

  
  public AbstractTransactionPending language(String language) {
    this.language = language;
    return this;
  }

   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractTransactionPending lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public AbstractTransactionPending addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public AbstractTransactionPending merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * 
   * @return merchantReference
  **/
  @ApiModelProperty(value = "")
  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  
  public AbstractTransactionPending metaData(Map<String, String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public AbstractTransactionPending putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

   /**
   * Meta data allow to store additional data along the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Meta data allow to store additional data along the object.")
  public Map<String, String> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, String> metaData) {
    this.metaData = metaData;
  }

  
  public AbstractTransactionPending shippingAddress(AddressCreate shippingAddress) {
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

  
  public AbstractTransactionPending shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * 
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  
  public AbstractTransactionPending successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
   * @return successUrl
  **/
  @ApiModelProperty(value = "The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  
  public AbstractTransactionPending timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  public AbstractTransactionPending token(Long token) {
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

  
  public AbstractTransactionPending tokenizationMode(TokenizationMode tokenizationMode) {
    this.tokenizationMode = tokenizationMode;
    return this;
  }

   /**
   * The tokenization mode controls if and how the tokenization of payment information is applied to the transaction.
   * @return tokenizationMode
  **/
  @ApiModelProperty(value = "The tokenization mode controls if and how the tokenization of payment information is applied to the transaction.")
  public TokenizationMode getTokenizationMode() {
    return tokenizationMode;
  }

  public void setTokenizationMode(TokenizationMode tokenizationMode) {
    this.tokenizationMode = tokenizationMode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractTransactionPending abstractTransactionPending = (AbstractTransactionPending) o;
    return Objects.equals(this.allowedPaymentMethodBrands, abstractTransactionPending.allowedPaymentMethodBrands) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, abstractTransactionPending.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.billingAddress, abstractTransactionPending.billingAddress) &&
        Objects.equals(this.completionBehavior, abstractTransactionPending.completionBehavior) &&
        Objects.equals(this.currency, abstractTransactionPending.currency) &&
        Objects.equals(this.customerEmailAddress, abstractTransactionPending.customerEmailAddress) &&
        Objects.equals(this.customerId, abstractTransactionPending.customerId) &&
        Objects.equals(this.failedUrl, abstractTransactionPending.failedUrl) &&
        Objects.equals(this.invoiceMerchantReference, abstractTransactionPending.invoiceMerchantReference) &&
        Objects.equals(this.language, abstractTransactionPending.language) &&
        Objects.equals(this.lineItems, abstractTransactionPending.lineItems) &&
        Objects.equals(this.merchantReference, abstractTransactionPending.merchantReference) &&
        Objects.equals(this.metaData, abstractTransactionPending.metaData) &&
        Objects.equals(this.shippingAddress, abstractTransactionPending.shippingAddress) &&
        Objects.equals(this.shippingMethod, abstractTransactionPending.shippingMethod) &&
        Objects.equals(this.successUrl, abstractTransactionPending.successUrl) &&
        Objects.equals(this.timeZone, abstractTransactionPending.timeZone) &&
        Objects.equals(this.token, abstractTransactionPending.token) &&
        Objects.equals(this.tokenizationMode, abstractTransactionPending.tokenizationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, billingAddress, completionBehavior, currency, customerEmailAddress, customerId, failedUrl, invoiceMerchantReference, language, lineItems, merchantReference, metaData, shippingAddress, shippingMethod, successUrl, timeZone, token, tokenizationMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractTransactionPending {\n");
    
    sb.append("    allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenizationMode: ").append(toIndentedString(tokenizationMode)).append("\n");
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

