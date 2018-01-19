package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;

public interface Tweetable {

    String getMessage() throws TweetTooLongException;

    Date getDate();

}
