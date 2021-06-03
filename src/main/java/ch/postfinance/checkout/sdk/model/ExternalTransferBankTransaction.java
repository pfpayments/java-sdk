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


package ch.postfinance.checkout.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import ch.postfinance.checkout.sdk.model.BankTransaction;
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

public class ExternalTransferBankTransaction {
  
  @JsonProperty("bankTransaction")
  protected BankTransaction bankTransaction = null;

  
  @JsonProperty("externalAccountIdentifier")
  protected String externalAccountIdentifier = null;

  
  @JsonProperty("externalAccountType")
  protected String externalAccountType = null;

  
  @JsonProperty("externalBankName")
  protected String externalBankName = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
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
   * @return externalAccountIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getExternalAccountIdentifier() {
    return externalAccountIdentifier;
  }

  
   /**
   * 
   * @return externalAccountType
  **/
  @ApiModelProperty(value = "")
  public String getExternalAccountType() {
    return externalAccountType;
  }

  
   /**
   * 
   * @return externalBankName
  **/
  @ApiModelProperty(value = "")
  public String getExternalBankName() {
    return externalBankName;
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
    ExternalTransferBankTransaction externalTransferBankTransaction = (ExternalTransferBankTransaction) o;
    return Objects.equals(this.bankTransaction, externalTransferBankTransaction.bankTransaction) &&
        Objects.equals(this.externalAccountIdentifier, externalTransferBankTransaction.externalAccountIdentifier) &&
        Objects.equals(this.externalAccountType, externalTransferBankTransaction.externalAccountType) &&
        Objects.equals(this.externalBankName, externalTransferBankTransaction.externalBankName) &&
        Objects.equals(this.id, externalTransferBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, externalTransferBankTransaction.linkedSpaceId) &&
        Objects.equals(this.version, externalTransferBankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransaction, externalAccountIdentifier, externalAccountType, externalBankName, id, linkedSpaceId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTransferBankTransaction {\n");
    
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    externalAccountIdentifier: ").append(toIndentedString(externalAccountIdentifier)).append("\n");
    sb.append("    externalAccountType: ").append(toIndentedString(externalAccountType)).append("\n");
    sb.append("    externalBankName: ").append(toIndentedString(externalBankName)).append("\n");
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

