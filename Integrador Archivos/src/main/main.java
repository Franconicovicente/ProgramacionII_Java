package main;

import config.RutasArchivos;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import services.EmpleadoService;

public class main {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();

//        EmpleadoService.hardcodearEmpleados(empleados);
//        EmpleadoService.guardarEmpleadosCSV(empleados, RutasArchivos.getRutaCSVString());
        List<Empleado> empleados2 = EmpleadoService.cargarEmpleadosCSV(RutasArchivos.getRutaCSVString());
        EmpleadoService.mostrarEmpleados(empleados2);
        
        EmpleadoService.serializarEmpleados(empleados2, RutasArchivos.getRutaBinarioString());
        
        
        List<Empleado> empleados3 = EmpleadoService.deserializarEmpleados(RutasArchivos.getRutaBinarioString());
        EmpleadoService.mostrarEmpleados(empleados3);
    }
}
