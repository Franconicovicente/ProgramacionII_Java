package interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public interface Gestionable<T> {

    void agregar(T elemento);

    boolean eliminar(T elemento);

    int obtener(int indice);

    void limpiar();

    void ordenarNatural(Comparable comparador);

    void ordenar(Comparator<T> cmp);

    List<T> filtrar(Predicate<T> criterio);

}
