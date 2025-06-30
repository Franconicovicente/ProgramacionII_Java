package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class test {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        List<Persona> personas = new ArrayList<>();

        productos.add(new Producto("Fanta", 300));
        productos.add(new Producto("CocaCola", 9000));
        productos.add(new Producto("Pepsi", 6000));
        productos.add(new Producto("Paso de los toros", 4000));
        productos.add(new Producto("Red Bull", 3500));

        personas.add(new Persona("Pedro", 32));
        personas.add(new Persona("Juan", 12));
        personas.add(new Persona("Analia", 22));
        personas.add(new Persona("Lucia", 35));
        personas.add(new Persona("Marcelo", 75));

//        Collections.sort(personas);
        Collections.sort(personas, new ComparadorPorNombrePersona());

//        Collections.sort(productos);
//        Collections.sort(productos, new ComparadorPorNombreProducto());
//        productos.sort(new ComparadorPorNombreProducto());
//
//        for (Producto p : productos) {
//            System.out.println(p);
//        }
        for (Persona p : personas) {
            System.out.println(p);
        }

    }
}
