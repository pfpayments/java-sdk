/**
 * PostFinance Java SDK
 *
 * This library allows to interact with the PostFinance payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://www.postfinance.ch/en/private.html
 * Developer email: ecosystem-team@wallee.com
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
package ch.postfinancecheckout.sdk.service;

import ch.postfinancecheckout.sdk.ApiClient;
import ch.postfinancecheckout.sdk.ApiException;
import ch.postfinancecheckout.sdk.model.Refund;
import ch.postfinancecheckout.sdk.model.RefundCreate;
import ch.postfinancecheckout.sdk.model.RefundState;
import ch.postfinancecheckout.sdk.model.RefundType;
import ch.postfinancecheckout.sdk.model.Transaction;
import ch.postfinancecheckout.sdk.model.TransactionCompletion;
import ch.postfinancecheckout.sdk.model.TransactionCompletionState;
import ch.postfinancecheckout.sdk.model.TransactionCreate;
import ch.postfinancecheckout.sdk.model.TransactionState;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

import static ch.postfinancecheckout.sdk.service.TestConstants.MOCK_CARD_DATA;
import static ch.postfinancecheckout.sdk.service.TestConstants.SPACE_ID;
import static ch.postfinancecheckout.sdk.service.TestUtils.getApiClient;
import static ch.postfinancecheckout.sdk.service.TestUtils.getTransactionCreatePayload;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Refunds service tests
 */
public class RefundTest {
  public static final Set<String> EMPTY_EXPAND = Collections.emptySet();
  public static RefundsService refundsService;
  public static TransactionsService transactionsService;

  @BeforeAll
  static void setUp() {
    ApiClient apiClient = getApiClient();
    refundsService = new RefundsService(apiClient);
    transactionsService = new TransactionsService(apiClient);
  }

  /**
   * Refund of fulfilled transaction should be created successfully
   */
  @Test
  public void refundOfCompletedTransactionShouldWork() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion transactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOffline(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      transactionCompletion.getState(),
      "Transaction completion state must be SUCCESSFUL");

    Transaction readTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FULFILL, readTransaction.getState(), "Transaction state must be FULFILL");

    RefundCreate refundCreate = getRefundCreate(transaction);

    Refund refund = refundsService.postPaymentRefunds(SPACE_ID, refundCreate, EMPTY_EXPAND);

    assertEquals(RefundState.SUCCESSFUL, refund.getState(), "Refund state must be SUCCESSFUL");
  }

  /**
   * Refund read should return valid data
   */
  @Test
  public void readShouldReturnRefundData() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion transactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOffline(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      transactionCompletion.getState(),
      "Transaction completion state must be SUCCESSFUL");

    Transaction readTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    RefundCreate refundCreate = getRefundCreate(transaction);

    Refund refund = refundsService.postPaymentRefunds(SPACE_ID, refundCreate, EMPTY_EXPAND);

    assertEquals(RefundState.SUCCESSFUL, refund.getState(), "Refund state must be SUCCESSFUL");

    Refund readRefund = refundsService.getPaymentRefundsId(refund.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(refund.getId(), readRefund.getId(), "Refund ids should match");
  }

  private static RefundCreate getRefundCreate(Transaction transaction) {
    RefundCreate refundCreate = new RefundCreate();
    refundCreate.setTransaction(transaction.getId());
    refundCreate.setType(RefundType.MERCHANT_INITIATED_ONLINE);
    refundCreate.setExternalId(UUID.randomUUID().toString());
    refundCreate.setAmount(BigDecimal.valueOf(29.95));
    return refundCreate;
  }

  private Transaction create(TransactionCreate transactionCreate) throws ApiException {
    return transactionsService.postPaymentTransactions(SPACE_ID, transactionCreate, EMPTY_EXPAND);
  }
}
