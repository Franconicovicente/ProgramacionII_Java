package model;

import interfaces.AccionTarea;
import interfaces.FiltroTarea;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Organizador {

    public static List<Tarea> filtrarTareas(List<Tarea> tareas, FiltroTarea filtro) {
        List<Tarea> toReturn = new ArrayList<>();
        for (Tarea t : tareas) {
            if (filtro.test(t)) {
                toReturn.add(t);
            }
        }

        return toReturn;
    }

    public static void ordenarTareas(List<Tarea> tareas, Comparator<Tarea> criterio) {
        tareas.sort(criterio);
    }

    public void aplicarAccion(List<Tarea> tareas, AccionTarea accion) {
        for (Tarea t : tareas) {
            accion.ejecutar(t);
        }
    }

}
