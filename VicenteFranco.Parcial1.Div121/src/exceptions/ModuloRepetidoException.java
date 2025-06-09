package exceptions;

public class ModuloRepetidoException extends RuntimeException {

    private static final String MESSAGE = "Modulo con mismo nombre y ubicacion de sala";

    public ModuloRepetidoException() {
        this(MESSAGE);
    }

    public ModuloRepetidoException(String message) {
        super(message);
    }

}
