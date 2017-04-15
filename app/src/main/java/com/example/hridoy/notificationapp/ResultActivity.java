package com.example.hridoy.notificationapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextClock;

/**
 * Created by Hridoy on 24-10-16.
 */
public class ResultActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    private void initialization() {
        TextClock time=(TextClock)findViewById(R.id.time);
        time.setVisibility(View.VISIBLE);
    }
}
