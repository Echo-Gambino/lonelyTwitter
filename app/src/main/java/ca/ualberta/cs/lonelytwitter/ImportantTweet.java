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
 * Represents an important tweet, which is derived from its parent class tweet.
 *
 * @author hingyue
 * @version 1.5
 * @see Tweet
 */
public class ImportantTweet extends Tweet{

    /**
     * Constructs the ImportantTweet object
     *
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs the ImportantTweet object
     *
     * @param message
     * @param date
     */
    ImportantTweet(String message, Date date){
       super(message,date);
    }

    /**
     * Returns true as all ImportantTweet objects are defined as important
     *
     * @return true
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
