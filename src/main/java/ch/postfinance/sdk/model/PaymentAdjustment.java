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
import ch.postfinance.sdk.model.Tax;
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

public class PaymentAdjustment {
  
  @JsonProperty("amountExcludingTax")
  protected BigDecimal amountExcludingTax = null;

  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("rateInPercentage")
  protected BigDecimal rateInPercentage = null;

  
  @JsonProperty("tax")
  protected Tax tax = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  
   /**
   * The adjustment&#39;s amount, excluding taxes.
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "The adjustment's amount, excluding taxes.")
  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }

  
   /**
   * The adjustment&#39;s amount, including taxes.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "The adjustment's amount, including taxes.")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
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
   * The percentage rate used to calculate the adjustment amount.
   * @return rateInPercentage
  **/
  @ApiModelProperty(value = "The percentage rate used to calculate the adjustment amount.")
  public BigDecimal getRateInPercentage() {
    return rateInPercentage;
  }

  
   /**
   * The tax applied to the adjustment.
   * @return tax
  **/
  @ApiModelProperty(value = "The tax applied to the adjustment.")
  public Tax getTax() {
    return tax;
  }

  
   /**
   * The type of the adjustment.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the adjustment.")
  public Long getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAdjustment paymentAdjustment = (PaymentAdjustment) o;
    return Objects.equals(this.amountExcludingTax, paymentAdjustment.amountExcludingTax) &&
        Objects.equals(this.amountIncludingTax, paymentAdjustment.amountIncludingTax) &&
        Objects.equals(this.id, paymentAdjustment.id) &&
        Objects.equals(this.rateInPercentage, paymentAdjustment.rateInPercentage) &&
        Objects.equals(this.tax, paymentAdjustment.tax) &&
        Objects.equals(this.type, paymentAdjustment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingTax, amountIncludingTax, id, rateInPercentage, tax, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAdjustment {\n");
    
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rateInPercentage: ").append(toIndentedString(rateInPercentage)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

