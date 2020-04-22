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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.postfinancecheckout.sdk.model.Customer;
import com.postfinancecheckout.sdk.model.CustomerAddressType;
import com.postfinancecheckout.sdk.model.CustomerPostalAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:51.860+02:00")
public class CustomerAddress {
  
  @JsonProperty("address")
  protected CustomerPostalAddress address = null;

  
  @JsonProperty("addressType")
  protected CustomerAddressType addressType = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("customer")
  protected Customer customer = null;

  
  @JsonProperty("defaultAddress")
  protected Boolean defaultAddress = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return address
  **/
  @ApiModelProperty(value = "")
  public CustomerPostalAddress getAddress() {
    return address;
  }

  
   /**
   * 
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  public CustomerAddressType getAddressType() {
    return addressType;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Customer getCustomer() {
    return customer;
  }

  
   /**
   * 
   * @return defaultAddress
  **/
  @ApiModelProperty(value = "")
  public Boolean isDefaultAddress() {
    return defaultAddress;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    CustomerAddress customerAddress = (CustomerAddress) o;
    return Objects.equals(this.address, customerAddress.address) &&
        Objects.equals(this.addressType, customerAddress.addressType) &&
        Objects.equals(this.createdOn, customerAddress.createdOn) &&
        Objects.equals(this.customer, customerAddress.customer) &&
        Objects.equals(this.defaultAddress, customerAddress.defaultAddress) &&
        Objects.equals(this.id, customerAddress.id) &&
        Objects.equals(this.linkedSpaceId, customerAddress.linkedSpaceId) &&
        Objects.equals(this.version, customerAddress.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressType, createdOn, customer, defaultAddress, id, linkedSpaceId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    defaultAddress: ").append(toIndentedString(defaultAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
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

