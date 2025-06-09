package parcialexpedicion;

import exceptions.NaveRepetidaException;
import model.AgenciaEspacial;
import model.Carguero;
import model.CruceEstelar;
import model.NaveExploracion;
import model.TipoMision;

public class ParcialExpedicion {

    public static void main(String[] args) {

        AgenciaEspacial agencia = new AgenciaEspacial("Agencia A");

        hardCodearAgencia(agencia);

    }

    public static void hardCodearAgencia(AgenciaEspacial a) {

        try {

            CruceEstelar cruce = new CruceEstelar("Cruce A", 150, 3042, 120);
            Carguero carguero = new Carguero("Carguero A", 150, 2003, 300);
            NaveExploracion naveExploracion = new NaveExploracion("Nave A", 300, 4012, TipoMision.CARTOGRAFIA);

            a.agregarNave(cruce);
            a.agregarNave(carguero);
            a.agregarNave(naveExploracion);

            a.mostrarNaves();

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (NaveRepetidaException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
