package Interfaces;

import java.util.ArrayList;

public class Interfaces {

    public static void main(String[] args) {
        Mosquito m = new Mosquito(2, "Aedes Egyptis", 'm');

        Avion a = new Avion("AA123", "Boeing", "747", 300);

        ArrayList<Volador> voladores = new ArrayList<>();

        voladores.add(m);
        voladores.add(a);

        for (Volador x : voladores) {
            x.volar();
        }

        Volador v = m;

        v.aterrizar();
        v.volar();

        if (v instanceof Mosquito x) {

            x.picar();
        }

    }
}
