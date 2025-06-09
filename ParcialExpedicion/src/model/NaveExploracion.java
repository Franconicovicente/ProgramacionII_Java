package model;

import interfaces.Explorable;

public class NaveExploracion extends Nave implements Explorable {

    private final TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, TipoMision tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }
    
    @Override
    public void iniciarExploracion() {
        System.out.println("Nave de Exploracion de nombre " + this.getNombre() + " iniciando exploracion");
    }

    @Override
    public String toString() {
        return "NaveExploracion{" + super.toString() + "tipoMision=" + tipoMision + '}';
    }

}
