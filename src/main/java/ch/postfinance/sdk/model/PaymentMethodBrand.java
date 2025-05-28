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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentMethodBrand {
  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("grayImagePath")
  protected String grayImagePath = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("imagePath")
  protected String imagePath = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("paymentMethod")
  protected Long paymentMethod = null;

  
  
   /**
   * The localized description of the object.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the object.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * The path to the payment method brand&#39;s grayscale image.
   * @return grayImagePath
  **/
  @ApiModelProperty(value = "The path to the payment method brand's grayscale image.")
  public String getGrayImagePath() {
    return grayImagePath;
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
   * The path to the payment method brand&#39;s image.
   * @return imagePath
  **/
  @ApiModelProperty(value = "The path to the payment method brand's image.")
  public String getImagePath() {
    return imagePath;
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
   * The payment method that the brand belongs to.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method that the brand belongs to.")
  public Long getPaymentMethod() {
    return paymentMethod;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBrand paymentMethodBrand = (PaymentMethodBrand) o;
    return Objects.equals(this.description, paymentMethodBrand.description) &&
        Objects.equals(this.grayImagePath, paymentMethodBrand.grayImagePath) &&
        Objects.equals(this.id, paymentMethodBrand.id) &&
        Objects.equals(this.imagePath, paymentMethodBrand.imagePath) &&
        Objects.equals(this.name, paymentMethodBrand.name) &&
        Objects.equals(this.paymentMethod, paymentMethodBrand.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, grayImagePath, id, imagePath, name, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBrand {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    grayImagePath: ").append(toIndentedString(grayImagePath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

