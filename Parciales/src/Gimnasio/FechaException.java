package Gimnasio;

public class FechaException extends RuntimeException {

    private static final String MESSAGE = "Error de fecha";

    public FechaException() {
        this(MESSAGE);
    }

    public FechaException(String message) {
        super(message);
    }
}
