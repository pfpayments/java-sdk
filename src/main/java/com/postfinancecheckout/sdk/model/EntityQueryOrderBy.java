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
import com.postfinancecheckout.sdk.model.EntityQueryOrderByType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The &#39;order by&#39; allows to order the returned entities.
 */
public class EntityQueryOrderBy {
  
  @SerializedName("fieldName")
  protected String fieldName = null;

  
  @SerializedName("sorting")
  protected EntityQueryOrderByType sorting = null;

  
  
  public EntityQueryOrderBy fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 
   * @return fieldName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  
  public EntityQueryOrderBy sorting(EntityQueryOrderByType sorting) {
    this.sorting = sorting;
    return this;
  }

   /**
   * 
   * @return sorting
  **/
  @ApiModelProperty(required = true, value = "")
  public EntityQueryOrderByType getSorting() {
    return sorting;
  }

  public void setSorting(EntityQueryOrderByType sorting) {
    this.sorting = sorting;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityQueryOrderBy entityQueryOrderBy = (EntityQueryOrderBy) o;
    return Objects.equals(this.fieldName, entityQueryOrderBy.fieldName) &&
        Objects.equals(this.sorting, entityQueryOrderBy.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, sorting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityQueryOrderBy {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

