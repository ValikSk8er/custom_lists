package com.valiksk8.mockito;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public static List<MainClass.User> userList = new ArrayList<>();

    static {
        userList.add(new MainClass.User("lucky7", "l7@test.com", 13));
        userList.add(new MainClass.User("lucky89", "89@test.com", 13));
        userList.add(new MainClass.User("lucky123", "123@test.com", 13));
    }

    public MainClass.User addUser(MainClass.User user) {
        userList.add(user);
        return user;
    }

    public MainClass.User findByEmail(final String email) {
        return userList.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .get();
    }
}

