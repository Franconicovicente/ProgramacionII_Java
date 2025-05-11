
package Guia2Herencia;
/*
3. Clases Abstractas de Figuras:
Crea una clase abstracta Figura con un método abstracto calcularArea(). Luego, implementa las
subclases Cuadrado y Círculo que extienden de Figura e implementan el método calcularArea().
*/
public abstract class Figura {
    
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }    
    
    
    public abstract double calcularArea();
    
}
