package easycoder.com.ec_auth.util;

public interface Constant
{
    // Success Status Codes
    int OK = 200;
    int CREATED = 201;
    int ACCEPTED = 202;
    int NO_CONTENT = 204;

    // Client Error Status Codes
    int BAD_REQUEST = 400;
    int UNAUTHORIZED = 401;
    int FORBIDDEN = 403;
    int NOT_FOUND = 404;
    int METHOD_NOT_ALLOWED = 405;
    int CONFLICT = 409;
    int GONE = 410;
    int NO_MORE_ATTEMPTS = 429;

    // Server Error Status Codes
    int INTERNAL_SERVER_ERROR = 500;
    int NOT_IMPLEMENTED = 501;
    int BAD_GATEWAY = 502;
    int SERVICE_UNAVAILABLE = 503;
    int GATEWAY_TIMEOUT = 504;
    int HTTP_VERSION_NOT_SUPPORTED = 505;

    String BASE_URL = "/api";
}
