package EjercicioUno;

import java.util.List;

public class contarElementos<T> {

    private List<T> datos;

    public void setDatos(List<T> dato) {

        this.datos = dato;

    }

    public List<T> getDatos() {
        return datos;
    }

}
