package EmpresaAeroespacial.model;

import java.time.LocalDate;

public abstract class Prueba implements Aprobable {

    private LocalDate fechaRealizada;

    public Prueba(LocalDate fecha) {

        this.fechaRealizada = fecha;

    }
}
