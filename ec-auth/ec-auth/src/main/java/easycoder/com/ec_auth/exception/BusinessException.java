package easycoder.com.ec_auth.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(int errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;
    private Object errorValue;

    public Object getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(Object errorValue) {
        this.errorValue = errorValue;
    }

    public BusinessException(int errCode, String  errMsg, Object errorValue) {
        this.errCode=errCode;
        this.errMsg = errMsg;
        this.errorValue=errorValue;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
