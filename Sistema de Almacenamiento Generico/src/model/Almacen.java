package model;

import interfaces.Almacenable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Almacen<T> implements Almacenable<T> {

    private List<T> lista = new ArrayList<>();

    public Almacen() {

    }

    @Override
    public String toString() {
        return "Contenido del almacen:" + lista;
    }

    @Override
    public void agregarItem(T item) {
        if (item == null) {
            throw new NullPointerException("ITEM NULO");
        }

        lista.add(item);

    }

    private void comprobarLista() {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("LISTA VACIA");
        }
    }

    @Override
    public T obtenerIndice(int indice) {
        comprobarLista();
        return lista.get(indice);
    }

    @Override
    public void eliminarPorIndice(int indice) {
        comprobarLista();
        lista.remove(indice);
    }

    @Override
    public boolean eliminar(T item) {
        comprobarLista();
        return lista.remove(item);
    }

    @Override
    public boolean contiene(T item) {
        comprobarLista();
        return lista.contains(item);
    }

    @Override
    public int tamanio() {
        comprobarLista();
        return lista.size();
    }

    @Override
    public List<T> getLista() {
        return lista;
    }

    @Override
    public List<T> filtrar(Predicate<? super T> criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
