package IntegradorInterfaces;

public class DispositivosElectronicos {

    private String marca;

    public DispositivosElectronicos(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("Dispositivo encendido");
    }
}
