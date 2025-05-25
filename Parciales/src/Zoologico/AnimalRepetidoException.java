package Zoologico;

public class AnimalRepetidoException extends RuntimeException {

    private static final String MESSAGE = "Animal repetido";

    public AnimalRepetidoException() {
        this(MESSAGE);
    }

    public AnimalRepetidoException(String message) {
        super(message);
    }

}
