package br.com.felipemenezesdm.service;

import java.util.Optional;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.beans.factory.annotation.Value;
import io.restassured.http.Method;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

@Service
public class ApiService {
    @Value("${api.url}")
    String apiUri;

    @Value("${api.correlation-id}")
    String correlationId;

    public Response get(String uri, Object... variables) {
        return get(uri, null, variables);
    }

    public Response get(String uri, HttpHeaders httpHeaders, Object... variables) {
        return sendRequest(Method.GET, uri, null, httpHeaders, variables);
    }

    public Response post(String uri, JSONObject body, Object... variables) {
        return post(uri, body, null, variables);
    }

    public Response post(String uri, JSONObject body, HttpHeaders httpHeaders, Object... variables) {
        return sendRequest(Method.POST, uri, body, httpHeaders, variables);
    }

    public Response put(String uri, JSONObject body, Object... variables) {
        return put(uri, body, null, variables);
    }

    public Response put(String uri, JSONObject body, HttpHeaders httpHeaders, Object... variables) {
        return sendRequest(Method.PUT, uri, body, httpHeaders, variables);
    }

    public Response patch(String uri, JSONObject body, Object... variables) {
        return patch(uri, body, null, variables);
    }

    public Response patch(String uri, JSONObject body, HttpHeaders httpHeaders, Object... variables) {
        return sendRequest(Method.PATCH, uri, body, httpHeaders, variables);
    }

    public Response delete(String uri, Object... variables) {
        return delete(uri, null, variables);
    }

    public Response delete(String uri, HttpHeaders httpHeaders, Object... variables) {
        return sendRequest(Method.DELETE, uri, null, httpHeaders, variables);
    }

    private Response sendRequest(Method method, String uri, JSONObject body, HttpHeaders httpHeaders, Object... variables) {
        return given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .headers(handleHeaders(httpHeaders))
                .and()
                .body((Optional.ofNullable(body).orElse(new JSONObject())).toString())
                .relaxedHTTPSValidation()
                .log()
                .all()
                .when()
                .request(method, apiUri.concat(uri), variables);
    }

    public HttpHeaders handleHeaders(HttpHeaders headers) {
        HttpHeaders newHeaders = new HttpHeaders();
        LinkedMultiValueMap<String, String> defaultHeaders = new LinkedMultiValueMap<>(Optional.ofNullable(headers).orElse(newHeaders));

        if(!defaultHeaders.containsKey("Authorization")) {
            defaultHeaders.add("Authorization", "");
        }

        if(!defaultHeaders.containsKey("CorrelationId")) {
            defaultHeaders.add("CorrelationId", correlationId);
        }

        newHeaders.addAll(defaultHeaders);
        return newHeaders;
    }
}
