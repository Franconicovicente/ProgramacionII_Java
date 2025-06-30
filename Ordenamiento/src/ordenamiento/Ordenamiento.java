package ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(List.of(3, 4, 5, 8, 1));
        
        List<Persona> personas = new ArrayList<>(List.of(
                new Persona(123, "Pedro", 'M', 12.3, Nacionalidad.ARGENTINA),
                new Persona(234, "Juan", 'M', 17, Nacionalidad.BRASILERA),
                new Persona(456, "Cristobal", 'M', 11.3, Nacionalidad.CHILENA),
                new Persona(789, "Pascual", 'M', 19.3, Nacionalidad.URUGUAYA)
        ));

//        mostrarLista(numeros);
        mostrarLista(personas);
        
        System.out.println("###########");

//        Collections.sort(numeros);
        Collections.sort(personas);

        mostrarLista(numeros);
    }

    public static void mostrarLista(List<?> lista) {
        for (Object o : lista) {
            System.out.println(o);
        }
    }

}
