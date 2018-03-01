package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setup() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void testTweet() {
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);

        solo.enterText((EditText) solo.getView(R.id.body), "test Tweet");

        solo.clickOnButton("Save");

        solo.clearEditText((EditText) solo.getView(R.id.body));

        assertTrue(solo.waitForText("Test Tweet!"));
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}