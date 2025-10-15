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
import ch.postfinance.sdk.model.LineItemCreate;
import ch.postfinance.sdk.model.PaymentLinkAddressHandlingMode;
import ch.postfinance.sdk.model.PaymentMethodConfiguration;
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
 * AbstractPaymentLinkUpdate
 */

public class AbstractPaymentLinkUpdate {
  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("allowedRedirectionDomains")
  protected List<String> allowedRedirectionDomains = null;

  
  @JsonProperty("appliedSpaceView")
  protected Long appliedSpaceView = null;

  
  @JsonProperty("availableFrom")
  protected OffsetDateTime availableFrom = null;

  
  @JsonProperty("availableUntil")
  protected OffsetDateTime availableUntil = null;

  
  @JsonProperty("billingAddressHandlingMode")
  protected PaymentLinkAddressHandlingMode billingAddressHandlingMode = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = null;

  
  @JsonProperty("maximalNumberOfTransactions")
  protected Integer maximalNumberOfTransactions = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("shippingAddressHandlingMode")
  protected PaymentLinkAddressHandlingMode shippingAddressHandlingMode = null;

  
  
  public AbstractPaymentLinkUpdate allowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractPaymentLinkUpdate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * The payment method configurations that customers can use for making payments.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The payment method configurations that customers can use for making payments.")
  public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  public void setAllowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  
  public AbstractPaymentLinkUpdate allowedRedirectionDomains(List<String> allowedRedirectionDomains) {
    this.allowedRedirectionDomains = allowedRedirectionDomains;
    return this;
  }

  public AbstractPaymentLinkUpdate addAllowedRedirectionDomainsItem(String allowedRedirectionDomainsItem) {
    if (this.allowedRedirectionDomains == null) {
      this.allowedRedirectionDomains = new ArrayList<>();
    }
    this.allowedRedirectionDomains.add(allowedRedirectionDomainsItem);
    return this;
  }

   /**
   * The domains to which the user is allowed to be redirected after the payment is completed. The following options can be configured: Exact domain: enter a full domain, e.g. (https://example.com). Wildcard domain: use to allow subdomains, e.g. (https://_*.example.com). All domains: use (ALL) to allow redirection to any domain (not recommended for security reasons). No domains : use (NONE) to disallow any redirection. Only one option per line is allowed. Invalid entries will be rejected. 
   * @return allowedRedirectionDomains
  **/
  @ApiModelProperty(value = "The domains to which the user is allowed to be redirected after the payment is completed. The following options can be configured: Exact domain: enter a full domain, e.g. (https://example.com). Wildcard domain: use to allow subdomains, e.g. (https://_*.example.com). All domains: use (ALL) to allow redirection to any domain (not recommended for security reasons). No domains : use (NONE) to disallow any redirection. Only one option per line is allowed. Invalid entries will be rejected. ")
  public List<String> getAllowedRedirectionDomains() {
    return allowedRedirectionDomains;
  }

  public void setAllowedRedirectionDomains(List<String> allowedRedirectionDomains) {
    this.allowedRedirectionDomains = allowedRedirectionDomains;
  }

  
  public AbstractPaymentLinkUpdate appliedSpaceView(Long appliedSpaceView) {
    this.appliedSpaceView = appliedSpaceView;
    return this;
  }

   /**
   * The payment link can be used within a specific space view, which may apply a customized design to the payment page.
   * @return appliedSpaceView
  **/
  @ApiModelProperty(value = "The payment link can be used within a specific space view, which may apply a customized design to the payment page.")
  public Long getAppliedSpaceView() {
    return appliedSpaceView;
  }

  public void setAppliedSpaceView(Long appliedSpaceView) {
    this.appliedSpaceView = appliedSpaceView;
  }

  
  public AbstractPaymentLinkUpdate availableFrom(OffsetDateTime availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

   /**
   * The earliest date the payment link can be used to initiate a transaction. If no date is provided, the link will be available immediately.
   * @return availableFrom
  **/
  @ApiModelProperty(value = "The earliest date the payment link can be used to initiate a transaction. If no date is provided, the link will be available immediately.")
  public OffsetDateTime getAvailableFrom() {
    return availableFrom;
  }

  public void setAvailableFrom(OffsetDateTime availableFrom) {
    this.availableFrom = availableFrom;
  }

  
  public AbstractPaymentLinkUpdate availableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = availableUntil;
    return this;
  }

