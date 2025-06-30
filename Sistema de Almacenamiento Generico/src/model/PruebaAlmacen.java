package model;

import interfaces.Almacenable;
import java.util.Iterator;

public class PruebaAlmacen {

    public static void main(String[] args) {

        Almacen<String> almacenString = new Almacen<>();
        Almacen<Producto> almacenProducto = new Almacen<>();
        
        Producto producto1 = new Producto(10, "Coca Cola", 3000, Tipo.BEBIDA);
        Producto producto2 = new Producto(11, "Cepillo", 4000, Tipo.LIMPIEZA);
        Producto producto3 = new Producto(12, "Leche", 2000, Tipo.LACTEO);

        System.out.println("Almacen de String:");
        almacenString.agregarItem("Hola");
        almacenString.agregarItem("Bienvenido");
        almacenString.agregarItem("Welcome");

        mostrarContenido(almacenString);
        
        System.out.println("##############");
        
        System.out.println("Almacen de Productos: ");
        almacenProducto.agregarItem(producto1);
        almacenProducto.agregarItem(producto2);
        almacenProducto.agregarItem(producto3);
        mostrarContenido(almacenProducto);

    }

    public static <T> void mostrarContenido(Almacenable<T> lista) {

        Iterator<T> it = lista.getLista().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
