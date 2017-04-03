package com.example.android.miwok;

/**
 * Created by Mayank on 3/26/2017.
 */

public class Word
{
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = -1;
    private int mMedia;

    public Word(String defaultTranslation, String miwokTranslation, int mediaFile)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMedia = mediaFile;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image, int mediaFile)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = image;
        mMedia = mediaFile;
    }

    public String getMiwok()
    {
        return this.mMiwokTranslation;
    }
    public String getEnglish()
    {
        return this.mDefaultTranslation;
    }
    public int getImageResourceId()
    {
        return this.mImageResourceId;
    }
    public boolean hasImage()
    {
        return mImageResourceId != -1 ? true : false;
    }
    public int getMedia()
    {
        return this.mMedia;
    }
}
