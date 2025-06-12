package EjercicioTres;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        GenericoTres<String> datoString = new GenericoTres<>();

        datoString.setDatos(Arrays.asList("Hola", "Chau", "XD"));

        imprimirLista(datoString.getDatos());

    }

    public static void imprimirLista(List<?> dato) {
        for (Object elemento : dato) {
            System.out.println(elemento);
        }
    }

}
