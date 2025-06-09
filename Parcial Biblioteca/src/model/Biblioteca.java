package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;

    private List<Publicaciones> publicaciones;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicaciones(Publicaciones publicacion) {

        for (Publicaciones p : publicaciones) {
            if (p.getTitulo().equalsIgnoreCase(publicacion.getTitulo()) && p.getAñoPublicacion().equals(publicacion.getAñoPublicacion())) {
                throw new PublicacionIgualException();
            }
        }

        publicaciones.add(publicacion);

    }

    public void mostrarPublicaciones() {

        for (Publicaciones p : publicaciones) {
            System.out.println(p);
        }

    }
    
    public void leerPublicaciones(Leible publicacion){
        publicacion.leer();
    }

}
