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
import ch.postfinance.sdk.model.ProductFeeType;
import ch.postfinance.sdk.model.ProductMeteredTierPricing;
import ch.postfinance.sdk.model.SubscriptionMetric;
import ch.postfinance.sdk.model.SubscriptionProductComponent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ProductMeteredFee {
  
  @JsonProperty("component")
  protected SubscriptionProductComponent component = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("metric")
  protected SubscriptionMetric metric = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("tierPricing")
  protected ProductMeteredTierPricing tierPricing = null;

  
  @JsonProperty("type")
  protected ProductFeeType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The product component that the fee belongs to.
   * @return component
  **/
  @ApiModelProperty(value = "The product component that the fee belongs to.")
  public SubscriptionProductComponent getComponent() {
    return component;
  }

  
   /**
   * The localized description of the fee that is displayed to the customer.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the fee that is displayed to the customer.")
  public Map<String, String> getDescription() {
    return description;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The metric used to determine the resource consumption billed to the customer.
   * @return metric
  **/
  @ApiModelProperty(value = "The metric used to determine the resource consumption billed to the customer.")
  public SubscriptionMetric getMetric() {
    return metric;
  }

  
   /**
   * The localized name of the fee that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the fee that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * The method used to calculate the tier price.
   * @return tierPricing
  **/
  @ApiModelProperty(value = "The method used to calculate the tier price.")
  public ProductMeteredTierPricing getTierPricing() {
    return tierPricing;
  }

  
   /**
   * The type of the fee.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the fee.")
  public ProductFeeType getType() {
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
    ProductMeteredFee productMeteredFee = (ProductMeteredFee) o;
    return Objects.equals(this.component, productMeteredFee.component) &&
        Objects.equals(this.description, productMeteredFee.description) &&
        Objects.equals(this.id, productMeteredFee.id) &&
        Objects.equals(this.linkedSpaceId, productMeteredFee.linkedSpaceId) &&
        Objects.equals(this.metric, productMeteredFee.metric) &&
        Objects.equals(this.name, productMeteredFee.name) &&
        Objects.equals(this.tierPricing, productMeteredFee.tierPricing) &&
        Objects.equals(this.type, productMeteredFee.type) &&
        Objects.equals(this.version, productMeteredFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, description, id, linkedSpaceId, metric, name, tierPricing, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredFee {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tierPricing: ").append(toIndentedString(tierPricing)).append("\n");
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

