package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        String message = getString(R.string.help_info);
        LinearLayout layout = new LinearLayout(this);
        TextView textView = new TextView(this);
        textView.setText(message);
        layout.addView(textView);
        setContentView(layout);
    }
}