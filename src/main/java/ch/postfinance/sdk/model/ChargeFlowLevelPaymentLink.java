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
import ch.postfinance.sdk.model.ChargeFlowLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ChargeFlowLevelPaymentLink {
  
  @JsonProperty("chargeFlowLevel")
  protected ChargeFlowLevel chargeFlowLevel = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("paymentLink")
  protected String paymentLink = null;

  
  
   /**
   * The charge flow level that the payment link belongs to.
   * @return chargeFlowLevel
  **/
  @ApiModelProperty(value = "The charge flow level that the payment link belongs to.")
  public ChargeFlowLevel getChargeFlowLevel() {
    return chargeFlowLevel;
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
   * The URL provided to the customer for entering their payment details and completing the transaction.
   * @return paymentLink
  **/
  @ApiModelProperty(value = "The URL provided to the customer for entering their payment details and completing the transaction.")
  public String getPaymentLink() {
    return paymentLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeFlowLevelPaymentLink chargeFlowLevelPaymentLink = (ChargeFlowLevelPaymentLink) o;
    return Objects.equals(this.chargeFlowLevel, chargeFlowLevelPaymentLink.chargeFlowLevel) &&
        Objects.equals(this.id, chargeFlowLevelPaymentLink.id) &&
        Objects.equals(this.linkedSpaceId, chargeFlowLevelPaymentLink.linkedSpaceId) &&
        Objects.equals(this.paymentLink, chargeFlowLevelPaymentLink.paymentLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeFlowLevel, id, linkedSpaceId, paymentLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevelPaymentLink {\n");
    
    sb.append("    chargeFlowLevel: ").append(toIndentedString(chargeFlowLevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
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

