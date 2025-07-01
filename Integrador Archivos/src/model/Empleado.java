package model;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {

    private static final long SerialVersionUID = 1L;
    private double sueldo;
    private Sector sector;

    public Empleado(int dni, String nombre, double sueldo, Sector sector) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Empleado" + super.toString() + ", sueldo=" + sueldo + ", sector=" + sector + ' ';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + sueldo + "," + sector;
    }

    public static String toCSVHeader() {
        return "nombre, dni, sueldo, sector \n";
    }

public static Empleado fromCSV(String empleadoCSV) {
    Empleado toReturn = null;

    if (empleadoCSV.endsWith("\n")) {
        empleadoCSV = empleadoCSV.substring(empleadoCSV.length() - 1);
    }

    String[] values = empleadoCSV.split(",");
    if (values.length == 4) {
        String nombre = values[0];
        int dni = Integer.parseInt(values[1]);
        double sueldo = Double.parseDouble(values[2]);
        Sector sector = Sector.valueOf(values[3]);
        toReturn = new Empleado(dni, nombre, sueldo, sector);
    }

    return toReturn;
}

}
