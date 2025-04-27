
package Ejercitacion;

public class Persona {
    
//Clase Persona:
//o Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
//o Implementa un método esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
//o Agrega un método para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
    private final String nombre;
    private final int edad;
    private final double altura;
    private double masa_corporal;
    
    
    public Persona (String nombre, int edad, double altura){
        verificarDatos(nombre, edad, altura);
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    
    public boolean esMayor(){
        return edad >= 18;
    }
    
    public double IMC (double peso){
        masa_corporal = Math.round(peso / (altura * altura));
        return masa_corporal;
    }
    
    private void verificarDatos(String nombre, int edad , double altura){
        if (nombre == null || nombre.trim().isEmpty() || !nombre.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Ingrese un nombre.");
        }
        if (edad < 0 || edad > 100){
            throw new IllegalArgumentException("Edad incorrecta");
        }
        if (altura < 1.30 || altura > 2.40){
            throw new IllegalArgumentException("Estatura invalida");
        }   
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        if (esMayor()){
            System.out.println("Es mayor de edad");
        }
        System.out.println("IMC: " + masa_corporal);
        
    }
    
    
}
