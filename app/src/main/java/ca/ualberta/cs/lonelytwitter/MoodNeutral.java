package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodNeutral extends Mood {
    MoodNeutral(Date date) { super(date); }

    @Override
    public String getMoodText() {
        return "feeling Neutral.";
    }

}