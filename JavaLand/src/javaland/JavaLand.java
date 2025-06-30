package javaland;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaLand {

    public static void main(String[] args) {

        String pathArchivos = "src/resources/";
        String nombreArchivoBinario = "mago.bin";
        String pathSerializado = pathArchivos + nombreArchivoBinario;

        Mago mago1 = new Mago("Gandalf", 1020);
        Mago mago2 = null;

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(pathSerializado))) {

            salida.writeObject(mago1);

            System.out.println("Serializacion exitosa!");

        } catch (IOException ex) {

            System.out.println("Problema al serializar");

        }

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(pathSerializado))) {

            mago2 = (Mago) entrada.readObject();

            System.out.println(mago2);

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
