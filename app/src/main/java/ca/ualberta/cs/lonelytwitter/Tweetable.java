package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Henry on 2018-01-18.
 */

import java.util.Date;
import java.util.List;

public interface Tweetable {

    String getMessage() throws TweetTooLongException;

    Date getDate();

    List<Mood> getMoodList();
}
