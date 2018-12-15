package com.valiksk8.patterns;

public class AddUserHandler extends BaseHandler {
    @Override
    protected void doSmth(String method, String uri, Request request) {
        System.out.println("From AddUserHandler");
    }
}
