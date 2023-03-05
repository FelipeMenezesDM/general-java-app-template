package br.com.felipemenezesdm.infrastructure.exception;

public class GatewayTimeoutException extends RuntimeException {
    public GatewayTimeoutException() {
        super();
    }

    public GatewayTimeoutException(String message) {
        super(message);
    }

    public GatewayTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public GatewayTimeoutException(Throwable cause) {
        super(cause);
    }
}
