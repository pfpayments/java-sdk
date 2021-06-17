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
import ch.postfinance.sdk.model.BankTransaction;
import ch.postfinance.sdk.model.LineItem;
import ch.postfinance.sdk.model.Refund;
import ch.postfinance.sdk.model.TransactionAwareEntity;
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

public class RefundRecoveryBankTransaction extends TransactionAwareEntity {
  
  @JsonProperty("bankTransaction")
  protected BankTransaction bankTransaction = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("refund")
  protected Refund refund = null;

  
  @JsonProperty("refundCurrencyAmount")
  protected BigDecimal refundCurrencyAmount = null;

  
  @JsonProperty("refundCurrencyValueAmount")
  protected BigDecimal refundCurrencyValueAmount = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return bankTransaction
  **/
  @ApiModelProperty(value = "")
  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }

  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The line items contain the items which could be recovered.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items contain the items which could be recovered.")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  
   /**
   * 
   * @return refund
  **/
  @ApiModelProperty(value = "")
  public Refund getRefund() {
    return refund;
  }

  
   /**
   * Specify the posting amount in the refund&#39;s currency.
   * @return refundCurrencyAmount
  **/
  @ApiModelProperty(value = "Specify the posting amount in the refund's currency.")
  public BigDecimal getRefundCurrencyAmount() {
    return refundCurrencyAmount;
  }

  
   /**
   * 
   * @return refundCurrencyValueAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRefundCurrencyValueAmount() {
    return refundCurrencyValueAmount;
  }

  
   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
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
    RefundRecoveryBankTransaction refundRecoveryBankTransaction = (RefundRecoveryBankTransaction) o;
    return Objects.equals(this.id, refundRecoveryBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, refundRecoveryBankTransaction.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, refundRecoveryBankTransaction.linkedTransaction) &&
        Objects.equals(this.bankTransaction, refundRecoveryBankTransaction.bankTransaction) &&
        Objects.equals(this.language, refundRecoveryBankTransaction.language) &&
        Objects.equals(this.lineItems, refundRecoveryBankTransaction.lineItems) &&
        Objects.equals(this.refund, refundRecoveryBankTransaction.refund) &&
        Objects.equals(this.refundCurrencyAmount, refundRecoveryBankTransaction.refundCurrencyAmount) &&
        Objects.equals(this.refundCurrencyValueAmount, refundRecoveryBankTransaction.refundCurrencyValueAmount) &&
        Objects.equals(this.spaceViewId, refundRecoveryBankTransaction.spaceViewId) &&
        Objects.equals(this.version, refundRecoveryBankTransaction.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, bankTransaction, language, lineItems, refund, refundCurrencyAmount, refundCurrencyValueAmount, spaceViewId, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRecoveryBankTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    refundCurrencyAmount: ").append(toIndentedString(refundCurrencyAmount)).append("\n");
    sb.append("    refundCurrencyValueAmount: ").append(toIndentedString(refundCurrencyValueAmount)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
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

