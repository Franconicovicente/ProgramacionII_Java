package model;

import java.util.ArrayList;
import java.util.List;

public class Botanico {

    private String nombre;
    private List<Planta> plantas;

    public Botanico(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public void agregarPlanta(Planta planta) {

        if (planta == null) {
            throw new NullPointerException("PLANTA NULA");
        }
        for (Planta p : plantas) {
            if (p.getNombre().equalsIgnoreCase(planta.getNombre()) && p.getUbicacion().equalsIgnoreCase(planta.getUbicacion())) {
                throw new PlantaRepetidaException();
            }
        }

        plantas.add(planta);

    }

    public void mostrarPlantas() {
        for (Planta p : plantas) {
            System.out.println(p);
        }
    }

    public void podarPlantas() {
        for (Planta p : plantas) {
            if (p instanceof Podable plantaPodable) {
                plantaPodable.podable();
            } else {
                System.out.println("La planta con nombre " + p.getNombre() + " no es podable.");
            }
        }

    }

}
