package EjercicioDos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        agregarElemento(lista, "Hola");
        agregarElemento(lista, "Chau");
        agregarElemento(lista, "Bienvenido");
        List<Integer> listaInt = new ArrayList<>();
        agregarElemento(listaInt, 3);
        agregarElemento(listaInt, 4);
        agregarElemento(listaInt, 5);
        System.out.println(lista);
        System.out.println(listaInt);

    }

    public static <T> void agregarElemento(List<T> dato, T elemento) {

        dato.add(elemento);

    }

}
