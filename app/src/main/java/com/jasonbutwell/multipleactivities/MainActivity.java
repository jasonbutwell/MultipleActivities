package com.jasonbutwell.multipleactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void changeActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        // pass in some variables from the first Activity
        intent.putExtra("hello","world");

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
