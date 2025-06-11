package org.sandeep.F1_CreationalPatterns.Builder.InnerBuilder;

public class URL {
    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;

    public static class Builder {
        private String protocol;
        private String hostName;
        private String port;
        private String pathParam;
        private String queryParam;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public URL build() {
            return new URL(this);
        }

    }

    private URL(Builder builder) {
        this.protocol = builder.protocol;
        this.hostName = builder.hostName;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public String getPort() {
        return port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (this.protocol != null) str.append(this.protocol);
        if (this.hostName != null) str.append(this.hostName);
        if (this.port != null) str.append(":").append(this.port);
        if (this.pathParam != null) str.append("/").append(this.pathParam);
        if (this.queryParam != null) str.append("?query=").append(this.queryParam);
        return str.toString();
    }
}
