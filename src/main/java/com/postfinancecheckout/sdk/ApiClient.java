package com.postfinancecheckout.sdk;

import com.postfinancecheckout.sdk.service.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.Json;

import java.io.IOException;
import java.io.OutputStream;

@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-05-12T11:16:25.794+02:00")
public class ApiClient {
    private final String basePath = "https://checkout.postfinance.ch:443/api";
    private final HttpRequestFactory httpRequestFactory;
    private final ObjectMapper objectMapper;
    private long userId;
    private String applicationKey;

    // A reasonable default object mapper. Client can pass in a chosen ObjectMapper anyway, this is just for reasonable defaults.
    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDateFormat(new RFC3339DateFormat());
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

    /**
     * Constructor for ApiClient
     *
     * @param userId
     * @param applicationKey
     */
    public ApiClient(long userId, String applicationKey) {
        if (applicationKey == null || applicationKey.trim().isEmpty()) {
            throw new IllegalArgumentException("The application key cannot be empty or null.");
        }
        if (userId < 1) {
            throw new IllegalArgumentException("The user id is invalid.");
        }

        this.userId = userId;
        this.applicationKey = applicationKey;
        this.httpRequestFactory = this.createRequestFactory();
        this.objectMapper = createDefaultObjectMapper();
    }

    public HttpRequestFactory getHttpRequestFactory() {
        return httpRequestFactory;
    }

    public HttpRequestFactory createRequestFactory() {
        final Auth signer = new Auth(this.userId, this.applicationKey);
        NetHttpTransport transport = new NetHttpTransport();
        return transport.createRequestFactory(new HttpRequestInitializer() {
            public void initialize(HttpRequest request) {
                request.setInterceptor(signer);
            }
        });
    }

    public String getBasePath() {
        return basePath;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
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
    
    private ChargeAttemptService chargeAttemptService;
    public ChargeAttemptService getChargeAttemptService() {
        if (this.chargeAttemptService == null) {
            this.chargeAttemptService = new ChargeAttemptService(this);
        }
        return this.chargeAttemptService;
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
    
    private HumanUserService humanUserService;
    public HumanUserService getHumanUserService() {
        if (this.humanUserService == null) {
            this.humanUserService = new HumanUserService(this);
        }
        return this.humanUserService;
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
    
    private PermissionService permissionService;
    public PermissionService getPermissionService() {
        if (this.permissionService == null) {
            this.permissionService = new PermissionService(this);
        }
        return this.permissionService;
    }
    
    private RefundCommentService refundCommentService;
    public RefundCommentService getRefundCommentService() {
        if (this.refundCommentService == null) {
            this.refundCommentService = new RefundCommentService(this);
        }
        return this.refundCommentService;
    }
    
    private RefundService refundService;
    public RefundService getRefundService() {
        if (this.refundService == null) {
            this.refundService = new RefundService(this);
        }
        return this.refundService;
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
