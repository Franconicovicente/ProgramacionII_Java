package model;

import interfaces.Reiniciable;

public class ExhibicionTactil extends ModuloInteractivo implements Reiniciable {

    private final int nivelInteractividad;
    private static final int NIVEL_MIN = 1;
    private static final int NIVEL_MAX = 10;

    public ExhibicionTactil(String nombreModulo, String ubicacionSala, TipoPublico publicoObjetivo, int nivelInteractividad) {
        super(nombreModulo, ubicacionSala, publicoObjetivo);
        this.nivelInteractividad = nivelInteractividad;
        validarNivel();
    }

    public void validarNivel() {
        if (nivelInteractividad < NIVEL_MIN || nivelInteractividad > NIVEL_MAX) {
            throw new IllegalArgumentException("Nivel de interactividad invalido");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "ExhibicionTactil{" + "nivelInteractividad=" + nivelInteractividad + '}';
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando Exhibicion Tactil.");
    }

}