   /**
   * The latest date the payment link can be used to initiate a transaction. If no date is provided, the link will remain available indefinitely.
   * @return availableUntil
  **/
  @ApiModelProperty(value = "The latest date the payment link can be used to initiate a transaction. If no date is provided, the link will remain available indefinitely.")
  public OffsetDateTime getAvailableUntil() {
    return availableUntil;
  }

  public void setAvailableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = availableUntil;
  }

  
  public AbstractPaymentLinkUpdate billingAddressHandlingMode(PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    this.billingAddressHandlingMode = billingAddressHandlingMode;
    return this;
  }

   /**
   * The handling mode defines whether a billing address is required and specifies how it should be provided.
   * @return billingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The handling mode defines whether a billing address is required and specifies how it should be provided.")
  public PaymentLinkAddressHandlingMode getBillingAddressHandlingMode() {
    return billingAddressHandlingMode;
  }

  public void setBillingAddressHandlingMode(PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    this.billingAddressHandlingMode = billingAddressHandlingMode;
  }

  
  public AbstractPaymentLinkUpdate currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code (ISO 4217). If not specified, it must be provided in the &#39;currency&#39; request parameter.
   * @return currency
  **/
  @ApiModelProperty(value = "The three-letter currency code (ISO 4217). If not specified, it must be provided in the 'currency' request parameter.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  public AbstractPaymentLinkUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language for displaying the payment page. If not specified, it can be supplied via the &#39;language&#39; request parameter.
   * @return language
  **/
  @ApiModelProperty(value = "The language for displaying the payment page. If not specified, it can be supplied via the 'language' request parameter.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractPaymentLinkUpdate lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public AbstractPaymentLinkUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items representing what is being sold. If not specified, they can be supplied via request parameters.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items representing what is being sold. If not specified, they can be supplied via request parameters.")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public AbstractPaymentLinkUpdate maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
    return this;
  }

   /**
   * The maximum number of transactions that can be initiated using the payment link.
   * @return maximalNumberOfTransactions
  **/
  @ApiModelProperty(value = "The maximum number of transactions that can be initiated using the payment link.")
  public Integer getMaximalNumberOfTransactions() {
    return maximalNumberOfTransactions;
  }

  public void setMaximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
  }

  
  public AbstractPaymentLinkUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the payment link.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the payment link.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public AbstractPaymentLinkUpdate shippingAddressHandlingMode(PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
    return this;
  }

   /**
   * The handling mode defines whether a shipping address is required and specifies how it should be provided.
   * @return shippingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The handling mode defines whether a shipping address is required and specifies how it should be provided.")
  public PaymentLinkAddressHandlingMode getShippingAddressHandlingMode() {
    return shippingAddressHandlingMode;
  }

  public void setShippingAddressHandlingMode(PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractPaymentLinkUpdate abstractPaymentLinkUpdate = (AbstractPaymentLinkUpdate) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, abstractPaymentLinkUpdate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.allowedRedirectionDomains, abstractPaymentLinkUpdate.allowedRedirectionDomains) &&
        Objects.equals(this.appliedSpaceView, abstractPaymentLinkUpdate.appliedSpaceView) &&
        Objects.equals(this.availableFrom, abstractPaymentLinkUpdate.availableFrom) &&
        Objects.equals(this.availableUntil, abstractPaymentLinkUpdate.availableUntil) &&
        Objects.equals(this.billingAddressHandlingMode, abstractPaymentLinkUpdate.billingAddressHandlingMode) &&
        Objects.equals(this.currency, abstractPaymentLinkUpdate.currency) &&
        Objects.equals(this.language, abstractPaymentLinkUpdate.language) &&
        Objects.equals(this.lineItems, abstractPaymentLinkUpdate.lineItems) &&
        Objects.equals(this.maximalNumberOfTransactions, abstractPaymentLinkUpdate.maximalNumberOfTransactions) &&
        Objects.equals(this.name, abstractPaymentLinkUpdate.name) &&
        Objects.equals(this.shippingAddressHandlingMode, abstractPaymentLinkUpdate.shippingAddressHandlingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, allowedRedirectionDomains, appliedSpaceView, availableFrom, availableUntil, billingAddressHandlingMode, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressHandlingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractPaymentLinkUpdate {\n");
    
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    allowedRedirectionDomains: ").append(toIndentedString(allowedRedirectionDomains)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    billingAddressHandlingMode: ").append(toIndentedString(billingAddressHandlingMode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippingAddressHandlingMode: ").append(toIndentedString(shippingAddressHandlingMode)).append("\n");
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

