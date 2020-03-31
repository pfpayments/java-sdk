/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.postfinancecheckout.sdk.model.CustomerAddressType;
import com.postfinancecheckout.sdk.model.CustomerPostalAddressCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractCustomerAddressActive
 */
public class AbstractCustomerAddressActive {
  
  @SerializedName("address")
  protected CustomerPostalAddressCreate address = null;

  
  @SerializedName("addressType")
  protected CustomerAddressType addressType = null;

  
  
  public AbstractCustomerAddressActive address(CustomerPostalAddressCreate address) {
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @ApiModelProperty(value = "")
  public CustomerPostalAddressCreate getAddress() {
    return address;
  }

  public void setAddress(CustomerPostalAddressCreate address) {
    this.address = address;
  }

  
  public AbstractCustomerAddressActive addressType(CustomerAddressType addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * 
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  public CustomerAddressType getAddressType() {
    return addressType;
  }

  public void setAddressType(CustomerAddressType addressType) {
    this.addressType = addressType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractCustomerAddressActive abstractCustomerAddressActive = (AbstractCustomerAddressActive) o;
    return Objects.equals(this.address, abstractCustomerAddressActive.address) &&
        Objects.equals(this.addressType, abstractCustomerAddressActive.addressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractCustomerAddressActive {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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

