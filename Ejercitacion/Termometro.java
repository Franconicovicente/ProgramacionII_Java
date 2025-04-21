    
package Ejercitacion;

public class Termometro {
//    Clase Termómetro:
//o Crea una clase Termómetro con un atributo temperatura de tipo double.
//o Escribe métodos para convertir la temperatura de grados Celsius a Fahrenheit y viceversa.
//o Implementa un método que permita aumentar o disminuir la temperatura en un valor dado.
    private double temperatura;
    private double temperatura_fahrenheit;
    private double temperatura_celsius;
    private double aumentoTemp;
    private double disminucionTemp;
    
    
    public Termometro (double temperatura){
        this.temperatura = temperatura;
    }
    
    public double convertirCelsius_Fahrenheit(){
        temperatura_fahrenheit = (temperatura * 9/5) + 32;
        return temperatura_fahrenheit;
    }
    public double convertirFahrenheit_Celsius(){
        temperatura_celsius = (temperatura - 32) * 5/9;
        return temperatura_celsius;
    }
    
    public void mostrarInfo(){  
        if (temperatura_celsius != 0){
            System.out.println("Temperatura en celsius: " + temperatura_celsius);
        }
        if (temperatura_fahrenheit != 0){
        System.out.println("Temperatura en fahrenheit: " + temperatura_fahrenheit);
        }
        System.out.println("Temperatura actual: " + temperatura);
    }
    
    public double aumentarTemperatura(double aumentoTemp){
        return temperatura += aumentoTemp;
    }    
    public double disminuirTemperatura(double disminucionTemp){
        return temperatura -= aumentoTemp;
    }    
    
    
}
