package Gimnasio;

import java.time.LocalDate;
import java.time.Period;

public abstract class Entrenador {

    private int nroLegajo;
    private String nombre;
    private String apellido;
    protected LocalDate fechaIngreso;

    public Entrenador(int nroLegajo, String nombre, String apellido, LocalDate fechaIngreso) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }

    public void validarFecha() {
        if (fechaIngreso.isAfter(LocalDate.now())) {
            throw new FechaException();
        }
    }

    public abstract double getSueldo();

    public int antiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

}
