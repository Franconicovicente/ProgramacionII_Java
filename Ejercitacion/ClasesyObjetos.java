
package Ejercitacion;

public class ClasesyObjetos {

    public static void main(String[] args) {
        
        
        try {
            
            Rectangulo r = new Rectangulo(10,20);
            Rectangulo r2 = new Rectangulo(20,30);
            
            Rectangulo r3 = r.sumarRectangulos(r2);
            
            Rectangulo r4 = Rectangulo.sumarRectangulos(r,r2);
            Rectangulo.sumarRectangulos(r, r4); 
            
            r4.mostrarInfo();
            
            
            r3.mostrarInfo();
//            rectangulo.mostrarInfo();
            
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
        
        System.out.println("########################");
        
        try {
            
            Libro libro = new Libro("DX", "CARLOS", 300, 200);
            
            libro.avanzarPagina(103);
            libro.mostrarDatos();
                    
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("########################");
        
        try{
            
            Termometro temperatura = new Termometro(30);
            
            temperatura.convertirCelsius_Fahrenheit();
            temperatura.convertirFahrenheit_Celsius();
            temperatura.mostrarInfo();
            temperatura.aumentarTemperatura(40);
            temperatura.mostrarInfo();
            
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
