package com.example.roshni.myapplication;

public class movie
{
    private String mMovie;
    private String mRelease;
    private int mID;
    private String mpresent,mabsent;
    public movie(int ID,String Movie,String Release,String present,String absent)
    {
        mID=ID;
        mMovie=Movie;
        mRelease=Release;
        mpresent=present;
        mabsent=absent;
    }
    public int getmImageDrawable() {
        return mID;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mID = mImageDrawable;
    }

    public String getmName() {
        return mMovie;
    }

    public String getmpresent() {
        return mpresent;
    }

    public String getmabsent() {
        return mabsent;
    }

    public void setmName(String mName) {
        this.mMovie = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }
}
