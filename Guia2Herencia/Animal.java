
package Guia2Herencia;

/*
1. Jerarquía de Animales:
Crea una clase base Animal con los atributos nombre y edad. Luego crea las subclases Perro y Gato,
que extienden de Animal. Agrega un método hacerSonido() en cada subclase para que emitan
sonidos distintos
*/

public class Animal {
    
    protected int edad;
    protected String nombre;
    
    public Animal (int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }   
    
    public String hacerSonido(){
        return "El animal hace un sonido generico";
    }
    
    public String toString(){
        return "Animal: " + nombre + " Edad: " + edad;
    }
    
}
