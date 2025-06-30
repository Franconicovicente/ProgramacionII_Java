package model;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long SerialVersionUID = 1L;
    private int dni;

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    private String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }

    public String toCSV() {
        return nombre + "," + dni;
    }

}
