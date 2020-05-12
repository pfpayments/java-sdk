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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.postfinancecheckout.sdk.model.CriteriaOperator;
import com.postfinancecheckout.sdk.model.EntityQueryFilter;
import com.postfinancecheckout.sdk.model.EntityQueryFilterType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The query filter allows to restrict the entities which are returned.
 */
@ApiModel(description = "The query filter allows to restrict the entities which are returned.")

public class EntityQueryFilter {
  
  @JsonProperty("children")
  protected List<EntityQueryFilter> children = null;

  
  @JsonProperty("fieldName")
  protected String fieldName = null;

  
  @JsonProperty("operator")
  protected CriteriaOperator operator = null;

  
  @JsonProperty("type")
  protected EntityQueryFilterType type = null;

  
  @JsonProperty("value")
  protected Object value = null;

  
  
  public EntityQueryFilter children(List<EntityQueryFilter> children) {
    this.children = children;
    return this;
  }

  public EntityQueryFilter addChildrenItem(EntityQueryFilter childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * The &#39;children&#39; can contain other filter nodes which are applied to the query. This property is only applicable on filter types &#39;OR&#39; and &#39;AND&#39;.
   * @return children
  **/
  @ApiModelProperty(value = "The 'children' can contain other filter nodes which are applied to the query. This property is only applicable on filter types 'OR' and 'AND'.")
  public List<EntityQueryFilter> getChildren() {
    return children;
  }

  public void setChildren(List<EntityQueryFilter> children) {
    this.children = children;
  }

  
  public EntityQueryFilter fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The &#39;fieldName&#39; indicates the property on the entity which should be filtered. This property is only applicable on filter type &#39;LEAF&#39;.
   * @return fieldName
  **/
  @ApiModelProperty(value = "The 'fieldName' indicates the property on the entity which should be filtered. This property is only applicable on filter type 'LEAF'.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  
  public EntityQueryFilter operator(CriteriaOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The &#39;operator&#39; indicates what kind of filtering on the &#39;fieldName&#39; is executed on. This property is only applicable on filter type &#39;LEAF&#39;.
   * @return operator
  **/
  @ApiModelProperty(value = "The 'operator' indicates what kind of filtering on the 'fieldName' is executed on. This property is only applicable on filter type 'LEAF'.")
  public CriteriaOperator getOperator() {
    return operator;
  }

  public void setOperator(CriteriaOperator operator) {
    this.operator = operator;
  }

  
  public EntityQueryFilter type(EntityQueryFilterType type) {
    this.type = type;
    return this;
  }

   /**
   * The filter type controls how the query node is interpreted. I.e. if the node acts as leaf node or as a filter group.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The filter type controls how the query node is interpreted. I.e. if the node acts as leaf node or as a filter group.")
  public EntityQueryFilterType getType() {
    return type;
  }

  public void setType(EntityQueryFilterType type) {
    this.type = type;
  }

  
  public EntityQueryFilter value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The &#39;value&#39; is used to compare with the &#39;fieldName&#39; as defined by the &#39;operator&#39;. This property is only applicable on filter type &#39;LEAF&#39;.
   * @return value
  **/
  @ApiModelProperty(value = "The 'value' is used to compare with the 'fieldName' as defined by the 'operator'. This property is only applicable on filter type 'LEAF'.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityQueryFilter entityQueryFilter = (EntityQueryFilter) o;
    return Objects.equals(this.children, entityQueryFilter.children) &&
        Objects.equals(this.fieldName, entityQueryFilter.fieldName) &&
        Objects.equals(this.operator, entityQueryFilter.operator) &&
        Objects.equals(this.type, entityQueryFilter.type) &&
        Objects.equals(this.value, entityQueryFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, fieldName, operator, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityQueryFilter {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

