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
import ch.postfinance.sdk.model.PersistableCurrencyAmountUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ProductMeteredTierFeeUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("fee")
  protected List<PersistableCurrencyAmountUpdate> fee = null;

  
  @JsonProperty("meteredFee")
  protected Long meteredFee = null;

  
  @JsonProperty("startRange")
  protected BigDecimal startRange = null;

  
  
  public ProductMeteredTierFeeUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public ProductMeteredTierFeeUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public ProductMeteredTierFeeUpdate fee(List<PersistableCurrencyAmountUpdate> fee) {
    this.fee = fee;
    return this;
  }

  public ProductMeteredTierFeeUpdate addFeeItem(PersistableCurrencyAmountUpdate feeItem) {
    if (this.fee == null) {
      this.fee = new ArrayList<>();
    }
    this.fee.add(feeItem);
    return this;
  }

   /**
   * The amount charged to the customer for each consumed unit at the end of a billing cycle.
   * @return fee
  **/
  @ApiModelProperty(value = "The amount charged to the customer for each consumed unit at the end of a billing cycle.")
  public List<PersistableCurrencyAmountUpdate> getFee() {
    return fee;
  }

  public void setFee(List<PersistableCurrencyAmountUpdate> fee) {
    this.fee = fee;
  }

  
  public ProductMeteredTierFeeUpdate meteredFee(Long meteredFee) {
    this.meteredFee = meteredFee;
    return this;
  }

   /**
   * The metered fee that this tier belongs to.
   * @return meteredFee
  **/
  @ApiModelProperty(value = "The metered fee that this tier belongs to.")
  public Long getMeteredFee() {
    return meteredFee;
  }

  public void setMeteredFee(Long meteredFee) {
    this.meteredFee = meteredFee;
  }

  
  public ProductMeteredTierFeeUpdate startRange(BigDecimal startRange) {
    this.startRange = startRange;
    return this;
  }

   /**
   * Starting from and including this quantity is contained in the tier.
   * @return startRange
  **/
  @ApiModelProperty(value = "Starting from and including this quantity is contained in the tier.")
  public BigDecimal getStartRange() {
    return startRange;
  }

  public void setStartRange(BigDecimal startRange) {
    this.startRange = startRange;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate = (ProductMeteredTierFeeUpdate) o;
    return Objects.equals(this.id, productMeteredTierFeeUpdate.id) &&
        Objects.equals(this.version, productMeteredTierFeeUpdate.version) &&
        Objects.equals(this.fee, productMeteredTierFeeUpdate.fee) &&
        Objects.equals(this.meteredFee, productMeteredTierFeeUpdate.meteredFee) &&
        Objects.equals(this.startRange, productMeteredTierFeeUpdate.startRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, fee, meteredFee, startRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredTierFeeUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
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

