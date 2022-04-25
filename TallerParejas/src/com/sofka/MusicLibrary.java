package com.sofka;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicLibrary {

    public static void main(String[] args) {
        Library tracks = new Library(new ArrayList<>()) {
        };
        ArrayList<Playlist> playlists = new ArrayList<>();


        Song s1 = new Song(001, "Solo tu", "2019", 3.22f, "Pop", "Caratula.jpg",
                "escrita y producida por german lozano en colaboracion con Diana del Mar");
        tracks.addSong(s1);

        Song s2 = new Song(002, "Ella", "2008", 2.33f, "Balada", "Caratula.jpg",
                "escrita y producida por Antonio Contreras y varios asrtistas invitados");
        tracks.addSong(s2);

        Song s3 = new Song(003, "La cruz de Santiago", "2007", 5.43f, "Metal", "Caratula.jpg",
                "Cancion escrita por el grupo español Mago de Oz");
        tracks.addSong(s3);

        Song s4 = new Song(004, "Adios", "2022", 1.59f, "Pop", "Caratula.jpg",
                "Antonio Cipriany y Vyky autores de la cancion");
        tracks.addSong(s4);

        Song s5 = new Song(005, "Soledad", "1995", 4.53f, "Balada", "Caratula.jpg",
                "Maria Jimena Lozano creador musical y compositora");
        tracks.addSong(s5);

        Song s6 = new Song(006, "Hijo de la luna", "2009", 5.43f, "Metal", "Caratula.jpg",
                "version producida por el grupo zaratoga cambiando su genero original");

        Song s1 = new Song("Solamente tú", 001, "2011", 4.17f, "Pop",
                "https://i1.sndcdn.com/artworks-000454267401-2lvtd5-t500x500.jpg",
                "Solamente tú es el nombre del primer sencillo del cantor español Pablo Alborán, de su álbum debut homónimo.");
        tracks.addSong(s1);

        Song s2 = new Song("Fuiste tú", 002, "2011", 4.55f, "Balada",
                "https://i.pinimg.com/originals/33/48/28/334828ba56edcb10f13072cda777c867.jpg",
                "Fuiste tú es una canción interpretada por el cantante Ricardo Arjona y Gaby Moreno,");
        tracks.addSong(s2);

        Song s3 = new Song("Enter Sandman", 003, "1991", 5.31f, "Metal",
                "https://www.plasticosydecibelios.com/wp-content/uploads/2020/03/artworks-000258189284-6xuusb-t500x500-460x460.jpg",
                "Enter Sandman es una canción de la banda estadounidense de thrash metal Metallica,");
        tracks.addSong(s3);

        Song s4 = new Song("Levitating", 004, "2020", 3.50f, "Pop",
                "https://jenesaispop.com/wp-content/uploads/2020/09/dualipa-dababy.jpg",
                "Levitating es una canción de la cantante británica Dua Lipa.");
        tracks.addSong(s4);

        Song s5 = new Song("Un siglo sin ti", 005, "2003", 4.22f, "Balada",
                "https://www.buenamusica.com/media/fotos/discos/c/chayanne/chayanne_un-siglo-sin-ti.jpg",
                "Un siglo sin ti es el título de la canción del artista Chayanne");
        tracks.addSong(s5);

        Song s6 = new Song("The Trooper", 006, "1983", 4.23f, "Metal",
                "https://lastfm.freetls.fastly.net/i/u/ar0/c8c0af60220945fc94f36810e5f3ac82",
                "The Trooper es una canción de la banda inglesa de heavy metal Iron Maiden.");

        tracks.addSong(s6);

        Scanner s = new Scanner(System.in);
        int menu1 = 0;
        try {
            do {

                System.out.println("\n Reproductor Musical");
                System.out.println("""

                        Seleccione alguna de las siguientes opciones:

                        1. Listar todas las canciones.\n
                        2. Crear Playlist.\n
                        3. Aplicar filtros a la busqueda.\n
                        4. Modificar Orden a lista de Canciones.\n

                        5. Salir del Reproductor:""");

                        5. Salir del Reproductor""");


                menu1 = Integer.parseInt(s.nextLine());
                switch (menu1) {
                    case 1:
                        System.out.println(tracks);
                        break;

                    case 2:
                        System.out.println("Por favor indique un nombre para su Playlist");
                        String name = s.nextLine();
                        Playlist pl = new Playlist(name, new ArrayList<>());
                        playlists.add(pl);
                        int menu2 = 0;
                        do {
                            System.out.println("Opciones de la playlist " + name
                                    + "\n1. Agregar canciones.\n2. Mostrar canciones."
                                    + "\n3. Regresar al menú principal");

                            menu2 = Integer.parseInt(s.nextLine());
                            switch (menu2) {
                                case 1: {

                                    System.out.println(
                                            "Por favor indique el identificador de la canción que desea agregar:");
                                    int song = Integer.parseInt(s.nextLine());
                                    pl.addSong(tracks.getSong(song));
                                }

                                case 2: {
                                    System.out.println(pl);
                                }
                                    break;

                                break;

                            }
                        } while (menu2 != 3);
                        break;

                    case 3:
                        System.out.println("""

                                Filtrar por Genero y Año:

                                1. Filtrar canciones por Género.\n
                                2. Filtrar canciones por Año.
                                 """);
                        int filter = Integer.parseInt(s.nextLine());
                        switch (filter) {
                            case 1: {
                                System.out.println("Indique el género por el que desea filtrar");
                                String genre = s.nextLine();

                                tracks.Genre(genre, tracks.getSongs());
                            }
                            case 2: {
                                System.out.println("Indique el año por el que desea filtrar");
                                String year = s.nextLine();
                                tracks.Date(year, tracks.getSongs());

                                tracks.byGenre(genre, tracks.getSongs());
                                break;
                            }
                            case 2: {
                                System.out.println("Indique el año por el que desea filtrar");
                                String date = s.nextLine();
                                tracks.byDate(date, tracks.getSongs());
                                break;

                            }
                            default:
                                System.out.println(tracks);

                        }
                        break;

                    case 4:
                        System.out.println("""
                                ¿Desea ordenar la lista de canciones?:
                                1. Orden Ascendente  por Año.\n
                                2. Orden Descendente por Año.\n
                                3. Orden Ascendente  por Duración.\n
                                4. Orden Descendente por Duración.\n

                                 """);
                        int order = Integer.parseInt(s.nextLine());
                        switch (order) {
                            case 1:

                                tracks.sortYearAsc();
                            case 2:
                                tracks.sortYearDesc();

                                tracks.sortDateAsc();
                            case 2:
                                tracks.sortDateDesc();

                            case 3:
                                tracks.sortDurationAsc();
                            case 4:
                                tracks.sortDurationDesc();
                            default: {
                            }



                                System.out.println(tracks);

                            System.out.println(tracks);

                        }

                }
            } while (menu1 != 5);
        } catch (NumberFormatException e) {
            System.out.println("Error: Verificar el dato ingresado");
        }

      }
}                                      


   
