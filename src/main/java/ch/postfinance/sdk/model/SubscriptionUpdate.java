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
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("affiliate")
  protected Long affiliate = null;

  
  @JsonProperty("description")
  protected String description = null;

  
  @JsonProperty("plannedTerminationDate")
  protected OffsetDateTime plannedTerminationDate = null;

  
  
  public SubscriptionUpdate id(Long id) {
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

  
  public SubscriptionUpdate version(Long version) {
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

  
  public SubscriptionUpdate affiliate(Long affiliate) {
    this.affiliate = affiliate;
    return this;
  }

   /**
   * The affiliate that led to the creation of the subscription.
   * @return affiliate
  **/
  @ApiModelProperty(value = "The affiliate that led to the creation of the subscription.")
  public Long getAffiliate() {
    return affiliate;
  }

  public void setAffiliate(Long affiliate) {
    this.affiliate = affiliate;
  }

  
  public SubscriptionUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description used to identify the subscription.
   * @return description
  **/
  @ApiModelProperty(value = "A description used to identify the subscription.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public SubscriptionUpdate plannedTerminationDate(OffsetDateTime plannedTerminationDate) {
    this.plannedTerminationDate = plannedTerminationDate;
    return this;
  }

   /**
   * The date and time when the subscription is planned to be terminated.
   * @return plannedTerminationDate
  **/
  @ApiModelProperty(value = "The date and time when the subscription is planned to be terminated.")
  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }

  public void setPlannedTerminationDate(OffsetDateTime plannedTerminationDate) {
    this.plannedTerminationDate = plannedTerminationDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdate subscriptionUpdate = (SubscriptionUpdate) o;
    return Objects.equals(this.id, subscriptionUpdate.id) &&
        Objects.equals(this.version, subscriptionUpdate.version) &&
        Objects.equals(this.affiliate, subscriptionUpdate.affiliate) &&
        Objects.equals(this.description, subscriptionUpdate.description) &&
        Objects.equals(this.plannedTerminationDate, subscriptionUpdate.plannedTerminationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, affiliate, description, plannedTerminationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
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

