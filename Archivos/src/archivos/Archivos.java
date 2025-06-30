package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void main(String[] args) {

        File f = new File("src/resources/aventura.txt");

        File manuscrito = new File("src/resources/aventura.txt");

        try (BufferedWriter escritorRapido = new BufferedWriter(new FileWriter(manuscrito));) {

            escritorRapido.write("XDXDXD\nPRUEBA IMPUNE\nIMPUNIZADO");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (BufferedReader bf = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
