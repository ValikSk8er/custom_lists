package com.valiksk8.patterns;

public class PageNotFoundHandler extends BaseHandler {
    @Override
    protected void doSmth(String method, String uri, Request request) {
        System.out.println("Page not found 404");
    }
}
