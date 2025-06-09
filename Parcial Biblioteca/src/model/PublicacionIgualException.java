
package model;


public class PublicacionIgualException extends RuntimeException{
    
    private static final String MESSAGE = "Insertaste dos publicaciones iguales.";

    public PublicacionIgualException() {
        this(MESSAGE);
    }

    public PublicacionIgualException(String message) {
        super(message);
    }
    
    
}
