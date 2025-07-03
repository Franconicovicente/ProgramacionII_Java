package main;

import config.ConfigApp;
import enums.TipoDeporte;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Actividad;
import model.ActividadDeportiva;
import services.GestorActividades;

public class main {

    public static void main(String[] args) {

        GestorActividades gestor = new GestorActividades();

        ActividadDeportiva actividad = new ActividadDeportiva(500, "Correr", LocalDateTime.now(), "BOCA JRS", TipoDeporte.BASQUET);
        ActividadDeportiva actividad1 = new ActividadDeportiva(600, "Caminar", LocalDateTime.now(), "River", TipoDeporte.ATLETISMO);
        ActividadDeportiva actividad2 = new ActividadDeportiva(700, "Trotar", LocalDateTime.now(), "Platense", TipoDeporte.NATACION);
        ActividadDeportiva actividad3 = new ActividadDeportiva(800, "Quedarse Quieto", LocalDateTime.now(), "Badminton", TipoDeporte.TENIS);

        List<ActividadDeportiva> actividades = new ArrayList<>();
        actividades.add(actividad);
        actividades.add(actividad1);
        actividades.add(actividad2);
        actividades.add(actividad3);
//        gestor.agregar(actividad);
//        gestor.agregar(actividad1);
//        gestor.agregar(actividad2);
//        gestor.agregar(actividad3);

//        GestorActividades.mostrarContenido(gestor.getElementos());
//
//        gestor.eliminar(actividad1);
//
//        System.out.println("############");
//        System.out.println("Elemento de nombre - " + actividad1.getTitulo() + " eliminado");
//        GestorActividades.mostrarContenido(gestor.getElementos());
//        System.out.println(gestor.getIndiceElemento(actividad2));
//        gestor.limpiarElementos();
//        GestorActividades.mostrarContenido(gestor.getElementos());
//        actividades.sort((a1, a2) -> a1.getTitulo().compareTo(a2.getTitulo()));
//
//        actividades.forEach(a -> System.out.println(a));
//
//        gestor.ordenar(Comparator.comparing(Actividad::getFechaHora));
//        
//        GestorActividades.mostrarContenido(gestor.getElementos());
//        GestorActividades.guardarElementosCSV(actividades, ConfigApp.getRutaCSVString());
        List<ActividadDeportiva> actividades1 = GestorActividades.cargarElementosCSV(ConfigApp.getRutaCSVString());

//        GestorActividades.mostrarContenido(actividades1);
        GestorActividades.serializarElementos(actividades1, ConfigApp.getRutaBinarioString());

        List<ActividadDeportiva> actividades2 = GestorActividades.deserializarElementos(ConfigApp.getRutaBinarioString());

        GestorActividades.mostrarContenido(actividades2);

    }

}
