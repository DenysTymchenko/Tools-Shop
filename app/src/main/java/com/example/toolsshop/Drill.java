package com.example.toolsshop;

import androidx.annotation.NonNull;

public class Drill {
    private String title;
    private String info;
    private int imageResId;

    public Drill(String title, String info, int imageResId) {
        this.title = title;
        this.info = info;
        this.imageResId = imageResId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResId() {
        return imageResId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
