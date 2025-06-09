package EmpresaAeroespacial.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAeroespacial {

    private String nombreEmpresa;
    private List<Cohete> cohetes;

    public EmpresaAeroespacial(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.cohetes = new ArrayList<>();
    }

    public void agregarCohete(Cohete cohete) {

        if (cohete == null) {
            throw new NullPointerException();
        }

        cohetes.add(cohete);

    }

    public int cantListosParaLanzar() {

        int coheteListo = 0;
        for (Cohete c : cohetes) {
            if (c.aprobar()) {
                coheteListo++;
            }
        }

        return coheteListo;
    }

}
