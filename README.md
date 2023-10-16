[![Build Status](https://travis-ci.org/pfpayments/java-sdk.svg?branch=master)](https://travis-ci.org/pfpayments/java-sdk)

# PostFinance Checkout Java Library

The PostFinance Checkout Java library wraps around the PostFinance Checkout API. This library facilitates your interaction with various services such as transactions, accounts, and subscriptions.


## Documentation

[PostFinance Checkout Web Service API](https://checkout.postfinance.ch/doc/api/web-service)

## Requirements

- Java 1.8+

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ch.postfinance</groupId>
    <artifactId>postfinancecheckout-java-sdk</artifactId>
    <version>6.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ch.postfinance:postfinancecheckout-java-sdk:6.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/postfinancecheckout-java-sdk-6.1.0.jar`
* `target/lib/*.jar`

## Usage
The library needs to be configured with your account's space id, user id, and secret key which are available in your [PostFinance Checkout
account dashboard](https://checkout.postfinance.ch/account/select). Set `space_id`, `user_id`, and `api_secret` to their values.

### Configuring a Service

```java
package ch.postfinance.sdk.example;

import ch.postfinance.sdk.ApiClient;
import ch.postfinance.sdk.service.TransactionService;

public class Example {

    public static void main(String[] args) {

        // Credentials
        Long userId = 512L;
        String secret = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
        
        // API Client
        ApiClient apiClient = new ApiClient(userId, secret);

        //Setup a custom connection timeout if needed. (Default value is: 25 seconds)
        apiClient.setReadTimeOut(20);

        // Create an API service instance:
        TransactionService transactionService = apiClient.getTransactionService();

        // ... use the transactionService to make API calls ...
        
    }
}
```

To get started with sending transactions, please review the example below:

```java
package ch.postfinance.sdk.test;

import java.io.IOException;
import java.math.BigDecimal;

import ch.postfinance.sdk.ApiClient;
import ch.postfinance.sdk.model.*;

/**
 * 
 */
public class TransactionPaymentPageExample {

	public static void main(String[] args) throws IOException {

	    // Credentials
        Long spaceId = 405L;
        Long applicationUserId = 512L;
        String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

	    // API Client
	    ApiClient apiClient = new ApiClient(applicationUserId, authenticationKey);

        // Line item
        LineItemCreate lineItem = new LineItemCreate();
        lineItem.name("Red T-Shirt")
                .uniqueId("5412")
                .type(LineItemType.PRODUCT)
                .quantity(BigDecimal.valueOf(1))
                .amountIncludingTax(BigDecimal.valueOf(29.95))
                .sku("red-t-shirt-123");

        // Customer Billing Address
        AddressCreate billingAddress = new AddressCreate();
        billingAddress.city("Winterthur")
                .country("CH")
                .emailAddress("test@example.com")
                .familyName("Customer")
                .givenName("Good")
                .postcode("8400")
                .postalState("ZH")
                .organizationName("Test GmbH")
                .mobilePhoneNumber("+41791234567")
                .salutation("Ms");

	    // Transaction Create Request
	    TransactionCreate request = new TransactionCreate();
        request.autoConfirmationEnabled(true).currency("CHF").language("en-US");
        request.setBillingAddress(billingAddress);
        request.setShippingAddress(billingAddress);
        request.addLineItemsItem(lineItem);
        
        // Create Transaction
        Transaction transaction = apiClient.getTransactionService().create(spaceId, request);
        
        // Build the payment page URL to which the user should be redirected when the payment page should be used:
        String paymentPageUrl = apiClient.getTransactionPaymentPageService().paymentPageUrl(spaceId, transaction.getId());
        System.out.println("Payment Page URL: " + paymentPageUrl);
        
        // The above statement should print something like:
        //
        //   Payment Page URL: https://app-wallee.com/s/405/payment/transaction/pay/[transaction ID]?securityToken=[some token]
        //
	}

}

```
## Recommendation

It is recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License

Please see the [license file](https://github.com/pfpayments/java-sdk/blob/master/LICENSE) for more information.
