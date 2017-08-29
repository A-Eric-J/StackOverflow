package com.hfad.stackoverflow;

import android.os.health.UidHealthStats;

import java.util.List;

/**
 * Created by amir ali on 8/23/2017.
 */


public class SimpleListEntry {

    private String image;
    private String sub;
    private String tags;
    private String tick;
    public SimpleListEntry(String image, String sub, String tags, String tick) {
        this.image = image;
        this.sub = sub;
        this.tags = tags;
        this.tick = tick;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTick() {
        return tick;
    }

    public void setTick(String tick) {
        this.tick = tick;
    }
}