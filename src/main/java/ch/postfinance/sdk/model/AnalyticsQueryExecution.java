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
import ch.postfinance.sdk.model.AnalyticsQueryExecutionState;
import ch.postfinance.sdk.model.FailureReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * Represents the execution of a query which has been submitted to Analytics.
 */
@ApiModel(description = "Represents the execution of a query which has been submitted to Analytics.")

public class AnalyticsQueryExecution {
  
  @JsonProperty("account")
  protected Long account = null;

  
  @JsonProperty("errorMessage")
  protected String errorMessage = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("processingEndTime")
  protected OffsetDateTime processingEndTime = null;

  
  @JsonProperty("processingStartTime")
  protected OffsetDateTime processingStartTime = null;

  
  @JsonProperty("queryString")
  protected String queryString = null;

  
  @JsonProperty("scannedDataInGb")
  protected BigDecimal scannedDataInGb = null;

  
  @JsonProperty("scannedDataLimit")
  protected BigDecimal scannedDataLimit = null;

  
  @JsonProperty("spaces")
  protected List<Long> spaces = null;

  
  @JsonProperty("state")
  protected AnalyticsQueryExecutionState state = null;

  
  
   /**
   * The account in which the query is executed.
   * @return account
  **/
  @ApiModelProperty(value = "The account in which the query is executed.")
  public Long getAccount() {
    return account;
  }

  
   /**
   * The error message that describes the reason for the failure of the query execution.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "The error message that describes the reason for the failure of the query execution.")
  public String getErrorMessage() {
    return errorMessage;
  }

  
   /**
   * The external ID of the query if one was specified, otherwise null.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external ID of the query if one was specified, otherwise null.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * The reason for the failure of query execution.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the failure of query execution.")
  public FailureReason getFailureReason() {
    return failureReason;
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
   * The date and time when the processing of the query was completed. Null if the query execution has not yet been completed.
   * @return processingEndTime
  **/
  @ApiModelProperty(value = "The date and time when the processing of the query was completed. Null if the query execution has not yet been completed.")
  public OffsetDateTime getProcessingEndTime() {
    return processingEndTime;
  }

  
   /**
   * The date and time when the processing of the query was started.
   * @return processingStartTime
  **/
  @ApiModelProperty(value = "The date and time when the processing of the query was started.")
  public OffsetDateTime getProcessingStartTime() {
    return processingStartTime;
  }

  
   /**
   * The SQL statement which has been submitted for execution.
   * @return queryString
  **/
  @ApiModelProperty(value = "The SQL statement which has been submitted for execution.")
  public String getQueryString() {
    return queryString;
  }

  
   /**
   * The amount of data that was scanned when processing the query (in GB).
   * @return scannedDataInGb
  **/
  @ApiModelProperty(value = "The amount of data that was scanned when processing the query (in GB).")
  public BigDecimal getScannedDataInGb() {
    return scannedDataInGb;
  }

  
   /**
   * The maximal amount of data that this query is allowed to scan (in GB). If this limit is reached, the query will be canceled.
   * @return scannedDataLimit
  **/
  @ApiModelProperty(value = "The maximal amount of data that this query is allowed to scan (in GB). If this limit is reached, the query will be canceled.")
  public BigDecimal getScannedDataLimit() {
    return scannedDataLimit;
  }

  
   /**
   * The spaces in which the query is executed. May be empty if all spaces of the specified account have been queried.
   * @return spaces
  **/
  @ApiModelProperty(value = "The spaces in which the query is executed. May be empty if all spaces of the specified account have been queried.")
  public List<Long> getSpaces() {
    return spaces;
  }

  
   /**
   * The current state of the query execution.
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the query execution.")
  public AnalyticsQueryExecutionState getState() {
    return state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryExecution analyticsQueryExecution = (AnalyticsQueryExecution) o;
    return Objects.equals(this.account, analyticsQueryExecution.account) &&
        Objects.equals(this.errorMessage, analyticsQueryExecution.errorMessage) &&
        Objects.equals(this.externalId, analyticsQueryExecution.externalId) &&
        Objects.equals(this.failureReason, analyticsQueryExecution.failureReason) &&
        Objects.equals(this.id, analyticsQueryExecution.id) &&
        Objects.equals(this.processingEndTime, analyticsQueryExecution.processingEndTime) &&
        Objects.equals(this.processingStartTime, analyticsQueryExecution.processingStartTime) &&
        Objects.equals(this.queryString, analyticsQueryExecution.queryString) &&
        Objects.equals(this.scannedDataInGb, analyticsQueryExecution.scannedDataInGb) &&
        Objects.equals(this.scannedDataLimit, analyticsQueryExecution.scannedDataLimit) &&
        Objects.equals(this.spaces, analyticsQueryExecution.spaces) &&
        Objects.equals(this.state, analyticsQueryExecution.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, errorMessage, externalId, failureReason, id, processingEndTime, processingStartTime, queryString, scannedDataInGb, scannedDataLimit, spaces, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryExecution {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processingEndTime: ").append(toIndentedString(processingEndTime)).append("\n");
    sb.append("    processingStartTime: ").append(toIndentedString(processingStartTime)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    scannedDataInGb: ").append(toIndentedString(scannedDataInGb)).append("\n");
    sb.append("    scannedDataLimit: ").append(toIndentedString(scannedDataLimit)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

