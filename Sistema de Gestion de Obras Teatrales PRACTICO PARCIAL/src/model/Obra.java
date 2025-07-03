package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Obra implements Serializable{

    private int codigo;
    private String titulo;
    private LocalDate estreno;

    public Obra(int codigo, String titulo, LocalDate estreno) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estreno = estreno;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getEstreno() {
        return estreno;
    }

    @Override
    public String toString() {
        return "Obra{" + "codigo=" + codigo + ", titulo=" + titulo + ", estreno=" + estreno + '}';
    }

    public String toCSV() {
        return codigo + "," + titulo + "," + estreno;
    }

}
