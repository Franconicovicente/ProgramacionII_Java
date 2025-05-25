package Zoologico;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoZoologico {

    private final String nombreEmpleado;
    private List<Animal> animales;

    public EmpleadoZoologico(String nombre) {
        this.nombreEmpleado = nombre;
        this.animales = new ArrayList<>();
    }

    private void verificarAnimal(Animal animal) {
        if (animal == null) {
            throw new NullPointerException("Animal nulo");
        }

        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(animal.getNombre()) && a.getEdad() == animal.getEdad()) {
                throw new AnimalRepetidoException();
            }
        }
    }

    public void agregarAnimal(Animal animal) {

        verificarAnimal(animal);

        animales.add(animal);

    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }

    public void vacunarAnimales(Vacunable animal) {
        animal.vacunar();
    }

}
