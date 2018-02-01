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
 * Represents the happy variant of mood, which is derived from the parent class of mood.
 *
 * @author hingyue
 * @version 1.5
 * @see Mood
 */
public class MoodHappy extends Mood {

    /**
     * Constructs a MoodHappy object
     */
    MoodHappy() { super(); }

    /**
     * Constructs a MoodHappy object
     *
     * @param date
     */
    MoodHappy(Date date) { super(date); }

    /**
     * Retrieves the String that determines mood's variant (in this class, its "Happy")
     *
     * @returns "Happy"
     */
    @Override
    public String getMood() { return "Happy"; }

}