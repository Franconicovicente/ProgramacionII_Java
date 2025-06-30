package services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import model.Sector;

public class EmpleadoService {

    public static void hardcodearEmpleados(List<? super Empleado> lista) {

        lista.add(new Empleado(12345781, "Carlos", 525000, Sector.VENTAS));
        lista.add(new Empleado(89124321, "Juan", 750000, Sector.SISTEMAS));
        lista.add(new Empleado(61324551, "Matias", 825000, Sector.RRHH));
        lista.add(new Empleado(54812841, "Esteban", 725000, Sector.CONTABLE));
        lista.add(new Empleado(68127390, "Quiroz", 12345500, Sector.VENTAS));
        lista.add(new Empleado(19288491, "Pedro", 5681023, Sector.SISTEMAS));
        lista.add(new Empleado(64719238, "Franco", 2834810, Sector.SISTEMAS));
        lista.add(new Empleado(19382819, "Roberto", 571102, Sector.CONTABLE));

    }

    public static void mostrarEmpleados(List<? extends Empleado> lista) {
        System.out.println("Lista de empleados: ");
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("Lista Vacia");
        }
        lista.forEach(e -> System.out.println(e));
    }

    public static void guardarEmpleadosCSV(List<? extends Empleado> lista, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            if (lista.isEmpty()) {
                throw new IllegalArgumentException("Lista vacia");
            }

            writer.write(Empleado.toCSVHeader());

            for (Empleado e : lista) {
                writer.write(e.toCSV());
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo: " + ex.getMessage());

        }

    }

    public static List<Empleado> cargarEmpleadosCSV(String path) {
        List<Empleado> toReturn = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String aux;
            br.readLine();

            while ((aux = br.readLine()) != null) {
                toReturn.add(Empleado.fromCSV(aux));
            }
            System.out.println("");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return toReturn;
    }

    public static void serializarEmpleados(List<? extends Empleado> lista, String path) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))) {

            salida.writeObject(lista);

            System.out.println("Serializacion exitosa!");

        } catch (IOException ex) {

            System.out.println("Problema al serializar");

        }

    }

    public static List<Empleado> deserializarEmpleados(String path) {
        List<Empleado> toReturn = null;
        
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(path))) {

            toReturn = (List<Empleado>) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return toReturn;
    }

}
