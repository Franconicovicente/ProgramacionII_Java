package Biblioteca;

import model.Biblioteca;
import model.Libros;
import model.Revistas;
import model.Genero;
import java.time.LocalDate;
import java.time.Month;
import model.Ilustraciones;
import model.PublicacionIgualException;

public class main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("BIBLIOTECA A");
        cargarBiblioteca(biblioteca);

    }

    public static void cargarBiblioteca(Biblioteca b) {

        try {

            Libros libro = new Libros("LIBRO A", LocalDate.of(2005, Month.MARCH, 30), "PEDRO", Genero.CIENCIA);
            Revistas revista = new Revistas("REVISTA A", LocalDate.of(2003, Month.AUGUST, 3), 244);
            Ilustraciones ilustracion = new Ilustraciones("ILUSTRACION A", LocalDate.of(2010, 4, 10), "NOMBRE ILUSTRADOR A", 120, 300);

            b.agregarPublicaciones(libro);
            b.agregarPublicaciones(revista);
            b.agregarPublicaciones(ilustracion);

            b.mostrarPublicaciones();

            b.leerPublicaciones(libro);
            b.leerPublicaciones(revista);

        } catch (PublicacionIgualException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
