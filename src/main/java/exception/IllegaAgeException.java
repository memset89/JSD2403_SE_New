package exception;

public class IllegaAgeException extends Exception{
    public IllegaAgeException() {
    }

    public IllegaAgeException(String message) {
        super(message);
    }

    public IllegaAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegaAgeException(Throwable cause) {
        super(cause);
    }

    public IllegaAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
