package Creational.nestedbuilder;

public class HttpRequest {
    private final String method;
    private final String url;
    private final String body;

    // private: the nested Builder is the only way to get an HttpRequest
    private HttpRequest(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.body = builder.body;
    }

    public void makeRequest() {
        System.out.println("Making " + method + " request to " + url
                + (body == null ? " with no body" : " with body: " + body));
    }

    public static class Builder {
        // private, because the nested class can still reach the outer constructor
        private String method;
        private String url;
        private String body;

        public Builder setMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

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
}
