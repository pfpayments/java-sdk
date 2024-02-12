package ch.postfinance.sdk.test;

import static ch.postfinance.sdk.test.TestUtils.getApiClient;
import static org.junit.Assert.assertTrue;

import ch.postfinance.sdk.ApiClient;
import ch.postfinance.sdk.model.*;
import ch.postfinance.sdk.service.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class TransactionLightboxServiceTest {
  private TransactionService transactionService;
  private TransactionLightboxService transactionLightboxService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    transactionLightboxService = apiClient.getTransactionLightboxService();
  }

  @Test
  public void shouldCreateUrlForJavascriptUsage() throws IOException {
    Transaction transaction = transactionService.create(TestConstants.SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    String url =
        transactionLightboxService.javascriptUrl(TestConstants.SPACE_ID, transaction.getId());

    assertTrue("URL must have proper format", url.contains("securityToken"));
  }
}
