package Expediciones;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEspacial {

    private List<NaveEspacial> naves;

    public AgenciaEspacial() {

        this.naves = new ArrayList<>();

    }

    public void agregarNaves(NaveEspacial nave) {
        if (nave == null) {
            throw new NullPointerException("Nave nula");
        }

        if (this.naves.equals(nave)) {
            throw new IllegalArgumentException("Nave ya cargada");
        }

        naves.add(nave);
    }

    public void mostrarNaves() {
        for (NaveEspacial n : naves) {
            System.out.println(n);
        }
    }

    public void iniciarExploracion() {
        for (NaveEspacial nave : naves) {
            if (!(nave instanceof CrucerosEstelares)) {
                nave.realizarMision();
            }
            if (nave instanceof CrucerosEstelares) {
                System.out.println("los cruceros no pueden realizar misiones");
            }
        }
    }

}
