package IntegradorListas;

public class SucursalRepetidaException extends RuntimeException {

    private static final String MESSAGE = "Sucursal Repetida";

    public SucursalRepetidaException() {
        this(MESSAGE);
    }

    public SucursalRepetidaException(String message) {
        super(message);
    }

}
