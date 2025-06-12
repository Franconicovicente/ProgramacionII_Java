package EjercicioTres;

import java.util.List;

public class GenericoTres<T> {

    private List<T> datos;

    public List<T> getDatos() {
        return datos;
    }

    public void setDatos(List<T> datos) {
        this.datos = datos;
    }

}
