
package clases.Television;

public class Televisor {
    
    
    public final int MAX_CANAL = 80;
    public final int MIN_CANAL = 1;
    public final int INITIAL_CANAL = 10;
    private final String marca;
    private final double tamanio;
    private int canal;
    private int volumen;
    private boolean encendido;
    private final int nroSerie; //primer numero de serie 10000
    private static int contadorSerie = 10000;
    
    public Televisor (String marca, double tamanio){
        validarTamanio(tamanio);
        this.marca = marca;
        this.tamanio = tamanio;
        this.canal = INITIAL_CANAL;
        this.nroSerie = generarNroSerie();
    }
    
    public int generarNroSerie(){
        return contadorSerie ++;
    }

        
    public void encender(){
        
        if (!encendido){
            encendido = true;
            System.out.println("Encendido");
        }
    }
    
    public void apagar(){
        if (encendido){
            encendido = false;
            System.out.println("Apagado");   
        }
    }
    
    private void validarTamanio(double tam){
        if (tam <= 0){
            throw new IllegalArgumentException("Tamanio invalido");   
        }
    }
    
    public void subirCanal(){
            validarEncendido();
            if (canal < MAX_CANAL){
                canal ++;
            }else{
                canal = MIN_CANAL;
            }
            mostrarCanal();
    }
    
    public void bajarCanal(){
            validarEncendido();
            if (canal > MIN_CANAL){
                canal --;
            }else{
                canal = MAX_CANAL;
            }
            mostrarCanal();
        }
    
    private void validarEncendido(){
        if (!encendido){
            throw new IllegalStateException("Televisor apagado");
        }
        
    }
    
    private void mostrarCanal(){
        System.out.println("Canal: " + canal);
    }
    
    public void mostrarInfo(){
        System.out.println("Marca:" + marca);
        System.out.println("Numero de serie: " + nroSerie);
        System.out.println("Tamanio: " + tamanio);
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        if (encendido){
            System.out.println("Televisor encendido");  
        }
        
    }
    
    public int getNroSerie(){
        return nroSerie;
    }
    
    
    
    
}
