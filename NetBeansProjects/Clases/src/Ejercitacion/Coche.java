package Ejercitacion;

public class Coche {
//     Clase Coche:
//o Crea una clase Coche con atributos marca, modelo, kilometraje, y combustibleRestante (en
//litros).
//o Escribe un método para calcular cuántos kilómetros puede recorrer el coche con el
//combustible restante, considerando un consumo fijo de combustible por kilómetro.
//o Implementa un método para "recargar" el combustible del coche.
    private final String marca;
    private final String modelo;
    private final int kilometraje;
    private double combustibleRestante;
    private double consumo_fijo;
    private double distancia_por_recorrer;
    
    
    
    
    public Coche (String marca, String modelo, int kilometraje, double combustibleRestante){
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.combustibleRestante = combustibleRestante;
        this.consumo_fijo = 15;
    }
    
    public int calcularDistancia(){
        distancia_por_recorrer = consumo_fijo * combustibleRestante;
        return (int)distancia_por_recorrer;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometros: " + kilometraje);
        System.out.println("Combustible restante: " + combustibleRestante +"L");
        System.out.println("Distancia por recorrer con " + combustibleRestante + " L de nafta con un consumo de " 
                           + consumo_fijo + " km/L: " + distancia_por_recorrer + " KM");
        
        
    }
    
    
}
