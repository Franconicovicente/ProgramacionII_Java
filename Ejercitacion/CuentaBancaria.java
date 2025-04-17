package Ejercitacion;


public class CuentaBancaria {
//     Clase CuentaBancaria:
//o Define una clase CuentaBancaria con atributos saldo, titular, y numeroDeCuenta.
//o Implementa métodos para depositar y retirar dinero, asegurándote de que no se permita retirar
//más de lo que hay en el saldo.
//o Crea un método para consultar el saldo actual de la cuenta.
    private double saldo;
    private final String titular;
    private final int numeroCuenta;
    private double dinero_depositado;
    private double dinero_retirado;
    
    
    
    
    public CuentaBancaria (double saldo, String titular, int numeroCuenta){
        verificarDatos(saldo, numeroCuenta, titular);
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }
    
    
    public void depositarDinero(double dinero_depositado){
        if (dinero_depositado < 0) {
            throw new IllegalArgumentException("No se puede depositar un monto negativo.");
        }
        saldo += dinero_depositado;
    }
    
    private void verificarDatos(double saldo, int numeroCuenta, String titular){
        
        if (titular == null || titular.trim().isEmpty() || !titular.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Ingrese un nombre.");
        }
        
        if (saldo < 0){
            throw new IllegalArgumentException("No puede tener saldo negativo.");
        }
        if (numeroCuenta < 0){
            throw new IllegalArgumentException("No puede tener numero de cuenta negativo.");
        }
        
    }
    
    public void retirarDinero(double dinero_a_retirar){ 
        if (dinero_a_retirar <= saldo){
            saldo -= dinero_a_retirar;
        } else {
        throw new IllegalArgumentException("Saldo insuficiente para retirar ese monto.");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    
    
    
}
