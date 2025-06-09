package EmpresaAeroespacial.model;

import java.util.ArrayList;
import java.util.List;

public class Cohete implements Aprobable {

    private static final int INITIAL_ID = 10000;
    private static int nextId = INITIAL_ID - 1;
    private int nroID;
    private String nombreCohete;
    private List<Prueba> pruebas;

    public Cohete(String nombre) {
        this.nroID = incrementarId();
        this.nombreCohete = nombre;
        this.pruebas = new ArrayList<>();
    }

    // metodo que incremente el id y lo retorne
    private static int incrementarId() {
        return ++nextId; //9999
    }

    public void agregarPrueba(Prueba prueba) {

        if (prueba == null) {
            throw new NullPointerException();
        }

        pruebas.add(prueba);

    }

    @Override
    public boolean aprobar() {

        if (pruebas.isEmpty()) {
            return false;

        }

        for (Prueba p : pruebas) {

            if (!p.aprobar()) {
                return false;
            }
        }
        return true;

    }

}
