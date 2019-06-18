package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xervice111 on 25-03-2018.
 */

public class InfoAddapter extends ArrayAdapter<Info> {
    // Resourse id for background colors for list of items
    private int mcolorResourseId;

    // defining the constructor
    public InfoAddapter(Context context, ArrayList<Info> infos, int colorResourseId) {
        super(context, 0, infos);
        mcolorResourseId = colorResourseId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if exsisting view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        // Get the object located in the list

        Info currentInfo = getItem(position);
        // Find the text view for item name

        TextView itemTextView = (TextView) listItemView.findViewById(R.id.item_name);

        // Set this text to item name

        itemTextView.setText(currentInfo.getmitemName());

        // Find the textView fot item description

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.item_description);

        // Set this text to description

        descriptionTextView.setText(currentInfo.getmitemDescription());

        // Find the image for the image view

        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.image_view);

        // Set this image to that image view

        itemImageView.setImageResource(currentInfo.getmImageResourceId());

        // Set the color for the listitem

        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resourse Id maps to

        int color = ContextCompat.getColor(getContext(), mcolorResourseId);

        //Set the background color of the text container view

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
