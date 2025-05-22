package IntegradorHotel;

public class Habitacion {

    private final int numero;
    private final TipoHabitacion tipo;
    private final double precioPorNoche;

    public Habitacion(int numero, TipoHabitacion tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
    
    

    @Override
    public String toString() {
        return "Habitacion numero: " + numero + " Tipo: " + tipo + " Precio: " + precioPorNoche;
    }

}
