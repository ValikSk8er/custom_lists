package com.valiksk8;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class MainClassTest {

    private MainClass mainClass = new MainClass();

    @Test
    public void testSumPositiveScenario(){
        int expectedResult = 10;
        int actualResult = mainClass.sum(5,5);

        Assert.assertEquals(expectedResult, actualResult);
    }


}