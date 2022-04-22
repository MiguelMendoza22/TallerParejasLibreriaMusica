package com.sofka;

import java.util.ArrayList;
import java.util.Collections;

import static com.sofka.Song.*;

public abstract class Library {
    public ArrayList<Song> songs;

    /**
     * Metodo Constructor que permite crear una instancia de la clase Library.
     */
    public Library(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * Metodo de acceso pare el atributo songs.
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Metodo modificador del atributo songs.
     */
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * este metodo permite agregar una canción al array.
     */
    public void addSong(Song s) {
        this.songs.add(s);
    }

    /**
     * este metodo permite acceder a una canción del array.
     */
    public Song getSong(int id) {
        int index = 0;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getId() == id) {
                index = i;
            }
        }
        return this.songs.get(index);
    }

    public void byDate(String date, ArrayList<Song> filterSongs) {
        filterSongs.stream().filter(song -> song.getDate().equals(date)).forEach(System.out::println);
    }

    public void byGenre(String genre, ArrayList<Song> filterSongs) {
        filterSongs.stream().filter(song -> song.getGenre().equals(genre)).forEach(System.out::println);
    }

    public void sortByYearAsc() {
        Collections.sort(songs, ascendingDateComparator);
    }

    public void sortByYearDesc() {
        Collections.sort(songs, descendingDateComparator);
    }

    public void sortByDurationAsc() {
        Collections.sort(songs, ascendingDurationComparator);
    }

    public void sortByDurationDesc() {
        Collections.sort(songs, descendingDurationComparator);
    }

    @Override
    public String toString() {
        return "Biblioteca de canciones: " + getSongs();
    }
}

