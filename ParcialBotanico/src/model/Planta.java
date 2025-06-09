package model;

public class Planta {

    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
        validarDatosNulos();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    private void validarDatosNulos() {
        if (nombre == null) {
            throw new NullPointerException("NOMBRE NULO");
        }
        if (ubicacion == null) {
            throw new NullPointerException();
        }
        if (clima == null) {
            throw new NullPointerException();
        }
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima + '}';
    }

}
