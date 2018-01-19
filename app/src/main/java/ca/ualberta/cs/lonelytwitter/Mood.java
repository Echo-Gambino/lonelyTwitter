package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public abstract class Mood implements MoodTable {                            // Example of abstract bases / classes

    private Date date;                                  // Example of attribute
    private String userMood;

    public Mood(String text) {
        this.userMood = text;
    }   // Example of constructor

    public Mood(String text, Date date) {
        this.userMood = text;
        this.date = date;
    }

    public String getUserMood() { return this.userMood; }

    public void setUserMood(String text) {
        if (text.length() > 100) {
            text = "Error";
        }

        this.userMood = text;
    }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public abstract String getMoodText();

}
