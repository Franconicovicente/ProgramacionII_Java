package EmpresaAeroespacial.model;

import java.time.LocalDate;
import java.time.Month;

public class maintest {

    public static void main(String[] args) {

        EmpresaAeroespacial Empresa = new EmpresaAeroespacial("EMPRESA 1");

        cargarEmpresaAeroespacial(Empresa);

    }

    public static void cargarEmpresaAeroespacial(EmpresaAeroespacial ea) {

        Cohete cohete = new Cohete("COHETE 1");
        cohete.agregarPrueba(new PruebaPropulsion(40, 7, LocalDate.of(2005, Month.MARCH, 13)));
        cohete.agregarPrueba(new PruebaSistema(LocalDate.of(2003, Month.MARCH, 12), NivelEvaluacion.ACEPTABLE));
        Cohete cohete1 = new Cohete("COHETE 2");
        cohete1.agregarPrueba(new PruebaPropulsion(40, 7, LocalDate.of(2005, Month.MARCH, 13)));
        cohete1.agregarPrueba(new PruebaSistema(LocalDate.of(2003, Month.MARCH, 12), NivelEvaluacion.DEFICIENTE));

        ea.agregarCohete(cohete);
        ea.agregarCohete(cohete1);

        System.out.println(ea.cantListosParaLanzar());

    }
}
