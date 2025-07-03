package model;

import interfaces.Almacenable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Almacen<T> implements Almacenable<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public void agregar(T elemento) {
        if (elemento == null) {
            throw new NullPointerException("Elemento nulo");
        }

        items.add(elemento);

    }

    @Override
    public List<T> obtenerTodos() {
        return items;
    }

    @Override
    public List<T> filtrar(Predicate<? super T> criterio) {
        List<T> listaFiltrada = new ArrayList<>();

        for (T item : items) {
            if (criterio.test(item)) {
                listaFiltrada.add(item);
            }
        }

        return listaFiltrada;

    }

    @Override
    public void paraCadaElemento(Consumer<? super T> accion) {

        for (T item : items) {
            accion.accept(item);
        }

    }

    public List<T> transformar(Function<? super T, ? extends T> transformacion) {
        List<T> toReturn = new ArrayList<>();

        for (T item : items) {
            toReturn.add(transformacion.apply(item));
        }

        return toReturn;

    }

    @Override
    public Iterator<T> iterator() {
        if (!items.isEmpty() && items.get(0) instanceof Comparable) {
            return iterator((Comparator<? super T>) Comparator.naturalOrder());
        }

        return items.iterator();
    }

    public Iterator<T> iterator(Comparator<? super T> comparator) {
        List<T> copiaOrdenados = new ArrayList<>(items);
        copiaOrdenados.sort(comparator);
        return copiaOrdenados.iterator();

    }

}
