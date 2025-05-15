
package IntegradorListas;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Objects;


public class Sucursal {
    
    private final String nombreSucursal;
    private final ArrayList<DispositivosElectronicos> dispositivos;
    
   
    
    
    public Sucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
        dispositivos = new ArrayList<>();
    }
    
   
    private void validarDispositivo(DispositivosElectronicos dispositivo){
        if (dispositivo == null){
            throw new NullPointerException("Dispositivo es nulo");
        }
    }
    
    public void agregarDispositivos(DispositivosElectronicos d){
        validarDispositivo(d);
        dispositivos.add(d);
    }
    
    public ArrayList getDispositivos(){
        return dispositivos;
    }
    
    public boolean compararNombre(String nombreSucursal){
        return this.nombreSucursal.equals(nombreSucursal);
    }
    
    
    public void listarDispositivos(){
        if (dispositivos.isEmpty()){
            System.out.println("No hay dispositivos");
            return;
        }
        for (DispositivosElectronicos d : dispositivos){
                System.out.println(d);
        }
        
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null || !(o instanceof Sucursal suc)){
            return false;
        }
        return this.nombreSucursal.equals(suc.nombreSucursal);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombreSucursal);
    }
    
    private void validarTipo(TipoDispositivo.Tipo t){
        if (t == null){
            throw new NullPointerException("El tipo es nulo");
        }
    }
    
    public ArrayList<DispositivosElectronicos> dispositivosPorTipo(TipoDispositivo.Tipo tipo){
        validarTipo(tipo);
        
        ArrayList<DispositivosElectronicos> dispositivosPorTipo = new ArrayList<>();
        
        for (DispositivosElectronicos d : dispositivos){
            if (d.compararTipo(tipo)){
                dispositivosPorTipo.add(d);
            }
        }
        return dispositivosPorTipo;
    }
    
    
    
    public void borrarDispositivo(String ID) {
    boolean encontrado = false;
    Iterator<DispositivosElectronicos> it = dispositivos.iterator();

    while (it.hasNext()) {
        DispositivosElectronicos d = it.next();
        if (d.compararID(ID)) {
            it.remove();  // forma segura de borrar
            System.out.println("Dispositivo eliminado correctamente.");
            encontrado = true;
            break; // Sale después de encontrar y borrar uno
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun ID como el que pusiste.");
    }
}
    
    public  boolean contieneDispositivo(String ID){
        for (DispositivosElectronicos d : dispositivos){
            if (d.compararID(ID))
                return true;
        }
        return false;
    }
}
