package IntegradorListas;

import java.util.ArrayList;

public class Empresa {

    private String nombre_empresa;
    private int total_dispositivos;
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public void listarDispositivos() {
        if (sucursales.isEmpty()) {
            System.out.println("No hay sucursales");
        } else {
            for (Sucursal s : sucursales) {
                s.listarDispositivos();
            }
        }
    }

    public Empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public void agregarSucursales(Sucursal s) {
        validarSucursalNula(s);
        if (sucursales.contains(s)) {
            throw new IllegalArgumentException("La sucursal ya se encuentra en la lista");
        }
        sucursales.add(s);
    }

    private void validarSucursalNula(Sucursal suc) {
        if (suc == null) {
            throw new NullPointerException("Sucursal nula");
        }
    }

    public ArrayList<DispositivosElectronicos> dispositivosPorTipo(TipoDispositivo.Tipo tipo) {
        ArrayList<DispositivosElectronicos> dispositivosPorTipo = new ArrayList<>();

        for (Sucursal s : sucursales) {

            dispositivosPorTipo.addAll(s.dispositivosPorTipo(tipo));

            //for (DispositivosElectronicos d : dispositivosPorTipo){
            //   if (d.compararTipo(tipo)){
            //    dispositivosPorTipo.add(d);
            //} ESTRUCTURADO
        }
        return dispositivosPorTipo;
    }

    public void borrarDispositivo(String ID) {
        boolean encontrado = false;
        if (ID == null) {
            throw new NullPointerException("ID nula");
        }

        for (Sucursal s : sucursales) {
            if (s.contieneDispositivo(ID)) {
                s.borrarDispositivo(ID);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun ID como el que pusiste.");
        }
    }

//D) La implementación del método porcDispositivosPorTipo que reciba el nombre de una sucursal y retorne
//los porcentajes de dispositivos por tipo que hay para tal sucursal.
    protected double[] obtenerPorcDispositivosPorTipo(String sucursal) {
        for (Sucursal s : sucursales) {
            if (s.getNombre().equals(sucursal)) {
                return s.porcDispositivosPorTipo();
            }
        }
        return null;
    }

}
