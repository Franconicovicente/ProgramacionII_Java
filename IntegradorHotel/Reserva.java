package IntegradorHotel;

import java.time.LocalDate;

class Reserva {

    private final Cliente cliente;
    private final Habitacion habitacion;
    private final LocalDate fechaInicio;
    private final LocalDate fechaFin;
    private boolean confirmada;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin, boolean confirmada) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.confirmada = confirmada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void confirmar() {
        if (!confirmada) {
            confirmada = true;
        }
    }

    public double calcularTotal() {
        return (fechaFin.getDayOfYear() - fechaInicio.getDayOfYear()) * habitacion.getPrecioPorNoche();
    }

    @Override
    public String toString() {
        return "Nombre del cliente: " + cliente + " Habitacion: " + habitacion + " Desde " + fechaInicio + " Hasta: " + fechaFin;
    }

}
