package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    // Tweets is given a final modifier to make it so it doesn't need to be changed since it is never
    // changed with some other ArrayList<Tweet>(), also there was never a chance to change its value to begin with.
    private final ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
