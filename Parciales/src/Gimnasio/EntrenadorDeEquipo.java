package Gimnasio;

import java.time.LocalDate;

public class EntrenadorDeEquipo extends Entrenador {

    private final double sueldoBase;
    private static final int AUMENTOFIJO = 4;
    private static final int AUMENTOMAYOR = 12;
    private static final int ANTIGUEDAD = 3;
    private static final int ANTIGUEDAD_2 = 6;

    public EntrenadorDeEquipo(double sueldoBase, int nroLegajo, String nombre, String apellido, LocalDate fechaIngreso) {
        super(nroLegajo, nombre, apellido, fechaIngreso);
        this.sueldoBase = sueldoBase;
        validarFecha();
    }

    @Override
    public double getSueldo() {

        if (antiguedad() < ANTIGUEDAD) {
            return sueldoBase;
        } else if (antiguedad() >= ANTIGUEDAD && antiguedad() <= ANTIGUEDAD_2) {
            return sueldoBase + sueldoBase * AUMENTOFIJO / 100.0;
        } else {
            return sueldoBase + sueldoBase * AUMENTOMAYOR / 100.0;
        }

    }

}
