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
 * Represents the sad variant of mood, which is derived from the parent class of mood.
 *
 * @author hingyue
 * @version 1.5
 * @see Mood
 */
public class MoodSad extends Mood {

    /**
     * Constructs a MoodSad object
     */
    MoodSad() { super(); }

    /**
     * Constructs a MoodSad object
     *
     * @param date
     */
    MoodSad(Date date) { super(date); }

    /**
     * Retrieves the String that determines mood's variant (in this class, its "Sad")
     *
     * @returns "Sad"
     */
    @Override
    public String getMood() {
        return "Sad";
    }

}