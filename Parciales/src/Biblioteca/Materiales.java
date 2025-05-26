package Biblioteca;

public abstract class Materiales {

    private String titulo;
    private int añoPublicacion;
    private TipoConservacion estadoConservacion;

    public Materiales(String titulo, int añoPublicacion, TipoConservacion estadoConservacion) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.estadoConservacion = estadoConservacion;
    }

}
