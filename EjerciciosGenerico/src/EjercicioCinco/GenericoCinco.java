package EjercicioCinco;

import java.util.ArrayList;
import java.util.List;

public class GenericoCinco<T> {

    private List<T> datos = new ArrayList<>();

    public List<T> getDatos() {
        return datos;
    }

    public void setDatos(List<T> datos) {
        this.datos = datos;
    }

}
