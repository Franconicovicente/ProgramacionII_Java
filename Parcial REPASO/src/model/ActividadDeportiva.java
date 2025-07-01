package model;

import enums.TipoDeporte;
import java.time.LocalDateTime;

public class ActividadDeportiva extends Actividad implements Comparable<Actividad> {

    private String equipoPrincipal;
    private TipoDeporte tipo;

    public ActividadDeportiva(int codigo, String titulo, LocalDateTime fechaHora, String equipoPrincipal, TipoDeporte tipoDeporte) {
        super(codigo, titulo, fechaHora);
        this.equipoPrincipal = equipoPrincipal;
        this.tipo = tipoDeporte;
    }

    @Override
    public String toString() {
        return "ActividadDeportiva{" + super.toString() + "equipoPrincipal=" + equipoPrincipal + ", tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(Actividad a) {
        return a.getFechaHora().compareTo(this.getFechaHora());
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + equipoPrincipal + "," + tipo;
    }

    public static String toHeaderCSV() {
        return "codigo, titulo, fechaHora, equipoPrincipal, tipoDeporte \n";
    }

    public static ActividadDeportiva fromCSV(String linea) {
        ActividadDeportiva toReturn = null;

        if (linea.endsWith("\n")) {
            linea = linea.substring(linea.length() - 1);
        }

        String[] values = linea.split(",");
        if (values.length == 5) {
            int codigo = Integer.parseInt(values[0]);
            String titulo = values[1];
            LocalDateTime sueldo = LocalDateTime.parse(values[2]);
            String equipoPrincipal = values[3];
            TipoDeporte tipoDeporte = TipoDeporte.valueOf(values[4]);
            toReturn = new ActividadDeportiva(codigo, titulo, sueldo, equipoPrincipal, tipoDeporte);
        }

        return toReturn;
    }

}
