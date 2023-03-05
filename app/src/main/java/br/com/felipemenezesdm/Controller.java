package br.com.felipemenezesdm;

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
