package EjercicioDos;

import java.util.List;

public class GenericaDos<T> {

    private List<T> datos;

    public List<T> getDatos() {

        return datos;

    }

    public void setDatos(List<T> datos) {

        this.datos = datos;

    }

}
