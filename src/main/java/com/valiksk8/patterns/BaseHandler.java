package com.valiksk8.patterns;

import java.util.List;

public abstract class BaseHandler {

    public void doSmth(String method, String uri){
        Request request = new Request();
        doSmth(method, uri, request);
    }

    public void doSmth(Request request){

    }
    protected abstract void doSmth(String method, String uri, Request request);


}
