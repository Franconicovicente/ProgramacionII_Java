package config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AppConfig {

    private static final String BASE = "src/resources";

    public static Path getRutaCSV() {
        return Paths.get(BASE, "eventos.csv");
    }

    public static Path getRutaBinario() {
        return Paths.get(BASE, "eventos.bin");
    }

    public static String getRutaCSVString() {
        return getRutaCSV().toString();
    }

    public static String getRutaBinarioString() {
        return getRutaBinario().toString();
    }
}
