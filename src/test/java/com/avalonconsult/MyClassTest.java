package com.avalonconsult;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by risdenk on 4/8/15.
 */
public class MyClassTest {

    @Test
    public void testMyMethod() throws Exception {
        String testString = "test";

        MyClass myClass = new MyClass();
        assertEquals(myClass.myMethod(testString), testString.length());
    }
}