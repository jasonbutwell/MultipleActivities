package com.jasonbutwell.multipleactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public void changeActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the intent from the calling Activity
        Intent intent = getIntent();

        // Attempt to retrieve the variable sent which was hello and is type String
        String string = intent.getStringExtra("hello");

        // log the value of the "hello" variable to the console.
        Log.i("hello", string);
    }
}
