
package Guia2Herencia;


public class PagoConTarjeta extends Pago {

    public PagoConTarjeta(double monto, String destinatario, String moneda) {
        super(monto, destinatario, moneda);
    }
    
    public String procesarPago(){
        if (getMonto() > 0){
            return "Pago procesado con tarjeta";
        }else{
            return "Pago no procesado, monto es menor a 0";
        }
    }
    
    
    
}
