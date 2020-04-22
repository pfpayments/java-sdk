package com.postfinancecheckout.sdk.test;

import com.postfinancecheckout.sdk.ApiClient;
import com.postfinancecheckout.sdk.model.*;
import com.postfinancecheckout.sdk.service.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * API tests for TransactionLightboxService
 */
public class TransactionLightboxServiceTest {

    // Credentials
    private Long spaceId = (long) 405;
    private Long applicationUserId = (long) 512;
    private String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

    // Services
    private ApiClient apiClient;
    private TransactionLightboxService transactionLightboxService;
    private TransactionService transactionService;

    // Models
    private TransactionCreate transactionPayload;

    @Before
    public void setup() {
        if (this.apiClient == null) {
            this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        }
        if (this.transactionLightboxService == null) {
            this.transactionLightboxService = new TransactionLightboxService(this.apiClient);
        }
        if (this.transactionService == null) {
            this.transactionService = new TransactionService(this.apiClient);
        }
    }

    /**
     * Get transaction payload
     *
     * @return TransactionCreate
     */
    private TransactionCreate getTransactionPayload() {
        if (this.transactionPayload == null) {
            // Line item
            LineItemCreate lineItem = new LineItemCreate();
            lineItem.name("Red T-Shirt")
                    .uniqueId("5412")
                    .type(LineItemType.PRODUCT)
                    .quantity(BigDecimal.valueOf(1))
                    .amountIncludingTax(BigDecimal.valueOf(29.95))
                    .sku("red-t-shirt-123");

            // Customer Billind Address
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

            this.transactionPayload = new TransactionCreate();
            this.transactionPayload.autoConfirmationEnabled(true).currency("CHF").language("en-US");
            this.transactionPayload.setBillingAddress(billingAddress);
            this.transactionPayload.setShippingAddress(billingAddress);
            this.transactionPayload.addLineItemsItem(lineItem);
        }
        return this.transactionPayload;
    }

    /**
     * Build JavaScript URL
     * <p>
     * This operation creates the URL which can be used to embed the JavaScript for handling the Lightbox checkout flow.
     */
    @Test
    public void javascriptUrlTest() {
        try {
            Transaction transaction = this.transactionService.create(this.spaceId, this.getTransactionPayload());
            String javascriptUrl = this.transactionLightboxService.javascriptUrl(spaceId, transaction.getId());
            Assert.assertTrue(javascriptUrl.contains("https://"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
