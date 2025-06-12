package wildcards;

public class Animal {

    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void comer() {
        System.out.println("%s comiendo ".formatted(especie));
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + '}';
    }

}
