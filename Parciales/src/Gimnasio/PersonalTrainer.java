package Gimnasio;

import java.time.LocalDate;

public class PersonalTrainer extends Entrenador {

    private double sueldoMinimo;
    private int nroClientes;
    private double montoPorCliente;

    public PersonalTrainer(double sueldoMinimo, int nroClientes, double montoPorCliente, int nroLegajo, String nombre, String apellido, LocalDate fechaIngreso) {
        super(nroLegajo, nombre, apellido, fechaIngreso);
        this.sueldoMinimo = sueldoMinimo;
        this.nroClientes = nroClientes;
        this.montoPorCliente = montoPorCliente;
        validarFecha();
    }

    @Override
    public double getSueldo() {

        if (calcularSueldoPorCliente() < this.sueldoMinimo) {
            return this.sueldoMinimo;
        }

        return calcularSueldoPorCliente();
    }

    private double calcularSueldoPorCliente() {
        return this.nroClientes * this.montoPorCliente;
    }

    public int getNroClientes() {
        return nroClientes;
    }
    
    
    
}
