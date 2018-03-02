package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String message = (String) bundle.get("oldTweetMessage");

        TextView textView = (TextView) findViewById(R.id.textView);
        String textViewMessage = message;

        textView.setText(textViewMessage);

    }
}
