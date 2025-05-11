
package Guia2Herencia;

public class Perro extends Animal{
    
    
    public Perro (int edad, String nombre){
        super(edad,nombre);
    }
    
    public String hacerSonido(){
        return "El perro ladra";
    }
    
}
