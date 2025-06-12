package wildcards;

public class Perro extends Mascota {

    private String raza;

    public Perro(String especie, String nombre, String raza) {
        super(especie, nombre);
        this.raza = raza;
    }
    
    public void ladrar(){
        System.out.println("GUAU!");
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "raza=" + raza + '}';
    }

    @Override
    public void demostrarCarinio() {
        System.out.println("%s mueve la cola".formatted(getNombre()));
    }

}
