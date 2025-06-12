package EjercicioCuatro;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        GenericoCuatro<Integer> listaFuente = new GenericoCuatro<>();
        GenericoCuatro<Integer> listaDestino = new GenericoCuatro<>();

        listaFuente.setDatos(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        copiarElementos(listaFuente.getDatos(), listaDestino.getDatos());

        System.out.println("Lista destino: " + listaDestino.getDatos());

    }

    public static <T> void copiarElementos(List<? extends T> fuente, List<T> destino) {

        for (T elemento : fuente) {

            destino.add(elemento);

        }

    }

}
