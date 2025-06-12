package model;

public class ExhibicionTactil extends ModuloInteractivo implements Reiniciable {

    private int nivelInteractividad;

    public ExhibicionTactil(String nombreModulo, String ubicacionSala, TipoPublico publicoObjetivo, int nivelInteractividad) {
        super(nombreModulo, ubicacionSala, publicoObjetivo);
        this.nivelInteractividad = nivelInteractividad;
    }

    @Override
    public String toString() {
        return super.toString() + "ExhibicionTactil{" + "nivelInteractividad=" + nivelInteractividad + '}';
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando Exhibicion Tactil.");
    }

}
