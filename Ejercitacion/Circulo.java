
package Ejercitacion;

public class Circulo {
//    Clase Círculo:
//o Define una clase Círculo con un atributo radio de tipo double.
//o Crea métodos para calcular el área y la circunferencia del círculo.
//o Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un
//porcentaje dado
        private double radio;
        private final double PI = 3.14159;
        private double areaCirculo;
        private double CircunferenciaCirculo;
        private double radio_incrementado;
        private double radio_disminuido;
        
        
        public Circulo (double radio){
            validarRadio(radio);
            this.radio = radio;
        }
        
        
        public double calcularAreaCirculo(){
            areaCirculo = PI * (radio * radio);
            return areaCirculo;
        }
        
        public double calcularCircunferenciaCirculo(){
            CircunferenciaCirculo = 2 * PI * radio;
            return CircunferenciaCirculo;
        }
        
        private void validarRadio(double radio){
            
            if (radio < 0){
                throw new IllegalArgumentException("Radio no puede ser menor a 0");
            }
            
        }
        
        public double aumentarRadio(double valorPorcentaje){
            radio_incrementado = (radio * valorPorcentaje) / 100;
            radio_incrementado += radio;
            return radio_incrementado;
        }
        public double disminuirRadio(double valorPorcentaje){
            radio_disminuido = (radio * valorPorcentaje) / 100;
            return radio_incrementado;
        }
        
        public void mostrarInfo(){
            System.out.println("Radio: " + radio);
            System.out.println("Area: " + areaCirculo);
            System.out.println("Circunferencia: " + CircunferenciaCirculo);
            System.out.println("Radio con incremento: " + radio_incrementado);
            System.out.println("Radio con disminucion: " + radio_disminuido);
        }
    
    
    
}
