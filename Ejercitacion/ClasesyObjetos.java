
package Ejercitacion;

public class ClasesyObjetos {

    public static void main(String[] args) {
        
        
        try {
            
            Rectangulo rectangulo = new Rectangulo(10,20);
            rectangulo.calcularArea();
            rectangulo.calcularPerimetro();
            rectangulo.esCuadrado();
            rectangulo.mostrarInfo();
            
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("########################");
        
        try {
            
            Circulo circulo = new Circulo(30);
            circulo.calcularAreaCirculo();
            circulo.calcularCircunferenciaCirculo();
            circulo.aumentarRadio(50);
            circulo.disminuirRadio(50);
            circulo.mostrarInfo();
            
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("########################");
        
        try{
            
            Persona persona = new Persona("Carlinhos", 12, 1.56);
            persona.esMayor();
            persona.IMC(60);
            persona.mostrarInfo();
            
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("########################");
        
        try{
            
            Coche coche = new Coche ("BMW", "Serie 3", 350, 60);
            coche.calcularDistancia();
            coche.mostrarInfo();
            
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("########################");
        
        try {
            
            CuentaBancaria cuentabanco = new CuentaBancaria(3000, "Franco", 3040);
            cuentabanco.consultarSaldo();
            cuentabanco.depositarDinero(300);
            cuentabanco.consultarSaldo();
            

        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
