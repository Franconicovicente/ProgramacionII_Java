package bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class BolilleroNumeros {

    private List<Integer> bolillas = new ArrayList<>();
    private final Random random = new Random();

    public void agregarBolilla(Integer numero) {
        bolillas.add(numero);
    }

    public Integer getBolillaRepo() {
        validarBolillas();
        return bolillas.get(nextRandomIndex());
    }

    public Integer getBolillaSinRepo() {
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
