package parciales.Expediciones;

public class Cargueros extends NaveEspacial {

    private final double capacidadCarga;

    public Cargueros(String nombre, int capacidadTripulacion, int añoLanzamiento, double cargaToneladas) {
        super(nombre, capacidadTripulacion, añoLanzamiento);
        this.capacidadCarga = cargaToneladas;
        validarCarga();
    }

    private void validarCarga() {
        if (capacidadCarga < 100 || capacidadCarga > 500) {
            throw new IllegalArgumentException("Capacidad de carga erronea");
        }

    }

    @Override
    public String toString() {
        return "Nombre nave: " + nombre + " Capacidad Tripulantes: " + capacidadTripulacion + " Anio lanzamiento: " + añoLanzamiento + " Capacidad Carga: " + capacidadCarga + " toneladas";
    }

}
