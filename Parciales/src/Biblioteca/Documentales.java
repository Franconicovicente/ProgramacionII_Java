package Biblioteca;

public class Documentales extends Materiales implements Digitalizable {
    
    private double duracionMinutos;
    private String temaPrincipal;
    
    
    public Documentales(String titulo, int añoPublicacion, TipoConservacion estadoConservacion, double minutos, String tema) {
        super(titulo, añoPublicacion, estadoConservacion);
        this.duracionMinutos = minutos;
        this.temaPrincipal = tema;
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando documentales...");
    }

    @Override
    public String toString() {
        return "Documentales{" + "duracionMinutos=" + duracionMinutos + ", temaPrincipal=" + temaPrincipal + '}';
    }
     
    
    
}
