package com.example.palindrome;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import java.util.Stack;

public class SupportingActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(0,100,0,0);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        textView1.setTextSize(20);
        textView2.setTextSize(24);
        //textView2.setPadding(0,20,0,0);
        Intent intent = getIntent();
        String sentence = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView1.setText("The sentence: " + sentence);
        layout.addView(textView1);
        String pldm = "<br><em>This sentence is a palindrome.</em>";
        String npldm = "<br><em>This sentence is not a palindrome.</em>";
        if(isPalindrome(sentence)) textView2.setText(HtmlCompat.fromHtml(pldm, 0)); //using the html text
        else textView2.setText(HtmlCompat.fromHtml(npldm, 0));
        layout.addView(textView2);
        setContentView(layout);
    }

    private boolean isPalindrome(String input) {
        String str = input;
        String[] arr1 = str.split("");
        Stack<String> stack = new Stack<>();
        for (String s: arr1){
            stack.push(s);
        }
        int count = 0;
        while(count<arr1.length/2) {
            if (!stack.pop().equalsIgnoreCase(arr1[count++])) {
                return false;
            }
        }
        return true;
    }

}
