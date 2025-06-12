package wildcards;

public class CajaGenerica<T> {

    private T elemento;

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    // <?> wildcard -- comodin
    // <? extends clase> upper bound wildcard -- comodin de limite superior
    public static <T> void unBoxing(CajaGenerica<? extends T> caja) {
        System.out.println(caja.getElemento());
    }

    // <? super clase> lower bound wildcard -- comodin de limite inferior
    public static <T> void boxing(CajaGenerica<? super T> caja, T elemento) {
        caja.setElemento(elemento);
    }

}
