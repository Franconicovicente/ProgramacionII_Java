package Zoologico;

public class Mamiferos extends Animal implements Vacunable {

    public Mamiferos(String nombre, int edad, double peso, TipoDieta dieta) {
        super(nombre, edad, peso, dieta);
    }

    @Override
    public void vacunar() {
        System.out.println("Mamifero vacunado");
    }

    @Override
    public String toString() {

        return "Mamifero " + nombre + " edad: " + edad + " peso: " + peso + " dieta: " + dieta;

    }

}
