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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class LineItemReduction {
  
  @JsonProperty("lineItemUniqueId")
  protected String lineItemUniqueId = null;

  
  @JsonProperty("quantityReduction")
  protected BigDecimal quantityReduction = null;

  
  @JsonProperty("unitPriceReduction")
  protected BigDecimal unitPriceReduction = null;

  
  
   /**
   * The unique identifier of the line item to which the reduction is applied. This ID ensures the reduction is accurately associated with the correct item.
   * @return lineItemUniqueId
  **/
  @ApiModelProperty(value = "The unique identifier of the line item to which the reduction is applied. This ID ensures the reduction is accurately associated with the correct item.")
  public String getLineItemUniqueId() {
    return lineItemUniqueId;
  }

  
   /**
   * The quantity removed or reduced from the line item. This value reflects the decrease in the item count due to the reduction.
   * @return quantityReduction
  **/
  @ApiModelProperty(value = "The quantity removed or reduced from the line item. This value reflects the decrease in the item count due to the reduction.")
  public BigDecimal getQuantityReduction() {
    return quantityReduction;
  }

  
   /**
   * The monetary amount by which the line item&#39;s unit price is discounted. This reduction adjusts the price without altering the quantity.
   * @return unitPriceReduction
  **/
  @ApiModelProperty(value = "The monetary amount by which the line item's unit price is discounted. This reduction adjusts the price without altering the quantity.")
  public BigDecimal getUnitPriceReduction() {
    return unitPriceReduction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemReduction lineItemReduction = (LineItemReduction) o;
    return Objects.equals(this.lineItemUniqueId, lineItemReduction.lineItemUniqueId) &&
        Objects.equals(this.quantityReduction, lineItemReduction.quantityReduction) &&
        Objects.equals(this.unitPriceReduction, lineItemReduction.unitPriceReduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemUniqueId, quantityReduction, unitPriceReduction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemReduction {\n");
    
    sb.append("    lineItemUniqueId: ").append(toIndentedString(lineItemUniqueId)).append("\n");
    sb.append("    quantityReduction: ").append(toIndentedString(quantityReduction)).append("\n");
    sb.append("    unitPriceReduction: ").append(toIndentedString(unitPriceReduction)).append("\n");
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

