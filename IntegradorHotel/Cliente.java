package IntegradorHotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona {

    private final String mail;

    private ArrayList<Reserva> reservas;

    public Cliente(String nombre, String dni, String mail) {
        super(nombre, dni);
        this.mail = mail;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public String getEmail() {
        return mail;
    }

    public void realizarReserva(Hotel hotel, Habitacion habitacion, LocalDate inicio, LocalDate fin) {
        if (!hotel.getHabitaciones().contains(habitacion)) {
            System.out.println("La habitacion no pertenece a este hotel");
        }

        for (Reserva r : hotel.getReservas()) {
            if (!r.getHabitacion().equals(habitacion)) {
                if (!(fin.isBefore(r.getFechaInicio()) || inicio.isAfter(r.getFechaFin()))) {
                    System.out.println("La habitacion ya esta reservada en esas fechas");
                    return;
                }
            }
        }

//        Reserva nuevaReserva = new Reserva(habitacion, inicio, fin);
//        hotel.getReservas().add(nuevaReserva);

    }

    @Override
    public void notificar(String notificacion) {
        System.out.println(notificacion);
    }
}
