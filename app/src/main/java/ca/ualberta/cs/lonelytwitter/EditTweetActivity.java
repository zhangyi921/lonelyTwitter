package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        TextView message = (TextView) findViewById(R.id.textView);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            content = mBundle.getString("content");
            Log.i("debug", "ddd");
            message.setText(content);

        }
    }
}
