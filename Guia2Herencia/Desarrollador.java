
package Guia2Herencia;


public class Desarrollador extends Empleado{
    private String lenguajeUtilizado;

    public Desarrollador(String lenguajeUtilizado, String nombre, double salario) {
        super(nombre, salario);
        this.lenguajeUtilizado = lenguajeUtilizado;
    }
    
    public String datosEmpleado(){
        return "Nombre: " + nombre + " Salario: " + salario + " Lenguaje Utilizado: " + lenguajeUtilizado;
    }
    
}
