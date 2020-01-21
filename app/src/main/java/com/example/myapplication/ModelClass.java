package com.example.myapplication;

/**
 * project: My Application
 * Created by : Thiha Eung
 * date : 1/21/2020
 */
public class ModelClass {

    private String mName;
    private int mImage;
    private int mBgColor;
    private int mFlagImage;


    public ModelClass(String mName, int mImage, int mBgColor, int mFlagImage) {
        this.mName = mName;
        this.mImage = mImage;
        this.mBgColor = mBgColor;
        this.mFlagImage = mFlagImage;
    }

    public String getmName() {
        return mName;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmBgColor() {
        return mBgColor;
    }

    public int getmFlagImage() {
        return mFlagImage;
    }
}
