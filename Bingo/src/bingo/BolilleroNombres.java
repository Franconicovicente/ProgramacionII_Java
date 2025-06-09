package bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import java.util.Random;

public class BolilleroNombres {

    private List<String> bolillas = new ArrayList<>();
    private final Random random = new Random();

    public void agregarBolilla(String nombre) {
        bolillas.add(nombre);
    }

    public String getBolillaRepo() {
        validarBolillas();
        return bolillas.get(nextRandomIndex());
    }

    public String getBolillaSinRepo() {
        validarBolillas();
        return bolillas.remove(nextRandomIndex());
    }

    private int nextRandomIndex() {
        return random.nextInt(bolillas.size());
    }

    private void validarBolillas() {
        if (!quedanBolillas()) {
            throw new NoSuchElementException("No quedan bolillas.");
        }
    }

    public boolean quedanBolillas() {
        return !bolillas.isEmpty();
    }

}
