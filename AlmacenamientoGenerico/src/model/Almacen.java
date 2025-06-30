package model;

import interfaces.Almacenable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Almacen<T> implements Almacenable<T> {

    private List<T> items;

    public Almacen() {
        items = new ArrayList<>();
    }

    @Override
    public void agregar(T item) {
        if (item == null) {
            throw new NullPointerException();
        }

        items.add(item);

    }

    @Override
    public T obtener(int indice) {

        validarListaVacia();

        return items.get(indice);

    }

    @Override
    public void eliminarPorIndice(int indice) {

        validarListaVacia();

        items.remove(indice);

    }

    @Override
    public boolean eliminar(T item) {
        validarListaVacia();

        return items.remove(item);

    }

    @Override
    public boolean contiene(T item) {
        validarListaVacia();

        return items.contains(item);
    }

    @Override
    public int tamanio() {
        return items.size();
    }

    private void validarListaVacia() {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacia");
        }
    }

    @Override
    public void mostrarContenido() {
        for(T item : this){
            System.out.println(item);
        }
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
