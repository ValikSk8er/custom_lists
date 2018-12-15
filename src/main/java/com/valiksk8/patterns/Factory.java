package com.valiksk8.patterns;

public class Factory {

    public static BaseHandler getGetAllUsersHandler(){
        return new GetAllUsersHandler();
    }

    public static BaseHandler getAddUserHandler(){
        return new AddUserHandler();
    }

    public static BaseHandler getPageNotFoundHadler(){
        return new PageNotFoundHandler();
    }

}
