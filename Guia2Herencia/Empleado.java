
package Guia2Herencia;

/*
Herencia con Empleados:
Crea una clase base Empleado con atributos nombre y salario. Luego crea dos subclases: Gerente y
Desarrollador. En la clase Gerente, añade un atributo para el número de empleados supervisados.
En la clase Desarrollador, añade un atributo para el lenguaje de programación que utiliza.

*/
public abstract class Empleado {
    
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract String datosEmpleado();
}
