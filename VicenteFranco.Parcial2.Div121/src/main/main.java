package main;

import config.RutaArchivos;
import enums.Genero;
import java.io.IOException;
import model.Catalogo;
import model.Pelicula;

public class main {

    public static void main(String[] args) {
        try {
            //// Crear un catálogo de películas
            Catalogo<Pelicula> catalogoPeliculas = new Catalogo<>();
            catalogoPeliculas.agregar(new Pelicula(1, "El Padrino", "Francis Ford Coppola", Genero.DRAMA));
            catalogoPeliculas.agregar(new Pelicula(2, "La La Land", "Damien Chazelle", Genero.COMEDIA));
            catalogoPeliculas.agregar(new Pelicula(3, "Guerra Mundial Z", "Marc Forster ", Genero.TERROR));
            catalogoPeliculas.agregar(new Pelicula(4, "Toy Story", "John Lasseter", Genero.ANIMACION));
            catalogoPeliculas.agregar(new Pelicula(5, "The Social Dilemma", "Jeff Orlowski", Genero.DOCUMENTAL));
            //// Mostrar todas las películas en el catálogo
            System.out.println("Catálogo de películas:");
            catalogoPeliculas.paraCadaElemento(a -> System.out.println(a));
            //// Filtrar películas por género COMEDIA
            System.out.println("\nPelículas de género COMEDIA:");
            catalogoPeliculas.filtrar(a -> a.getGenero() == Genero.COMEDIA).forEach(a -> System.out.println(a));
            //// Filtrar películas cuyo título contiene "Guerra"
            System.out.println("\nPelículas cuyo título contiene 'Guerra':");
            catalogoPeliculas.filtrar(a -> a.getTitulo().contains("Guerra")).forEach(a -> System.out.println(a));
            //// Ordenar películas de manera natural (por id)
            System.out.println("\nPelículas ordenadas de manera natural (por id):");
            catalogoPeliculas.ordenar();
            catalogoPeliculas.paraCadaElemento(a -> System.out.println(a));
            //// Ordenar películas por título usando Comparator
            System.out.println("\nPelículas ordenadas por título:");
            catalogoPeliculas.ordenar((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
            catalogoPeliculas.paraCadaElemento(a -> System.out.println(a));
// Guardar el catálogo en archivo binario
            catalogoPeliculas.guardarEnArchivo(RutaArchivos.getRutaBinarioString());
            // Cargar el catálogo desde archivo binario

            Catalogo<Pelicula> catalogoCargado = Catalogo.cargarDesdeArchivo(RutaArchivos.getRutaBinarioString());

            System.out.println("\nPelículas cargadas desde archivo binario:");
            catalogoCargado.paraCadaElemento(a -> System.out.println(a));
            //// Guardar el catálogo en archivo CSV
            catalogoPeliculas.guardarEnCSV(catalogoPeliculas, RutaArchivos.getRutaCSVString());
            //// Cargar el catálogo desde archivo CSV
            catalogoCargado.cargarDesdeCSV(RutaArchivos.getRutaCSVString(), linea -> Pelicula.fromCSV(linea));
            System.out.println("\nPelículas cargadas desde archivo CSV:");
            catalogoCargado.paraCadaElemento(a -> System.out.println(a));
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
