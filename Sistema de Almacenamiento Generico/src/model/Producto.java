package model;

public class Producto {

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

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

}
