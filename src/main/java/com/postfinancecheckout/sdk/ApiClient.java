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

@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:51.860+02:00")
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
    
    public AccountService accountServiceApi() {
        return new AccountService(this);
    }
    
    public ApplicationUserService applicationUserServiceApi() {
        return new ApplicationUserService(this);
    }
    
    public ChargeAttemptService chargeAttemptServiceApi() {
        return new ChargeAttemptService(this);
    }
    
    public ChargeFlowLevelPaymentLinkService chargeFlowLevelPaymentLinkServiceApi() {
        return new ChargeFlowLevelPaymentLinkService(this);
    }
    
    public ChargeFlowLevelService chargeFlowLevelServiceApi() {
        return new ChargeFlowLevelService(this);
    }
    
    public ChargeFlowService chargeFlowServiceApi() {
        return new ChargeFlowService(this);
    }
    
    public ConditionTypeService conditionTypeServiceApi() {
        return new ConditionTypeService(this);
    }
    
    public CountryService countryServiceApi() {
        return new CountryService(this);
    }
    
    public CountryStateService countryStateServiceApi() {
        return new CountryStateService(this);
    }
    
    public CurrencyService currencyServiceApi() {
        return new CurrencyService(this);
    }
    
    public CustomerAddressService customerAddressServiceApi() {
        return new CustomerAddressService(this);
    }
    
    public CustomerCommentService customerCommentServiceApi() {
        return new CustomerCommentService(this);
    }
    
    public CustomerService customerServiceApi() {
        return new CustomerService(this);
    }
    
    public DeliveryIndicationService deliveryIndicationServiceApi() {
        return new DeliveryIndicationService(this);
    }
    
    public HumanUserService humanUserServiceApi() {
        return new HumanUserService(this);
    }
    
    public LabelDescriptionGroupService labelDescriptionGroupServiceApi() {
        return new LabelDescriptionGroupService(this);
    }
    
    public LabelDescriptionService labelDescriptionServiceApi() {
        return new LabelDescriptionService(this);
    }
    
    public LanguageService languageServiceApi() {
        return new LanguageService(this);
    }
    
    public LegalOrganizationFormService legalOrganizationFormServiceApi() {
        return new LegalOrganizationFormService(this);
    }
    
    public ManualTaskService manualTaskServiceApi() {
        return new ManualTaskService(this);
    }
    
    public PaymentConnectorConfigurationService paymentConnectorConfigurationServiceApi() {
        return new PaymentConnectorConfigurationService(this);
    }
    
    public PaymentConnectorService paymentConnectorServiceApi() {
        return new PaymentConnectorService(this);
    }
    
    public PaymentMethodBrandService paymentMethodBrandServiceApi() {
        return new PaymentMethodBrandService(this);
    }
    
    public PaymentMethodConfigurationService paymentMethodConfigurationServiceApi() {
        return new PaymentMethodConfigurationService(this);
    }
    
    public PaymentMethodService paymentMethodServiceApi() {
        return new PaymentMethodService(this);
    }
    
    public PaymentProcessorConfigurationService paymentProcessorConfigurationServiceApi() {
        return new PaymentProcessorConfigurationService(this);
    }
    
    public PaymentProcessorService paymentProcessorServiceApi() {
        return new PaymentProcessorService(this);
    }
    
    public PermissionService permissionServiceApi() {
        return new PermissionService(this);
    }
    
    public RefundCommentService refundCommentServiceApi() {
        return new RefundCommentService(this);
    }
    
    public RefundService refundServiceApi() {
        return new RefundService(this);
    }
    
    public SpaceService spaceServiceApi() {
        return new SpaceService(this);
    }
    
    public StaticValueService staticValueServiceApi() {
        return new StaticValueService(this);
    }
    
    public TransactionCommentService transactionCommentServiceApi() {
        return new TransactionCommentService(this);
    }
    
    public TransactionCompletionService transactionCompletionServiceApi() {
        return new TransactionCompletionService(this);
    }
    
    public TransactionIframeService transactionIframeServiceApi() {
        return new TransactionIframeService(this);
    }
    
    public TransactionInvoiceCommentService transactionInvoiceCommentServiceApi() {
        return new TransactionInvoiceCommentService(this);
    }
    
    public TransactionInvoiceService transactionInvoiceServiceApi() {
        return new TransactionInvoiceService(this);
    }
    
    public TransactionLightboxService transactionLightboxServiceApi() {
        return new TransactionLightboxService(this);
    }
    
    public TransactionMobileSdkService transactionMobileSdkServiceApi() {
        return new TransactionMobileSdkService(this);
    }
    
    public TransactionPaymentPageService transactionPaymentPageServiceApi() {
        return new TransactionPaymentPageService(this);
    }
    
    public TransactionService transactionServiceApi() {
        return new TransactionService(this);
    }
    
    public TransactionVoidService transactionVoidServiceApi() {
        return new TransactionVoidService(this);
    }
    
    public UserAccountRoleService userAccountRoleServiceApi() {
        return new UserAccountRoleService(this);
    }
    
    public UserSpaceRoleService userSpaceRoleServiceApi() {
        return new UserSpaceRoleService(this);
    }
    
    public WebhookListenerService webhookListenerServiceApi() {
        return new WebhookListenerService(this);
    }
    
    public WebhookUrlService webhookUrlServiceApi() {
        return new WebhookUrlService(this);
    }
    
}
