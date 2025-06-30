package javaland;

import java.io.Serializable;

public class Mago implements Serializable {

    private static final long SerialVersionUID = 1;
    private String nombre;
    private int nivelMagia;

    public Mago(String nombre, int nivelMagia) {
        this.nombre = nombre;
        this.nivelMagia = nivelMagia;
    }

    @Override
    public String toString() {
        return "Mago{" + "nombre=" + nombre + ", nivelMagia=" + nivelMagia + '}';
    }

}
