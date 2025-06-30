package config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RutasArchivos {

    private static final String BASE = "src/resources";

    public static Path getRutaCSV() {
        return Paths.get(BASE, "personas.csv");
    }

    public static Path getRutaBinario() {
        return Paths.get(BASE, "personas.bin");
    }

    public static String getRutaCSVString() {
        return getRutaCSV().toString();
    }

    public static String getRutaBinarioString() {
        return getRutaBinario().toString();
    }

}
