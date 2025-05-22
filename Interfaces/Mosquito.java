package Interfaces;

public class Mosquito implements Volador {

    private int edad;
    private String especie;
    private char genero;

    public Mosquito(int edad, String especie, char genero) {
        this.edad = edad;
        this.especie = especie;
        this.genero = genero;
    }

    public void picar() {
        System.out.println("Mira que te pico");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando cerca de tu oreja");
    }

    @Override
    public void despegar() {
        System.out.println("Mosquito despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Mosquito aterrizando");
    }

}
