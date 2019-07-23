package net.iutil.javalib.exception;

/**
 * 工具类异常
 * @author Erwin Feng
 * @since 2019-07-23 09:55
 */
public class UtilsException extends RuntimeException {

    public UtilsException(String message) {
        super(message);
    }

    public UtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    public UtilsException(Throwable cause) {
        super(cause);
    }

    public UtilsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
