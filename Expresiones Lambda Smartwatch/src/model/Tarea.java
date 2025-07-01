package model;

import java.time.LocalDate;

public class Tarea {

    private String nombre;
    public boolean completada;
    private LocalDate fechaVencimiento;
    private int duracion;
    private int prioridad;

    public Tarea(String nombre, boolean completada, LocalDate fechaVencimiento, int duracion, int prioridad) {
        this.nombre = nombre;
        this.completada = completada;
        this.fechaVencimiento = fechaVencimiento;
        this.duracion = duracion;
        this.prioridad = prioridad;
        validarDatos();
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", completada=" + completada + ", fechaVencimiento=" + fechaVencimiento + ", duracion=" + duracion + ", prioridad=" + prioridad + '}';
    }

    private void validarDatos() {
        if (nombre == null) {
            throw new NullPointerException("nombre nulo");
        }

        if (prioridad != 1 && prioridad != 2 && prioridad != 3) {
            throw new IllegalArgumentException("Prioridad no valida");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getPrioridad() {
        return prioridad;
    }

}
