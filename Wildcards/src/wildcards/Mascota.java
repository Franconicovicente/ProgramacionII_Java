package wildcards;

public class Mascota extends Animal implements Amigable {

    private String nombre;

    public Mascota(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void vacunar(){
        System.out.println("Vacunando a %s".formatted(nombre));
    }

    @Override
    public String toString() {
        return "Mascota{" + super.toString() + "nombre=" + nombre + '}';
    }

    @Override
    public void demostrarCarinio() {
        System.out.println("%s esta contento con nosotros".formatted(nombre));
    }

}
