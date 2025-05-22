package IntegradorInterfaces;

import IntegradorListas.main;

public class maintest {

    public static void main(String[] args) {
        EmpresaLogistica empresa = new EmpresaLogistica("Empresa A");

        DronEntrega dron = new DronEntrega("Samsung");

        CamionReparto camion = new CamionReparto("AA123", 12.5);

        Delivery delivery = new Delivery("Carlos");

        empresa.agregarTransportador(delivery);
        empresa.agregarTransportador(dron);
        empresa.agregarTransportador(camion);
        empresa.realizarEntregas();

        Transportador d = dron;

        if (d instanceof DronEntrega dronEntrega) {
            dronEntrega.revisarBateria();
        }

        Transportador c = camion;

        if (c instanceof CamionReparto cr) {
            cr.setCombustible(true);
            cr.cargarCombustible();
        }

        Transportador de = delivery;

        if (de instanceof Delivery del) {
            del.felicitarDelivery();
        }

    }
}
