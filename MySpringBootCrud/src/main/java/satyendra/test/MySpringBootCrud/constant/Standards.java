package satyendra.test.MySpringBootCrud.constant;

public final class Standards {
    
    public static final int DEFAULT_PAGE_SIZE = 10;
    public static final int DEFAULT_AMOUNT = 100;
    public static final String MERCHANT_SERVICE_NAME = "Merchant Service";
    
    public static final String MERCHANT = "Merchant";
    public static final String TERMINAL = "Terminal";
    public static final String POINT_OF_SALE = "PointOfSale";
    public static final String PROCESSOR = "Processor";
    public static final String ACCEPTED = "Accepted";
    public static final String SUCCESS = "Success";
    public static final String FAILURE = "Failure";
    public static final String DELETE_TERMINALMESSAGE = "deleteTerminal";
    
    public static final String CREDIT_CARD = "Credit Card";
    
    public static final String MISMATCH_CUSTOMER_ID = "Mismatched customerID";
    public static final String MISMATCH_MERCHANT_TOKEN = "Mismatched MerchantToken";
    public static final String MISMATCH_TERMINAL_TOKEN = "Mismatched TerminalToken";
    public static final String ID_NOT_SEND = "Mismatched processorId";
    public static final String MERCHANT_NOT_FOUND = "MerchantToken not found";
    public static final String MERCHANT_IS_DISABLED = "MerchantToken is disabled";
    public static final String TERMINAL_NOT_FOUND = "TerminalToken not found";
    public static final String POINT_OF_SALE_NOT_FOUND = "PointOfSale not found";
    public static final String PROCESSOR_NOT_FOUND = "Proceesor not found";
    public static final String PROCESSOR_ID_NOT_FOUND = "ProcessorId not found";
    public static final String PROCESSORTYPE_NOT_FOUND = "ProcessorType not found";
    public static final String CONCURRENT = "Concurrent";
    public static final String GENERIC = "Generic";
    public static final String MERCHANT_CONCURRENT_MODIFICATION = "Merchant concurrent modification attempt failed";
    public static final String BAD_CONFIGURATION = "Supplied configuration details cannot be mapped to Json";
    public static final String GENERIC_ERROR_MESSAGE = "Generic Error Message";
    public static final String BADCARDTHRESHOLD = "badCardThreshold should be less than or equal to numberOfRetries.";
    
    public static final String CONFLICT_MERCHANTDETAILS = "MerchantDetails already exist.";
    public static final String CONFLICT_MERCHANTNAME_CUSTOMERID = "Merchant Name and CustomerId already exist";
    public static final String CONFLICT_TERMINAL_NAME = "TerminalName already exist.";
    public static final String CONFLICT_TERMINALDETAILS = "TerminalDetails already exist.";
    public static final String CONFLICT_PROCESSOR_ID = "ProcessorID already exist.";
    
    public static final String PAYMENT_TEST = "Failed to call Payment test mircoservice.. /api/v1/payments/test";
    public static final String MERCHANT_DEPENDENCY_FAILED = "Failed to Call mircoservice..api/v1/validate/merchant";
    public static final String TERMINAL_DEPENDENCY_FAILED = "Failed to Call mircoservice..api/v1/validate/terminal";
    public static final String TERMINAL_DISABLED = "Either Merchant, or Terminal is disabled";
    
    public static final String ACTION_TYPE_INSERT = "Insert";
    public static final String ACTION_TYPE_EDIT = "Edit";
    public static final String ACTION_TYPE_DELETE = "Delete";
    public static final String VALIDATE_MERCHANT = "Validate Merchant";
    public static final String VALIDATE_TERMINAL = "Validate Terminal";
    public static final String CREDIT_CALL = "CreditCall";
    public static final String CREDIT_CALL_NOT_ASSOCIATE_WITH_TERMINAL = "Creditcall processorType is not associated with terminalId";
    
    public static final String TMSURL = "tmsUrl";
    public static final String TRANSACTIONKEY = "transactionKey";
   
    public static final String SPACE = " ";    
    public static final String COMMA = ",";
    
    private Standards() {
        super();
    }
    
}
