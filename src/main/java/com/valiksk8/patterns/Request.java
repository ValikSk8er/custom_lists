package com.valiksk8.patterns;

import java.util.List;
import java.util.Objects;

public class Request {
    private List<Object> params;

    String method;
    String uri;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Request() {
    }

    public Request(String method, String uri) {
        this.method = method;
        this.uri = uri;
    }

    public List<Object> getParams() {
        return params;
    }

    public void setParams(List<Object> params) {
        this.params = params;
    }

    public static Request of(String method, String uri){
        return new Request(method, uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, uri);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(method, request.method) &&
                Objects.equals(uri, request.uri);
    }
}
