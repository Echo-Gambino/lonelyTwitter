package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public abstract class Mood {

    private Date date;

    Mood() {
        this.date = getDate();
    }

    public Mood(Date date) { this.date = date; }

    public Date getDate() { return date; }

    public void setDate() { this.date = date; }

    public abstract String getMoodText();

}
