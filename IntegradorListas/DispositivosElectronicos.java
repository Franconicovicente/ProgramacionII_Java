package IntegradorListas;

public class DispositivosElectronicos {

    private final String ID;
    private final double precio;
    private final TipoDispositivo.Tipo tipo;

    public DispositivosElectronicos(String ID, double precio, TipoDispositivo.Tipo tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " Precio: " + precio + " Tipo: " + tipo;
    }

    public boolean compararTipo(TipoDispositivo.Tipo tipo) {
        return this.tipo.equals(tipo);
    }

    public TipoDispositivo.Tipo getTipo() {
        return tipo;
    }

    public boolean compararID(String ID) {
        return this.ID.equals(ID);
    }

}
