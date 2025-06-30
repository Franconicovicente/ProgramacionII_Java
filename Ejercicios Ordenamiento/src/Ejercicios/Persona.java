package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private List<Persona> personas;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.personas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", personas=" + personas + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(this.edad, p.edad);
    }

}
