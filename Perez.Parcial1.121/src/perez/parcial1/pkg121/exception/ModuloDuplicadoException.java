package perez.parcial1.pkg121.exception;

public class ModuloDuplicadoException extends RuntimeException{
    private static final String MESSAGE = "Modulo duplicado";

    public ModuloDuplicadoException() {
        this(MESSAGE);
    }
    
    public ModuloDuplicadoException(String message) {
        super(message);
    }
    
    
}
