package genericos;

public class CajaGenerica<T> {

    private T dato;

    public void setDato(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

}
