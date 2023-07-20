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
import ch.postfinance.sdk.model.CustomersPresence;
import ch.postfinance.sdk.model.DataCollectionType;
import ch.postfinance.sdk.model.Feature;
import ch.postfinance.sdk.model.PaymentMethodBrand;
import ch.postfinance.sdk.model.PaymentPrimaryRiskTaker;
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
 * 
 */
@ApiModel(description = "")

public class PaymentConnector {
  
  @JsonProperty("dataCollectionType")
  protected DataCollectionType dataCollectionType = null;

  
  @JsonProperty("deprecated")
  protected Boolean deprecated = null;

  
  @JsonProperty("deprecationReason")
  protected Map<String, String> deprecationReason = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("feature")
  protected Feature feature = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("paymentMethod")
  protected Long paymentMethod = null;

  
  @JsonProperty("paymentMethodBrand")
  protected PaymentMethodBrand paymentMethodBrand = null;

  
  @JsonProperty("primaryRiskTaker")
  protected PaymentPrimaryRiskTaker primaryRiskTaker = null;

  
  @JsonProperty("processor")
  protected Long processor = null;

  
  @JsonProperty("supportedCustomersPresences")
  protected List<CustomersPresence> supportedCustomersPresences = null;

  
  @JsonProperty("supportedFeatures")
  protected List<Long> supportedFeatures = null;

  
  
   /**
   * 
   * @return dataCollectionType
  **/
  @ApiModelProperty(value = "")
  public DataCollectionType getDataCollectionType() {
    return dataCollectionType;
  }

  
   /**
   * 
   * @return deprecated
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeprecated() {
    return deprecated;
  }

  
   /**
   * 
   * @return deprecationReason
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDeprecationReason() {
    return deprecationReason;
  }

  
   /**
   * The localized description of the object.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the object.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return feature
  **/
  @ApiModelProperty(value = "")
  public Feature getFeature() {
    return feature;
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
   * The localized name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the object.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public Long getPaymentMethod() {
    return paymentMethod;
  }

  
   /**
   * 
   * @return paymentMethodBrand
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  
   /**
   * 
   * @return primaryRiskTaker
  **/
  @ApiModelProperty(value = "")
  public PaymentPrimaryRiskTaker getPrimaryRiskTaker() {
    return primaryRiskTaker;
  }

  
   /**
   * 
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public Long getProcessor() {
    return processor;
  }

  
   /**
   * 
   * @return supportedCustomersPresences
  **/
  @ApiModelProperty(value = "")
  public List<CustomersPresence> getSupportedCustomersPresences() {
    return supportedCustomersPresences;
  }

  
   /**
   * 
   * @return supportedFeatures
  **/
  @ApiModelProperty(value = "")
  public List<Long> getSupportedFeatures() {
    return supportedFeatures;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnector paymentConnector = (PaymentConnector) o;
    return Objects.equals(this.dataCollectionType, paymentConnector.dataCollectionType) &&
        Objects.equals(this.deprecated, paymentConnector.deprecated) &&
        Objects.equals(this.deprecationReason, paymentConnector.deprecationReason) &&
        Objects.equals(this.description, paymentConnector.description) &&
        Objects.equals(this.feature, paymentConnector.feature) &&
        Objects.equals(this.id, paymentConnector.id) &&
        Objects.equals(this.name, paymentConnector.name) &&
        Objects.equals(this.paymentMethod, paymentConnector.paymentMethod) &&
        Objects.equals(this.paymentMethodBrand, paymentConnector.paymentMethodBrand) &&
        Objects.equals(this.primaryRiskTaker, paymentConnector.primaryRiskTaker) &&
        Objects.equals(this.processor, paymentConnector.processor) &&
        Objects.equals(this.supportedCustomersPresences, paymentConnector.supportedCustomersPresences) &&
        Objects.equals(this.supportedFeatures, paymentConnector.supportedFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCollectionType, deprecated, deprecationReason, description, feature, id, name, paymentMethod, paymentMethodBrand, primaryRiskTaker, processor, supportedCustomersPresences, supportedFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnector {\n");
    
    sb.append("    dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
    sb.append("    primaryRiskTaker: ").append(toIndentedString(primaryRiskTaker)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    supportedCustomersPresences: ").append(toIndentedString(supportedCustomersPresences)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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

