package EjercicioSeis;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        GenericoSeis<Integer> lista = new GenericoSeis<>();
        lista.setDatos(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(buscarElemento(lista.getDatos(), 5));

    }

    public static <T> boolean buscarElemento(List<T> lista, T elemento) {

        for (T lis : lista) {
            if (lis.equals(elemento)) {
                return true;
            }
        }

        return false;
    }

}
