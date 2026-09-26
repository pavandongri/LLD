package Creational.builder;

public class Main {
    public static void main(String[] args) {
        HttpRequest post = new HttpRequestBuilder()
                .setMethod("POST")
                .setUrl("https://example.com")
                .setBody("body")
                .build();

        post.makeRequest();

        // body is optional, and order does not matter
        HttpRequest get = new HttpRequestBuilder()
                .setUrl("https://example.com/users")
                .setMethod("GET")
                .build();

        get.makeRequest();

        // a missing required field is caught at build() time
        try {
            new HttpRequestBuilder().setMethod("DELETE").build();
        } catch (IllegalStateException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
