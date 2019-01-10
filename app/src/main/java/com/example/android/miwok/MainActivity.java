/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        NumbersClickListener clickListener = new NumbersClickListener();

        //Find View that shows number category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that view
        numbers.setOnClickListener(clickListener);

    }

    public void openNumbersList(View view){

        Intent intent = new Intent(this,NumbersActivity.class);
        startActivity(intent);
    }

    public void openColorsList(View view){

        Intent intent = new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }

    public void openPhrasesList(View view){

        Intent intent = new Intent(this,PhrasesActivity.class);
        startActivity(intent);
    }

    public void openFamilyMembersList(View view){

        Intent intent = new Intent(this,FamilyMembersActivity.class);
        startActivity(intent);
    }
}
