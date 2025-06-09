package model;

public class Flor extends Planta {

    private Temporada temporadaFlorecimiento;

    public Flor(String nombre, String ubicacion, String clima, Temporada temporadaFlorecimiento) {
        super(nombre, ubicacion, clima);
        this.temporadaFlorecimiento = temporadaFlorecimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Flor{" + "temporadaFlorecimiento=" + temporadaFlorecimiento + '}';
    }

}
