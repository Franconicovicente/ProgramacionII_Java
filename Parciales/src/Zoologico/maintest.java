package Zoologico;

public class maintest {

    public static void main(String[] args) {

        EmpleadoZoologico EmpleadoA = new EmpleadoZoologico("juan");

        cargarZoo(EmpleadoA);

    }

    public static void cargarZoo(EmpleadoZoologico empleado) {

        Aves pajaro = new Aves("Pajaro", 3, 5, TipoDieta.HERVIBORO, 45.6);

        Reptiles iguana = new Reptiles("Iguana", 3, 4, TipoDieta.CARNIVORO, "Dura", "ectotermia");

        Mamiferos murcielago = new Mamiferos("Murcielago", 3, 4, TipoDieta.OMNIVORO);
        try {
            empleado.agregarAnimal(iguana);
            empleado.agregarAnimal(murcielago);
            empleado.agregarAnimal(pajaro);

            empleado.mostrarAnimales();

            empleado.vacunarAnimales(murcielago);

        } catch (AnimalRepetidoException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
