package Biblioteca;

public class Revistas extends Materiales{
    private int nroEdicion;
    private String mesPublicacion; 

    public Revistas(int nroEdicion, String mesPublicacion, String titulo, int añoPublicacion, TipoConservacion estadoConservacion) {
        super(titulo, añoPublicacion, estadoConservacion);
        this.nroEdicion = nroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String toString() {
        return "Revistas{" + "nroEdicion=" + nroEdicion + ", mesPublicacion=" + mesPublicacion + '}';
    }
}
