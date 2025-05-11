
package Guia2Herencia;


public class Coche extends Vehiculo{
    
    public Coche (String marca, String modelo){
        super(marca,modelo);
    }
    
    public String mostrarDetalles(){
        return "Marca: " + marca + " Modelo: " + modelo;
    }
    
    public String acelerarAuto(){
        return "El coche acelera a una velocidad de 300km/h";
    }
    
    
}
