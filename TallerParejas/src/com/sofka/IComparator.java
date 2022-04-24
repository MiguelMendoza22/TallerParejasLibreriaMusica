package com.sofka;

import java.util.Comparator;

public interface IComparator {

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

}
