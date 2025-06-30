package interfaces;

public interface Almacenable<T> extends Iterable<T> {

    void agregar(T item);

    T obtener(int indice);

    void eliminarPorIndice(int indice);

    boolean eliminar(T item);

    boolean contiene(T item);

    int tamanio();
    
    void mostrarContenido();
    

}
