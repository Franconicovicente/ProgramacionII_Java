package IntegradorInterfaces;

public class CamionReparto extends Vehiculo implements Transportador {

    private double carga;
    private boolean tieneCombustible;

    public CamionReparto(String patente, double carga) {
        super(patente);
        this.carga = carga;
        this.tieneCombustible = true;
    }

    public void cargarPaquete() {
        System.out.println("Paquete cargado");
    }

    @Override
    public void transportarPaquetes() {
        System.out.println("El camion esta transportando los paquetes");
    }

    public boolean setCombustible(boolean combustible) {
        return tieneCombustible = combustible;
    }

    public void cargarCombustible() {

        if (tieneCombustible) {
            System.out.println("El camion tiene combustible, no se puede cargar");
            return;
        }

        System.out.println("Cargando combustible...");
        tieneCombustible = true;
        System.out.println("Combustible cargado");

    }

}
