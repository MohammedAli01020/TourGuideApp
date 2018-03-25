package com.example.mohamed.tourguideapp.data;

public class DataModel {
    private String mTitle;
    private int mImageResourceId;
    private String mDescription;

    String getmTitle() {
        return mTitle;
    }

    int getmImageResourceId() {
        return mImageResourceId;
    }

    String getmDescription() {
        return mDescription;
    }

    public DataModel(String mTitle, int mImageResourceId, String mDescription) {

        this.mTitle = mTitle;
        this.mImageResourceId = mImageResourceId;
        this.mDescription = mDescription;
    }
}
