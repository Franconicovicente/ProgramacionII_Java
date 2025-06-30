package ordenamiento;

public class Persona implements Comparable<Persona> {

    private int dni;
    private String nombre;
    private char genero;
    private double altura;
    private Nacionalidad nacionalidad;

    public Persona(int dni, String nombre, char genero, double altura, Nacionalidad nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", genero=" + genero + ", altura=" + altura + ", nacionalidad=" + nacionalidad + '}';
    }
    

    @Override
    public int compareTo(Persona p){
        return Integer.compare(dni, p.dni);
    }

}
