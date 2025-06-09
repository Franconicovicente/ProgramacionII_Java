package model;

public abstract class ModuloInteractivo {

    private String nombreModulo;
    private String ubicacionSala;
    private TipoPublico publicoObjetivo;

    public ModuloInteractivo(String nombreModulo, String ubicacionSala, TipoPublico publicoObjetivo) {
        this.nombreModulo = nombreModulo;
        this.ubicacionSala = ubicacionSala;
        this.publicoObjetivo = publicoObjetivo;
        validarNulos();
    }

    private void validarNulos() {
        if (nombreModulo == null) {
            throw new NullPointerException("NOMBRE NULO");
        }
        if (ubicacionSala == null) {
            throw new NullPointerException("UBICACION NULA");
        }
    }

    public String getNombre() {
        return nombreModulo;
    }

    public String getUbicacionSala() {
        return ubicacionSala;
    }

    public TipoPublico getPublicoObjetivo() {
        return publicoObjetivo;
    }

    @Override
    public String toString() {
        return "ModuloInteractivo{" + "nombreModulo=" + nombreModulo + ", ubicacionSala=" + ubicacionSala + ", publicoObjetivo=" + publicoObjetivo + '}';
    }

}
