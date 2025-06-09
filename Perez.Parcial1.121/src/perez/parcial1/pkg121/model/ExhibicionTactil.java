package perez.parcial1.pkg121.model;

public class ExhibicionTactil extends Modulo implements Reiniciable{
    public static int MIN_NIVEL_INTERACTIVIDAD = 1;
    public static int MAX_NIVEL_INTERACTIVIDAD = 10;
    private int nivelInteractividad;

    public ExhibicionTactil(String nombre, int sala, TipoPublico tipo, int nivelInteractividad) {
        super(nombre, sala, tipo);
        validarNivel(nivelInteractividad);
        this.nivelInteractividad = nivelInteractividad;
    }

    public void validarNivel(int nivel){
        if(nivel < MIN_NIVEL_INTERACTIVIDAD || nivel > MAX_NIVEL_INTERACTIVIDAD){
            throw new  IllegalArgumentException("Nivel de interactividad fuera del rango.");
        }
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando " + getNombre() + "...");
    }

    @Override
    public String toString() {
        return super.toString() + ", nivel de interactividad: " + nivelInteractividad;
    }

    
    
}

