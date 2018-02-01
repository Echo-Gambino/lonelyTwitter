/*
 * January 31, 2018
 *
 * Copyright 2018 Hing Yue Lam
 *
 */
package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents a normal tweet, which is derived from its parent class tweet.
 *
 * @author hingyue
 * @version 1.5
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs the NormalTweet object
     *
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs the NormalTweet object
     *
     * @param message
     * @param date
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     * The method isImportant returns false as the object is assigned to not be important
     *
     * @return false
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}
