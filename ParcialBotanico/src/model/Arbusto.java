package model;

public class Arbusto extends Planta implements Podable {

    private int densidadFollaje;

    public Arbusto(String nombre, String ubicacion, String clima, int densidadFollaje) {
        super(nombre, ubicacion, clima);
        this.densidadFollaje = densidadFollaje;
    }

    @Override
    public void podable() {
        System.out.println("Podando arbusto.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Densidad de Follaje: " + densidadFollaje;
    }

}
