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

public class InternalTransferBankTransaction {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("sourceBankTransaction")
  protected BankTransaction sourceBankTransaction = null;

  
  @JsonProperty("targetBankTransaction")
  protected BankTransaction targetBankTransaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
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
   * 
   * @return sourceBankTransaction
  **/
  @ApiModelProperty(value = "")
  public BankTransaction getSourceBankTransaction() {
    return sourceBankTransaction;
  }

  
   /**
   * 
   * @return targetBankTransaction
  **/
  @ApiModelProperty(value = "")
  public BankTransaction getTargetBankTransaction() {
    return targetBankTransaction;
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
    InternalTransferBankTransaction internalTransferBankTransaction = (InternalTransferBankTransaction) o;
    return Objects.equals(this.id, internalTransferBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, internalTransferBankTransaction.linkedSpaceId) &&
        Objects.equals(this.sourceBankTransaction, internalTransferBankTransaction.sourceBankTransaction) &&
        Objects.equals(this.targetBankTransaction, internalTransferBankTransaction.targetBankTransaction) &&
        Objects.equals(this.version, internalTransferBankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, sourceBankTransaction, targetBankTransaction, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransferBankTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    sourceBankTransaction: ").append(toIndentedString(sourceBankTransaction)).append("\n");
    sb.append("    targetBankTransaction: ").append(toIndentedString(targetBankTransaction)).append("\n");
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

