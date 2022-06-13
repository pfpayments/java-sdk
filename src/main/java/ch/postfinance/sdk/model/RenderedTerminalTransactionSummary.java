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
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class RenderedTerminalTransactionSummary {
  
  @JsonProperty("data")
  protected byte[] data = null;

  
  @JsonProperty("mimeType")
  protected String mimeType = null;

  
  
  public RenderedTerminalTransactionSummary data(byte[] data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  
   /**
   * The mime type indicates the format of the receipt document. The mime type depends on the requested receipt format.
   * @return mimeType
  **/
  @ApiModelProperty(value = "The mime type indicates the format of the receipt document. The mime type depends on the requested receipt format.")
  public String getMimeType() {
    return mimeType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderedTerminalTransactionSummary renderedTerminalTransactionSummary = (RenderedTerminalTransactionSummary) o;
    return Arrays.equals(this.data, renderedTerminalTransactionSummary.data) &&
        Objects.equals(this.mimeType, renderedTerminalTransactionSummary.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(data), mimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderedTerminalTransactionSummary {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

