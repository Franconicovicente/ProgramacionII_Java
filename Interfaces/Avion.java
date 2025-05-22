package Interfaces;

public class Avion implements Volador {

    private String matricula;
    private String marca;
    private String modelo;
    private int cantPasajeros;
    private boolean trenAbajo;

    public Avion(String matricula, String marca, String modelo, int cantPasajeros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cantPasajeros = cantPasajeros;
        this.trenAbajo = true;
    }

    public void presurizarCabina() {
        System.out.println("Presurizando la cabina");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando cargado de pasajeros");
    }

    @Override
    public void despegar() {
        System.out.println("Avion despegando");
        subirTrenAterrizaje();
    }

    @Override
    public void aterrizar() {
        bajarTrenAterrizaje();
        System.out.println("Avion aterrizando");
    }

    private void bajarTrenAterrizaje() {
        if (!trenAbajo) {
            trenAbajo = true;
        }
    }

    private void subirTrenAterrizaje() {
        if (trenAbajo) {
            trenAbajo = false;
        }
    }

}
