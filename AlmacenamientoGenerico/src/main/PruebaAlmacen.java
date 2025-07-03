package main;

import enums.Tipo;
import java.util.Iterator;
import model.Almacen;
import model.ComparadorProductoMarca;
import model.Producto;

public class PruebaAlmacen {

    public static void main(String[] args) {
//
//        Almacen<String> almacenString = new Almacen<>();
//        Almacen<Integer> almacenInteger = new Almacen<>();
        Almacen<Producto> almacenProducto = new Almacen<>();

        almacenProducto.agregar(new Producto(1234, "Coca Cola", 13145, Tipo.BEBIDA));
        almacenProducto.agregar(new Producto(5678, "Papas", 13465, Tipo.COMIDA));
        almacenProducto.agregar(new Producto(222324, "Red Bull", 135145, Tipo.BEBIDA));
        almacenProducto.agregar(new Producto(9101112, "Trapo", 135445, Tipo.LIMPIEZA));
        almacenProducto.agregar(new Producto(13141516, "Tablet", 13445, Tipo.TECNOLOGIA));
        almacenProducto.agregar(new Producto(1718, "Computadora", 1331345, Tipo.TECNOLOGIA));
        almacenProducto.agregar(new Producto(192021, "Fanta", 132245, Tipo.BEBIDA));

//        almacenProducto.mostrarContenido();
//        Iterator<Producto> it = almacenProducto.iterator(new ComparadorProductoMarca());
//
//        System.out.println("------ Productos ordenados por Marca -------");
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        almacenProducto.forEach(p -> System.out.println(p));

        System.out.println("----- Filtrados por Tipo Bebida ----- ");

        almacenProducto.filtrar(p -> p.getTipo() == Tipo.BEBIDA).forEach(p -> System.out.println(p));

        System.out.println("----- Precio productos ----- ");

        almacenProducto.paraCadaElemento(p -> {

            System.out.println("- " + p.getNombre() + "," + p.getPrecio());

        });

        System.out.println("----- Productos por TIPO ----- ");

        Almacen.mostrarTipo(almacenProducto);

        System.out.println("----- Aumentar COMIDAS ----- ");

        almacenProducto.aumentarComida(almacenProducto);

        almacenProducto.mostrarContenido();

    }

}
