package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class Actividad implements Serializable {

    private int codigo;
    private String titulo;
    private LocalDateTime fechaHora;

    public Actividad(int codigo, String titulo, LocalDateTime fechaHora) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        verificarTitulo();
    }

    private void verificarTitulo() {
        if (titulo == null) {
            throw new NullPointerException("Titulo nulo");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Actividad{" + "codigo=" + codigo + ", titulo=" + titulo + ", fechaHora=" + fechaHora + '}';
    }

    public String toCSV() {
        return codigo + "," + titulo + "," + fechaHora;
    }

}
