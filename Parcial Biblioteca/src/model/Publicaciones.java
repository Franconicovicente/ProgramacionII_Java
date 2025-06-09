package model;

import java.time.LocalDate;

public abstract class Publicaciones {
    private String titulo;
    private LocalDate añoPublicacion;
    
    public Publicaciones(String titulo, LocalDate añoPublicacion){
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public LocalDate getAñoPublicacion(){
        return añoPublicacion;
    }
    
}
