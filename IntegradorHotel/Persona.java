package IntegradorHotel;

import java.util.ArrayList;

public abstract class Persona {

    private String nombre;
    private String dni;
    private ArrayList<String> notificaciones;

    public Persona() {
        notificaciones = new ArrayList<>();
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public abstract void notificar(String notificacion);

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }
    
    private void verificarMensajeNulo(String m){
        if (m == null) {
            throw new NullPointerException("mensaje es nulo");
        }
    }

    protected void agregarNotificaciones(String mensaje) {
        verificarMensajeNulo(mensaje);
        notificaciones.add(mensaje);
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + " Dni: " + dni;
    }

}
