package perez.parcial1.pkg121.Main;

import java.util.ArrayList;
import perez.parcial1.pkg121.model.EstacionAnio;
import perez.parcial1.pkg121.model.ExhibicionTactil;
import perez.parcial1.pkg121.model.ExperimentoGuiado;
import perez.parcial1.pkg121.model.Modulo;
import perez.parcial1.pkg121.model.Museo;
import perez.parcial1.pkg121.model.Simulador;
import perez.parcial1.pkg121.model.TipoPublico;

public class Main {
    public static void main(String[] args) {
        
        Museo m = new Museo();
        
        cargarMuseo(m);
        
        
        //2 Mostrar módulos:
        //m.mostrarModulos();
        
        //3 Reinicio de módulos:
        m.reiniciarModulos();
        
        //4. Filtrar por tipo de público:
        //ArrayList<Modulo> adolescentes = m.filtrarPorPublico(TipoPublico.ADOLESCENTES);
        //ArrayList<Modulo> ninios = m.filtrarPorPublico(TipoPublico.NINIOS);
        //ArrayList<Modulo> adultos = m.filtrarPorPublico(TipoPublico.ADULTOS);
    }
    
    public static void cargarMuseo(Museo m){
        //1 Agregar módulo duplicado:
        Modulo moduloEspacial1 = new Simulador("Viaje Espacial", 1, TipoPublico.NINIOS, 15);
        Modulo moduloEspacial2 = new Simulador("Viaje Espacial", 1, TipoPublico.ADOLESCENTES, 20);
        
        //m.agregarModulo(moduloEspacial1);
        m.agregarModulo(moduloEspacial2);
        
        //2 Mostrar módulos:
        Modulo exhibicionTactil = new ExhibicionTactil("Pieles de animales", 3, TipoPublico.ADULTOS, 8);
        Modulo experimentoGuiado = new ExperimentoGuiado("Osos polares", 2, TipoPublico.ADOLESCENTES, EstacionAnio.INVIERNO);
        m.agregarModulo(exhibicionTactil);
        m.agregarModulo(experimentoGuiado);
        
        
    }
}
