
package Ejercitacion;

public class Libro {
//    Clase Libro:
//o Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
//o Implementa métodos para avanzar y retroceder páginas.
//o Crea un método que indique si el lector ha terminado de leer el libro.
    private final String titulo;
    private final String autor;
    private int numeroPaginas;
    private int paginaActual;
    private int paginasAvanzadas;
    private int paginasAtras;
    
    
    public Libro (String titulo, String autor, int numeroPaginas, int paginaActual){
        validarDatos(titulo, autor, numeroPaginas, paginaActual);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.paginaActual = paginaActual;
    }
    
    private void validarDatos(String titulo, String autor, int numeroPaginas, int paginaActual){
        if (paginaActual > numeroPaginas){
            throw new IllegalArgumentException("Pagina actual mas grande que el numero de paginas total");
        }
        if (numeroPaginas < 0){
            throw new IllegalArgumentException("Pagina es menor a 1");
        }
        if (paginaActual < 0){
            throw new IllegalArgumentException("Pagina actual es menor a 1");
        }
        if (titulo == null || titulo.trim().isEmpty() || !titulo.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Nombre del titulo no ingresado");
        }
        if (autor == null || autor.trim().isEmpty() || !autor.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Nombre del autor no ingresado");
        }
    }
    
    public int avanzarPagina(int paginasAvanzadas){
        paginaActual += paginasAvanzadas;
        validarDatos(titulo, autor, numeroPaginas, paginaActual);
        return paginaActual;
    }
    
    public int retrocederPagina(int paginasAtras){
        return paginaActual -= paginasAtras;
    }
    public boolean terminoLectura(){
        return paginaActual == numeroPaginas;
    }
    
    public void mostrarDatos(){
        System.out.println("Pagina actual: " + paginaActual);
        if (terminoLectura()){
            System.out.println("Termino el libro");
        }else{
            System.out.println("No termino el libro");
        }
    }
    
    
    
    
    
    
    
}
