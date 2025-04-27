
package clases.Television;

public class ControlRemoto {
    
    private Televisor televisor;
    
    
    public ControlRemoto (Televisor tv){
        this.televisor = tv;
    }
    
    private boolean verificarTV(){
        if (televisor != null){
            return true;
        }else{
            return false;
        }
    }
    
    public void encender(){
        if (verificarTV()){
            televisor.encender();
        }
    }
    
    public void mostrarInfo(){
        if (verificarTV()){
            televisor.mostrarInfo();
        }
    }


    public void subirCanal(){
        if (verificarTV()){
            televisor.subirCanal();
        }
    }
    
    public int informarTv(){
        if (verificarTV()){
            return televisor.getNroSerie();
        } else{
            throw new IllegalStateException("No tengo televisor");
        } 
        
    } 
    
    
}
