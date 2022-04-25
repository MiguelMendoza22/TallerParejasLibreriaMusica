package com.sofka;

import java.util.Comparator;

/**
 * La interface IComparator contiene los métodos para ordenar las canciones de forma ascendente o descendente.
 *
 * @version 1.00.00 2022-04-24
 *
 * @author Jesús Miguel Molina Mendoza.
 */
public interface IComparator {

    /**
     * Permite comparar las canciones por el atributo date
     * para posteriormente ser ordenadas de forma ascendente
     */
    public static Comparator<Song> ascendingDateComparator = (Song s1, Song s2) -> {
        String date1 = s1.getDate();
        String date2 = s2.getDate();
        return date1.compareTo(date2);
    };

    /**
     * Permite comparar las canciones por el atributo date
     * para posteriormente ser ordenadas de forma descendente
     */
    public static Comparator<Song> descendingDateComparator = (Song s1, Song s2) -> {
        String date1 = s1.getDate();
        String date2 = s2.getDate();
        return date2.compareTo(date1);
    };

    /**
     * Permite comparar las canciones por el atributo duration
     * para posteriormente ser ordenadas de forma ascendente
     */
    public static Comparator<Song> ascendingDurationComparator = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 < duration2) return -1;
        if (duration1 > duration2) return 1;
        return 0;
    };

    /**
     * Permite comparar las canciones por el atributo duration
     * para posteriormente ser ordenadas de forma descendente
     */
    public static Comparator<Song> descendingDurationComparator = (Song s1, Song s2) -> {
        float duration1 = s1.getDuration();
        float duration2 = s2.getDuration();
        if (duration1 > duration2) return -1;
        if (duration1 < duration2) return 1;
        return 0;
        //return duration2 - duration1;
    };

}
