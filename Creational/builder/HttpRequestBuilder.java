package Creational.builder;

public class HttpRequestBuilder {
    // package-private so HttpRequest can copy them out; not public
    String method;
    String url;
    String body;

    public HttpRequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    // terminates the chain and is the only place a request gets validated
    public HttpRequest build() {
        if (method == null || method.isBlank()) {
            throw new IllegalStateException("method is required");
        }
        if (url == null || url.isBlank()) {
            throw new IllegalStateException("url is required");
        }
        return new HttpRequest(this);
    }
}
