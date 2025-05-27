package conversor.andres.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultarMoneda {
    public Moneda buscarMoneda(String monedaBase) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fc10eb4e777330543e102985/latest/" + monedaBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Respuesta de la API: " + response.body());  // Para verificar la respuesta JSON
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda o hubo un problema con la solicitud: " + e.getMessage(), e);
        }
    }
}
