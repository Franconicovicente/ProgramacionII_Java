package services;

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
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import model.GeneroTeatral;
import model.Obra;
import model.ObraTeatral;

public class GestorObras<T extends Comparable<T>> implements Gestionable<T> {

    private List<T> obras = new ArrayList<>();

    @Override
    public void agregar(T elemento) {
        if (elemento == null) {
            throw new NullPointerException("Elemento nulo");
        }

        obras.add(elemento);

    }

    private void comprobarListaVacia() {
        if (obras.isEmpty()) {
            throw new IllegalArgumentException("Lista vacia");
        }
    }

    public static void hardcodearObras(List<? super ObraTeatral> lista) {

        lista.add(new ObraTeatral(200, "Obra Teatral 1", LocalDate.of(2005, Month.MARCH, 12), "Director 1", GeneroTeatral.COMEDIA));
        lista.add(new ObraTeatral(300, "Obra Teatral 2", LocalDate.of(2006, Month.APRIL, 12), "Director 2", GeneroTeatral.DRAMA));
        lista.add(new ObraTeatral(400, "Obra Teatral 3", LocalDate.of(2007, Month.AUGUST, 12), "Director 3", GeneroTeatral.MUSICAL));
        lista.add(new ObraTeatral(500, "Obra Teatral 4", LocalDate.of(2008, Month.DECEMBER, 12), "Director 4", GeneroTeatral.INFANTIL));
        lista.add(new ObraTeatral(600, "Obra Teatral 5", LocalDate.of(2009, Month.FEBRUARY, 12), "Director 5", GeneroTeatral.TRAGEDIA));
        lista.add(new ObraTeatral(700, "Obra Teatral 6", LocalDate.of(2010, Month.JANUARY, 12), "Director 6", GeneroTeatral.TRAGEDIA));
        lista.add(new ObraTeatral(800, "Obra Teatral 7", LocalDate.of(2011, Month.JULY, 12), "Director 7", GeneroTeatral.DRAMA));

    }

    @Override
    public boolean eliminar(T elemento) {

        comprobarListaVacia();
        return obras.remove(elemento);

    }

    @Override
    public int obtener(int indice) {

        comprobarListaVacia();
        return obras.indexOf(indice);

    }

    @Override
    public void limpiar() {

        comprobarListaVacia();
        obras.clear();

    }

    @Override
    public void ordenarNatural(Comparable comparador) {
        Collections.sort(obras);
    }

    @Override
    public void ordenar(Comparator<T> cmp) {

        obras.sort(cmp);

    }

    @Override
    public List<T> filtrar(Predicate<T> criterio) {
        List<T> listaFiltrada = new ArrayList<>();

        for (T obra : obras) {
            if (criterio.test(obra)) {
                listaFiltrada.add(obra);
            }
        }

        return listaFiltrada;
    }

    public static void guardarCSV(List<? extends ObraTeatral> lista, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            if (lista.isEmpty()) {
                throw new IllegalArgumentException("Lista vacia");
            }

            writer.write(ObraTeatral.toHeaderCSV());

            for (ObraTeatral e : lista) {
                writer.write(e.toCSV());
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo: " + ex.getMessage());

        }
    }

public List<T> cargarCSV(String path, Function<String, T> constructor) {
        List<T> toReturn = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String aux;
            br.readLine();

            while ((aux = br.readLine()) != null) {
                T item = constructor.apply(aux);
                toReturn.add(item);
            }
            System.out.println("");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return toReturn;
    }

    public static void serializarObras(List<? extends ObraTeatral> lista, String path) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))) {

            salida.writeObject(lista);

            System.out.println("Serializacion exitosa!");

        } catch (IOException ex) {

            System.out.println("Problema al serializar");

        }
    }

    public static List<ObraTeatral> deserealizarObras(String path) {
        List<ObraTeatral> toReturn = null;

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(path))) {

            toReturn = (List<ObraTeatral>) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return toReturn;
    }

    public static void mostrarContenido(List<? extends Obra> lista) {
        lista.forEach(l -> System.out.println(l));

    }

}
