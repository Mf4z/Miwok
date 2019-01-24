package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        //Get Current Word Position
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default word from the current Word object and
        // set this text on the defaultWord TextView
        defaultWord.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok word from the current Word object and
        // set this text on the miwokWord TextView
        miwokWord.setText(currentWord.getMiwokTranslation());

        //FInd ImageView in the list_item.xml with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //Checks if Image view has an resource id passed to it
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE); //Set image visible incase in was intially not visible when recyling
        }
        else{//Set visibility to gone to show no space of image
            imageView.setVisibility(View.GONE);
        }
        //Returns the whole list item layout (Containing two text views)
        return listItemView;
    }





}
