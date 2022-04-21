package com.sofka;

import java.util.Comparator;

public class Song {

    private String title;
    private int id;
    private String date;
    private float duration;
    private String genre;
    private String cover;
    private String description;

    public Song() {
    }

    public Song(String title, int id, String date, float duration, String genre, String cover, String description) {

        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public float getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }

}

