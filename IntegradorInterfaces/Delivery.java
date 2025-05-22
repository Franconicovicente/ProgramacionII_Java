package IntegradorInterfaces;

public class Delivery implements Transportador {

    private String nombre;

    public Delivery(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void transportarPaquetes() {
        System.out.println("Me llamo " + nombre + " y entrego el paquete a pie");
    }

    public void felicitarDelivery() {
        System.out.println("Felicidades " + nombre + " hiciste un gran trabajo!");
    }

}
