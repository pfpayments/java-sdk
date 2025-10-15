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
import ch.postfinance.sdk.model.SubscriptionProduct;
import ch.postfinance.sdk.model.SubscriptionProductVersion;
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

public class SubscriptionProductVersionRetirement {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("productVersion")
  protected SubscriptionProductVersion productVersion = null;

  
  @JsonProperty("respectTerminationPeriods")
  protected Boolean respectTerminationPeriods = null;

  
  @JsonProperty("targetProduct")
  protected SubscriptionProduct targetProduct = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * The product version that is to be retired.
   * @return productVersion
  **/
  @ApiModelProperty(value = "The product version that is to be retired.")
  public SubscriptionProductVersion getProductVersion() {
    return productVersion;
  }

  
   /**
   * Whether the subscriptions&#39; termination periods should be respected.
   * @return respectTerminationPeriods
  **/
  @ApiModelProperty(value = "Whether the subscriptions' termination periods should be respected.")
  public Boolean isRespectTerminationPeriods() {
    return respectTerminationPeriods;
  }

  
   /**
   * The product to which the subscriptions with the retiring product version are to be migrated. If none is defined, the subscriptions are terminated.
   * @return targetProduct
  **/
  @ApiModelProperty(value = "The product to which the subscriptions with the retiring product version are to be migrated. If none is defined, the subscriptions are terminated.")
  public SubscriptionProduct getTargetProduct() {
    return targetProduct;
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
    SubscriptionProductVersionRetirement subscriptionProductVersionRetirement = (SubscriptionProductVersionRetirement) o;
    return Objects.equals(this.createdOn, subscriptionProductVersionRetirement.createdOn) &&
        Objects.equals(this.id, subscriptionProductVersionRetirement.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductVersionRetirement.linkedSpaceId) &&
        Objects.equals(this.productVersion, subscriptionProductVersionRetirement.productVersion) &&
        Objects.equals(this.respectTerminationPeriods, subscriptionProductVersionRetirement.respectTerminationPeriods) &&
        Objects.equals(this.targetProduct, subscriptionProductVersionRetirement.targetProduct) &&
        Objects.equals(this.version, subscriptionProductVersionRetirement.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, linkedSpaceId, productVersion, respectTerminationPeriods, targetProduct, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersionRetirement {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    respectTerminationPeriods: ").append(toIndentedString(respectTerminationPeriods)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

