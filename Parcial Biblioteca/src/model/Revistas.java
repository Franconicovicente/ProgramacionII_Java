package model;

import java.time.LocalDate;

public class Revistas extends Publicaciones implements Leible {

    private int nroEdicion;

    public Revistas(String titulo, LocalDate añoPublicacion, int nroEdicion) {
        super(titulo, añoPublicacion);
        this.nroEdicion = nroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo revista.");
    }

    @Override
    public String toString() {
        return "Revistas{" + "nroEdicion=" + nroEdicion + '}';
    }

}
