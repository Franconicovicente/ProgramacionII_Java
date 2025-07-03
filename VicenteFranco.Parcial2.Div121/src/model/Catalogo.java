package model;

import interfaces.CSVSerializable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Catalogo<T> implements Serializable {

    private List<T> items = new ArrayList<>();

    public void agregar(T item) {

        if (item == null) {
            throw new NullPointerException("Ingreso un item nulo");
        }

        items.add(item);
    }

    private void checkearListaVacia() {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("Lista vacia");
        }
    }

    public void eliminarItemsPorIndice(int indice) {

        checkearListaVacia();
        items.remove(indice);

    }

    public int obtenerIndicePorItem(T item) {

        checkearListaVacia();
        return items.indexOf(item);

    }

    public void paraCadaElemento(Consumer<? super T> accion) {

        for (T item : items) {
            accion.accept(item);
        }

    }

    public List<T> filtrar(Predicate<? super T> filtro) {

        checkearListaVacia();
        List<T> listaFiltrada = new ArrayList<>();

        for (T item : items) {
            if (filtro.test(item)) {
                listaFiltrada.add(item);
            }
        }

        return listaFiltrada;

    }

    public Iterator<T> ordenar() {
        if (!items.isEmpty() && items.get(0) instanceof Comparable) {
            return ordenar((Comparator<? super T>) Comparator.naturalOrder());
        }

        return items.iterator();
    }

    public Iterator<T> ordenar(Comparator<? super T> comparator) {
        List<T> copiaOrdenados = new ArrayList<>(items);
        copiaOrdenados.sort(comparator);
        return copiaOrdenados.iterator();

    }

    public void guardarEnCSV(Catalogo<T> catalogo, String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(Pelicula.toHeaderCSV());
            bw.newLine();

            for (T item : catalogo.items) {
                bw.write(((CSVSerializable) item).toCSV());
                bw.newLine();
            }
            System.out.println("Archivo CSV guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar CSV: " + e.getMessage());
        }
    }

    public static <T> List<T> cargarDesdeCSV(String path, Function<String, T> constructor) {
        List<T> toReturn = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea = br.readLine(); // Saltar encabezado

            while ((linea = br.readLine()) != null) {

                T aux = constructor.apply(linea);
                if (aux != null) {
                    toReturn.add(aux);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error al leer archivo: " + ex.getMessage());
        }

        return toReturn;
    }

    public static <T> Catalogo<T> cargarDesdeArchivo(String rutaArchivo) throws IOException, ClassNotFoundException {

        try (ObjectInputStream salida = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            return (Catalogo<T>) salida.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error al cargar el archivo: " + e.getMessage());
        }
    }

    public void guardarEnArchivo(String path) {
        try (ObjectOutputStream entrada = new ObjectOutputStream(new FileOutputStream(path))) {
            entrada.writeObject(this);
            System.out.println("Catálogo guardado correctamente en un archivo binario");
        } catch (IOException e) {
            System.out.println("Error al guardar el catálogo: " + e.getMessage());
        }
    }

}
