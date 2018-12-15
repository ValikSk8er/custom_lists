package com.valiksk8.patterns;

class GetAllUsersHandler extends BaseHandler {
    
    @Override
    protected void doSmth(String method, String uri, Request request) {
        System.out.println("From GetAllUsersHandler");
    }
}
