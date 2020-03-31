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
import com.postfinancecheckout.sdk.model.PaymentTerminalAddress;
import com.postfinancecheckout.sdk.model.PaymentTerminalConfiguration;
import com.postfinancecheckout.sdk.model.PaymentTerminalLocationState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class PaymentTerminalLocation {
  
  @SerializedName("defaultConfiguration")
  protected PaymentTerminalConfiguration defaultConfiguration = null;

  
  @SerializedName("deliveryAddress")
  protected PaymentTerminalAddress deliveryAddress = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("name")
  protected String name = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("state")
  protected PaymentTerminalLocationState state = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return defaultConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalConfiguration getDefaultConfiguration() {
    return defaultConfiguration;
  }

  
   /**
   * 
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalAddress getDeliveryAddress() {
    return deliveryAddress;
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
   * The terminal location name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The terminal location name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalLocationState getState() {
    return state;
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
    PaymentTerminalLocation paymentTerminalLocation = (PaymentTerminalLocation) o;
    return Objects.equals(this.defaultConfiguration, paymentTerminalLocation.defaultConfiguration) &&
        Objects.equals(this.deliveryAddress, paymentTerminalLocation.deliveryAddress) &&
        Objects.equals(this.id, paymentTerminalLocation.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalLocation.linkedSpaceId) &&
        Objects.equals(this.name, paymentTerminalLocation.name) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalLocation.plannedPurgeDate) &&
        Objects.equals(this.state, paymentTerminalLocation.state) &&
        Objects.equals(this.version, paymentTerminalLocation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultConfiguration, deliveryAddress, id, linkedSpaceId, name, plannedPurgeDate, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalLocation {\n");
    
    sb.append("    defaultConfiguration: ").append(toIndentedString(defaultConfiguration)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

