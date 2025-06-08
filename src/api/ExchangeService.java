package api;
import com.google.gson.Gson;
import models.ExchangeResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeService {
    private final String url_api = "https://v6.exchangerate-api.com/v6/18a90713f3321a2601469dd8/latest/USD";
    private final HttpClient client = HttpClient.newHttpClient();

    public String obtenerJson() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_api))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body(); // devolver JSON
        } catch (Exception e) {
            System.out.println("Exchange service failed");
            return null;
        }
    }


    public ExchangeResponse obtenerDatos() {
        String json = obtenerJson();
        Gson gson = new Gson();
        return gson.fromJson(json, ExchangeResponse.class);
    }
}
