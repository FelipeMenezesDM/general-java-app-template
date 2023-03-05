package br.com.felipemenezesdm.infrastructure.exception;

public class BadGatewayException extends RuntimeException {

    public BadGatewayException() {
        super();
    }

    public BadGatewayException(String message) {
        super(message);
    }

    public BadGatewayException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadGatewayException(Throwable cause) {
        super(cause);
    }
}
