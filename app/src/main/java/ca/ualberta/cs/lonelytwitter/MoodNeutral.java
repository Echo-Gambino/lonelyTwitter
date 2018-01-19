package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodNeutral extends Mood {
    MoodNeutral(String userMood) { super(userMood); }

    MoodNeutral(String userMood, Date date) { super(userMood, date); }

    @Override
    public String getMoodText() {
        return "#feelingNeutral.";
    }

}