package parciales.Expediciones;

public class maintest {

    public static void main(String[] args) {

        NavesExploracion naveexplo = new NavesExploracion("ASD123", 100, 2005, "Cartografia");

        Cargueros carguero = new Cargueros("EFG345", 300, 2000, 500);

        CrucerosEstelares crucero = new CrucerosEstelares("HIJ678", 123, 4313, 1222);

        AgenciaEspacial agencia1 = new AgenciaEspacial();

        agencia1.agregarNaves(naveexplo);
        agencia1.agregarNaves(carguero);
        agencia1.agregarNaves(crucero);

        agencia1.mostrarNaves();

        agencia1.iniciarExploracion();

    }
}
