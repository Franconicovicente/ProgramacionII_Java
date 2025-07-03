package model;

import enums.Tipo;

public class Producto {

    private String nombre;
    private double precio;
    private Tipo tipo;

    public Producto(String nombre, double precio, Tipo tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

}
