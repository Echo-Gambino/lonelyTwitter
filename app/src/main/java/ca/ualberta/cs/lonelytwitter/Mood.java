package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public abstract class Mood {                            // Example of abstract bases / classes

    private Date date;                                  // Example of attribute

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }   // Example of constructor

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public abstract String getMood();

}
