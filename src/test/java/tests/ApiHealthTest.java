package test.java.tests;

import java.net.http.HttpResponse;

public class ApiHealthTest {
    private ApiHealthTest() {
    }

    public void checkApiHealth() {
        HttpResponse<String> response = ApiClient.get("/health");
        if (response.statusCode() != 200) { 
            throw new AssertionError("API health check failed with status code: " + response.statusCode());
        }
      }
}
