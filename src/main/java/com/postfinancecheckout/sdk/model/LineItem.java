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


package com.postfinancecheckout.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.postfinancecheckout.sdk.model.LineItemAttribute;
import com.postfinancecheckout.sdk.model.LineItemType;
import com.postfinancecheckout.sdk.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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

public class LineItem {
  
  @JsonProperty("aggregatedTaxRate")
  protected BigDecimal aggregatedTaxRate = null;

  
  @JsonProperty("amountExcludingTax")
  protected BigDecimal amountExcludingTax = null;

  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("attributes")
  protected Map<String, LineItemAttribute> attributes = null;

  
  @JsonProperty("discountExcludingTax")
  protected BigDecimal discountExcludingTax = null;

  
  @JsonProperty("discountIncludingTax")
  protected BigDecimal discountIncludingTax = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("shippingRequired")
  protected Boolean shippingRequired = null;

  
  @JsonProperty("sku")
  protected String sku = null;

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @JsonProperty("taxAmountPerUnit")
  protected BigDecimal taxAmountPerUnit = null;

  
  @JsonProperty("taxes")
  protected List<Tax> taxes = null;

  
  @JsonProperty("type")
  protected LineItemType type = null;

  
  @JsonProperty("undiscountedAmountExcludingTax")
  protected BigDecimal undiscountedAmountExcludingTax = null;

  
  @JsonProperty("undiscountedAmountIncludingTax")
  protected BigDecimal undiscountedAmountIncludingTax = null;

  
  @JsonProperty("undiscountedUnitPriceExcludingTax")
  protected BigDecimal undiscountedUnitPriceExcludingTax = null;

  
  @JsonProperty("undiscountedUnitPriceIncludingTax")
  protected BigDecimal undiscountedUnitPriceIncludingTax = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  @JsonProperty("unitPriceExcludingTax")
  protected BigDecimal unitPriceExcludingTax = null;

  
  @JsonProperty("unitPriceIncludingTax")
  protected BigDecimal unitPriceIncludingTax = null;

  
  
   /**
   * The aggregated tax rate is the sum of all tax rates of the line item.
   * @return aggregatedTaxRate
  **/
  @ApiModelProperty(value = "The aggregated tax rate is the sum of all tax rates of the line item.")
  public BigDecimal getAggregatedTaxRate() {
    return aggregatedTaxRate;
  }

  
   /**
   * 
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }

  
   /**
   * 
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  
   /**
   * 
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, LineItemAttribute> getAttributes() {
    return attributes;
  }

  
   /**
   * 
   * @return discountExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscountExcludingTax() {
    return discountExcludingTax;
  }

  
   /**
   * 
   * @return discountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }

  
   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  
   /**
   * 
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  
   /**
   * 
   * @return shippingRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isShippingRequired() {
    return shippingRequired;
  }

  
   /**
   * 
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  
   /**
   * 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * 
   * @return taxAmountPerUnit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxAmountPerUnit() {
    return taxAmountPerUnit;
  }

  
   /**
   * 
   * @return taxes
  **/
  @ApiModelProperty(value = "")
  public List<Tax> getTaxes() {
    return taxes;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public LineItemType getType() {
    return type;
  }

  
   /**
   * 
   * @return undiscountedAmountExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUndiscountedAmountExcludingTax() {
    return undiscountedAmountExcludingTax;
  }

  
   /**
   * 
   * @return undiscountedAmountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUndiscountedAmountIncludingTax() {
    return undiscountedAmountIncludingTax;
  }

  
   /**
   * 
   * @return undiscountedUnitPriceExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUndiscountedUnitPriceExcludingTax() {
    return undiscountedUnitPriceExcludingTax;
  }

  
   /**
   * 
   * @return undiscountedUnitPriceIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUndiscountedUnitPriceIncludingTax() {
    return undiscountedUnitPriceIncludingTax;
  }

  
   /**
   * The unique id identifies the line item within the set of line items associated with the transaction.
   * @return uniqueId
  **/
  @ApiModelProperty(value = "The unique id identifies the line item within the set of line items associated with the transaction.")
  public String getUniqueId() {
    return uniqueId;
  }

  
   /**
   * 
   * @return unitPriceExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitPriceExcludingTax() {
    return unitPriceExcludingTax;
  }

  
   /**
   * 
   * @return unitPriceIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitPriceIncludingTax() {
    return unitPriceIncludingTax;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.aggregatedTaxRate, lineItem.aggregatedTaxRate) &&
        Objects.equals(this.amountExcludingTax, lineItem.amountExcludingTax) &&
        Objects.equals(this.amountIncludingTax, lineItem.amountIncludingTax) &&
        Objects.equals(this.attributes, lineItem.attributes) &&
        Objects.equals(this.discountExcludingTax, lineItem.discountExcludingTax) &&
        Objects.equals(this.discountIncludingTax, lineItem.discountIncludingTax) &&
        Objects.equals(this.name, lineItem.name) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.shippingRequired, lineItem.shippingRequired) &&
        Objects.equals(this.sku, lineItem.sku) &&
        Objects.equals(this.taxAmount, lineItem.taxAmount) &&
        Objects.equals(this.taxAmountPerUnit, lineItem.taxAmountPerUnit) &&
        Objects.equals(this.taxes, lineItem.taxes) &&
        Objects.equals(this.type, lineItem.type) &&
        Objects.equals(this.undiscountedAmountExcludingTax, lineItem.undiscountedAmountExcludingTax) &&
        Objects.equals(this.undiscountedAmountIncludingTax, lineItem.undiscountedAmountIncludingTax) &&
        Objects.equals(this.undiscountedUnitPriceExcludingTax, lineItem.undiscountedUnitPriceExcludingTax) &&
        Objects.equals(this.undiscountedUnitPriceIncludingTax, lineItem.undiscountedUnitPriceIncludingTax) &&
        Objects.equals(this.uniqueId, lineItem.uniqueId) &&
        Objects.equals(this.unitPriceExcludingTax, lineItem.unitPriceExcludingTax) &&
        Objects.equals(this.unitPriceIncludingTax, lineItem.unitPriceIncludingTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, attributes, discountExcludingTax, discountIncludingTax, name, quantity, shippingRequired, sku, taxAmount, taxAmountPerUnit, taxes, type, undiscountedAmountExcludingTax, undiscountedAmountIncludingTax, undiscountedUnitPriceExcludingTax, undiscountedUnitPriceIncludingTax, uniqueId, unitPriceExcludingTax, unitPriceIncludingTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    
    sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    discountExcludingTax: ").append(toIndentedString(discountExcludingTax)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxAmountPerUnit: ").append(toIndentedString(taxAmountPerUnit)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    undiscountedAmountExcludingTax: ").append(toIndentedString(undiscountedAmountExcludingTax)).append("\n");
    sb.append("    undiscountedAmountIncludingTax: ").append(toIndentedString(undiscountedAmountIncludingTax)).append("\n");
    sb.append("    undiscountedUnitPriceExcludingTax: ").append(toIndentedString(undiscountedUnitPriceExcludingTax)).append("\n");
    sb.append("    undiscountedUnitPriceIncludingTax: ").append(toIndentedString(undiscountedUnitPriceIncludingTax)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    unitPriceExcludingTax: ").append(toIndentedString(unitPriceExcludingTax)).append("\n");
    sb.append("    unitPriceIncludingTax: ").append(toIndentedString(unitPriceIncludingTax)).append("\n");
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

