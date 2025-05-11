
package Guia2Herencia;


public class Gerente extends Empleado {
    private int empleadosSupervisados;

    public Gerente(int empleadosSupervisados, String nombre, double salario) {
        super(nombre, salario);
        this.empleadosSupervisados = empleadosSupervisados;
    }
    
    public String datosEmpleado(){
        return "Nombre: " + nombre + " Salario: " + salario + " Empleados supervisados " + empleadosSupervisados;
    }
    
}
