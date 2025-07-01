package services;

import interfaces.Manejable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import model.Actividad;
import model.ActividadDeportiva;

public class GestorActividades<T> implements Manejable<T> {

    List<T> elementos = new ArrayList<>();

    @Override
    public void agregar(T elemento) {
        if (elemento == null) {
            throw new NullPointerException("Elemento nulo");
        }

        elementos.add(elemento);

    }

    private void comprobarListaVacia() {
        if (elementos.isEmpty()) {
            throw new IllegalArgumentException("Lista vacia");
        }
    }

    @Override
    public void eliminar(T elemento) {
        comprobarListaVacia();
        elementos.remove(elemento);

    }

    @Override
    public int getIndiceElemento(T elemento) {
        comprobarListaVacia();

        return elementos.indexOf(elemento);

    }

    @Override
    public void limpiarElementos() {
        comprobarListaVacia();
        elementos.clear();
    }

    @Override
    public void ordenar(Comparator<T> comparador) {

        comprobarListaVacia();

        elementos.sort(comparador);

    }

    @Override
    public List<T> filtrar(Predicate<T> filtro) {
        List<T> nuevaLista = new ArrayList<>();

        comprobarListaVacia();

        for (T filtrado : elementos) {
            if (filtro.test(filtrado)) {
                nuevaLista.add(filtrado);
            }
        }

        return nuevaLista;

    }

    public static void guardarElementosCSV(List<? extends ActividadDeportiva> lista, String path) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            if (lista.isEmpty()) {
                throw new IllegalArgumentException("Lista vacia");
            }

            writer.write(ActividadDeportiva.toHeaderCSV());

            for (ActividadDeportiva e : lista) {
                writer.write(e.toCSV());
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo: " + ex.getMessage());

        }
    }

    public static List<ActividadDeportiva> cargarElementosCSV(String path) {
        List<ActividadDeportiva> toReturn = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String aux;
            br.readLine();

            while ((aux = br.readLine()) != null) {
                toReturn.add(ActividadDeportiva.fromCSV(aux));
            }
            System.out.println("");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return toReturn;
    }

    public static void serializarElementos(List<? extends ActividadDeportiva> lista, String path) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))) {

            salida.writeObject(lista);

            System.out.println("Serializacion exitosa!");

        } catch (IOException ex) {

            System.out.println("Problema al serializar");

        }
    }

    public static List<ActividadDeportiva> deserializarElementos(String path) {
        List<ActividadDeportiva> toReturn = null;

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(path))) {

            toReturn = (List<ActividadDeportiva>) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return toReturn;
    }

    public static void mostrarContenido(List<? extends Actividad> lista) {
        lista.forEach(e -> System.out.println(e));

    }

    public List<T> getElementos() {
        return elementos;
    }

}
