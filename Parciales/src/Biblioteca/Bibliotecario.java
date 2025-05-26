package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario {

    private String nombreBibliotecario;
    private List<Materiales> material;

    public Bibliotecario(String nombreBibliotecario) {
        this.nombreBibliotecario = nombreBibliotecario;
        this.material = new ArrayList<>();
    }

    public void agregarMaterial(Materiales m) {

        if (m == null) {
            throw new NullPointerException();
        }

        material.add(m);

    }

    public void mostrarMaterial() {
        for (Materiales m : material) {
            System.out.println(m);
        }
    }

    public void digitalizarMateriales(Digitalizable d) {
        d.digitalizar();
    }

}
