package IntegradorListas;

import java.util.Iterator;

public class main {

    public static void main(String[] args) {
        Empresa e1 = new Empresa("DispositivosTech");

        cargarEmpresa(e1);
//
//        e1.listarDispositivos();
//    Iterator<DispositivosElectronicos> it = e1.dispositivosPorTipo(TipoDispositivo.Tipo.COMPUTADORA);
//    
//    
//    while (it.hasNext()){
//        System.out.println(it.next());
//    }
//        for (DispositivosElectronicos d : e1.dispositivosPorTipo(TipoDispositivo.Tipo.COMPUTADORA)) {
//          System.out.println(d);
//       }
//
//        e1.borrarDispositivo("300");
//        e1.borrarDispositivo("400");
//        e1.listarDispositivos();

//        for (double porc : e1.obtenerPorcDispositivosPorTipo("Sucursal B")) {
//            System.out.println("Porc: %.2f".formatted(porc));
//        }
    }

    public static void cargarEmpresa(Empresa e) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarDispositivos(new DispositivosElectronicos("300", 100, TipoDispositivo.Tipo.COMPUTADORA));
        s1.agregarDispositivos(new DispositivosElectronicos("400", 200, TipoDispositivo.Tipo.TELEFONO));
        s2.agregarDispositivos(new DispositivosElectronicos("500", 300, TipoDispositivo.Tipo.TABLET));
        s2.agregarDispositivos(new DispositivosElectronicos("600", 400, TipoDispositivo.Tipo.COMPUTADORA));
        s2.agregarDispositivos(new DispositivosElectronicos("700", 500, TipoDispositivo.Tipo.TELEFONO));

        try {
            e.agregarSucursales(s1);
            e.agregarSucursales(s1);
        } catch (SucursalRepetidaException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
