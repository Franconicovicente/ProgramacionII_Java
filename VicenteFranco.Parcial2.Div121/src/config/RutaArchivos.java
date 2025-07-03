package config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RutaArchivos {

    private static final String BASE = "src/resources";

    public static Path getRutaCSV() {
        return Paths.get(BASE, "peliculas.csv");
    }

    public static Path getRutaBinario() {
        return Paths.get(BASE, "peliculas.bin");
    }

    public static String getRutaCSVString() {
        return getRutaCSV().toString();
    }

    public static String getRutaBinarioString() {
        return getRutaBinario().toString();
    }
}
