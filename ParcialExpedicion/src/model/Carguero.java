package model;

import interfaces.Explorable;

public class Carguero extends Nave implements Explorable {

    private final double capacidadCarga;
    private static final double CAPACIDAD_CARGA_MIN = 100;
    private static final double CAPACIDAD_CARGA_MAX = 500;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, double capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
        validarCapacidad();
    }

    private void validarCapacidad() {
        if (capacidadCarga < CAPACIDAD_CARGA_MIN || capacidadCarga > CAPACIDAD_CARGA_MAX) {
            throw new IllegalArgumentException("Capacidad invalida");
        }
    }

    @Override
    public void iniciarExploracion() {
        System.out.println("Carguero de nombre: " + this.getNombre() + " iniciando exploracion");
    }

    @Override
    public String toString() {
        return "Carguero{" + super.toString() + "capacidadCarga=" + capacidadCarga + '}';
    }

}
