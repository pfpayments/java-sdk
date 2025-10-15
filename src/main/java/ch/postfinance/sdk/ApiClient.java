package ch.postfinance.sdk;

import ch.postfinance.sdk.service.*;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.Json;

import java.io.IOException;
import java.io.OutputStream;

/**
* The ApiClient class is responsible for setting up and maintaining the state and configuration
* necessary to interact with a remote API service.
*/

public class ApiClient {

    private static final String DEFAULT_BASE_PATH = "https://checkout.postfinance.ch:443/api";

    // Configuration fields
    private int readTimeOut = 25;
    private String basePath;
    private HttpRequestFactory httpRequestFactory;
    private ObjectMapper objectMapper;
    private long userId;
    private String applicationKey;
    private Map<String, String> defaultHeaders = new HashMap<>();

    // Proxy settings
    private String proxyHostname;
    private int proxyPort;

    /**
    * Creates a default ObjectMapper for JSON serialization/deserialization.
    * This mapper will ignore unknown properties and set proper date formats among other configurations.
    */
    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDateFormat(new RFC3339DateFormat())
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

    /**
    * Validates the primary inputs required for establishing a connection with the API.
    *
    * @param userId         The user ID that will be authenticated.
    * @param applicationKey The application key corresponding to the user's account, used for authentication.
    * @param basePath       The base URL for the API against which all the requests would be made.
    * @throws IllegalArgumentException if any argument does not meet the criteria.
    */
    private void validateInputs(long userId, String applicationKey, String basePath) {
        if (applicationKey == null || applicationKey.trim().isEmpty()) {
            throw new IllegalArgumentException("Application key cannot be null or empty.");
        }
        if (userId < 1) {
            throw new IllegalArgumentException("User ID must be positive.");
        }
        if (basePath == null || basePath.trim().isEmpty()) {
            throw new IllegalArgumentException("Base path cannot be null or empty.");
        }
    }

    /**
    * Initializes common properties for the API client.
    */
    private void initializeBaseProperties(long userId, String applicationKey, String basePath) {
        validateInputs(userId, applicationKey, basePath);
        this.basePath = basePath;
        this.userId = userId;
        this.applicationKey = applicationKey;
        this.objectMapper = createDefaultObjectMapper();
    }

    /**
    * Sets up the proxy properties for the API client.
    */
    private void initializeProxyProperties(String proxyHostname, int proxyPort) {
        this.proxyHostname = proxyHostname;
        this.proxyPort = proxyPort;
    }

    /**
    * Constructs an ApiClient with the default base path.
    */
    public ApiClient(long userId, String applicationKey) {
        this(userId, applicationKey, DEFAULT_BASE_PATH);
	}

    /**
    * Constructs an ApiClient with a custom base path.
    */
    public ApiClient(long userId, String applicationKey, String basePath) {
        initializeBaseProperties(userId, applicationKey, basePath);
        this.httpRequestFactory = createRequestFactory();
    }

    /**
    * Constructor for ApiClient specifying user credentials, proxy details, and base path.
    *
    * @param userId user identifier for authentication.
    * @param applicationKey unique application key for user authentication.
    * @param basePath the base URL for API requests.
    * @param proxyHostname the hostname of the proxy server.
    * @param proxyPort the port of the proxy server.
    */
    public ApiClient(long userId, String applicationKey, String basePath, String proxyHostname, int proxyPort) {
        initializeBaseProperties(userId, applicationKey, basePath);
        initializeProxyProperties(proxyHostname, proxyPort);
        this.httpRequestFactory = createRequestFactory();
    }

    /**
    * Constructor for ApiClient specifying user credentials with the default base path and proxy details.
    *
    * @param userId user identifier for authentication.
    * @param applicationKey unique application key for user authentication.
    * @param proxyHostname the hostname of the proxy server.
    * @param proxyPort the port of the proxy server.
    */
    public ApiClient(long userId, String applicationKey, String proxyHostname, int proxyPort) {
        this(userId, applicationKey, DEFAULT_BASE_PATH, proxyHostname, proxyPort);
    }

