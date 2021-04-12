package com.example.helloworld;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndriodJUnit4.class)
public class MainActivityTest{
    @Rule
    public ActivityTestRule<MainActivity> test
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void hasString(){
        onView(withID(R.id.helloWorldText)).check(matches(withText(R.string.hello_world)));
    }

}