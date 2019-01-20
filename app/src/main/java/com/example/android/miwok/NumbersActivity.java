package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

      //Create A List of Numbers
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        // Add Numbers to Activity Layout
        //Find Root view so we can add child view
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


        for(int index = 0; index < words.size(); index++){ //For Loop more concise than While
            //Creating a new TextView
            TextView wordView = new TextView(this);

            // Set the text to be word at the current index
            wordView.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordView);

        }

    }

}
