package model;

import enums.Tipo;
import interfaces.Almacenable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
        for (T item : this) {
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

    @Override
    public <R> List<R> transformar(Function<? super T, ? extends R> transformacion) {

        List<R> toReturn = new ArrayList<>();

        for (T item : items) {
            toReturn.add(transformacion.apply(item));
        }

        return toReturn;

    }

    public static void mostrarTipo(Almacen<? extends Producto> almacen) {

        almacen.transformar(p -> p.getTipo()).forEach(p -> System.out.println(p));

    }

    public void aumentarComida(Almacen<? extends Producto> almacen) {
        List<? extends Producto> comidas = almacen.filtrar(p -> p.getTipo() == Tipo.COMIDA);

        for (Producto comida : comidas) {
            double precioOriginal = comida.getPrecio();
            double nuevoPrecio = precioOriginal * 1.10;
            // Redondear a 2 decimales
            nuevoPrecio = Math.round(nuevoPrecio * 100.0) / 100.0;
            comida.setPrecio(nuevoPrecio);
        }

    }

}