    /**
     * Creates an HttpRequestFactory configured for making HTTP requests. The method initializes a transport builder
     * and potentially sets a proxy for it.
     *
     * @return HttpRequestFactory This factory is configured with the built transport and the interceptor.
     *                            It is ready for making HTTP requests, handling the details of connection
     *                            and protocol, allowing for high configurability and ease of modifications.
     */
    private HttpRequestFactory createRequestFactory() {
        final RequestInterceptor interceptor = new RequestInterceptor(this.userId, this.applicationKey, this.defaultHeaders);
        NetHttpTransport.Builder builder = new NetHttpTransport.Builder();

        if (proxyHostname != null && !proxyHostname.isEmpty()) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHostname, proxyPort));
            builder.setProxy(proxy);
        }

        NetHttpTransport transport = builder.build();

        return transport.createRequestFactory(request -> request.setInterceptor(interceptor));
    }

    /**
    * Allows the addition of default headers that will be sent with each request.
    */
    public void addDefaultHeader (String key, String value) {
        this.defaultHeaders.put(key, value);
    }

    // Standard getters and setters
    public HttpRequestFactory getHttpRequestFactory() {
        return httpRequestFactory;
    }

    public String getBasePath() {
        return basePath;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public int getReadTimeOut() {
        return readTimeOut;
    }

    public void setReadTimeOut(int readTimeOut) {
        this.readTimeOut = readTimeOut;
    }

    public class JacksonJsonHttpContent extends AbstractHttpContent {
        /* A POJO that can be serialized with a com.fasterxml Jackson ObjectMapper */
        private final Object data;

        public JacksonJsonHttpContent(Object data) {
            super(Json.MEDIA_TYPE);
            this.data = data;
        }

        @Override
        public void writeTo(OutputStream out) throws IOException {
            objectMapper.writeValue(out, data);
        }
    }

    // Builder pattern to get API instances for this client.
    
    private AccountService accountService;
    public AccountService getAccountService() {
        if (this.accountService == null) {
            this.accountService = new AccountService(this);
        }
        return this.accountService;
    }
    
    private ApplicationUserService applicationUserService;
    public ApplicationUserService getApplicationUserService() {
        if (this.applicationUserService == null) {
            this.applicationUserService = new ApplicationUserService(this);
        }
        return this.applicationUserService;
    }
    
    private BankAccountService bankAccountService;
    public BankAccountService getBankAccountService() {
        if (this.bankAccountService == null) {
            this.bankAccountService = new BankAccountService(this);
        }
        return this.bankAccountService;
    }
    
    private BankTransactionService bankTransactionService;
    public BankTransactionService getBankTransactionService() {
        if (this.bankTransactionService == null) {
            this.bankTransactionService = new BankTransactionService(this);
        }
        return this.bankTransactionService;
    }
    
    private CardProcessingService cardProcessingService;
    public CardProcessingService getCardProcessingService() {
        if (this.cardProcessingService == null) {
            this.cardProcessingService = new CardProcessingService(this);
        }
        return this.cardProcessingService;
    }
    
    private ChargeAttemptService chargeAttemptService;
    public ChargeAttemptService getChargeAttemptService() {
        if (this.chargeAttemptService == null) {
            this.chargeAttemptService = new ChargeAttemptService(this);
        }
        return this.chargeAttemptService;
    }
    
    private ChargeBankTransactionService chargeBankTransactionService;
    public ChargeBankTransactionService getChargeBankTransactionService() {
        if (this.chargeBankTransactionService == null) {
            this.chargeBankTransactionService = new ChargeBankTransactionService(this);
        }
        return this.chargeBankTransactionService;
    }
    
    private ChargeFlowLevelPaymentLinkService chargeFlowLevelPaymentLinkService;
    public ChargeFlowLevelPaymentLinkService getChargeFlowLevelPaymentLinkService() {
        if (this.chargeFlowLevelPaymentLinkService == null) {
            this.chargeFlowLevelPaymentLinkService = new ChargeFlowLevelPaymentLinkService(this);
        }
        return this.chargeFlowLevelPaymentLinkService;
    }
    
    private ChargeFlowLevelService chargeFlowLevelService;
    public ChargeFlowLevelService getChargeFlowLevelService() {
        if (this.chargeFlowLevelService == null) {
            this.chargeFlowLevelService = new ChargeFlowLevelService(this);
        }
        return this.chargeFlowLevelService;
    }
    
    private ChargeFlowService chargeFlowService;
    public ChargeFlowService getChargeFlowService() {
        if (this.chargeFlowService == null) {
            this.chargeFlowService = new ChargeFlowService(this);
        }
        return this.chargeFlowService;
    }
    
    private ConditionTypeService conditionTypeService;
    public ConditionTypeService getConditionTypeService() {
        if (this.conditionTypeService == null) {
            this.conditionTypeService = new ConditionTypeService(this);
        }
        return this.conditionTypeService;
    }
    
    private CountryService countryService;
    public CountryService getCountryService() {
        if (this.countryService == null) {
            this.countryService = new CountryService(this);
        }
        return this.countryService;
    }
    
    private CountryStateService countryStateService;
    public CountryStateService getCountryStateService() {
        if (this.countryStateService == null) {
            this.countryStateService = new CountryStateService(this);
        }
        return this.countryStateService;
    }
    
    private CurrencyBankAccountService currencyBankAccountService;
    public CurrencyBankAccountService getCurrencyBankAccountService() {
        if (this.currencyBankAccountService == null) {
            this.currencyBankAccountService = new CurrencyBankAccountService(this);
        }
        return this.currencyBankAccountService;
    }
    
    private CurrencyService currencyService;
    public CurrencyService getCurrencyService() {
        if (this.currencyService == null) {
            this.currencyService = new CurrencyService(this);
        }
        return this.currencyService;
    }
    
    private CustomerAddressService customerAddressService;
    public CustomerAddressService getCustomerAddressService() {
        if (this.customerAddressService == null) {
            this.customerAddressService = new CustomerAddressService(this);
        }
        return this.customerAddressService;
    }
    
    private CustomerCommentService customerCommentService;
    public CustomerCommentService getCustomerCommentService() {
        if (this.customerCommentService == null) {
            this.customerCommentService = new CustomerCommentService(this);
        }
        return this.customerCommentService;
    }
    
    private CustomerService customerService;
    public CustomerService getCustomerService() {
        if (this.customerService == null) {
            this.customerService = new CustomerService(this);
        }
        return this.customerService;
    }
    
    private DeliveryIndicationService deliveryIndicationService;
    public DeliveryIndicationService getDeliveryIndicationService() {
        if (this.deliveryIndicationService == null) {
            this.deliveryIndicationService = new DeliveryIndicationService(this);
        }
        return this.deliveryIndicationService;
    }
    
    private DocumentTemplateService documentTemplateService;
    public DocumentTemplateService getDocumentTemplateService() {
        if (this.documentTemplateService == null) {
            this.documentTemplateService = new DocumentTemplateService(this);
        }
        return this.documentTemplateService;
    }
    
    private DocumentTemplateTypeService documentTemplateTypeService;
    public DocumentTemplateTypeService getDocumentTemplateTypeService() {
        if (this.documentTemplateTypeService == null) {
            this.documentTemplateTypeService = new DocumentTemplateTypeService(this);
        }
        return this.documentTemplateTypeService;
    }
    
    private DunningCaseLevelService dunningCaseLevelService;
    public DunningCaseLevelService getDunningCaseLevelService() {
        if (this.dunningCaseLevelService == null) {
            this.dunningCaseLevelService = new DunningCaseLevelService(this);
        }
        return this.dunningCaseLevelService;
    }
    
    private DunningCaseService dunningCaseService;
    public DunningCaseService getDunningCaseService() {
        if (this.dunningCaseService == null) {
            this.dunningCaseService = new DunningCaseService(this);
        }
        return this.dunningCaseService;
    }
    
    private DunningFlowLevelService dunningFlowLevelService;
    public DunningFlowLevelService getDunningFlowLevelService() {
        if (this.dunningFlowLevelService == null) {
            this.dunningFlowLevelService = new DunningFlowLevelService(this);
        }
        return this.dunningFlowLevelService;
    }
    
    private DunningFlowService dunningFlowService;
    public DunningFlowService getDunningFlowService() {
        if (this.dunningFlowService == null) {
            this.dunningFlowService = new DunningFlowService(this);
        }
        return this.dunningFlowService;
    }
    
    private ExternalTransferBankTransactionService externalTransferBankTransactionService;
    public ExternalTransferBankTransactionService getExternalTransferBankTransactionService() {
        if (this.externalTransferBankTransactionService == null) {
            this.externalTransferBankTransactionService = new ExternalTransferBankTransactionService(this);
        }
        return this.externalTransferBankTransactionService;
    }
    
    private HumanUserService humanUserService;
    public HumanUserService getHumanUserService() {
        if (this.humanUserService == null) {
            this.humanUserService = new HumanUserService(this);
        }
        return this.humanUserService;
    }
    
    private InternalTransferBankTransactionService internalTransferBankTransactionService;
    public InternalTransferBankTransactionService getInternalTransferBankTransactionService() {
        if (this.internalTransferBankTransactionService == null) {
            this.internalTransferBankTransactionService = new InternalTransferBankTransactionService(this);
        }
        return this.internalTransferBankTransactionService;
    }
    
    private InvoiceReconciliationRecordInvoiceLinkService invoiceReconciliationRecordInvoiceLinkService;
    public InvoiceReconciliationRecordInvoiceLinkService getInvoiceReconciliationRecordInvoiceLinkService() {
        if (this.invoiceReconciliationRecordInvoiceLinkService == null) {
            this.invoiceReconciliationRecordInvoiceLinkService = new InvoiceReconciliationRecordInvoiceLinkService(this);
        }
        return this.invoiceReconciliationRecordInvoiceLinkService;
    }
    
    private InvoiceReconciliationRecordService invoiceReconciliationRecordService;
    public InvoiceReconciliationRecordService getInvoiceReconciliationRecordService() {
        if (this.invoiceReconciliationRecordService == null) {
            this.invoiceReconciliationRecordService = new InvoiceReconciliationRecordService(this);
        }
        return this.invoiceReconciliationRecordService;
    }
    
    private InvoiceReimbursementService invoiceReimbursementService;
    public InvoiceReimbursementService getInvoiceReimbursementService() {
        if (this.invoiceReimbursementService == null) {
            this.invoiceReimbursementService = new InvoiceReimbursementService(this);
        }
        return this.invoiceReimbursementService;
    }
    
    private LabelDescriptionGroupService labelDescriptionGroupService;
    public LabelDescriptionGroupService getLabelDescriptionGroupService() {
        if (this.labelDescriptionGroupService == null) {
            this.labelDescriptionGroupService = new LabelDescriptionGroupService(this);
        }
        return this.labelDescriptionGroupService;
    }
    
    private LabelDescriptionService labelDescriptionService;
    public LabelDescriptionService getLabelDescriptionService() {
        if (this.labelDescriptionService == null) {
            this.labelDescriptionService = new LabelDescriptionService(this);
        }
        return this.labelDescriptionService;
    }
    
    private LanguageService languageService;
    public LanguageService getLanguageService() {
        if (this.languageService == null) {
            this.languageService = new LanguageService(this);
        }
        return this.languageService;
    }
    
    private LegalOrganizationFormService legalOrganizationFormService;
    public LegalOrganizationFormService getLegalOrganizationFormService() {
        if (this.legalOrganizationFormService == null) {
            this.legalOrganizationFormService = new LegalOrganizationFormService(this);
        }
        return this.legalOrganizationFormService;
    }
    
    private ManualTaskService manualTaskService;
    public ManualTaskService getManualTaskService() {
        if (this.manualTaskService == null) {
            this.manualTaskService = new ManualTaskService(this);
        }
        return this.manualTaskService;
    }
    
    private PaymentConnectorConfigurationService paymentConnectorConfigurationService;
    public PaymentConnectorConfigurationService getPaymentConnectorConfigurationService() {
        if (this.paymentConnectorConfigurationService == null) {
            this.paymentConnectorConfigurationService = new PaymentConnectorConfigurationService(this);
        }
        return this.paymentConnectorConfigurationService;
    }
    
    private PaymentConnectorService paymentConnectorService;
    public PaymentConnectorService getPaymentConnectorService() {
        if (this.paymentConnectorService == null) {
            this.paymentConnectorService = new PaymentConnectorService(this);
        }
        return this.paymentConnectorService;
    }
    
    private PaymentLinkService paymentLinkService;
    public PaymentLinkService getPaymentLinkService() {
        if (this.paymentLinkService == null) {
            this.paymentLinkService = new PaymentLinkService(this);
        }
        return this.paymentLinkService;
    }
    
    private PaymentMethodBrandService paymentMethodBrandService;
    public PaymentMethodBrandService getPaymentMethodBrandService() {
        if (this.paymentMethodBrandService == null) {
            this.paymentMethodBrandService = new PaymentMethodBrandService(this);
        }
        return this.paymentMethodBrandService;
    }
    
    private PaymentMethodConfigurationService paymentMethodConfigurationService;
    public PaymentMethodConfigurationService getPaymentMethodConfigurationService() {
        if (this.paymentMethodConfigurationService == null) {
            this.paymentMethodConfigurationService = new PaymentMethodConfigurationService(this);
        }
        return this.paymentMethodConfigurationService;
    }
    
    private PaymentMethodService paymentMethodService;
    public PaymentMethodService getPaymentMethodService() {
        if (this.paymentMethodService == null) {
            this.paymentMethodService = new PaymentMethodService(this);
        }
        return this.paymentMethodService;
    }
    
    private PaymentProcessorConfigurationService paymentProcessorConfigurationService;
    public PaymentProcessorConfigurationService getPaymentProcessorConfigurationService() {
        if (this.paymentProcessorConfigurationService == null) {
            this.paymentProcessorConfigurationService = new PaymentProcessorConfigurationService(this);
        }
        return this.paymentProcessorConfigurationService;
    }
    
    private PaymentProcessorService paymentProcessorService;
    public PaymentProcessorService getPaymentProcessorService() {
        if (this.paymentProcessorService == null) {
            this.paymentProcessorService = new PaymentProcessorService(this);
        }
        return this.paymentProcessorService;
    }
    
    private PaymentTerminalService paymentTerminalService;
    public PaymentTerminalService getPaymentTerminalService() {
        if (this.paymentTerminalService == null) {
            this.paymentTerminalService = new PaymentTerminalService(this);
        }
        return this.paymentTerminalService;
    }
    
    private PaymentTerminalTillService paymentTerminalTillService;
    public PaymentTerminalTillService getPaymentTerminalTillService() {
        if (this.paymentTerminalTillService == null) {
            this.paymentTerminalTillService = new PaymentTerminalTillService(this);
        }
        return this.paymentTerminalTillService;
    }
    
    private PaymentTerminalTransactionSummaryService paymentTerminalTransactionSummaryService;
    public PaymentTerminalTransactionSummaryService getPaymentTerminalTransactionSummaryService() {
        if (this.paymentTerminalTransactionSummaryService == null) {
            this.paymentTerminalTransactionSummaryService = new PaymentTerminalTransactionSummaryService(this);
        }
        return this.paymentTerminalTransactionSummaryService;
    }
    
    private PermissionService permissionService;
    public PermissionService getPermissionService() {
        if (this.permissionService == null) {
            this.permissionService = new PermissionService(this);
        }
        return this.permissionService;
    }
    
    private RefundBankTransactionService refundBankTransactionService;
    public RefundBankTransactionService getRefundBankTransactionService() {
        if (this.refundBankTransactionService == null) {
            this.refundBankTransactionService = new RefundBankTransactionService(this);
        }
        return this.refundBankTransactionService;
    }
    
    private RefundCommentService refundCommentService;
    public RefundCommentService getRefundCommentService() {
        if (this.refundCommentService == null) {
            this.refundCommentService = new RefundCommentService(this);
        }
        return this.refundCommentService;
    }
    
    private RefundRecoveryBankTransactionService refundRecoveryBankTransactionService;
    public RefundRecoveryBankTransactionService getRefundRecoveryBankTransactionService() {
        if (this.refundRecoveryBankTransactionService == null) {
            this.refundRecoveryBankTransactionService = new RefundRecoveryBankTransactionService(this);
        }
        return this.refundRecoveryBankTransactionService;
    }
    
    private RefundService refundService;
    public RefundService getRefundService() {
        if (this.refundService == null) {
            this.refundService = new RefundService(this);
        }
        return this.refundService;
    }
    
    private ShopifyRecurringOrderService shopifyRecurringOrderService;
    public ShopifyRecurringOrderService getShopifyRecurringOrderService() {
        if (this.shopifyRecurringOrderService == null) {
            this.shopifyRecurringOrderService = new ShopifyRecurringOrderService(this);
        }
        return this.shopifyRecurringOrderService;
    }
    
    private ShopifySubscriberService shopifySubscriberService;
    public ShopifySubscriberService getShopifySubscriberService() {
        if (this.shopifySubscriberService == null) {
            this.shopifySubscriberService = new ShopifySubscriberService(this);
        }
        return this.shopifySubscriberService;
    }
    
    private ShopifySubscriptionProductService shopifySubscriptionProductService;
    public ShopifySubscriptionProductService getShopifySubscriptionProductService() {
        if (this.shopifySubscriptionProductService == null) {
            this.shopifySubscriptionProductService = new ShopifySubscriptionProductService(this);
        }
        return this.shopifySubscriptionProductService;
    }
    
    private ShopifySubscriptionService shopifySubscriptionService;
    public ShopifySubscriptionService getShopifySubscriptionService() {
        if (this.shopifySubscriptionService == null) {
            this.shopifySubscriptionService = new ShopifySubscriptionService(this);
        }
        return this.shopifySubscriptionService;
    }
    
    private ShopifySubscriptionSuspensionService shopifySubscriptionSuspensionService;
    public ShopifySubscriptionSuspensionService getShopifySubscriptionSuspensionService() {
        if (this.shopifySubscriptionSuspensionService == null) {
            this.shopifySubscriptionSuspensionService = new ShopifySubscriptionSuspensionService(this);
        }
        return this.shopifySubscriptionSuspensionService;
    }
    
    private ShopifySubscriptionVersionService shopifySubscriptionVersionService;
    public ShopifySubscriptionVersionService getShopifySubscriptionVersionService() {
        if (this.shopifySubscriptionVersionService == null) {
            this.shopifySubscriptionVersionService = new ShopifySubscriptionVersionService(this);
        }
        return this.shopifySubscriptionVersionService;
    }
    
    private ShopifyTransactionService shopifyTransactionService;
    public ShopifyTransactionService getShopifyTransactionService() {
        if (this.shopifyTransactionService == null) {
            this.shopifyTransactionService = new ShopifyTransactionService(this);
        }
        return this.shopifyTransactionService;
    }
    
    private SpaceService spaceService;
    public SpaceService getSpaceService() {
        if (this.spaceService == null) {
            this.spaceService = new SpaceService(this);
        }
        return this.spaceService;
    }
    
    private StaticValueService staticValueService;
    public StaticValueService getStaticValueService() {
        if (this.staticValueService == null) {
            this.staticValueService = new StaticValueService(this);
        }
        return this.staticValueService;
    }
    
    private SubscriberService subscriberService;
    public SubscriberService getSubscriberService() {
        if (this.subscriberService == null) {
            this.subscriberService = new SubscriberService(this);
        }
        return this.subscriberService;
    }
    
    private SubscriptionAffiliateService subscriptionAffiliateService;
    public SubscriptionAffiliateService getSubscriptionAffiliateService() {
        if (this.subscriptionAffiliateService == null) {
            this.subscriptionAffiliateService = new SubscriptionAffiliateService(this);
        }
        return this.subscriptionAffiliateService;
    }
    
    private SubscriptionChargeService subscriptionChargeService;
    public SubscriptionChargeService getSubscriptionChargeService() {
        if (this.subscriptionChargeService == null) {
            this.subscriptionChargeService = new SubscriptionChargeService(this);
        }
        return this.subscriptionChargeService;
    }
    
    private SubscriptionLedgerEntryService subscriptionLedgerEntryService;
    public SubscriptionLedgerEntryService getSubscriptionLedgerEntryService() {
        if (this.subscriptionLedgerEntryService == null) {
            this.subscriptionLedgerEntryService = new SubscriptionLedgerEntryService(this);
        }
        return this.subscriptionLedgerEntryService;
    }
    
    private SubscriptionMetricService subscriptionMetricService;
    public SubscriptionMetricService getSubscriptionMetricService() {
        if (this.subscriptionMetricService == null) {
            this.subscriptionMetricService = new SubscriptionMetricService(this);
        }
        return this.subscriptionMetricService;
    }
    
    private SubscriptionMetricUsageService subscriptionMetricUsageService;
    public SubscriptionMetricUsageService getSubscriptionMetricUsageService() {
        if (this.subscriptionMetricUsageService == null) {
            this.subscriptionMetricUsageService = new SubscriptionMetricUsageService(this);
        }
        return this.subscriptionMetricUsageService;
    }
    
    private SubscriptionPeriodBillService subscriptionPeriodBillService;
    public SubscriptionPeriodBillService getSubscriptionPeriodBillService() {
        if (this.subscriptionPeriodBillService == null) {
            this.subscriptionPeriodBillService = new SubscriptionPeriodBillService(this);
        }
        return this.subscriptionPeriodBillService;
    }
    
    private SubscriptionProductComponentGroupService subscriptionProductComponentGroupService;
    public SubscriptionProductComponentGroupService getSubscriptionProductComponentGroupService() {
        if (this.subscriptionProductComponentGroupService == null) {
            this.subscriptionProductComponentGroupService = new SubscriptionProductComponentGroupService(this);
        }
        return this.subscriptionProductComponentGroupService;
    }
    
    private SubscriptionProductComponentService subscriptionProductComponentService;
    public SubscriptionProductComponentService getSubscriptionProductComponentService() {
        if (this.subscriptionProductComponentService == null) {
            this.subscriptionProductComponentService = new SubscriptionProductComponentService(this);
        }
        return this.subscriptionProductComponentService;
    }
    
    private SubscriptionProductFeeTierService subscriptionProductFeeTierService;
    public SubscriptionProductFeeTierService getSubscriptionProductFeeTierService() {
        if (this.subscriptionProductFeeTierService == null) {
            this.subscriptionProductFeeTierService = new SubscriptionProductFeeTierService(this);
        }
        return this.subscriptionProductFeeTierService;
    }
    
    private SubscriptionProductMeteredFeeService subscriptionProductMeteredFeeService;
    public SubscriptionProductMeteredFeeService getSubscriptionProductMeteredFeeService() {
        if (this.subscriptionProductMeteredFeeService == null) {
            this.subscriptionProductMeteredFeeService = new SubscriptionProductMeteredFeeService(this);
        }
        return this.subscriptionProductMeteredFeeService;
    }
    
    private SubscriptionProductPeriodFeeService subscriptionProductPeriodFeeService;
    public SubscriptionProductPeriodFeeService getSubscriptionProductPeriodFeeService() {
        if (this.subscriptionProductPeriodFeeService == null) {
            this.subscriptionProductPeriodFeeService = new SubscriptionProductPeriodFeeService(this);
        }
        return this.subscriptionProductPeriodFeeService;
    }
    
    private SubscriptionProductRetirementService subscriptionProductRetirementService;
    public SubscriptionProductRetirementService getSubscriptionProductRetirementService() {
        if (this.subscriptionProductRetirementService == null) {
            this.subscriptionProductRetirementService = new SubscriptionProductRetirementService(this);
        }
        return this.subscriptionProductRetirementService;
    }
    
    private SubscriptionProductService subscriptionProductService;
    public SubscriptionProductService getSubscriptionProductService() {
        if (this.subscriptionProductService == null) {
            this.subscriptionProductService = new SubscriptionProductService(this);
        }
        return this.subscriptionProductService;
    }
    
    private SubscriptionProductSetupFeeService subscriptionProductSetupFeeService;
    public SubscriptionProductSetupFeeService getSubscriptionProductSetupFeeService() {
        if (this.subscriptionProductSetupFeeService == null) {
            this.subscriptionProductSetupFeeService = new SubscriptionProductSetupFeeService(this);
        }
        return this.subscriptionProductSetupFeeService;
    }
    
    private SubscriptionProductVersionRetirementService subscriptionProductVersionRetirementService;
    public SubscriptionProductVersionRetirementService getSubscriptionProductVersionRetirementService() {
        if (this.subscriptionProductVersionRetirementService == null) {
            this.subscriptionProductVersionRetirementService = new SubscriptionProductVersionRetirementService(this);
        }
        return this.subscriptionProductVersionRetirementService;
    }
    
    private SubscriptionProductVersionService subscriptionProductVersionService;
    public SubscriptionProductVersionService getSubscriptionProductVersionService() {
        if (this.subscriptionProductVersionService == null) {
            this.subscriptionProductVersionService = new SubscriptionProductVersionService(this);
        }
        return this.subscriptionProductVersionService;
    }
    
    private SubscriptionService subscriptionService;
    public SubscriptionService getSubscriptionService() {
        if (this.subscriptionService == null) {
            this.subscriptionService = new SubscriptionService(this);
        }
        return this.subscriptionService;
    }
    
    private SubscriptionSuspensionService subscriptionSuspensionService;
    public SubscriptionSuspensionService getSubscriptionSuspensionService() {
        if (this.subscriptionSuspensionService == null) {
            this.subscriptionSuspensionService = new SubscriptionSuspensionService(this);
        }
        return this.subscriptionSuspensionService;
    }
    
    private SubscriptionVersionService subscriptionVersionService;
    public SubscriptionVersionService getSubscriptionVersionService() {
        if (this.subscriptionVersionService == null) {
            this.subscriptionVersionService = new SubscriptionVersionService(this);
        }
        return this.subscriptionVersionService;
    }
    
    private TokenService tokenService;
    public TokenService getTokenService() {
        if (this.tokenService == null) {
            this.tokenService = new TokenService(this);
        }
        return this.tokenService;
    }
    
    private TokenVersionService tokenVersionService;
    public TokenVersionService getTokenVersionService() {
        if (this.tokenVersionService == null) {
            this.tokenVersionService = new TokenVersionService(this);
        }
        return this.tokenVersionService;
    }
    
    private TransactionCommentService transactionCommentService;
    public TransactionCommentService getTransactionCommentService() {
        if (this.transactionCommentService == null) {
            this.transactionCommentService = new TransactionCommentService(this);
        }
        return this.transactionCommentService;
    }
    
    private TransactionCompletionService transactionCompletionService;
    public TransactionCompletionService getTransactionCompletionService() {
        if (this.transactionCompletionService == null) {
            this.transactionCompletionService = new TransactionCompletionService(this);
        }
        return this.transactionCompletionService;
    }
    
    private TransactionIframeService transactionIframeService;
    public TransactionIframeService getTransactionIframeService() {
        if (this.transactionIframeService == null) {
            this.transactionIframeService = new TransactionIframeService(this);
        }
        return this.transactionIframeService;
    }
    
    private TransactionInvoiceCommentService transactionInvoiceCommentService;
    public TransactionInvoiceCommentService getTransactionInvoiceCommentService() {
        if (this.transactionInvoiceCommentService == null) {
            this.transactionInvoiceCommentService = new TransactionInvoiceCommentService(this);
        }
        return this.transactionInvoiceCommentService;
    }
    
    private TransactionInvoiceService transactionInvoiceService;
    public TransactionInvoiceService getTransactionInvoiceService() {
        if (this.transactionInvoiceService == null) {
            this.transactionInvoiceService = new TransactionInvoiceService(this);
        }
        return this.transactionInvoiceService;
    }
    
    private TransactionLightboxService transactionLightboxService;
    public TransactionLightboxService getTransactionLightboxService() {
        if (this.transactionLightboxService == null) {
            this.transactionLightboxService = new TransactionLightboxService(this);
        }
        return this.transactionLightboxService;
    }
    
    private TransactionLineItemVersionService transactionLineItemVersionService;
    public TransactionLineItemVersionService getTransactionLineItemVersionService() {
        if (this.transactionLineItemVersionService == null) {
            this.transactionLineItemVersionService = new TransactionLineItemVersionService(this);
        }
        return this.transactionLineItemVersionService;
    }
    
    private TransactionMobileSdkService transactionMobileSdkService;
    public TransactionMobileSdkService getTransactionMobileSdkService() {
        if (this.transactionMobileSdkService == null) {
            this.transactionMobileSdkService = new TransactionMobileSdkService(this);
        }
        return this.transactionMobileSdkService;
    }
    
    private TransactionPaymentPageService transactionPaymentPageService;
    public TransactionPaymentPageService getTransactionPaymentPageService() {
        if (this.transactionPaymentPageService == null) {
            this.transactionPaymentPageService = new TransactionPaymentPageService(this);
        }
        return this.transactionPaymentPageService;
    }
    
    private TransactionService transactionService;
    public TransactionService getTransactionService() {
        if (this.transactionService == null) {
            this.transactionService = new TransactionService(this);
        }
        return this.transactionService;
    }
    
    private TransactionTerminalService transactionTerminalService;
    public TransactionTerminalService getTransactionTerminalService() {
        if (this.transactionTerminalService == null) {
            this.transactionTerminalService = new TransactionTerminalService(this);
        }
        return this.transactionTerminalService;
    }
    
    private TransactionVoidService transactionVoidService;
    public TransactionVoidService getTransactionVoidService() {
        if (this.transactionVoidService == null) {
            this.transactionVoidService = new TransactionVoidService(this);
        }
        return this.transactionVoidService;
    }
    
    private UserAccountRoleService userAccountRoleService;
    public UserAccountRoleService getUserAccountRoleService() {
        if (this.userAccountRoleService == null) {
            this.userAccountRoleService = new UserAccountRoleService(this);
        }
        return this.userAccountRoleService;
    }
    
    private UserSpaceRoleService userSpaceRoleService;
    public UserSpaceRoleService getUserSpaceRoleService() {
        if (this.userSpaceRoleService == null) {
            this.userSpaceRoleService = new UserSpaceRoleService(this);
        }
        return this.userSpaceRoleService;
    }
    
    private WebAppService webAppService;
    public WebAppService getWebAppService() {
        if (this.webAppService == null) {
            this.webAppService = new WebAppService(this);
        }
        return this.webAppService;
    }
    
    private WebhookEncryptionService webhookEncryptionService;
    public WebhookEncryptionService getWebhookEncryptionService() {
        if (this.webhookEncryptionService == null) {
            this.webhookEncryptionService = new WebhookEncryptionService(this);
        }
        return this.webhookEncryptionService;
    }
    
    private WebhookListenerService webhookListenerService;
    public WebhookListenerService getWebhookListenerService() {
        if (this.webhookListenerService == null) {
            this.webhookListenerService = new WebhookListenerService(this);
        }
        return this.webhookListenerService;
    }
    
    private WebhookUrlService webhookUrlService;
    public WebhookUrlService getWebhookUrlService() {
        if (this.webhookUrlService == null) {
            this.webhookUrlService = new WebhookUrlService(this);
        }
        return this.webhookUrlService;
    }
    
}
