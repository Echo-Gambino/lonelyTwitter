package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public abstract class Tweet implements Tweetable {
    // Two attributes with access modifiers of private
    private String message;
    private Date date;

    public Tweet(String message) { // Constructor #1
        this.message = message;
    }

    public Tweet(String message, Date date) { // Constructor #2
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();
}
