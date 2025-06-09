package perez.parcial1.pkg121.model;

public class ExperimentoGuiado extends Modulo{
    private EstacionAnio estacion;

    public ExperimentoGuiado(String nombre, int sala, TipoPublico tipo, EstacionAnio estacion) {
        super(nombre, sala, tipo);
        this.estacion = estacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", estacion del anio: " + estacion;
    }
    
    
}
