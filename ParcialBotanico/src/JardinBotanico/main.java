package JardinBotanico;

import model.*;

public class main {

    public static void main(String[] args) {
        
        Botanico b = new Botanico("BOTANICO A");
        
        crearBotanico(b);
        
    }

    public static void crearBotanico(Botanico b) {
        
        
        try{
            Arbol arbol = new Arbol("ARBOL A", "UBICACION A", "CLIMA A", 12.5);

            Flor flor = new Flor("FLOR A", "UBICACION B", "CLIMA B", Temporada.INVIERNO);

            Arbusto arbusto = new Arbusto("ARBUSTO A", "UBICACION C", "CLIMA C", 5);

            b.agregarPlanta(flor);
            b.agregarPlanta(arbol);
            b.agregarPlanta(arbusto);
//            b.agregarPlanta(null);
            
            b.mostrarPlantas();
            
            b.podarPlantas();
            
        }catch (PlantaRepetidaException | NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }
}
