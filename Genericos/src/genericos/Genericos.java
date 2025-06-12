package genericos;

public class Genericos {

    public static void main(String[] args) {

        CajaEntero cajaEntero = new CajaEntero();
        CajaCadena cajaCadena = new CajaCadena();
        CajaPersona cajaPersona = new CajaPersona();
        Persona p = new Persona("Jose", 23);
        CajaObjeto cajaObjeto = new CajaObjeto();

        CajaGenerica<Integer> cajaGenerica1 = new CajaGenerica<Integer>();
        CajaGenerica<String> cajaGenerica2 = new CajaGenerica<String>();
        CajaGenerica<Persona> cajaGenerica3 = new CajaGenerica<Persona>();

        cajaGenerica1.setDato(33);
        System.out.println(cajaGenerica1.getDato());

        cajaGenerica2.setDato("Hola");
        System.out.println(cajaGenerica2.getDato());

        cajaGenerica3.setDato(p);
        System.out.println(cajaGenerica3.getDato().getSaludo());

//        cajaEntero.setDato(45);
//        cajaCadena.setDato("Hola");
//        cajaPersona.setValor(p);
//
//        cajaObjeto.setDato(p);
//        System.out.println(cajaObjeto.getDato());
//        cajaObjeto.setDato(45);
//        System.out.println(cajaObjeto.getDato());
//        cajaObjeto.setDato("Hola");
//        System.out.println(cajaObjeto.getDato());
//        System.out.println(cajaCadena.getDato().toUpperCase());
//        System.out.println(cajaPersona.getDato().getSaludo());
//        System.out.println(cajaEntero.getDato());
//        System.out.println(cajaCadena.getDato());
//        System.out.println(cajaPersona.getDato());
    }

}
