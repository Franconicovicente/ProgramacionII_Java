package model;

import enums.GeneroMusical;
import java.time.LocalDate;

public class EventoMusical extends Evento implements Comparable<Evento> {

    private String artista;
    private GeneroMusical genero;

    public EventoMusical(int id, String nombre, LocalDate fecha, String artista, GeneroMusical genero) {

        super(id, nombre, fecha);
        this.artista = artista;
        this.genero = genero;
        validarArtista();

    }

    private void validarArtista() {
        if (artista == null) {
            throw new NullPointerException("Artista nulo");
        }
    }

    @Override
    public int compareTo(Evento e) {
        return e.getFecha().compareTo(this.getFecha());
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + artista + "," + genero;
    }

    public static String toHeaderCSV() {
        return "id, nombre, fecha, artista, genero \n";
    }

    @Override
    public String toString() {
        return "EventoMusical "+ super.toString() + "artista=" + artista + ", genero=" + genero + '}';
    }

    public static EventoMusical fromCSV(String eventoCSV) {
        EventoMusical toReturn = null;

        String[] values = eventoCSV.split(",");
        if (values.length == 5) {
            int id = Integer.parseInt(values[0]);
            String nombre = values[1];
            LocalDate fecha = LocalDate.parse(values[2]);
            String artista = (values[3]);
            GeneroMusical genero = GeneroMusical.valueOf(values[4]);
            toReturn = new EventoMusical(id, nombre, fecha, artista, genero);
        }

        return toReturn;
    }
}
