package interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public interface Manejable<T> {

    void agregar(T elemento);

    void eliminar(T elemento);

    int getIndiceElemento(T elemento);

    void limpiarElementos();

    void ordenar(Comparator<T> comparador);

    List<T> filtrar(Predicate<T> filtro);

}
