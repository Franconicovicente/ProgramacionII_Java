package Zoologico;

public class Aves extends Animal implements Vacunable {

    private double envergaduraAlas;

    public Aves(String nombre, int edad, double peso, TipoDieta dieta, double envergaduraAlas) {
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void vacunar() {
        System.out.println("Ave vacunada");
    }

    @Override
    public String toString() {
        return "Ave " + nombre + " edad: " + edad + " peso: " + peso + " dieta: " + dieta + " Envergadura alas: " + envergaduraAlas;
    }

}
