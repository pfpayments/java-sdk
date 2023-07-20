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
import ch.postfinance.sdk.model.Address;
import ch.postfinance.sdk.model.ChargeAttemptEnvironment;
import ch.postfinance.sdk.model.CustomersPresence;
import ch.postfinance.sdk.model.Environment;
import ch.postfinance.sdk.model.FailureReason;
import ch.postfinance.sdk.model.LineItem;
import ch.postfinance.sdk.model.PaymentConnectorConfiguration;
import ch.postfinance.sdk.model.PaymentTerminal;
import ch.postfinance.sdk.model.Token;
import ch.postfinance.sdk.model.TokenizationMode;
import ch.postfinance.sdk.model.TransactionCompletionBehavior;
import ch.postfinance.sdk.model.TransactionEnvironmentSelectionStrategy;
import ch.postfinance.sdk.model.TransactionGroup;
import ch.postfinance.sdk.model.TransactionState;
import ch.postfinance.sdk.model.TransactionUserInterfaceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Transaction {
  
  @JsonProperty("acceptHeader")
  protected String acceptHeader = null;

  
  @JsonProperty("acceptLanguageHeader")
  protected String acceptLanguageHeader = null;

  
  @JsonProperty("allowedPaymentMethodBrands")
  protected List<Long> allowedPaymentMethodBrands = null;

  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<Long> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("authorizationAmount")
  protected BigDecimal authorizationAmount = null;

  
  @JsonProperty("authorizationEnvironment")
  protected ChargeAttemptEnvironment authorizationEnvironment = null;

  
  @JsonProperty("authorizationSalesChannel")
  protected Long authorizationSalesChannel = null;

  
  @JsonProperty("authorizationTimeoutOn")
  protected OffsetDateTime authorizationTimeoutOn = null;

  
  @JsonProperty("authorizedOn")
  protected OffsetDateTime authorizedOn = null;

  
  @JsonProperty("autoConfirmationEnabled")
  protected Boolean autoConfirmationEnabled = null;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress = null;

  
  @JsonProperty("chargeRetryEnabled")
  protected Boolean chargeRetryEnabled = null;

  
  @JsonProperty("completedAmount")
  protected BigDecimal completedAmount = null;

  
  @JsonProperty("completedOn")
  protected OffsetDateTime completedOn = null;

  
  @JsonProperty("completionBehavior")
  protected TransactionCompletionBehavior completionBehavior = null;

  
  @JsonProperty("completionTimeoutOn")
  protected OffsetDateTime completionTimeoutOn = null;

  
  @JsonProperty("confirmedBy")
  protected Long confirmedBy = null;

  
  @JsonProperty("confirmedOn")
  protected OffsetDateTime confirmedOn = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("customerEmailAddress")
  protected String customerEmailAddress = null;

  
  @JsonProperty("customerId")
  protected String customerId = null;

  
  @JsonProperty("customersPresence")
  protected CustomersPresence customersPresence = null;

  
  @JsonProperty("deliveryDecisionMadeOn")
  protected OffsetDateTime deliveryDecisionMadeOn = null;

  
  @JsonProperty("deviceSessionIdentifier")
  protected String deviceSessionIdentifier = null;

  
  @JsonProperty("emailsDisabled")
  protected Boolean emailsDisabled = null;

  
  @JsonProperty("endOfLife")
  protected OffsetDateTime endOfLife = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("environmentSelectionStrategy")
  protected TransactionEnvironmentSelectionStrategy environmentSelectionStrategy = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("failedUrl")
  protected String failedUrl = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("group")
  protected TransactionGroup group = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("internetProtocolAddress")
  protected String internetProtocolAddress = null;

  
  @JsonProperty("internetProtocolAddressCountry")
  protected String internetProtocolAddressCountry = null;

  
  @JsonProperty("invoiceMerchantReference")
  protected String invoiceMerchantReference = null;

  
  @JsonProperty("javaEnabled")
  protected Boolean javaEnabled = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("parent")
  protected Long parent = null;

  
  @JsonProperty("paymentConnectorConfiguration")
  protected PaymentConnectorConfiguration paymentConnectorConfiguration = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingOn")
  protected OffsetDateTime processingOn = null;

  
  @JsonProperty("refundedAmount")
  protected BigDecimal refundedAmount = null;

  
  @JsonProperty("screenColorDepth")
  protected String screenColorDepth = null;

  
  @JsonProperty("screenHeight")
  protected String screenHeight = null;

  
  @JsonProperty("screenWidth")
  protected String screenWidth = null;

  
  @JsonProperty("shippingAddress")
  protected Address shippingAddress = null;

  
  @JsonProperty("shippingMethod")
  protected String shippingMethod = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected TransactionState state = null;

  
  @JsonProperty("successUrl")
  protected String successUrl = null;

  
  @JsonProperty("terminal")
  protected PaymentTerminal terminal = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("token")
  protected Token token = null;

  
  @JsonProperty("tokenizationMode")
  protected TokenizationMode tokenizationMode = null;

  
  @JsonProperty("totalAppliedFees")
  protected BigDecimal totalAppliedFees = null;

  
  @JsonProperty("totalSettledAmount")
  protected BigDecimal totalSettledAmount = null;

  
  @JsonProperty("userAgentHeader")
  protected String userAgentHeader = null;

  
  @JsonProperty("userFailureMessage")
  protected String userFailureMessage = null;

  
  @JsonProperty("userInterfaceType")
  protected TransactionUserInterfaceType userInterfaceType = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  @JsonProperty("windowHeight")
  protected String windowHeight = null;

  
  @JsonProperty("windowWidth")
  protected String windowWidth = null;

  
  @JsonProperty("yearsToKeep")
  protected Integer yearsToKeep = null;

  
  
   /**
   * 
   * @return acceptHeader
  **/
  @ApiModelProperty(value = "")
  public String getAcceptHeader() {
    return acceptHeader;
  }

  
   /**
   * The accept language contains the header which indicates the language preferences of the buyer.
   * @return acceptLanguageHeader
  **/
  @ApiModelProperty(value = "The accept language contains the header which indicates the language preferences of the buyer.")
  public String getAcceptLanguageHeader() {
    return acceptLanguageHeader;
  }

  
   /**
   * 
   * @return allowedPaymentMethodBrands
  **/
  @ApiModelProperty(value = "")
  public List<Long> getAllowedPaymentMethodBrands() {
    return allowedPaymentMethodBrands;
  }

  
   /**
   * 
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  
   /**
   * 
   * @return authorizationAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }

  
   /**
   * The environment in which this transaction was successfully authorized.
   * @return authorizationEnvironment
  **/
  @ApiModelProperty(value = "The environment in which this transaction was successfully authorized.")
  public ChargeAttemptEnvironment getAuthorizationEnvironment() {
    return authorizationEnvironment;
  }

  
   /**
   * The sales channel through which the transaction was placed.
   * @return authorizationSalesChannel
  **/
  @ApiModelProperty(value = "The sales channel through which the transaction was placed.")
  public Long getAuthorizationSalesChannel() {
    return authorizationSalesChannel;
  }

  
   /**
   * This is the time on which the transaction will be timed out when it is not at least authorized. The timeout time may change over time.
   * @return authorizationTimeoutOn
  **/
  @ApiModelProperty(value = "This is the time on which the transaction will be timed out when it is not at least authorized. The timeout time may change over time.")
  public OffsetDateTime getAuthorizationTimeoutOn() {
    return authorizationTimeoutOn;
  }

  
   /**
   * 
   * @return authorizedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAuthorizedOn() {
    return authorizedOn;
  }

  
   /**
   * When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.
   * @return autoConfirmationEnabled
  **/
  @ApiModelProperty(value = "When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.")
  public Boolean isAutoConfirmationEnabled() {
    return autoConfirmationEnabled;
  }

  
   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
   * @return chargeRetryEnabled
  **/
  @ApiModelProperty(value = "When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.")
  public Boolean isChargeRetryEnabled() {
    return chargeRetryEnabled;
  }

  
   /**
   * The completed amount is the total amount which has been captured so far.
   * @return completedAmount
  **/
  @ApiModelProperty(value = "The completed amount is the total amount which has been captured so far.")
  public BigDecimal getCompletedAmount() {
    return completedAmount;
  }

  
   /**
   * 
   * @return completedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }

  
   /**
   * The completion behavior controls when the transaction is completed.
   * @return completionBehavior
  **/
  @ApiModelProperty(value = "The completion behavior controls when the transaction is completed.")
  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }

  
   /**
   * 
   * @return completionTimeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompletionTimeoutOn() {
    return completionTimeoutOn;
  }

  
   /**
   * 
   * @return confirmedBy
  **/
  @ApiModelProperty(value = "")
  public Long getConfirmedBy() {
    return confirmedBy;
  }

  
   /**
   * 
   * @return confirmedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getConfirmedOn() {
    return confirmedOn;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
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
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * The customer email address is the email address of the customer. If no email address is provided on the shipping or billing address this address is used.
   * @return customerEmailAddress
  **/
  @ApiModelProperty(value = "The customer email address is the email address of the customer. If no email address is provided on the shipping or billing address this address is used.")
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  
   /**
   * 
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  
   /**
   * The customer&#39;s presence indicates what kind of authentication method was finally used during authorization of the transaction. If no value is provided, &#39;Virtually Present&#39; is used by default.
   * @return customersPresence
  **/
  @ApiModelProperty(value = "The customer's presence indicates what kind of authentication method was finally used during authorization of the transaction. If no value is provided, 'Virtually Present' is used by default.")
  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }

  
   /**
   * This date indicates when the decision has been made if a transaction should be delivered or not.
   * @return deliveryDecisionMadeOn
  **/
  @ApiModelProperty(value = "This date indicates when the decision has been made if a transaction should be delivered or not.")
  public OffsetDateTime getDeliveryDecisionMadeOn() {
    return deliveryDecisionMadeOn;
  }

  
   /**
   * The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.
   * @return deviceSessionIdentifier
  **/
  @ApiModelProperty(value = "The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.")
  public String getDeviceSessionIdentifier() {
    return deviceSessionIdentifier;
  }

  
   /**
   * Flag indicating whether email sending is disabled for this particular transaction. Defaults to false.
   * @return emailsDisabled
  **/
  @ApiModelProperty(value = "Flag indicating whether email sending is disabled for this particular transaction. Defaults to false.")
  public Boolean isEmailsDisabled() {
    return emailsDisabled;
  }

  
   /**
   * The transaction&#39;s end of life indicates the date from which on no operation can be carried out anymore.
   * @return endOfLife
  **/
  @ApiModelProperty(value = "The transaction's end of life indicates the date from which on no operation can be carried out anymore.")
  public OffsetDateTime getEndOfLife() {
    return endOfLife;
  }

  
   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public Environment getEnvironment() {
    return environment;
  }

  
   /**
   * The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.
   * @return environmentSelectionStrategy
  **/
  @ApiModelProperty(value = "The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.")
  public TransactionEnvironmentSelectionStrategy getEnvironmentSelectionStrategy() {
    return environmentSelectionStrategy;
  }

  
   /**
   * 
   * @return failedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
   * @return failedUrl
  **/
  @ApiModelProperty(value = "The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.")
  public String getFailedUrl() {
    return failedUrl;
  }

  
   /**
   * The failure reason describes why the transaction failed. This is only provided when the transaction is marked as failed.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The failure reason describes why the transaction failed. This is only provided when the transaction is marked as failed.")
  public FailureReason getFailureReason() {
    return failureReason;
  }

  
   /**
   * 
   * @return group
  **/
  @ApiModelProperty(value = "")
  public TransactionGroup getGroup() {
    return group;
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
   * The Internet Protocol (IP) address identifies the device of the buyer.
   * @return internetProtocolAddress
  **/
  @ApiModelProperty(value = "The Internet Protocol (IP) address identifies the device of the buyer.")
  public String getInternetProtocolAddress() {
    return internetProtocolAddress;
  }

  
   /**
   * 
   * @return internetProtocolAddressCountry
  **/
  @ApiModelProperty(value = "")
  public String getInternetProtocolAddressCountry() {
    return internetProtocolAddressCountry;
  }

  
   /**
   * 
   * @return invoiceMerchantReference
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }

  
   /**
   * 
   * @return javaEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isJavaEnabled() {
    return javaEnabled;
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
   * 
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<LineItem> getLineItems() {
    return lineItems;
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
   * @return merchantReference
  **/
  @ApiModelProperty(value = "")
  public String getMerchantReference() {
    return merchantReference;
  }

  
   /**
   * Allow to store additional information about the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Allow to store additional information about the object.")
  public Map<String, String> getMetaData() {
    return metaData;
  }

  
   /**
   * 
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Long getParent() {
    return parent;
  }

  
   /**
   * 
   * @return paymentConnectorConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
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
   * 
   * @return processingOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }

  
   /**
   * The refunded amount is the total amount which has been refunded so far.
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "The refunded amount is the total amount which has been refunded so far.")
  public BigDecimal getRefundedAmount() {
    return refundedAmount;
  }

  
   /**
   * 
   * @return screenColorDepth
  **/
  @ApiModelProperty(value = "")
  public String getScreenColorDepth() {
    return screenColorDepth;
  }

  
   /**
   * 
   * @return screenHeight
  **/
  @ApiModelProperty(value = "")
  public String getScreenHeight() {
    return screenHeight;
  }

  
   /**
   * 
   * @return screenWidth
  **/
  @ApiModelProperty(value = "")
  public String getScreenWidth() {
    return screenWidth;
  }

  
   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  
   /**
   * 
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "")
  public String getShippingMethod() {
    return shippingMethod;
  }

  
   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public TransactionState getState() {
    return state;
  }

  
   /**
   * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
   * @return successUrl
  **/
  @ApiModelProperty(value = "The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.")
  public String getSuccessUrl() {
    return successUrl;
  }

  
   /**
   * The terminal on which the payment was processed.
   * @return terminal
  **/
  @ApiModelProperty(value = "The terminal on which the payment was processed.")
  public PaymentTerminal getTerminal() {
    return terminal;
  }

  
   /**
   * The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Token getToken() {
    return token;
  }

  
   /**
   * The tokenization mode controls if and how the tokenization of payment information is applied to the transaction.
   * @return tokenizationMode
  **/
  @ApiModelProperty(value = "The tokenization mode controls if and how the tokenization of payment information is applied to the transaction.")
  public TokenizationMode getTokenizationMode() {
    return tokenizationMode;
  }

  
   /**
   * The total applied fees is the sum of all fees that have been applied so far.
   * @return totalAppliedFees
  **/
  @ApiModelProperty(value = "The total applied fees is the sum of all fees that have been applied so far.")
  public BigDecimal getTotalAppliedFees() {
    return totalAppliedFees;
  }

  
   /**
   * The total settled amount is the total amount which has been settled so far.
   * @return totalSettledAmount
  **/
  @ApiModelProperty(value = "The total settled amount is the total amount which has been settled so far.")
  public BigDecimal getTotalSettledAmount() {
    return totalSettledAmount;
  }

  
   /**
   * The user agent header provides the exact string which contains the user agent of the buyer.
   * @return userAgentHeader
  **/
  @ApiModelProperty(value = "The user agent header provides the exact string which contains the user agent of the buyer.")
  public String getUserAgentHeader() {
    return userAgentHeader;
  }

  
   /**
   * The failure message describes for an end user why the transaction is failed in the language of the user. This is only provided when the transaction is marked as failed.
   * @return userFailureMessage
  **/
  @ApiModelProperty(value = "The failure message describes for an end user why the transaction is failed in the language of the user. This is only provided when the transaction is marked as failed.")
  public String getUserFailureMessage() {
    return userFailureMessage;
  }

  
   /**
   * The user interface type defines through which user interface the transaction has been processed resp. created.
   * @return userInterfaceType
  **/
  @ApiModelProperty(value = "The user interface type defines through which user interface the transaction has been processed resp. created.")
  public TransactionUserInterfaceType getUserInterfaceType() {
    return userInterfaceType;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  
   /**
   * 
   * @return windowHeight
  **/
  @ApiModelProperty(value = "")
  public String getWindowHeight() {
    return windowHeight;
  }

  
   /**
   * 
   * @return windowWidth
  **/
  @ApiModelProperty(value = "")
  public String getWindowWidth() {
    return windowWidth;
  }

  
   /**
   * The number of years the transaction will be stored after it has been authorized.
   * @return yearsToKeep
  **/
  @ApiModelProperty(value = "The number of years the transaction will be stored after it has been authorized.")
  public Integer getYearsToKeep() {
    return yearsToKeep;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.acceptHeader, transaction.acceptHeader) &&
        Objects.equals(this.acceptLanguageHeader, transaction.acceptLanguageHeader) &&
        Objects.equals(this.allowedPaymentMethodBrands, transaction.allowedPaymentMethodBrands) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, transaction.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.authorizationAmount, transaction.authorizationAmount) &&
        Objects.equals(this.authorizationEnvironment, transaction.authorizationEnvironment) &&
        Objects.equals(this.authorizationSalesChannel, transaction.authorizationSalesChannel) &&
        Objects.equals(this.authorizationTimeoutOn, transaction.authorizationTimeoutOn) &&
        Objects.equals(this.authorizedOn, transaction.authorizedOn) &&
        Objects.equals(this.autoConfirmationEnabled, transaction.autoConfirmationEnabled) &&
        Objects.equals(this.billingAddress, transaction.billingAddress) &&
        Objects.equals(this.chargeRetryEnabled, transaction.chargeRetryEnabled) &&
        Objects.equals(this.completedAmount, transaction.completedAmount) &&
        Objects.equals(this.completedOn, transaction.completedOn) &&
        Objects.equals(this.completionBehavior, transaction.completionBehavior) &&
        Objects.equals(this.completionTimeoutOn, transaction.completionTimeoutOn) &&
        Objects.equals(this.confirmedBy, transaction.confirmedBy) &&
        Objects.equals(this.confirmedOn, transaction.confirmedOn) &&
        Objects.equals(this.createdBy, transaction.createdBy) &&
        Objects.equals(this.createdOn, transaction.createdOn) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.customerEmailAddress, transaction.customerEmailAddress) &&
        Objects.equals(this.customerId, transaction.customerId) &&
        Objects.equals(this.customersPresence, transaction.customersPresence) &&
        Objects.equals(this.deliveryDecisionMadeOn, transaction.deliveryDecisionMadeOn) &&
        Objects.equals(this.deviceSessionIdentifier, transaction.deviceSessionIdentifier) &&
        Objects.equals(this.emailsDisabled, transaction.emailsDisabled) &&
        Objects.equals(this.endOfLife, transaction.endOfLife) &&
        Objects.equals(this.environment, transaction.environment) &&
        Objects.equals(this.environmentSelectionStrategy, transaction.environmentSelectionStrategy) &&
        Objects.equals(this.failedOn, transaction.failedOn) &&
        Objects.equals(this.failedUrl, transaction.failedUrl) &&
        Objects.equals(this.failureReason, transaction.failureReason) &&
        Objects.equals(this.group, transaction.group) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.internetProtocolAddress, transaction.internetProtocolAddress) &&
        Objects.equals(this.internetProtocolAddressCountry, transaction.internetProtocolAddressCountry) &&
        Objects.equals(this.invoiceMerchantReference, transaction.invoiceMerchantReference) &&
        Objects.equals(this.javaEnabled, transaction.javaEnabled) &&
        Objects.equals(this.language, transaction.language) &&
        Objects.equals(this.lineItems, transaction.lineItems) &&
        Objects.equals(this.linkedSpaceId, transaction.linkedSpaceId) &&
        Objects.equals(this.merchantReference, transaction.merchantReference) &&
        Objects.equals(this.metaData, transaction.metaData) &&
        Objects.equals(this.parent, transaction.parent) &&
        Objects.equals(this.paymentConnectorConfiguration, transaction.paymentConnectorConfiguration) &&
        Objects.equals(this.plannedPurgeDate, transaction.plannedPurgeDate) &&
        Objects.equals(this.processingOn, transaction.processingOn) &&
        Objects.equals(this.refundedAmount, transaction.refundedAmount) &&
        Objects.equals(this.screenColorDepth, transaction.screenColorDepth) &&
        Objects.equals(this.screenHeight, transaction.screenHeight) &&
        Objects.equals(this.screenWidth, transaction.screenWidth) &&
        Objects.equals(this.shippingAddress, transaction.shippingAddress) &&
        Objects.equals(this.shippingMethod, transaction.shippingMethod) &&
        Objects.equals(this.spaceViewId, transaction.spaceViewId) &&
        Objects.equals(this.state, transaction.state) &&
        Objects.equals(this.successUrl, transaction.successUrl) &&
        Objects.equals(this.terminal, transaction.terminal) &&
        Objects.equals(this.timeZone, transaction.timeZone) &&
        Objects.equals(this.token, transaction.token) &&
        Objects.equals(this.tokenizationMode, transaction.tokenizationMode) &&
        Objects.equals(this.totalAppliedFees, transaction.totalAppliedFees) &&
        Objects.equals(this.totalSettledAmount, transaction.totalSettledAmount) &&
        Objects.equals(this.userAgentHeader, transaction.userAgentHeader) &&
        Objects.equals(this.userFailureMessage, transaction.userFailureMessage) &&
        Objects.equals(this.userInterfaceType, transaction.userInterfaceType) &&
        Objects.equals(this.version, transaction.version) &&
        Objects.equals(this.windowHeight, transaction.windowHeight) &&
        Objects.equals(this.windowWidth, transaction.windowWidth) &&
        Objects.equals(this.yearsToKeep, transaction.yearsToKeep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHeader, acceptLanguageHeader, allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, authorizationAmount, authorizationEnvironment, authorizationSalesChannel, authorizationTimeoutOn, authorizedOn, autoConfirmationEnabled, billingAddress, chargeRetryEnabled, completedAmount, completedOn, completionBehavior, completionTimeoutOn, confirmedBy, confirmedOn, createdBy, createdOn, currency, customerEmailAddress, customerId, customersPresence, deliveryDecisionMadeOn, deviceSessionIdentifier, emailsDisabled, endOfLife, environment, environmentSelectionStrategy, failedOn, failedUrl, failureReason, group, id, internetProtocolAddress, internetProtocolAddressCountry, invoiceMerchantReference, javaEnabled, language, lineItems, linkedSpaceId, merchantReference, metaData, parent, paymentConnectorConfiguration, plannedPurgeDate, processingOn, refundedAmount, screenColorDepth, screenHeight, screenWidth, shippingAddress, shippingMethod, spaceViewId, state, successUrl, terminal, timeZone, token, tokenizationMode, totalAppliedFees, totalSettledAmount, userAgentHeader, userFailureMessage, userInterfaceType, version, windowHeight, windowWidth, yearsToKeep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    acceptLanguageHeader: ").append(toIndentedString(acceptLanguageHeader)).append("\n");
    sb.append("    allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorizationEnvironment: ").append(toIndentedString(authorizationEnvironment)).append("\n");
    sb.append("    authorizationSalesChannel: ").append(toIndentedString(authorizationSalesChannel)).append("\n");
    sb.append("    authorizationTimeoutOn: ").append(toIndentedString(authorizationTimeoutOn)).append("\n");
    sb.append("    authorizedOn: ").append(toIndentedString(authorizedOn)).append("\n");
    sb.append("    autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
    sb.append("    completedAmount: ").append(toIndentedString(completedAmount)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    completionTimeoutOn: ").append(toIndentedString(completionTimeoutOn)).append("\n");
    sb.append("    confirmedBy: ").append(toIndentedString(confirmedBy)).append("\n");
    sb.append("    confirmedOn: ").append(toIndentedString(confirmedOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    deliveryDecisionMadeOn: ").append(toIndentedString(deliveryDecisionMadeOn)).append("\n");
    sb.append("    deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
    sb.append("    emailsDisabled: ").append(toIndentedString(emailsDisabled)).append("\n");
    sb.append("    endOfLife: ").append(toIndentedString(endOfLife)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internetProtocolAddress: ").append(toIndentedString(internetProtocolAddress)).append("\n");
    sb.append("    internetProtocolAddressCountry: ").append(toIndentedString(internetProtocolAddressCountry)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    screenColorDepth: ").append(toIndentedString(screenColorDepth)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenizationMode: ").append(toIndentedString(tokenizationMode)).append("\n");
    sb.append("    totalAppliedFees: ").append(toIndentedString(totalAppliedFees)).append("\n");
    sb.append("    totalSettledAmount: ").append(toIndentedString(totalSettledAmount)).append("\n");
    sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
    sb.append("    userInterfaceType: ").append(toIndentedString(userInterfaceType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    windowHeight: ").append(toIndentedString(windowHeight)).append("\n");
    sb.append("    windowWidth: ").append(toIndentedString(windowWidth)).append("\n");
    sb.append("    yearsToKeep: ").append(toIndentedString(yearsToKeep)).append("\n");
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

