package interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import model.Evento;
import model.EventoMusical;

public interface Gestionable<T> {

    void agregarElemento(T elemento);

    void eliminarElemento(T elemento);

    int getElemento(T elemento);

    void limpiarElementos();

    List<T> ordenarPorCriterio(Comparator<T> comparador);

    List<T> filtrarElementos(Predicate<T> filtro);

    

}
