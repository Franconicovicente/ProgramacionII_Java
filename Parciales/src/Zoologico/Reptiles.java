package Zoologico;

public class Reptiles extends Animal {

    private final String tipoEscama;
    private final String regTemperatura;

    public Reptiles(String nombre, int edad, double peso, TipoDieta dieta, String tipoEscama, String regTemperatura) {
        super(nombre, edad, peso, dieta);
        this.tipoEscama = tipoEscama;
        this.regTemperatura = regTemperatura;
    }

    @Override
    public String toString() {
        return "Reptil " + nombre + " edad: " + edad + " peso: " + peso + " dieta: " + dieta + " tipo escama: " + tipoEscama + " Reg Temperatura " + regTemperatura;
    }

}
