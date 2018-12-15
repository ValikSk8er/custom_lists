package com.valiksk8.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;

@RunWith(MockitoJUnitRunner.class)
public class MainClassTest {
    @Mock
    private UserDao userDao;
    @Mock
    private EmailService emailService;
    @InjectMocks
    private MainClassWrapper mainClass = new MainClassWrapper();

    @Test
    public void testFindUserByEmail_OK(){
        MainClass.User user = new MainClass.User("lucky", "l@t.com", 10);
        Mockito.when(userDao.findByEmail(anyString())).thenReturn(user);
        MainClass.User expected = new MainClass.User("lucky", "l@t.com", 10);

        MainClass.User result = mainClass.findByEmail("l@t.com");

//        Mockito.verify(userDao).addUser(new MainClass.User("lucky", "l@t.com", 10));

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSpy(){
        List<MainClass.User> users = Mockito.spy(new ArrayList<>());

        users.add(new MainClass.User(null, null, null));
        Mockito.verify(users).add(new MainClass.User(null, null, null));
        assertEquals(1, users.size());
    }

    class MainClassWrapper extends MainClass {
        @Override
        User modifyUser(User user){
            return user;
        }
    }
}