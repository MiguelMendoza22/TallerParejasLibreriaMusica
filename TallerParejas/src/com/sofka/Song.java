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


    public static Comparator<Song> ascendingDateComparator = (Song s1, Song s2) -> {
        String date1 = s1.getDate();
        String date2 = s2.getDate();
        return date1.compareTo(date2);
    };

    public static Comparator<Song> descendingDateComparator = (Song s1, Song s2) -> {
        String date1 = s1.getDate();
        String date2 = s2.getDate();
        return date2.compareTo(date1);
    };

    public static Comparator<Song> ascendingDurationComparator = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 < duration2) return -1;
        if (duration1 > duration2) return 1;
        return 0;
    };

    public static Comparator<Song> descendingDurationComparator = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 > duration2) return -1;
        if (duration1 < duration2) return 1;
        return 0;
        //return duration2 - duration1;
    };

    @Override
    public String toString() {
        return "\n" + id + ". " + title + ". " + date + ". " + duration + ". " + genre;
    }
}



