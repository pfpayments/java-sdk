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
import ch.postfinance.sdk.model.PersistableCurrencyAmount;
import ch.postfinance.sdk.model.ProductMeteredFee;
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

public class ProductMeteredTierFee {
  
  @JsonProperty("fee")
  protected List<PersistableCurrencyAmount> fee = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("meteredFee")
  protected ProductMeteredFee meteredFee = null;

  
  @JsonProperty("startRange")
  protected BigDecimal startRange = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The amount charged to the customer for each consumed unit at the end of a billing cycle.
   * @return fee
  **/
  @ApiModelProperty(value = "The amount charged to the customer for each consumed unit at the end of a billing cycle.")
  public List<PersistableCurrencyAmount> getFee() {
    return fee;
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
   * The metered fee that this tier belongs to.
   * @return meteredFee
  **/
  @ApiModelProperty(value = "The metered fee that this tier belongs to.")
  public ProductMeteredFee getMeteredFee() {
    return meteredFee;
  }

  
   /**
   * Starting from and including this quantity is contained in the tier.
   * @return startRange
  **/
  @ApiModelProperty(value = "Starting from and including this quantity is contained in the tier.")
  public BigDecimal getStartRange() {
    return startRange;
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
    ProductMeteredTierFee productMeteredTierFee = (ProductMeteredTierFee) o;
    return Objects.equals(this.fee, productMeteredTierFee.fee) &&
        Objects.equals(this.id, productMeteredTierFee.id) &&
        Objects.equals(this.meteredFee, productMeteredTierFee.meteredFee) &&
        Objects.equals(this.startRange, productMeteredTierFee.startRange) &&
        Objects.equals(this.version, productMeteredTierFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, id, meteredFee, startRange, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredTierFee {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
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

