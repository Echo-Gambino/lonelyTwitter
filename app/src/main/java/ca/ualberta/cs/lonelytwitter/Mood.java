/*
 * January 31, 2018
 *
 * Copyright 2018 Hing Yue Lam
 *
 */
package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

/**
 * Represents Mood.
 *
 * @author hingyue
 * @version 1.5
 * @see MoodHappy
 * @see MoodNeutral
 * @see MoodSad
 */
public abstract class Mood {                            // Example of abstract bases / classes

    private Date date;                                  // Example of attribute

    /**
     * Constructs a Mood object
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * Constructs a Mood object
     *
     * @param date
     */
    public Mood(Date date) {
        this.date = date;
    }   // Example of constructor

    /**
     * Retrieves the date from the Mood object
     *
     * @return date
     */
    public Date getDate() { return date; }

    /**
     * Sets the Mood object's Date variable (this.date) with the given argument (date).
     *
     * @param date
     */
    public void setDate(Date date) { this.date = date; }

    /**
     * Returns a string representing what mood (or more specifically, what variant of mood) the
     * the object has, which can only be returned in one of Mood's child classes that
     * fully implemented getMood.
     *
     * @return String
     */
    public abstract String getMood();

}
