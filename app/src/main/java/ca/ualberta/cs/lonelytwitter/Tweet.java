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
 * Represents a tweet.
 *
 * @author hingyue
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    /**
     * Constructs a tweet object (Empty constructor)
     */
    Tweet() {}

    /**
     * Constructs a tweet object
     *
     * @param message Tweet message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message Tweet message
     * @param date tweet date.
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Retrieves tweet's Date variable date.
     *
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Retrieves tweet's String variable message.
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }


    /**
     * Sets the object Tweet's message variable with the given argument message.
     *
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
    * Sets the object Tweet's date with the given argument date.
    *
    * @param date
    */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Method that determines if a tweet is or isn't important, but can only be plausibly determined
     * by children classes that implement this isImportant boolean class.
     *
     * @return boolean
     */
    public abstract boolean isImportant();

    /**
     * Returns Tweet's String variable message
     *
     * @return message
     */
    @Override
    public String toString(){
        return message;
    }
}
