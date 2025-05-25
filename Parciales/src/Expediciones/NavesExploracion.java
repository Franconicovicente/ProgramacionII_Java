package Expediciones;

public class NavesExploracion extends NaveEspacial {

    private final String tipoMision;

    public NavesExploracion(String nombre, int capacidadTripulacion, int añoLanzamiento, String mision) {

        super(nombre, capacidadTripulacion, añoLanzamiento);
        this.tipoMision = mision;
        validarTipoMisionNula();

    }

    private void validarTipoMisionNula() {

        if (tipoMision == null) {
            throw new NullPointerException();
        }

    }

    @Override
    public String toString() {
        return "Nombre nave: " + nombre + " Capacidad Tripulantes: " + capacidadTripulacion + " Anio lanzamiento: " + añoLanzamiento + " Tipo mision: " + tipoMision;
    }

}
