package Biblioteca;

public abstract class Materiales {

    protected String titulo;
    protected int añoPublicacion;
    protected TipoConservacion estadoConservacion;

    public Materiales(String titulo, int añoPublicacion, TipoConservacion estadoConservacion) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.estadoConservacion = estadoConservacion;
    }

}
