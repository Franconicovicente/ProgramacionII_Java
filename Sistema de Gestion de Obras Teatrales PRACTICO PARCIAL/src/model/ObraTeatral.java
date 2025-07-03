package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObraTeatral extends Obra implements Comparable<Obra> {

    private String director;
    private GeneroTeatral genero;

    public ObraTeatral(int codigo, String titulo, LocalDate estreno, String director, GeneroTeatral genero) {
        super(codigo, titulo, estreno);
        this.director = director;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ObraTeatral{" + super.toString() + "director=" + director + ", genero=" + genero + '}';
    }

    @Override
    public int compareTo(Obra o) {
        return o.getEstreno().compareTo(this.getEstreno());
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + director + "," + genero;
    }

    public static String toHeaderCSV() {
        return "codigo, titulo, estreno, director, genero \n";
    }

    public static ObraTeatral fromCSV(String lineaCSV) {
        ObraTeatral toReturn = null;

        if (lineaCSV.endsWith("\n")) {
            lineaCSV = lineaCSV.substring(lineaCSV.length() - 1);
        }

        String[] values = lineaCSV.split(",");
        if (values.length == 5) {
            int codigo = Integer.parseInt(values[0]);
            String titulo = values[1];
            LocalDate estreno = LocalDate.parse(values[2]);
            String director = values[3];
            GeneroTeatral tipoDeporte = GeneroTeatral.valueOf(values[4]);
            toReturn = new ObraTeatral(codigo, titulo, estreno, director, tipoDeporte);
        }

        return toReturn;
    }

}
