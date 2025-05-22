package IntegradorHotel;

import java.util.ArrayList;

public class Recepcionista extends Persona {

    private final String legajo;

    public Recepcionista(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

    public ArrayList<Reserva> getReservas() {
        
        return null;
        
    }

    public String getLegajo() {
        return legajo;
    }

    public void confirmarReserva(Reserva reserva, Hotel hotel) {
        
    }

    @Override
    public void notificar(String notificacion) {
        System.out.println(notificacion);
    }

}
