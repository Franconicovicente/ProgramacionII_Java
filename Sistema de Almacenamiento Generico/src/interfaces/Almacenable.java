package interfaces;

import java.util.List;
import java.util.function.Predicate;

public interface Almacenable<T> {

    void agregarItem(T item);
    // agrega un elemento al almacén

    T obtenerIndice(int indice);
    //obtiene un elemento según su posición en el almacén

    void eliminarPorIndice(int indice);
    //elimina un elemento segun su posicion en el almacen

    boolean eliminar(T item);

    boolean contiene(T item);

    //indica si un elemento esta almacenado
    int tamanio();

    //cant de elementos almacenados
    List<T> getLista();

    List<T> filtrar(Predicate<? super T> criterio);
    
}
