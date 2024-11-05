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
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class AnalyticsQuery {
  
  @JsonProperty("accountId")
  protected Long accountId = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("maxCacheAge")
  protected Integer maxCacheAge = null;

  
  @JsonProperty("queryString")
  protected String queryString = null;

  
  @JsonProperty("scannedDataLimit")
  protected BigDecimal scannedDataLimit = null;

  
  @JsonProperty("spaceIds")
  protected List<Long> spaceIds = null;

  
  
  public AnalyticsQuery accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account in which the query is to be executed.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account in which the query is to be executed.")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  
  public AnalyticsQuery externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public AnalyticsQuery maxCacheAge(Integer maxCacheAge) {
    this.maxCacheAge = maxCacheAge;
    return this;
  }

   /**
   * The maximum age (in minutes) of queries already executed that are to be taken into account. If an equivalent query is already available and not older than the specified age, its result will be returned instead of re-executing it. To force a new execution, specify a new, unique external ID and no maximum cache age.
   * @return maxCacheAge
  **/
  @ApiModelProperty(value = "The maximum age (in minutes) of queries already executed that are to be taken into account. If an equivalent query is already available and not older than the specified age, its result will be returned instead of re-executing it. To force a new execution, specify a new, unique external ID and no maximum cache age.")
  public Integer getMaxCacheAge() {
    return maxCacheAge;
  }

  public void setMaxCacheAge(Integer maxCacheAge) {
    this.maxCacheAge = maxCacheAge;
  }

  
  public AnalyticsQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

   /**
   * The PrestoDB/Athena SQL statement to be executed.
   * @return queryString
  **/
  @ApiModelProperty(value = "The PrestoDB/Athena SQL statement to be executed.")
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  
  public AnalyticsQuery scannedDataLimit(BigDecimal scannedDataLimit) {
    this.scannedDataLimit = scannedDataLimit;
    return this;
  }

   /**
   * The maximum amount of data that the query is allowed to scan. After the limit is reached, the query will be canceled.
   * @return scannedDataLimit
  **/
  @ApiModelProperty(value = "The maximum amount of data that the query is allowed to scan. After the limit is reached, the query will be canceled.")
  public BigDecimal getScannedDataLimit() {
    return scannedDataLimit;
  }

  public void setScannedDataLimit(BigDecimal scannedDataLimit) {
    this.scannedDataLimit = scannedDataLimit;
  }

  
  public AnalyticsQuery spaceIds(List<Long> spaceIds) {
    this.spaceIds = spaceIds;
    return this;
  }

  public AnalyticsQuery addSpaceIdsItem(Long spaceIdsItem) {
    if (this.spaceIds == null) {
      this.spaceIds = new ArrayList<>();
    }
    this.spaceIds.add(spaceIdsItem);
    return this;
  }

   /**
   * The IDs of the spaces belonging to the specified account in which the query is to be executed. Do not provide any value to query all spaces in the specified account.
   * @return spaceIds
  **/
  @ApiModelProperty(value = "The IDs of the spaces belonging to the specified account in which the query is to be executed. Do not provide any value to query all spaces in the specified account.")
  public List<Long> getSpaceIds() {
    return spaceIds;
  }

  public void setSpaceIds(List<Long> spaceIds) {
    this.spaceIds = spaceIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQuery analyticsQuery = (AnalyticsQuery) o;
    return Objects.equals(this.accountId, analyticsQuery.accountId) &&
        Objects.equals(this.externalId, analyticsQuery.externalId) &&
        Objects.equals(this.maxCacheAge, analyticsQuery.maxCacheAge) &&
        Objects.equals(this.queryString, analyticsQuery.queryString) &&
        Objects.equals(this.scannedDataLimit, analyticsQuery.scannedDataLimit) &&
        Objects.equals(this.spaceIds, analyticsQuery.spaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, maxCacheAge, queryString, scannedDataLimit, spaceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQuery {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    maxCacheAge: ").append(toIndentedString(maxCacheAge)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    scannedDataLimit: ").append(toIndentedString(scannedDataLimit)).append("\n");
    sb.append("    spaceIds: ").append(toIndentedString(spaceIds)).append("\n");
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

