package bingo;

public class FormulaUno {

    private final String nombre;
    private final Escuderia escuderia;

    public FormulaUno(String nombre, Escuderia escuderia) {
        this.nombre = nombre;
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "FormulaUno{" + "nombre=" + nombre + ", escuderia=" + escuderia + '}';
    }

}
