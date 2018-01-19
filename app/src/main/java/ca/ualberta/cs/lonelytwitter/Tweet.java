package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Tweet implements Tweetable {
    // Two attributes with access modifiers of private
    private String message;
    private Date date;
    private List<Mood> moodList;

    public Tweet() { // Constructor #1
        this.date = new Date();
        moodList = new ArrayList<Mood>();
        this.moodList.add(new MoodHappy());
        this.moodList.add(new MoodSad());
        this.moodList.add(new MoodNeutral());
    }

    public Tweet(String message) { // Constructor #1
        this();
        this.message = message;
    }

    public Tweet(String message, Date date) { // Constructor #2
        this(message);
        this.date = date;
    }

    public void addMood(Mood mood) {
        this.moodList.add(mood);
    }

    public List<Mood> getMoodList() {
        return this.moodList;
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
