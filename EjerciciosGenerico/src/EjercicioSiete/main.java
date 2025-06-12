package EjercicioSiete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {

        GenericoSiete<Integer> listaInt = new GenericoSiete<>();

        listaInt.setDatos(new ArrayList<>(Arrays.asList(null, 1, 2, 3, 4, null)));

        eliminarNulos(listaInt.getDatos());

        System.out.println("Lista: " + listaInt.getDatos());

    }

    public static <T> void eliminarNulos(List<T> lista) {

        Iterator<T> it = lista.iterator();

        while (it.hasNext()) {
            T elemento = it.next();
            if (elemento == null) {
                it.remove();
            }
        }

    }

}
