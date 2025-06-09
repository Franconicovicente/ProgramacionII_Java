package model;

import java.time.LocalDate;

public class Libros extends Publicaciones implements Leible {

    private String autor;
    private Genero genero;

    public Libros(String titulo, LocalDate añoPublicacion, String autor, Genero genero) {

        super(titulo, añoPublicacion);
        this.autor = autor;
        this.genero = genero;

    }

    @Override
    public void leer() {
        System.out.println("Leyendo libro.");
    }

    @Override
    public String toString() {
        return "Libros{" + "autor=" + autor + ", genero=" + genero + '}';
    }

}
