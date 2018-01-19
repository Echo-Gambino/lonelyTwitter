package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodSad extends Mood {
    MoodSad(String userMood) { super(userMood); }

    MoodSad(String userMood, Date date) { super(userMood, date); }

    @Override
    public String getMoodText() {
        return "#feelingSad.";
    }

}