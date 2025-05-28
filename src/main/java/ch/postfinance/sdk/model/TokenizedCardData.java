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
import ch.postfinance.sdk.model.CardCryptogram;
import ch.postfinance.sdk.model.RecurringIndicator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TokenizedCardData {
  
  @JsonProperty("cryptogram")
  protected CardCryptogram cryptogram = null;

  
  @JsonProperty("initialRecurringTransaction")
  protected Boolean initialRecurringTransaction = null;

  
  @JsonProperty("recurringIndicator")
  protected RecurringIndicator recurringIndicator = null;

  
  @JsonProperty("tokenRequestorId")
  protected String tokenRequestorId = null;

  
  
   /**
   * An additional authentication value that enhances the security of tokenized card transactions.
   * @return cryptogram
  **/
  @ApiModelProperty(value = "An additional authentication value that enhances the security of tokenized card transactions.")
  public CardCryptogram getCryptogram() {
    return cryptogram;
  }

  
   /**
   * Whether the transaction is an initial recurring transaction, based on the recurring indicator. This is used to identify the first transaction in a recurring payment setup.
   * @return initialRecurringTransaction
  **/
  @ApiModelProperty(value = "Whether the transaction is an initial recurring transaction, based on the recurring indicator. This is used to identify the first transaction in a recurring payment setup.")
  public Boolean isInitialRecurringTransaction() {
    return initialRecurringTransaction;
  }

  
   /**
   * The indicator used to distinguish between recurring and one-time transactions. If omitted, it will be automatically determined based on the transaction&#39;s properties.
   * @return recurringIndicator
  **/
  @ApiModelProperty(value = "The indicator used to distinguish between recurring and one-time transactions. If omitted, it will be automatically determined based on the transaction's properties.")
  public RecurringIndicator getRecurringIndicator() {
    return recurringIndicator;
  }

  
   /**
   * The token requestor identifier (TRID) identifies the entity requesting tokenization for a card transaction.
   * @return tokenRequestorId
  **/
  @ApiModelProperty(value = "The token requestor identifier (TRID) identifies the entity requesting tokenization for a card transaction.")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizedCardData tokenizedCardData = (TokenizedCardData) o;
    return Objects.equals(this.cryptogram, tokenizedCardData.cryptogram) &&
        Objects.equals(this.initialRecurringTransaction, tokenizedCardData.initialRecurringTransaction) &&
        Objects.equals(this.recurringIndicator, tokenizedCardData.recurringIndicator) &&
        Objects.equals(this.tokenRequestorId, tokenizedCardData.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptogram, initialRecurringTransaction, recurringIndicator, tokenRequestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizedCardData {\n");
    
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    initialRecurringTransaction: ").append(toIndentedString(initialRecurringTransaction)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
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

