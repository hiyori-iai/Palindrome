package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    public static final String TAG = "CPTR320";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        String message = getString(R.string.about_info);
        Log.i(TAG, message);
        LinearLayout layout = new LinearLayout(this);
        TextView textView = new TextView(this);
        textView.setText(message);
        layout.addView(textView);
        setContentView(layout);
    }
}