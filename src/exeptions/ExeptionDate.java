package exeptions;

public class ExeptionDate extends Exception{
    public ExeptionDate() {
    }

    public ExeptionDate(String message) {
        super(message);
    }

    public ExeptionDate(String message, Throwable cause) {
        super(message, cause);
    }

    public ExeptionDate(Throwable cause) {
        super(cause);
    }

    public ExeptionDate(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
