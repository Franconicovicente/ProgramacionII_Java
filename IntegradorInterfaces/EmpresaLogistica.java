package IntegradorInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLogistica {

    private String nombre;
    private List<Transportador> transportadores;

    public EmpresaLogistica(String nombre) {
        this.nombre = nombre;
        this.transportadores = new ArrayList<>();
    }

    public void realizarEntregas() {
        for (Transportador t : transportadores) {
            t.transportarPaquetes();
        }
    }

    public void agregarTransportador(Transportador t) {
        if (t == null) {
            throw new NullPointerException();
        }
        transportadores.add(t);
        System.out.println("Transportador agregado");
    }

}
