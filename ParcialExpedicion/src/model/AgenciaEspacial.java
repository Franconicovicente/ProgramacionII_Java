package model;

import exceptions.NaveRepetidaException;
import interfaces.Explorable;
import java.util.ArrayList;
import java.util.List;

public class AgenciaEspacial {

    private final String nombre;
    private List<Nave> naves;

    public AgenciaEspacial(String nombre) {
        this.nombre = nombre;
        this.naves = new ArrayList<>();
        validarNombreNulo();
    }

    private void validarNombreNulo() {
        if (nombre == null) {
            throw new NullPointerException("Nombre de agencia nulo");
        }
    }

    public void agregarNave(Nave nave) {
        if (nave == null) {
            throw new NullPointerException("Nave nula");
        }

        for (Nave n : naves) {
            if (n.getNombre().equalsIgnoreCase(nave.getNombre()) && n.getAnioLanzamiento() == nave.getAnioLanzamiento()) {
                throw new NaveRepetidaException();
            }
        }

        naves.add(nave);

    }

    public void mostrarNaves() {

        if (naves.isEmpty()) {
            throw new IllegalArgumentException("No hay naves en la agencia");
        }

        for (Nave n : naves) {
            System.out.println(n);
        }
    }

    public void iniciarExploracion() {
        for (Nave n : naves) {
            if (n instanceof Explorable naveExplorable) {
                naveExplorable.iniciarExploracion();
            } else {
                throw new IllegalArgumentException("Nave " + n.getNombre() + " no es explorable.");
            }
        }
    }

}
