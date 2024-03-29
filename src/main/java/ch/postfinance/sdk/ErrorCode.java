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


package ch.postfinance.sdk;

/**
 * The error code represents a potential error which may be thrown by Wallee SDK.
 *
 */
public enum ErrorCode {

    ENTITY_NOT_FOUND(0, "Entity not found"),
    WEBHOOK_ENCRYPTION_GENERAL_ERROR(100, "General webhook encryption error"),
    WEBHOOK_ENCRYPTION_SIGNATURE_HEADER_INVALID(101, "Invalid webhook signature header"),
    WEBHOOK_ENCRYPTION_PUBLIC_KEY_INVALID(102, "Invalid webhook signature public key"),
    WEBHOOK_ENCRYPTION_PUBLIC_KEY_UNKNOWN(103, "Unknown webhook signature public key"),
    WEBHOOK_ENCRYPTION_UNKNOWN_PROVIDER(104, "Unknown webhook signature encryption provider"),
    WEBHOOK_ENCRYPTION_UNKNOWN_ALGORITHM(105, "Unknown webhook signature encryption algorithm")
    ;

    private final int code;
    private final String description;

    private ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}