package model;

import interfaces.Gestionable;
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
import java.util.List;
import java.util.function.Predicate;

public class GestorEventos<T> implements Gestionable<T>, Serializable {

    private List<T> eventos = new ArrayList<>();

    @Override
    public void agregarElemento(T elemento) {

        if (elemento == null) {
            throw new NullPointerException("Elemento nulo");
        }

        eventos.add(elemento);

    }

    private void verificarListaVacia() {
        if (eventos.isEmpty()) {
            System.out.println("Lista de eventos vacia.");
        }
    }

    @Override
    public void eliminarElemento(T elemento) {
        verificarListaVacia();
        eventos.remove(elemento);

    }

    @Override
    public int getElemento(T elemento) {
        verificarListaVacia();

        return eventos.indexOf(elemento);

    }

    @Override
    public void limpiarElementos() {
        verificarListaVacia();

        eventos.clear();
    }

    @Override
    public List<T> ordenarPorCriterio(Comparator<T> comparador) {

        List<T> listaOrdenada = new ArrayList<>();

        listaOrdenada.sort(comparador);

        return listaOrdenada;

    }

    @Override
    public List<T> filtrarElementos(Predicate<T> filtro) {

        List<T> listaFiltrada = new ArrayList<>();

        for (T elemento : eventos) {
            if (filtro.test(elemento)) {
                listaFiltrada.add(elemento);
            }
        }

        return listaFiltrada;

    }

    public static void guardarElementosCSV(List<? extends Evento> lista, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            if (lista.isEmpty()) {
                throw new IllegalArgumentException("Lista vacia");
            }

            writer.write(EventoMusical.toHeaderCSV());

            for (Evento e : lista) {
                writer.write(e.toCSV());
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo: " + ex.getMessage());

        }
    }

    public static List<EventoMusical> cargarElementosCSV(String path) {
        List<EventoMusical> toReturn = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String aux;
            br.readLine();

            while ((aux = br.readLine()) != null) {
                toReturn.add(EventoMusical.fromCSV(aux));
            }
            System.out.println("");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return toReturn;
    }

    public static void mostrarElementos(List<? extends Evento> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("Lista vacia");
        }
        lista.forEach(e -> System.out.println(e));
    }

    public static void guardarElementosBinario(List<? extends Evento> lista, String path) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))) {

            salida.writeObject(lista);

            System.out.println("Serializacion exitosa!");

        } catch (IOException ex) {

            System.out.println("Problema al serializar");

        }

    }

    public static List<EventoMusical> cargarElementosBinario(String path) {
        List<EventoMusical> toReturn = null;

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(path))) {

            toReturn = (List<EventoMusical>) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return toReturn;
    }
}
