package model;

import interfaces.Reiniciable;
import exceptions.ModuloRepetidoException;
import java.util.ArrayList;
import java.util.List;

public class PersonalMuseo {

    private String nombre;
    private List<ModuloInteractivo> modulos;

    public PersonalMuseo(String nombre) {
        this.nombre = nombre;
        modulos = new ArrayList<>();
    }

    public void agregarModulo(ModuloInteractivo modulo) {

        if (modulo == null) {
            throw new NullPointerException();
        }
        for (ModuloInteractivo m : modulos) {
            if (m.getNombre().equalsIgnoreCase(modulo.getNombre()) && m.getUbicacionSala().equalsIgnoreCase(modulo.getUbicacionSala())) {
                throw new ModuloRepetidoException();
            }
        }

        modulos.add(modulo);

    }

    public void mostrarModulos() {

        if (modulos.isEmpty()) {
            throw new IllegalArgumentException("Modulos vacio.");
        }

        for (ModuloInteractivo m : modulos) {
            System.out.println(m);
        }

    }

    public void reiniciarModulos() {

        for (ModuloInteractivo m : modulos) {
            if (m instanceof Reiniciable moduloReiniciable) {
                moduloReiniciable.reiniciar();
            } else {
                System.out.println("El modulo de nombre " + m.getNombre() + " no se puede reiniciar");
            }
        }

    }

    public List<ModuloInteractivo> filtrarPorPublico(TipoPublico tipo) {
        List<ModuloInteractivo> tipoFiltrado = new ArrayList<>();

        for (ModuloInteractivo m : modulos) {
            if (m.getPublicoObjetivo().equals(tipo)) {
                tipoFiltrado.add(m);
            }
        }

        return tipoFiltrado;
    }

}
