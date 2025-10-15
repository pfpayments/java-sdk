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
 * AbstractSubscriberUpdate
 */

public class AbstractSubscriberUpdate {
  
  @JsonProperty("additionalAllowedPaymentMethodConfigurations")
  protected List<Long> additionalAllowedPaymentMethodConfigurations = null;

  
  @JsonProperty("billingAddress")
  protected AddressCreate billingAddress = null;

  
  @JsonProperty("description")
  protected String description = null;

  
  @JsonProperty("disallowedPaymentMethodConfigurations")
  protected List<Long> disallowedPaymentMethodConfigurations = null;

  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("shippingAddress")
  protected AddressCreate shippingAddress = null;

  
  
  public AbstractSubscriberUpdate additionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
    this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractSubscriberUpdate addAdditionalAllowedPaymentMethodConfigurationsItem(Long additionalAllowedPaymentMethodConfigurationsItem) {
    if (this.additionalAllowedPaymentMethodConfigurations == null) {
      this.additionalAllowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.additionalAllowedPaymentMethodConfigurations.add(additionalAllowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * Allow the subscriber to use these payment methods even if subscription products do not accept them.
   * @return additionalAllowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "Allow the subscriber to use these payment methods even if subscription products do not accept them.")
  public List<Long> getAdditionalAllowedPaymentMethodConfigurations() {
    return additionalAllowedPaymentMethodConfigurations;
  }

  public void setAdditionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
    this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
  }

  
  public AbstractSubscriberUpdate billingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The address associated with the subscriber for invoicing and transaction processing purposes.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The address associated with the subscriber for invoicing and transaction processing purposes.")
  public AddressCreate getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public AbstractSubscriberUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description used to identify the subscriber.
   * @return description
  **/
  @ApiModelProperty(value = "The description used to identify the subscriber.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public AbstractSubscriberUpdate disallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
    this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractSubscriberUpdate addDisallowedPaymentMethodConfigurationsItem(Long disallowedPaymentMethodConfigurationsItem) {
    if (this.disallowedPaymentMethodConfigurations == null) {
      this.disallowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.disallowedPaymentMethodConfigurations.add(disallowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * Prevent the subscriber from using these payment methods even if subscription products do accept them.
   * @return disallowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "Prevent the subscriber from using these payment methods even if subscription products do accept them.")
  public List<Long> getDisallowedPaymentMethodConfigurations() {
    return disallowedPaymentMethodConfigurations;
  }

  public void setDisallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
    this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
  }

  
  public AbstractSubscriberUpdate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address that is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address that is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public AbstractSubscriberUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language that is used when communicating with the subscriber via emails and documents.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is used when communicating with the subscriber via emails and documents.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractSubscriberUpdate metaData(Map<String, String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public AbstractSubscriberUpdate putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

   /**
   * Allow to store additional information about the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Allow to store additional information about the object.")
  public Map<String, String> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, String> metaData) {
    this.metaData = metaData;
  }

  
  public AbstractSubscriberUpdate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The merchant&#39;s reference used to identify the subscriber.
   * @return reference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the subscriber.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  
  public AbstractSubscriberUpdate shippingAddress(AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The address to where orders will be shipped.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The address to where orders will be shipped.")
  public AddressCreate getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractSubscriberUpdate abstractSubscriberUpdate = (AbstractSubscriberUpdate) o;
    return Objects.equals(this.additionalAllowedPaymentMethodConfigurations, abstractSubscriberUpdate.additionalAllowedPaymentMethodConfigurations) &&
        Objects.equals(this.billingAddress, abstractSubscriberUpdate.billingAddress) &&
        Objects.equals(this.description, abstractSubscriberUpdate.description) &&
        Objects.equals(this.disallowedPaymentMethodConfigurations, abstractSubscriberUpdate.disallowedPaymentMethodConfigurations) &&
        Objects.equals(this.emailAddress, abstractSubscriberUpdate.emailAddress) &&
        Objects.equals(this.language, abstractSubscriberUpdate.language) &&
        Objects.equals(this.metaData, abstractSubscriberUpdate.metaData) &&
        Objects.equals(this.reference, abstractSubscriberUpdate.reference) &&
        Objects.equals(this.shippingAddress, abstractSubscriberUpdate.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, language, metaData, reference, shippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractSubscriberUpdate {\n");
    
    sb.append("    additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

