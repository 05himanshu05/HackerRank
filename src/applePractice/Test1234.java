package applePractice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Test1234 {


    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    private static final HttpClient client = HttpClient.newHttpClient();

    public static String addPet(
            Integer id,
            String name,
            String status,
            Map<String, Object> category,
            List<String> photoUrls,
            List<Map<String, Object>> tags
    ) throws Exception {

        if (name == null || status == null) {
            throw new IllegalArgumentException("Name and status are required");
        }

        // Generate random ID if not provided
        if (id == null) {
            id = ThreadLocalRandom.current().nextInt(100000, 999999);
        }

        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"id\":").append(id).append(",");
        json.append("\"name\":\"").append(name).append("\",");
        json.append("\"status\":\"").append(status).append("\"");

        // Optional: category
        if (category != null && !category.isEmpty()) {
            json.append(",\"category\":{");
            json.append("\"id\":").append(category.get("id")).append(",");
            json.append("\"name\":\"").append(category.get("name")).append("\"");
            json.append("}");
        }

        // Optional: photoUrls
        if (photoUrls != null) {
            json.append(",\"photoUrls\":[");
            for (int i = 0; i < photoUrls.size(); i++) {
                json.append("\"").append(photoUrls.get(i)).append("\"");
                if (i < photoUrls.size() - 1) json.append(",");
            }
            json.append("]");
        }

        // Optional: tags
        if (tags != null && !tags.isEmpty()) {
            json.append(",\"tags\":[");
            for (int i = 0; i < tags.size(); i++) {
                Map<String, Object> tag = tags.get(i);
                json.append("{\"id\":").append(tag.get("id"))
                        .append(",\"name\":\"").append(tag.get("name")).append("\"}");
                if (i < tags.size() - 1) json.append(",");
            }
            json.append("]");
        }

        json.append("}");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/pet"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("Failed to add pet: " + response.body());
        }
    }

    // ==============================
    // Function 2: checkIfExists
    // ==============================
    public static boolean checkIfExists(int petId, String status) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/pet/findByStatus?status=" + status))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to fetch pets");
        }

        String body = response.body();

        // Simple check for matching id in response JSON
        return body.contains("\"id\":" + petId);
    }

    // ==============================
    // Main Task
    // ==============================
    public static void main(String[] args) throws Exception {

        // Add new pet
        String response = addPet(
                null,
                "Charlie",
                "available",
                null,
                new ArrayList<>(),
                null
        );

        System.out.println("AddPet Response:");
        System.out.println(response);

        // Extract id from response (simple extraction)
        int idIndex = response.indexOf("\"id\":") + 5;
        int commaIndex = response.indexOf(",", idIndex);
        int petId = Integer.parseInt(response.substring(idIndex, commaIndex));

        // Verify existence
        boolean exists = checkIfExists(petId, "available");

        System.out.println("Pet exists? " + exists);
    }
}
