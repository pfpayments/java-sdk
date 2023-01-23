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
 * Exception thrown when the PostFinanceCheckout SDK API call results in an invalid response.
 */
public class PostFinanceCheckoutSdkException extends RuntimeException {

    private static final long serialVersionUID = 1675383192982547616L;

	/**
	 * Constructor.
	 *
	 * @param errorCode
	 *            the PostFinanceCheckout SDK error code
	 * @param message
	 *            the exception message details
	 */
    public PostFinanceCheckoutSdkException(ErrorCode errorCode, String message) {
        super(String.format("Error code: %d. %s", errorCode.getCode(), message));
    }

}