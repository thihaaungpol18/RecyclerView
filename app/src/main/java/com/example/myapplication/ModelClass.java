package com.example.myapplication;

import android.graphics.Color;

/**
 * project: My Application
 * Created by : Thiha Eung
 * date : 1/21/2020
 */
public class ModelClass {

    private String mName;
    private int mImage;
    private int mBgcolor;


    public ModelClass(String mName, int mImage, int mBgcolor) {
        this.mName = mName;
        this.mImage = mImage;
        this.mBgcolor = mBgcolor;
    }

    public String getmName() {
        return mName;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmBgcolor() {
        return mBgcolor;
    }
}
