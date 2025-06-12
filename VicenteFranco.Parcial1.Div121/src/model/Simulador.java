package model;

public class Simulador extends ModuloInteractivo implements Reiniciable {

    private int duracionMaxima;

    public Simulador(String nombreModulo, String ubicacionSala, TipoPublico publicoObjetivo, int duracionMaxima) {
        super(nombreModulo, ubicacionSala, publicoObjetivo);
        this.duracionMaxima = duracionMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "Simulador{" + "duracionMaxima=" + duracionMaxima + '}';
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando Simulador.");
    }

}
