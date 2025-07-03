package main;

import enums.Tipo;
import java.util.List;
import model.Almacen;
import model.Producto;

public class main {

    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregar(new Producto("Coca", 1000, Tipo.COMESTIBLE));
        almacen.agregar(new Producto("Pepsi", 1500, Tipo.COMESTIBLE));
        almacen.agregar(new Producto("Salems Lot", 3000, Tipo.LIBRO));
        almacen.agregar(new Producto("Martillo", 5000, Tipo.HERRAMIENTA));
        almacen.agregar(new Producto("Ventana", 10000, Tipo.OTRO));

        System.out.println("---- Productos Almacenados ----");
        almacen.forEach(a -> System.out.println(a));

        System.out.println("---- Productos Comestibles ----");

        almacen.filtrar(a -> a.getTipo() == Tipo.COMESTIBLE).forEach(a -> System.out.println(a));

        System.out.println("---- Productos por Nombre ----");
        almacen.paraCadaElemento(a -> System.out.println(a.getNombre()));

        System.out.println("---- Productos por Aumento ----");
        List<Producto> productosTransformados = almacen.transformar(p -> {
            if (p.getTipo() == Tipo.COMESTIBLE) {
                double nuevoPrecio = Math.round(p.getPrecio() * 1.10 * 100.0) / 100.0;
                return new Producto(p.getNombre(), nuevoPrecio, p.getTipo());
            } else {
                return new Producto(p.getNombre(), p.getPrecio(), p.getTipo());
            }
        });

        productosTransformados.forEach(p -> System.out.println(p));

    }

}
