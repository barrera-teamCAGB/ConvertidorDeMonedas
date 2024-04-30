import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import java.net.URI;


public class ConsultaMoneda {
	
	Moneda monedaAConvertir(String moneda){
		URI urlDeLaApi = URI.create("https://v6.exchangerate-api.com/v6/b446664bb250f3604a1c655e/latest/" + moneda);
		
		HttpClient client = HttpClient.newHttpClient();
   		HttpRequest request = HttpRequest.newBuilder()
         .uri(urlDeLaApi)
         .build();
		
		HttpResponse<String> response = null;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		return new Gson().fromJson(response.body(), Moneda.class);
	}
}
