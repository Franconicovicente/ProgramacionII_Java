package model;

public class CruceEstelar extends Nave {

    private final int cantidadPasajeros;

    public CruceEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
        validarCantPasajeros();
    }

    private void validarCantPasajeros() {
        if (cantidadPasajeros < 0) {
            throw new IllegalArgumentException("Estas mandando una nave con pasajeros negativos.");
        }
    }

    @Override
    public String toString() {
        return "CruceEstelar{" + super.toString() + "cantidadPasajeros=" + cantidadPasajeros + '}';
    }

}
