package easycoder.com.ec_auth.exception;

public class BusinessError {

    int code;
    String message;
    Object errorValue;

    public BusinessError(int code, String message) {
        this.code = code;
        this.message = message;

    }

    public BusinessError(int code, String message, Object errorValue) {
        this.code = code;
        this.message = message;
        this.errorValue = errorValue;
    }

    public int getCode() {
        return code;
    }

    public Object getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(Object errorValue) {
        this.errorValue = errorValue;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BusinessError{" + "code=" + code + ", message=" + message + '}';
    }
}
