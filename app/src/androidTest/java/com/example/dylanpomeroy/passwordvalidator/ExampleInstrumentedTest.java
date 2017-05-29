package com.example.dylanpomeroy.passwordvalidator;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class) { };

    @Test
    public void tryPassword1(){
        onView(withId(R.id.txtPassEntry))
                .perform(typeText("#herpAd3rp"), closeSoftKeyboard());

        onView(withId(R.id.btnValidate))
                .perform(click());

        onView(withId(R.id.lblPassStrength))
                .check(matches(withText(R.string.strongPassMsg)));
    }

    @Test
    public void tryPassword2(){
        onView(withId(R.id.txtPassEntry))
                .perform(typeText("weakazpass"), closeSoftKeyboard());

        onView(withId(R.id.btnValidate))
                .perform(click());

        onView(withId(R.id.lblPassStrength))
                .check(matches(withText(R.string.weakPassMsg)));
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.dylanpomeroy.passwordvalidator", appContext.getPackageName());
    }
}
