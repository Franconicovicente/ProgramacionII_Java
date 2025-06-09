package model;

public abstract class Nave {

    private final String nombre;
    private final int capacidadTripulacion;
    private final int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
        validarDatos();
    }

    private void validarDatos() {
        if (nombre == null) {
            throw new NullPointerException("Nombre de nave nulo");
        }
        if (capacidadTripulacion < 0) {
            throw new IllegalArgumentException("Capacidad menor a 0");
        }
        if (anioLanzamiento < 0) {
            throw new IllegalArgumentException("Anio negativo");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadTripulacion=" + capacidadTripulacion + ", anioLanzamiento=" + anioLanzamiento + '}';
    }

}
