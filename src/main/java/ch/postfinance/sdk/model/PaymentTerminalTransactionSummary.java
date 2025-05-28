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
import ch.postfinance.sdk.model.PaymentTerminalDccTransactionSum;
import ch.postfinance.sdk.model.PaymentTerminalTransactionSum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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

public class PaymentTerminalTransactionSummary {
  
  @JsonProperty("balanceAmountPerCurrency")
  protected Map<String, BigDecimal> balanceAmountPerCurrency = null;

  
  @JsonProperty("dccTransactionSums")
  protected List<PaymentTerminalDccTransactionSum> dccTransactionSums = null;

  
  @JsonProperty("endedOn")
  protected OffsetDateTime endedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("numberOfTransactions")
  protected Integer numberOfTransactions = null;

  
  @JsonProperty("paymentTerminal")
  protected Long paymentTerminal = null;

  
  @JsonProperty("receipt")
  protected String receipt = null;

  
  @JsonProperty("reference")
  protected Long reference = null;

  
  @JsonProperty("startedOn")
  protected OffsetDateTime startedOn = null;

  
  @JsonProperty("transactionSums")
  protected List<PaymentTerminalTransactionSum> transactionSums = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The transactions amount per currency.
   * @return balanceAmountPerCurrency
  **/
  @ApiModelProperty(value = "The transactions amount per currency.")
  public Map<String, BigDecimal> getBalanceAmountPerCurrency() {
    return balanceAmountPerCurrency;
  }

  
   /**
   * 
   * @return dccTransactionSums
  **/
  @ApiModelProperty(value = "")
  public List<PaymentTerminalDccTransactionSum> getDccTransactionSums() {
    return dccTransactionSums;
  }

  
   /**
   * 
   * @return endedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndedOn() {
    return endedOn;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return numberOfTransactions
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfTransactions() {
    return numberOfTransactions;
  }

  
   /**
   * The payment terminal of the transaction summary.
   * @return paymentTerminal
  **/
  @ApiModelProperty(value = "The payment terminal of the transaction summary.")
  public Long getPaymentTerminal() {
    return paymentTerminal;
  }

  
   /**
   * 
   * @return receipt
  **/
  @ApiModelProperty(value = "")
  public String getReceipt() {
    return receipt;
  }

  
   /**
   * 
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public Long getReference() {
    return reference;
  }

  
   /**
   * 
   * @return startedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartedOn() {
    return startedOn;
  }

  
   /**
   * 
   * @return transactionSums
  **/
  @ApiModelProperty(value = "")
  public List<PaymentTerminalTransactionSum> getTransactionSums() {
    return transactionSums;
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
    PaymentTerminalTransactionSummary paymentTerminalTransactionSummary = (PaymentTerminalTransactionSummary) o;
    return Objects.equals(this.balanceAmountPerCurrency, paymentTerminalTransactionSummary.balanceAmountPerCurrency) &&
        Objects.equals(this.dccTransactionSums, paymentTerminalTransactionSummary.dccTransactionSums) &&
        Objects.equals(this.endedOn, paymentTerminalTransactionSummary.endedOn) &&
        Objects.equals(this.id, paymentTerminalTransactionSummary.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalTransactionSummary.linkedSpaceId) &&
        Objects.equals(this.numberOfTransactions, paymentTerminalTransactionSummary.numberOfTransactions) &&
        Objects.equals(this.paymentTerminal, paymentTerminalTransactionSummary.paymentTerminal) &&
        Objects.equals(this.receipt, paymentTerminalTransactionSummary.receipt) &&
        Objects.equals(this.reference, paymentTerminalTransactionSummary.reference) &&
        Objects.equals(this.startedOn, paymentTerminalTransactionSummary.startedOn) &&
        Objects.equals(this.transactionSums, paymentTerminalTransactionSummary.transactionSums) &&
        Objects.equals(this.version, paymentTerminalTransactionSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAmountPerCurrency, dccTransactionSums, endedOn, id, linkedSpaceId, numberOfTransactions, paymentTerminal, receipt, reference, startedOn, transactionSums, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionSummary {\n");
    
    sb.append("    balanceAmountPerCurrency: ").append(toIndentedString(balanceAmountPerCurrency)).append("\n");
    sb.append("    dccTransactionSums: ").append(toIndentedString(dccTransactionSums)).append("\n");
    sb.append("    endedOn: ").append(toIndentedString(endedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
    sb.append("    paymentTerminal: ").append(toIndentedString(paymentTerminal)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    transactionSums: ").append(toIndentedString(transactionSums)).append("\n");
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

