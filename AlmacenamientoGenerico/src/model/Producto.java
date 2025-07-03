package model;

import enums.Tipo;

public class Producto implements Comparable<Producto> {

    private int id;
    private String nombre;
    private double precio;
    private Tipo tipo;

    public Producto(int id, String nombre, double precio, Tipo tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(Producto p) {
        return Integer.compare(id, p.id);
    }

}
