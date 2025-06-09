package exceptions;

public class NaveRepetidaException extends RuntimeException {

    private final static String MESSAGE = "Nave repetida";

    public NaveRepetidaException() {
        this(MESSAGE);
    }

    public NaveRepetidaException(String message) {
        super(message);
    }

}
