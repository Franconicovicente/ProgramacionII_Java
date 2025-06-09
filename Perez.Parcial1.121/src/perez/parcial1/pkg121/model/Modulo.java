package perez.parcial1.pkg121.model;

public abstract class Modulo {
    private String nombre;
    private int sala;
    private TipoPublico tipo;

    public Modulo(String nombre, int sala, TipoPublico tipo) {
        this.nombre = nombre;
        this.sala = sala;
        this.tipo = tipo;
    }
    
    public boolean isMismoModulo(Modulo modulo){
        return this.nombre.equalsIgnoreCase(modulo.nombre) && this.sala == modulo.sala;
    }

    @Override
    public String toString() {
        return "Modulo: " + "nombre: " + nombre + ", sala: " + sala + ", tipo publico : " + tipo;
    }

    public TipoPublico getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
