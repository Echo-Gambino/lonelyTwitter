package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodHappy extends Mood {
    MoodHappy(String userMood) { super(userMood); }     // Example of inheritance

    MoodHappy(String userMood, Date date) { super(userMood, date); }

    @Override
    public String getMoodText() { return "#feelingHappy."; }

}