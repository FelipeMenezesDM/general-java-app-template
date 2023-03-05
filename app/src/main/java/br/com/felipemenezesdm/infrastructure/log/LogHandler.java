package br.com.felipemenezesdm.infrastructure.log;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Instant;
import java.util.HashMap;

public class LogHandler {
    private final static HashMap<String, Instant> timers = new HashMap<>();

    private static final ObjectMapper mapper = new ObjectMapper();

    private static final Logger logger = LoggerFactory.getLogger("default");

    private LogHandler() {
        throw new IllegalStateException();
    }

    public static void registerLogger(String loggerId) {
        timers.put(loggerId, Instant.now());
    }

    public static void info(String message, LogPayload payload) {
        handlerPayload(message, payload, "INFO");
    }

    public static void warning(String message, LogPayload payload) {
        handlerPayload(message, payload, "WARNING");
    }

    public static void error(String message, LogPayload payload) {
        handlerPayload(message, payload, "ERROR");
    }

    private static void handlerPayload(String message, LogPayload payload, String severity) {
        payload.setSeverity(severity);
        payload.setDuration(timers.getOrDefault(payload.getLoggerId(), null), Instant.now());

        try {
            switch (severity) {
                case "ERROR":
                    logger.error("{} {}", message, mapper.writeValueAsString(payload));
                    break;
                case "WARNING":
                    logger.warn("{} {}", message, mapper.writeValueAsString(payload));
                    break;
                default:
                    logger.info("{} {}", message, mapper.writeValueAsString(payload));
                    break;
            }
        }catch (Exception ignore) {}
    }
}
