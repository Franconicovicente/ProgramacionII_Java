package model;

public class PlantaRepetidaException extends RuntimeException {
    
    private static final String MESSAGE = "Error, ya que insertaste una planta con mismo nombre y ubicacion";
    
    
    public PlantaRepetidaException(){
        this(MESSAGE);
    }
    
    public PlantaRepetidaException(String message){
        super(message);
    }
    

    
}
