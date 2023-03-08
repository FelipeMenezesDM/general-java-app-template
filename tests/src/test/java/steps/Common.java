package steps;

import br.com.felipemenezesdm.service.ApiService;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class Common {
    @Autowired
    ApiService apiService;

    private Response response;

    @Dado("que uma requisição foi realizada para o endpoint de health check da aplicação")
    public void que_uma_requisicao_foi_realizada_para_o_endpoint_de_health_check_da_aplicacao() {
        response = apiService.get("/health-check");
    }

    @Entao("confirmar retorno de status http 200")
    public void confirmar_retorno_de_status_http_200() {
        Assertions.assertEquals(response.statusCode(), 200);
    }
}
