package com.example.android.tourguideapp;

/**
 * Created by xervice111 on 25-03-2018.
 */

public class Info {

    // Get the Item name

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    // Get the item description
    private String mitemName;
    private String mitemDescription;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Making a Constructor
    //@param itemName store the item name
    //@param itemDescription store the item description
    //@param imageResourseId store the image

    public Info(String itemName, String itemDescription, int imageReasiurseId) {

        mitemName = itemName;

        mitemDescription = itemDescription;

        mImageResourceId = imageReasiurseId;
    }

    // Get the item name

    public String getmitemName() {
        return mitemName;
    }

    // Get the item Description

    public String getmitemDescription() {
        return mitemDescription;
    }

    // Get the image Resourse Id

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether there is a image for the info

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
