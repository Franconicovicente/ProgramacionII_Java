package Biblioteca;

public class Libros extends Materiales implements Digitalizable{

    private String autorPrincipal;
    private int nroPaginas;

    public Libros(String autorPrincipal, int nroPaginas, String titulo, int añoPublicacion, TipoConservacion estadoConservacion) {
        super(titulo, añoPublicacion, estadoConservacion);
        this.autorPrincipal = autorPrincipal;
        this.nroPaginas = nroPaginas;
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando libro...");
    }

    @Override
    public String toString() {
        return "Libros{" + "autorPrincipal=" + autorPrincipal + ", nroPaginas=" + nroPaginas + '}';
    }

}
