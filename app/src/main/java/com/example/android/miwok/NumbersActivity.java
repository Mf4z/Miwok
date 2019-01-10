package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Array of Numbers

        String[] engNumbers = new String[10];
        engNumbers[0] = "One";
        engNumbers[1] = "Two";
        engNumbers[2] = "Three";
        engNumbers[3] = "Four";
        engNumbers[4] = "Five";
        engNumbers[5] = "Six";
        engNumbers[6] = "Seven";
        engNumbers[7] = "Eight";
        engNumbers[8] = "Nine";
        engNumbers[9] = "Ten";

        Log.v("NumbersActivity","Number : "+engNumbers[0]);
        Log.v("NumbersActivity","Number : "+engNumbers[1]);

    }

}
