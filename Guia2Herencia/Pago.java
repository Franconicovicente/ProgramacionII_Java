
package Guia2Herencia;

/*
Sistema de Pago:
Crea una clase base Pago con un método procesarPago(). Crea las subclases PagoConTarjeta y
PagoConEfectivo, que implementen diferentes versiones de procesarPago().
*/
public abstract class Pago {
    
    protected double monto;
    protected String destinatario;
    protected String moneda;

    public Pago(double monto, String destinatario, String moneda) {
        this.monto = monto;
        this.destinatario = destinatario;
        this.moneda = moneda;
    }

    public double getMonto() {
        return monto;
    }
    
    
    
    public abstract String procesarPago();
    
    
    
}
