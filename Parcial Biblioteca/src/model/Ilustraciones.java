package model;

import java.time.LocalDate;

public class Ilustraciones extends Publicaciones {

    private String nombreIlustrador;
    private int dimensionAlto;
    private int dimensionAncho;

    public Ilustraciones(String titulo, LocalDate añoPublicacion,String nombre, int alto, int ancho) {
        super(titulo, añoPublicacion);
        this.nombreIlustrador = nombre;
        this.dimensionAlto = alto;
        this.dimensionAncho = ancho;
    }

    @Override
    public String toString() {
        return "Ilustraciones{" + "nombreIlustrador=" + nombreIlustrador + ", dimensionAlto=" + dimensionAlto + ", dimensionAncho=" + dimensionAncho + '}';
    }

}
