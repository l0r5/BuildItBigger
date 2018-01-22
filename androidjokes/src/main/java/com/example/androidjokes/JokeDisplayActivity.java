package com.example.androidjokes;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    private static final String INTENT_EXTRA_JOKE = "joke";

    public static Intent launchIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeDisplayActivity.class);
        intent.putExtra(INTENT_EXTRA_JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarby);

        String joke = getIntent().getStringExtra(INTENT_EXTRA_JOKE);
        if (joke == null)
            joke = "Joke is null";

        tellAJoke(joke);




    }

    private void tellAJoke(String joke) {
        TextView textView = findViewById(R.id.tv_joke);
        textView.setText(joke);
    }


}
