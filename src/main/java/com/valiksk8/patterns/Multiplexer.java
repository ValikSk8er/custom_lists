package com.valiksk8.patterns;

import java.util.HashMap;
import java.util.Map;

public class Multiplexer {

    private final static Map<Request, BaseHandler> handlers = new HashMap<>();

    static {
        handlers.put(Request.of("GET", "/users"), Factory.getAddUserHandler());
        handlers.put(Request.of("POST", "/users"), Factory.getAddUserHandler());
    }

    public void doSmth(String method, String uri){
        Request request = new Request(method, uri);

        BaseHandler handler = handlers.getOrDefault(request, Factory.getPageNotFoundHadler());

        handler.doSmth(request);
    }
}
