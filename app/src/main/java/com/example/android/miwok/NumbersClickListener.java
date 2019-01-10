package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"Open the list of Numbers",Toast.LENGTH_LONG).show();
    }
}
