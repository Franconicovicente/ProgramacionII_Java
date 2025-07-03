package main;

import config.ConfigApp;
import java.util.ArrayList;
import java.util.List;
import model.ObraTeatral;
import services.GestorObras;

public class main {
    
    public static void main(String[] args) {
        
        List<ObraTeatral> obrasteatrales = new ArrayList<>();

//        GestorObras.hardcodearObras(obrasteatrales);
//        GestorObras.guardarCSV(obrasteatrales, ConfigApp.getRutaCSVString());
//        List<ObraTeatral> obrasteatrales1 = GestorObras.cargarCSV(ConfigApp.getRutaCSVString());
//        GestorObras.mostrarContenido(obrasteatrales1);
//        GestorObras.serializarObras(obrasteatrales1, ConfigApp.getRutaBinarioString());
        List<ObraTeatral> obrasteatrales2 = GestorObras.deserealizarObras(ConfigApp.getRutaBinarioString());

//        GestorObras.mostrarContenido(obrasteatrales2);
        GestorObras gestor1 = new GestorObras();
        
        List<ObraTeatral> obras = gestor1.cargarCSV(ConfigApp.getRutaCSVString(), linea -> ObraTeatral.fromCSV((String) linea));
        
        obras.forEach(o -> System.out.println(o));
        
    }
}
