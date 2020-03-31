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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.util.*;
import java.time.OffsetDateTime;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(TransactionInvoiceState.Adapter.class)
public enum TransactionInvoiceState {
  
  CREATE("CREATE"),
  
  OPEN("OPEN"),
  
  OVERDUE("OVERDUE"),
  
  CANCELED("CANCELED"),
  
  PAID("PAID"),
  
  DERECOGNIZED("DERECOGNIZED"),
  
  NOT_APPLICABLE("NOT_APPLICABLE");

  private String value;

  TransactionInvoiceState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionInvoiceState fromValue(String text) {
    for (TransactionInvoiceState b : TransactionInvoiceState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TransactionInvoiceState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionInvoiceState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionInvoiceState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionInvoiceState.fromValue(String.valueOf(value));
    }
  }
}

