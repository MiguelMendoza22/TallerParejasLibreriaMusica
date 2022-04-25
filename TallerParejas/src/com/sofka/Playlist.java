package com.sofka;

import java.util.ArrayList;

/**
 * La clase Playist tiene los atributos y métodos necesarios para crear y obtener la playlist.
 *
 * @version 1.00.00 2022-04-24

 * @author Jesús Miguel Molina Mendoza
 */

public class Playlist extends Library {

    private String namePlist;

    /**
     * Constructor: permite crear una instancia de la clase Playlist.
     * @param namePlist
     * @param songs
     */

    public Playlist(String namePlist, ArrayList<Song> songs) {
        super(songs);
        this.namePlist = namePlist;
    }

    /**
     * Método accesor del atributo namePlaylist.
     * @return
     */
    public String getNamePlist() {
        return namePlist;
    }

    public void setNamePlist(String namePlist) {
        this.namePlist = namePlist;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la canción.
     * @return
     */
    @Override
    public String toString() {
        return "Playlist: " + namePlist + "\n" + getSongs();
    }


}
