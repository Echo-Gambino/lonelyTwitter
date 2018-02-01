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

/**
 * Provides an interface to interact with Tweet
 *
 * @author hingyue
 * @version 1.5
 * @see Tweet
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
