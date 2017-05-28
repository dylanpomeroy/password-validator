package com.example.dylanpomeroy.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void validatePassword() throws Exception {
        Password password = new Password("password");
        assertFalse(password.validate());

        password.text = "2short";
        assertFalse(password.validate());
    }
}