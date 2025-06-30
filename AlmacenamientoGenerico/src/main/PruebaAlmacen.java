package main;

import enums.Tipo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import model.Almacen;
import model.ComparadorProductoMarca;
import model.ComparadorProductoPrecio;
import model.Producto;

public class PruebaAlmacen {

    public static void main(String[] args) {

        Almacen<String> almacenString = new Almacen<>();
        Almacen<Integer> almacenInteger = new Almacen<>();
        Almacen<Producto> almacenProducto = new Almacen<>();

        almacenProducto.agregar(new Producto(1234, "Coca Cola", 13145, Tipo.BEBIDA));
        almacenProducto.agregar(new Producto(5678, "Papas", 13465, Tipo.COMIDA));
        almacenProducto.agregar(new Producto(222324, "Red Bull", 135145, Tipo.BEBIDA));
        almacenProducto.agregar(new Producto(9101112, "Trapo", 135445, Tipo.LIMPIEZA));
        almacenProducto.agregar(new Producto(13141516, "Tablet", 13445, Tipo.TECNOLOGIA));
        almacenProducto.agregar(new Producto(1718, "Computadora", 1331345, Tipo.TECNOLOGIA));
        almacenProducto.agregar(new Producto(192021, "Fanta", 132245, Tipo.BEBIDA));

//        almacenProducto.mostrarContenido();
        Iterator<Producto> it = almacenProducto.iterator(new ComparadorProductoMarca());
        Iterator<Producto> it1 = almacenProducto.iterator(new ComparadorProductoPrecio());
        

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("########");
        
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        

    }

}
