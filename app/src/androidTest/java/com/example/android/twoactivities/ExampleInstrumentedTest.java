/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.twoactivities;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    /**   WEB
     *      1. Get the url                  const final STring URL = "blazedemo.com"
     *      2. Find element on page
     *      3. If button, click
     *      4. If text, do something
     *      5. Check actual result = expected result
     */

    /**   ANDROID
     *     1.  What screen do you want test (what screen should i start at)?
     *     2.  Find element on screen (button, edittext, textveiw)
     *     3.  If button --> CLICK ON IT!
     *     4.  If input box --> TYPE STUFF IN IT
     *     5.  If label --> CHECK THE TEXT
     *     6.  Check actual result = expected result
     */



    // 1. Tell Android what screen you want to test
    // In example below, it will start on MainActivity.java
    @Rule
    public ActivityTestRule activityRule =
            new ActivityTestRule<>(MainActivity.class);


    // TEST CASES
    // TC1:  Test that when you push the SEND button, it goes to next screen
    @Test
    public void testGoingToNextPage() throws Exception {
       // onView(withId(R.id.______))

        // get the button and click it
        onView(withId(R.id.button_main)).perform(click());

        sleep(1000);        // i don't know if sleep actually works!

        // on next page, check that there is a label called "text_header"
        onView(withId(R.id.text_header)).check(matches(isDisplayed()));

        sleep(3000);

        // go back to previous page
        //  -- find reply button and click on it?
        onView(withId(R.id.button_second)).perform(click());

        sleep(1000);
    }

    // TC2:  Test then when you type nonsense into box, text appears on page 2
    @Test
    public void testInputBox() {
        // 1. find the text box
        // 2. type some nonsese
        // 3. click on SEND button (find the button + click)
        // 4. make sure text appears

    }



//
//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.example.android.twoactivities", appContext.getPackageName());
//    }

}
