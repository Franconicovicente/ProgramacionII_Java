
package Guia2Herencia;

public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }
    
    public double calcularArea(){
        return lado * lado;
    }
    
}
