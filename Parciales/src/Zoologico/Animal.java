package Zoologico;

public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected double peso;
    protected TipoDieta dieta;

    public Animal(String nombre, int edad, double peso, TipoDieta dieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.dieta = dieta;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
