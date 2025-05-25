package Expediciones;

public abstract class NaveEspacial {

    protected String nombre;

    protected int capacidadTripulacion;

    protected int añoLanzamiento;

    public NaveEspacial(String nombre, int capacidadTripulacion, int añoLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.añoLanzamiento = añoLanzamiento;
    }

    public void realizarMision() {

        System.out.println("Nave " + nombre + " iniciando exploracion");

    }

    @Override
    public String toString() {
        return "Nombre nave: " + nombre + " Capacidad Tripulantes: " + capacidadTripulacion + " Anio lanzamiento: " + añoLanzamiento;
    }

}
