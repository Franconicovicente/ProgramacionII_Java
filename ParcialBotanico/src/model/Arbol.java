package model;

public class Arbol extends Planta implements Podable {

    private double alturaMaxima;

    public Arbol(String nombre, String ubicacion, String clima, double alturaMaxima) {
        super(nombre, ubicacion, clima);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void podable() {
        System.out.println("Podando arbol.");
    }

    @Override
    public String toString() {
        return super.toString() + "Arbol{" + "alturaMaxima=" + alturaMaxima + '}';
    }

}
