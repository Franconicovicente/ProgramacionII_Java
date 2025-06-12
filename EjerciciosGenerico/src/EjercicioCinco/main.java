package EjercicioCinco;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        GenericoCinco<Integer> listaInteger = new GenericoCinco<>();
        GenericoCinco<Integer> listaNueva = new GenericoCinco<>();

        listaInteger.setDatos(Arrays.asList(10, 20, 30, 40, 50, 60));

        combinarListas(listaInteger.getDatos(), listaNueva.getDatos());

        System.out.println("Lista nueva: " + listaNueva.getDatos());

    }

    public static <T> void combinarListas(List<T> listaRecibida, List<T> listaDevuelta) {

        for (T elemento : listaRecibida) {
            listaDevuelta.add(elemento);
        }

    }

}
