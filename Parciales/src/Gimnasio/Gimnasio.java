package Gimnasio;

import java.util.ArrayList;
import java.util.List;

public class Gimnasio {

    private final List<Entrenador> entrenadores;

    private String nombreGimnasio;

    public Gimnasio(String nombreGimnasio) {
        this.entrenadores = new ArrayList<>();
        this.nombreGimnasio = nombreGimnasio;
    }

    public void agregarEntrenadores(Entrenador e) {

        if (e == null) {
            throw new NullPointerException();
        }

        entrenadores.add(e);

    }

    public void mostrarSueldos() {
        System.out.println("Lista sueldos gimnasio " + nombreGimnasio);
        for (Entrenador e : entrenadores) {
            System.out.println(String.format("%-20s $ %8.2f", e.nombreCompleto(), e.getSueldo()));
        }
    }

    public PersonalTrainer entrenadorMasClientes() {
        PersonalTrainer toReturn = null;

        for (Entrenador e : entrenadores) {
            if (e instanceof PersonalTrainer p) {
                if (toReturn == null || toReturn.getNroClientes() < p.getNroClientes()) {
                    toReturn = p;
                }
            }
        }

        return toReturn;

    }

}
