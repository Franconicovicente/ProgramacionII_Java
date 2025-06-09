package EmpresaAeroespacial.model;

import java.time.LocalDate;

public class PruebaPropulsion extends Prueba {

    private static final int CALIFICACION_MIN = 0;
    private static final int CALIFICACION_MAX = 10;
    private static final int MIN_APROBACION = 6;
    private static final int DURACION_MAX = 90;
    private int duracionMinutos;
    private int puntajeNumerico;

    public PruebaPropulsion(int duracionMinutos, int puntajeNumerico, LocalDate fecha) {
        super(fecha);
        validarPuntaje(puntajeNumerico);
        this.duracionMinutos = duracionMinutos;
        this.puntajeNumerico = puntajeNumerico;
    }

    private void validarPuntaje(int puntaje) {
        if (puntaje < CALIFICACION_MIN || puntaje > CALIFICACION_MAX) {
            throw new IllegalArgumentException("Puntaje invalido");
        }
    }

    @Override
    public boolean aprobar() {

        return duracionMinutos < DURACION_MAX && puntajeNumerico >= MIN_APROBACION;

    }

}
