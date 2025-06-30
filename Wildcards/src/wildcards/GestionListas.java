package wildcards;

import java.util.List;

public interface GestionListas {

    public static void imprimirLista(List<?> lista) {
        for (Object o : lista) {
            System.out.println(o);
        }

    }

    public static void imprimirListaAnimales(List<? extends Animal> lista) {
        for (Animal o : lista) {
            System.out.println(o);
        }

    }

    public static void alimentarAnimales(List<? extends Animal> lista) {
        for (Animal a : lista) {
            a.comer();
        }

    }

    public static void vacunarAnimales(List<? extends Mascota> lista) {
        for (Mascota m : lista) {
            m.vacunar();
        }

    }

    public static void agregarPerro(List<? super Perro> lista, Perro unPerro) {
        if (unPerro == null) {
            throw new NullPointerException("PERRO NULO");
        }
        lista.add(unPerro);
    }

    public static <T> void agregarElemento(List<? super T> lista, T elemento) {
        if (elemento == null) {
            throw new NullPointerException("ELEMENTO NULO");
        }
        lista.add(elemento);
    }

}
