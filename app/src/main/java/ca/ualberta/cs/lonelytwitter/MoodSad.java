package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodSad extends Mood {
    MoodSad(Date date) { super(date); }

    @Override
    public String getMoodText() {
        return "feeling Sad.";
    }

}