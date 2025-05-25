package Expediciones;

public class CrucerosEstelares extends NaveEspacial {

    private int capacidadPasajeros;

    public CrucerosEstelares(String nombre, int capacidadTripulacion, int añoLanzamiento, int capacidadPasajeros) {
        super(nombre, capacidadTripulacion, añoLanzamiento);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Nombre nave: " + nombre + " Capacidad Tripulantes: " + capacidadTripulacion + " Anio lanzamiento: " + añoLanzamiento + " Capacidad Pasajeros: " + capacidadPasajeros;
    }

}
