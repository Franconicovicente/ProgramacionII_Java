package main;

import config.AppConfig;
import enums.GeneroMusical;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import model.Evento;
import model.EventoMusical;
import model.GestorEventos;

public class Recitales {
    
    public static void main(String[] args) {
        
        List<EventoMusical> eventos = new ArrayList<>();
        
        eventos.add(new EventoMusical(123, "Evento A", LocalDate.of(2005, Month.MARCH, 12), "Tupac", GeneroMusical.ROCK));
        eventos.add(new EventoMusical(456, "Evento B", LocalDate.of(2000, Month.FEBRUARY, 12), "Madonna", GeneroMusical.POP));
        eventos.add(new EventoMusical(789, "Evento C", LocalDate.of(1990, Month.JULY, 12), "Rolling Stones", GeneroMusical.CLASICA));
        
        GestorEventos.guardarElementosCSV(eventos, AppConfig.getRutaCSVString());
        
        List<EventoMusical> eventos2 = GestorEventos.cargarElementosCSV(AppConfig.getRutaCSVString());
        
        GestorEventos.mostrarElementos(eventos2);
        
        GestorEventos.guardarElementosBinario(eventos2, AppConfig.getRutaBinarioString());
        
        List<EventoMusical> eventos3 = GestorEventos.cargarElementosBinario(AppConfig.getRutaBinarioString());
        
        GestorEventos.mostrarElementos(eventos3);
        
    }
    
}
