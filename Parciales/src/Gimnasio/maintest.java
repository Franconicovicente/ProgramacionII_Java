package Gimnasio;

import java.time.LocalDate;
import java.time.Month;

public class maintest {

    public static void main(String[] args) {
        Gimnasio g1 = new Gimnasio("LION");

        PersonalTrainer mayorClientes = g1.entrenadorMasClientes();

        cargarGimnasio(g1);

//        g1.entrenadorMasClientes();
//        if(mayorClientes != null){
//            System.out.println(mayorClientes.nombreCompleto() + " " + mayorClientes.getNroClientes());
//        }
    }

    public static void cargarGimnasio(Gimnasio g) {

        PersonalTrainer trainer = new PersonalTrainer(300000, 5, 5000, 341234, "Pedro", "Alvarez", LocalDate.now());
        EntrenadorDeEquipo entrenadorEquipo = new EntrenadorDeEquipo(500000, 123456, "Juan", "Perez", LocalDate.of(2026, Month.MARCH, 13));

        try {

            g.agregarEntrenadores(trainer);
            g.agregarEntrenadores(entrenadorEquipo);

            g.mostrarSueldos();
        } catch (FechaException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
