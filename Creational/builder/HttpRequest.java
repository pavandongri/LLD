package Creational.builder;

public class HttpRequest {
    private final String method;
    private final String url;
    private final String body;

    // package-private: only HttpRequestBuilder.build() can construct one
    HttpRequest(HttpRequestBuilder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.body = builder.body;
    }

    public void makeRequest() {
        System.out.println("Making " + method + " request to " + url
                + (body == null ? " with no body" : " with body: " + body));
    }
}
