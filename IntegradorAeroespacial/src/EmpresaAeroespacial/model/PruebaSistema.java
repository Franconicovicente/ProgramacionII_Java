package EmpresaAeroespacial.model;

import java.time.LocalDate;

public class PruebaSistema extends Prueba {

    private static final NivelEvaluacion NIVEL_APROBACION = NivelEvaluacion.ACEPTABLE;

    private NivelEvaluacion nivel;

    public PruebaSistema(LocalDate fecha, NivelEvaluacion evaluacion) {
        super(fecha);
        this.nivel = evaluacion;
    }

    @Override
    public boolean aprobar() {
        return nivel.ordinal() >= NIVEL_APROBACION.ordinal();
    }

}
