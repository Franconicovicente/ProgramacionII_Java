package wildcards;

public class Persona implements Amigable {

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public void demostrarCarinio() {
        System.out.println(String.format("%s me da un abrazo", nombre));
    }

}
