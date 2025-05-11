
package Guia2Herencia;

public class Moto extends Vehiculo{

    public Moto(String marca, String modelo) {
        super(marca,modelo);
    }
    
     public String mostrarDetalles(){
        return "Marca: " + marca + " Modelo: " + modelo;
    }
    
     
    public String acelerarMoto(){
        return "La moto acelera a una velocidad de 120km/h";
    }
    
}
