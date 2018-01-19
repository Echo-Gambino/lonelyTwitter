package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public class MoodSad extends Mood {

    MoodSad() { super(); }

    MoodSad(Date date) { super(date); }

    @Override
    public String getMood() {
        return "Sad";
    }

}