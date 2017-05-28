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

        password.text = "2$h0rT";
        assertFalse(password.validate());

        password.text = "noupperca$3";
        assertFalse(password.validate());

        password.text = "NOLOWERCA$3";
        assertFalse(password.validate());

        password.text = "NoSymbols";
        assertFalse(password.validate());

        password.text = "ValidPas$word1";
        assertTrue(password.validate());

        password.text = "V4l1dP4$$w0rd2";
        assertTrue(password.validate());
    }
}