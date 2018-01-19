package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodHappy extends Mood {
    MoodHappy() { super(); }

    MoodHappy(Date date) { super(date); }

    @Override
    public String getMood() { return "Happy"; }

}