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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class TransactionInvoiceComment {
  
  @SerializedName("content")
  protected String content = null;

  
  @SerializedName("createdBy")
  protected Long createdBy = null;

  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("editedBy")
  protected Long editedBy = null;

  
  @SerializedName("editedOn")
  protected OffsetDateTime editedOn = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("pinned")
  protected Boolean pinned = null;

  
  @SerializedName("transactionInvoice")
  protected Long transactionInvoice = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
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
   * @return editedBy
  **/
  @ApiModelProperty(value = "")
  public Long getEditedBy() {
    return editedBy;
  }

  
   /**
   * The date on which the comment was last edited.
   * @return editedOn
  **/
  @ApiModelProperty(value = "The date on which the comment was last edited.")
  public OffsetDateTime getEditedOn() {
    return editedOn;
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
   * 
   * @return pinned
  **/
  @ApiModelProperty(value = "")
  public Boolean isPinned() {
    return pinned;
  }

  
   /**
   * 
   * @return transactionInvoice
  **/
  @ApiModelProperty(value = "")
  public Long getTransactionInvoice() {
    return transactionInvoice;
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
    TransactionInvoiceComment transactionInvoiceComment = (TransactionInvoiceComment) o;
    return Objects.equals(this.content, transactionInvoiceComment.content) &&
        Objects.equals(this.createdBy, transactionInvoiceComment.createdBy) &&
        Objects.equals(this.createdOn, transactionInvoiceComment.createdOn) &&
        Objects.equals(this.editedBy, transactionInvoiceComment.editedBy) &&
        Objects.equals(this.editedOn, transactionInvoiceComment.editedOn) &&
        Objects.equals(this.id, transactionInvoiceComment.id) &&
        Objects.equals(this.linkedSpaceId, transactionInvoiceComment.linkedSpaceId) &&
        Objects.equals(this.pinned, transactionInvoiceComment.pinned) &&
        Objects.equals(this.transactionInvoice, transactionInvoiceComment.transactionInvoice) &&
        Objects.equals(this.version, transactionInvoiceComment.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, createdBy, createdOn, editedBy, editedOn, id, linkedSpaceId, pinned, transactionInvoice, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoiceComment {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    editedBy: ").append(toIndentedString(editedBy)).append("\n");
    sb.append("    editedOn: ").append(toIndentedString(editedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    transactionInvoice: ").append(toIndentedString(transactionInvoice)).append("\n");
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

