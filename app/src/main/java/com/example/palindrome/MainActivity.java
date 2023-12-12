package com.example.palindrome;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "CPTR320";
    public static final String EXTRA_MESSAGE = "cptr320.palindrome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputText = (EditText) findViewById(R.id.inputText);
        inputText.selectAll();;
    }

    public void sentMessage(View view){
        Log.i(TAG, "Button pushed.");
        EditText inputText = findViewById(R.id.inputText);
        String message = inputText.getText().toString();
        Log.i(TAG, "The sentence is " + message);
        Intent intent = new Intent(this, SupportingActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id==R.id.about){
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        } else if (id==R.id.help){
            startActivity(new Intent(this, HelpActivity.class));
            return false;
        }
        return true;
    }
}