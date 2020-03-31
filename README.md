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
    <groupId>com.postfinancecheckout</groupId>
    <artifactId>postfinancecheckout-java-sdk</artifactId>
    <version>2.0.11</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.postfinancecheckout:postfinancecheckout-java-sdk:2.0.11"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/postfinancecheckout-java-sdk-2.0.11.jar`
* `target/lib/*.jar`

## Usage
The library needs to be configured with your account's space id, user id, and secret key which are available in your [PostFinance Checkout
account dashboard](https://checkout.postfinance.ch/account/select). Set `space_id`, `user_id`, and `api_secret` to their values.

### Configuring a Service

```java
package com.postfinancecheckout.sdk.example;

import com.postfinancecheckout.sdk.ApiClient;
import com.postfinancecheckout.sdk.service.TransactionService;

public class Example {

    public static void main(String[] args) {

        // API Configuration.
        long spaceId = (Long) 405;
        long userId = (Long) 512;
        String secret = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
        ApiClient apiClient = new ApiClient(userId, secret);

        // Create API service instance.
        TransactionService transactionService = new TransactionService(apiClient);

    }
}
```

To get started with sending transactions, please review the example below:

```java
package com.postfinancecheckout.sdk.example;

import com.postfinancecheckout.sdk.ApiClient;
import com.postfinancecheckout.sdk.ApiException;
import com.postfinancecheckout.sdk.ApiResponse;
import com.postfinancecheckout.sdk.service.TransactionPaymentPageService;
import com.postfinancecheckout.sdk.service.TransactionService;
import com.postfinancecheckout.sdk.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class TransactionPaymentPageServiceTest {
    private TransactionService transactionService;
    private TransactionCreate transactionCreate;
    private Long spaceId;
    private Long applicationUserId;
    private String authenticationKey;
    private ApiClient apiClient;
    private ApiResponse<Transaction> transaction;

    @Before
    public void setup() {
        this.applicationUserId = (long) 512;
        this.spaceId = (long) 405;
        this.authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
        this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        this.transactionService = new TransactionService(this.apiClient);
        this.createTransaction();
    }

    private void createTransaction() {

        AddressCreate billingAddress = new AddressCreate()
        .salutation("Ms")
        .givenName("Good")
        .familyName("Customer")
        .gender(Gender.FEMALE)
        .country("CH")
        .city("Winterthur")
        .postcode("8400")
        .dateOfBirth(LocalDate.of(1991, 1, 11))
        .organizationName("Test GmbH")
        .mobilePhoneNumber("+41791234567")
        .emailAddress("test@wallee.com");

        AddressCreate shippingAddress = new AddressCreate()
        .salutation("Ms")
        .givenName("Good")
        .familyName("Customer")
        .gender(Gender.FEMALE)
        .country("CH")
        .city("Winterthur")
        .postcode("8400")
        .dateOfBirth(LocalDate.of(1991, 1, 11))
        .organizationName("Test GmbH")
        .mobilePhoneNumber("+41791234567")
        .emailAddress("test@wallee.com");

        LineItemCreate lineItem1 = new LineItemCreate()
        .sku("item-1")
        .name("Item 1")
        .uniqueId("unique-id-item-1")
        .type(LineItemType.PRODUCT)
        .quantity(BigDecimal.ONE)
        .shippingRequired(true)
        .amountIncludingTax(new BigDecimal("67.47"))
        .addTaxesItem(
            new TaxCreate().title("VAT").rate(new BigDecimal(8))
        );

        LineItemCreate lineItem2 = new LineItemCreate()
        .sku("test-shipping")
        .name("Shipping")
        .uniqueId("unique-id-test-shipping")
        .type(LineItemType.SHIPPING)
        .quantity(BigDecimal.ONE)
        .amountIncludingTax(new BigDecimal("3.12"))
        .addTaxesItem(
            new TaxCreate().title("VAT").rate(new BigDecimal(8))
        );

        this.transactionCreate = new TransactionCreate();
        this.transactionCreate.customerEmailAddress("test@wallee.com");
        this.transactionCreate.customerId("cutomer-x");
        this.transactionCreate.merchantReference(UUID.randomUUID().toString());
        this.transactionCreate.invoiceMerchantReference("order-1");
        this.transactionCreate.successUrl("http://localhost/success?orderId=1");
        this.transactionCreate.failedUrl("http://localhost/failed?orderId=1");
        this.transactionCreate.shippingMethod("Test Shipping");
        this.transactionCreate.chargeRetryEnabled(false);
        this.transactionCreate.allowedPaymentMethodConfigurations(Arrays.asList(8656l));
        this.transactionCreate.language("en-US");
        this.transactionCreate.currency("CHF");
        this.transactionCreate.billingAddress(billingAddress);
        this.transactionCreate.shippingAddress(shippingAddress);
        this.transactionCreate.addLineItemsItem(lineItem1);
        this.transactionCreate.addLineItemsItem(lineItem2);
        try {
            this.transaction = this.transactionService.createWithHttpInfo(
                this.spaceId,
                this.transactionCreate
            );
        } catch (ApiException e) {
            Assert.fail("Failed to create transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    @Test
    public void testPaymentPageUrl() {

        TransactionPaymentPageService transactionPaymentPageService = new TransactionPaymentPageService(this.apiClient);
        String paymentPageUrl     = null;
        try {
            paymentPageUrl = transactionPaymentPageService.paymentPageUrl(this.spaceId, this.transaction.getData().getId());
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(paymentPageUrl);
        Assert.assertTrue(paymentPageUrl.contains("http"));
    }
}

```
## Recommendation

It is recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License

Please see the [license file](https://github.com/pfpayments/java-sdk/blob/master/LICENSE) for more information.
