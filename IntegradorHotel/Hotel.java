package IntegradorHotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {

    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Recepcionista> recepcionistas;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        recepcionistas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarRecepcionista(Recepcionista recepcionista) {
        recepcionistas.add(recepcionista);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public ArrayList<Habitacion> buscarHabitacionesDisponibles(LocalDate inicio, LocalDate fin, TipoHabitacion tipo) {
        ArrayList<Habitacion> disponibles = new ArrayList<>();

        for (Habitacion h : habitaciones) {
            if (!h.getTipo().equals(tipo)) {
                continue; // Si no es del tipo  me la salto
            }

            boolean estaReservada = false;

            for (Reserva r : reservas) {
                if (r.getHabitacion().equals(h)) {
                    boolean seSuperpone = !(fin.isBefore(r.getFechaInicio()) || inicio.isAfter(r.getFechaFin()));
                    if (seSuperpone) {
                        estaReservada = true;
                        break;
                    }
                }
            }

            if (!estaReservada) {
                disponibles.add(h);
            }
        }

        return disponibles;
    }

    @Override
    public String toString() {
        return "Hotel " + nombre + " Direccion " + direccion;
    }

}
