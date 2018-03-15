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
        String message = bundle != null ? bundle.getString("MainMessage") : null;   // The single line if statement is to catch the possibility of bundle being null
        Date date = (Date) bundle.get("MainDate");
        TextView textview = (TextView) findViewById(R.id.textView);
        String text = message + "\n" + date.toString();
        textview.setText(text);
    }
}
