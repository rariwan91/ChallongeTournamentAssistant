package Constants;

/**
 * From Challonge API Documentation
 * <p>
 * Response Codes
 * The following HTTP response codes are issued by the API. All other codes are the result of a request not reaching the application.
 * <p>
 * 200 - OK
 * 401 - Unauthorized (Invalid API key or insufficient permissions)
 * 404 - Object not found within your account scope
 * 406 - Requested format is not supported - request JSON or XML only
 * 422 - Validation error(s) for create or update method
 * 500 - Something went wrong on our end. If you continually receive this, please contact us.
 */
public class ResponseConstants {
    /**
     * OK
     */
    public static final int RESPONSE_GOOD = 200;

    /**
     * Unauthorized (Invalid API key or insufficient permissions)
     */
    public static final int RESPONSE_UNAUTHORIZED = 401;

    /**
     * Object not found within your account scope
     */
    public static final int RESPONSE_OBJECT_NOT_FOUND = 404;

    /**
     * Requested format is not supported - request JSON or XML only
     */
    public static final int RESPONSE_BAD_FORMAT = 406;

    /**
     * Validation error(s) for create or update method
     */
    public static final int RESPONSE_VALIDATION_ERROR = 422;

    /**
     * Something went wrong on Challonge's side. If you continually receive this, please contact them.
     */
    public static final int RESPONSE_CHALLONGE_HAVING_ISSUES = 500;
}
