package vicentefranco.parcial1.div121;

import exceptions.ModuloRepetidoException;
import java.util.List;
import model.*;

public class VicenteFrancoParcial1Div121 {

    public static void main(String[] args) {

        PersonalMuseo personalMuseo = new PersonalMuseo("PERSONAL A");

        cargarMuseo(personalMuseo);

    }

    public static void cargarMuseo(PersonalMuseo p) {

        try {

            Simulador simulador = new Simulador("SIMULADOR A", "UBICACION SIMULADOR A", TipoPublico.NINIOS, 30);
            Simulador simulador2 = new Simulador("SIMULADOR B", "UBICACION SIMULADOR B", TipoPublico.ADOLESCENTES, 120);
            Simulador simulador3 = new Simulador("SIMULADOR C", "UBICACION SIMULADOR C", TipoPublico.ADULTOS, 90);

            Simulador ViajeEspacial = new Simulador("VIAJE ESPACIAL", "SALA 1", TipoPublico.NINIOS, 90);
            Simulador ViajeGalactico = new Simulador("VIAJE ESPACIAL", "SALA 1", TipoPublico.ADULTOS, 90);

            ExhibicionTactil exhibicion = new ExhibicionTactil("EXHIBICION A", "UBICACION EXHIBICION A", TipoPublico.NINIOS, 4);
            ExhibicionTactil exhibicion2 = new ExhibicionTactil("EXHIBICION B", "UBICACION EXHIBICION B", TipoPublico.ADOLESCENTES, 1);
            ExhibicionTactil exhibicion3 = new ExhibicionTactil("EXHIBICION C", "UBICACION EXHIBICION C", TipoPublico.ADULTOS, 10);

            ExperimentoGuiado experimento = new ExperimentoGuiado("EXPERIMENTO A", "UBICACION EXPERIMENTO A", TipoPublico.NINIOS, EstacionAnio.PRIMAVERA);
            ExperimentoGuiado experimento2 = new ExperimentoGuiado("EXPERIMENTO B", "UBICACION EXPERIMENTO B", TipoPublico.ADOLESCENTES, EstacionAnio.INVIERNO);
            ExperimentoGuiado experimento3 = new ExperimentoGuiado("EXPERIMENTO C", "UBICACION EXPERIMENTO C", TipoPublico.ADULTOS, EstacionAnio.VERANO);

            p.agregarModulo(simulador);
            p.agregarModulo(simulador2);
            p.agregarModulo(simulador3);
            p.agregarModulo(exhibicion);
            p.agregarModulo(exhibicion2);
            p.agregarModulo(exhibicion3);
            p.agregarModulo(experimento);
            p.agregarModulo(experimento2);
            p.agregarModulo(experimento3);
            System.out.println("################");
//            p.agregarModulo(ViajeEspacial);
//            p.agregarModulo(ViajeGalactico);
            System.out.println("################");
            p.mostrarModulos();
            p.reiniciarModulos();
            List<ModuloInteractivo> filtrados = p.filtrarPorPublico(TipoPublico.NINIOS);
            for (ModuloInteractivo m : filtrados) {
                System.out.println(m);
            }

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (ModuloRepetidoException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
