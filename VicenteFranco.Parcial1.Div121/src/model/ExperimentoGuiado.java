package model;

public class ExperimentoGuiado extends ModuloInteractivo {

    private EstacionAño estacionRealizada;

    public ExperimentoGuiado(String nombreModulo, String ubicacionSala, TipoPublico publicoObjetivo, EstacionAño estacionRealizada) {
        super(nombreModulo, ubicacionSala, publicoObjetivo);
        this.estacionRealizada = estacionRealizada;
    }

    @Override
    public String toString() {
        return super.toString() + "ExperimentoGuiado{" + "estacionRealizada=" + estacionRealizada + '}';
    }

}
