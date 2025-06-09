package perez.parcial1.pkg121.model;

import java.util.ArrayList;
import java.util.List;
import perez.parcial1.pkg121.exception.ModuloDuplicadoException;

public class Museo {
    private final List<Modulo> modulos = new ArrayList<>();
    
    public void agregarModulo(Modulo modulo){
        validarModulo(modulo);
        
        modulos.add(modulo);
    }
    public void mostrarModulos(){
        for(Modulo d : modulos){
            System.out.println(d);
        }
    }
    public void reiniciarModulos(){
        for(Modulo m : modulos){
            if(m instanceof Reiniciable r){
                r.reiniciar();
            }else{
                System.out.println(m.getNombre() + " no requiere reiniciarse.");
            }
        }
    }
    public ArrayList<Modulo> filtrarPorPublico(TipoPublico tipo){
        ArrayList<Modulo> toReturn = new ArrayList<>();
        for(Modulo m : modulos){
            if(m.getTipo() == tipo){
                System.out.println(m);
                toReturn.add(m);
            }
        }
        
        return toReturn;
    }
    
    public void validarModulo(Modulo modulo){
            
        for(Modulo d : modulos){
            if(modulo.isMismoModulo(d)){
                throw new ModuloDuplicadoException("El modulo ingresado ya esta en el museo.");
            }
        }
    }
}
