
package Guia2Herencia;


/*
 Herencia con Vehículos:
Crea una clase Vehiculo con atributos marca y modelo. Crea las subclases Coche y Moto que hereden
de Vehiculo. Agrega un método mostrarDetalles() en cada subclase que imprima la marca y el
modelo, y agrega un atributo específico para cada subclase.
*/
public class Vehiculo {
    
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String mostrarDetalles(){
        return "El auto no tiene nada asignado";
    }
    
    
}
