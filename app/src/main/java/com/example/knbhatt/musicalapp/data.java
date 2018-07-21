package com.example.knbhatt.musicalapp;

/**
 * Created by KN Bhatt on 7/18/2018.
 */
public class data {
    private String song;
    private String singer;
    private int photo;

    public data() {
    }

    public data(String song, String singer, int photo) {
        this.song = song;
        this.singer = singer;
        this.photo = photo;
    }

    public String getSong() {
        return song;
    }

    public int getPhoto() {
        return photo;
    }

    public String getSinger() {
        return singer;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
