package com.example.anroid.musicapp;

public class Song {
    private String mTitle;
    private String mArtist;


    public Song(String Title, String Artist)
    {
        mTitle = Title;
        mArtist = Artist;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }



}