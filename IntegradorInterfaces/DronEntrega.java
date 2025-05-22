package IntegradorInterfaces;

public class DronEntrega extends DispositivosElectronicos implements Transportador {

    private boolean camaraEncendida;
    private double numBateria;

    public DronEntrega(String marca) {
        super(marca);
        this.numBateria = 100;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo dron");
    }

    @Override
    public void transportarPaquetes() {
        encender();
        System.out.println("El dron esta transportando los paquetes");

    }

    public void revisarBateria() {
        System.out.println("Porcentaje de bateria: " + numBateria + "%");
    }

    //revisar baterias a los drones revisarBateria() en dron
}
