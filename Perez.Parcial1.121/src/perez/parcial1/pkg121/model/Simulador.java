package perez.parcial1.pkg121.model;

public class Simulador  extends Modulo implements Reiniciable{
    private int duracion;

    public Simulador(String nombre, int sala, TipoPublico tipo, int duracion) {
        super(nombre, sala, tipo);
        this.duracion = duracion;
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando " + getNombre() + "...");
    }

    @Override
    public String toString() {
        return super.toString() + ", duracion: " + duracion + "'";
    }
    
    
}
