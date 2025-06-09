package genericos;

public class GenericosExtra {

    //whildcards O comodines
    public static void main(String[] args) {

        CajaGenerica<Persona> caja = new CajaGenerica<>();
        CajaGenerica<String> caja2 = new CajaGenerica<>();
        CajaGenerica<Integer> caja3 = new CajaGenerica<>();

        caja.setDato(new Persona("Juan", 20));
        caja2.setDato("Hola");
        caja3.setDato(4);

        mostrarCaja(caja);
        mostrarCaja(caja2);
        mostrarCaja(caja3);

    }

    public static void mostrarCaja(CajaGenerica<?> caja) {

        System.out.println(caja.getDato());

    }

}
