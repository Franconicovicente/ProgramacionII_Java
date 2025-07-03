package model;

import enums.Genero;
import interfaces.CSVSerializable;
import java.io.Serializable;

public class Pelicula implements Comparable<Pelicula>, Serializable, CSVSerializable {

    private int id;
    private String titulo;
    private String director;
    private Genero genero;

    public Pelicula(int id, String titulo, String director, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero + '}';
    }

    @Override
    public String toCSV() {
        return id + "," + titulo + "," + director + "," + genero;
    }

    public static String toHeaderCSV() {
        return "id, titulo, director, genero\n";
    }

    public static Pelicula fromCSV(String linea) {
        Pelicula toReturn = null;

        if (linea.endsWith("\n")) {
            linea = linea.substring(linea.length() - 1);
        }

        String[] values = linea.split(",");
        if (values.length == 4) {
            int id = Integer.parseInt(values[0]);
            String titulo = values[1];
            String director = values[2];
            Genero genero = Genero.valueOf(values[3]);
            toReturn = new Pelicula(id, titulo, director, genero);
        }

        return toReturn;
    }

    @Override
    public int compareTo(Pelicula p) {
        return Integer.compare(this.getId(), p.getId());
    }

}
