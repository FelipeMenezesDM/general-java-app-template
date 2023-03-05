package br.com.felipemenezesdm;

import br.com.felipemenezesdm.infrastructure.log.LogHandler;
import br.com.felipemenezesdm.infrastructure.log.LogPayload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String teste() {
        LogHandler.registerLogger("teste");
        LogHandler.error("teste", LogPayload.build().setLoggerId("teste").setLogCode("Teste"));
        return "teste30";
    }
}
