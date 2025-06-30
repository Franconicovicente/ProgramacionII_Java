package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private double precio;
    private List<Producto> items;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.items = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", items=" + items + '}';
    }

    public void agregarItem(Producto item) {
        items.add(item);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto p) {
        return Double.compare(this.getPrecio(), p.getPrecio());
    }

}
