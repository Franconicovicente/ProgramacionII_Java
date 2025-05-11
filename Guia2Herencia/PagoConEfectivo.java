
package Guia2Herencia;


public class PagoConEfectivo extends Pago {

    public PagoConEfectivo(double monto, String destinatario, String moneda) {
        super(monto, destinatario, moneda);
    }
    
    public String procesarPago(){
        if (getMonto() > 0){
            return "Pago procesado con efectivo";
        }else{
            return "Pago no procesado, monto es menor a 0";
        }
    }
    
}
