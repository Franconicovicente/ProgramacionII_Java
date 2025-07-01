package expresiones.lambda.smartwatch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import model.Organizador;
import model.Tarea;

public class ExpresionesLambdaSmartwatch {

    public static void main(String[] args) {

        List<Tarea> tareas = Arrays.asList(
                new Tarea("Estudiar", false, LocalDate.of(2025, 7, 10), 120, 1),
                new Tarea("Comprar comida", true, LocalDate.of(2025, 7, 3), 30, 2),
                new Tarea("Limpiar cocina", false, LocalDate.of(2025, 7, 5), 45, 3),
                new Tarea("Pagar impuestos", false, LocalDate.of(2025, 7, 1), 20, 1)
        );

//        System.out.println("----- Lista original -----");
//        tareas.forEach(System.out::println);
        // Filtrar tareas completadas
//        List<Tarea> completadas = Organizador.filtrarTareas(tareas, t -> t.completada);
//        for (Tarea t : completadas) {
//            System.out.println(t);
//        }
//        System.out.println("----- Lista Ordenada por Prioridad -----");
        List<Tarea> ordenadaPrioridad = new ArrayList<>(tareas);
        Organizador.ordenarTareas(ordenadaPrioridad, (a, b) -> Integer.compare(b.getPrioridad(), a.getPrioridad()));
        
        for (Tarea t : ordenadaPrioridad){
            System.out.println(t);
        }
        LocalDate hoy = LocalDate.now();
        
        
        List<Tarea> venceHoy = Organizador.filtrarTareas(tareas, t -> t.getFechaVencimiento().equals(hoy));
        
        
        if (venceHoy.isEmpty()){
            System.out.println("No hay tareas que vencen hoy.");
        }else{
            System.out.println("Recordatorio: estas tareas vencen hoy: ");
            for (Tarea t : venceHoy){
                System.out.println("- " + t.getNombre());
            }
        }
        
    }

}
