package com.sofka;

import java.util.Comparator;

/**
 * La clase Song contiene los atributos de las canciones y los métodos para acceder a sus atributos.
 *
 * @version 1.00.00 2022-04-24
 *
 * @author Jesús Miguel Molina Mendoza.
 */


public class Song {

    private String title;
    private int id;
    private String date;
    private float duration;
    private String genre;
    private String cover;
    private String description;


    /**
     *Constructor: permite crear una instancia de la clase Song.
     * @param title
     * @param id
     * @param date
     * @param duration
     * @param genre
     * @param cover
     * @param description
     */
    public Song(String title, int id, String date, float duration, String genre, String cover, String description) {

        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;

    }

    /**
     * Método accesor del atributo title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método accesor del atributo id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Método accesor del atributo date
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * Método accesor del atributo duration
     * @return
     */
    public float getDuration() {
        return duration;
    }

    /**
     * Método accesor del atributo genre
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método accesor del atributo cover
     * @return
     */
    public String getCover() {
        return cover;
    }

    /**
     * Método accesor del atributo description
     * @return
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sobreescribe el método toString para mostrar los datos de la canción de la manera deseada.
     * @return
     */
    @Override
    public String toString() {
        return "\n" + id + ". " + title + ". " + date + ". " + duration + ". " + genre;
    }
}



