package bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Bolillero<T> {

    private List<T> bolillas = new ArrayList<>();
    private final Random random = new Random();

    public void agregarBolilla(T bolilla) {
        bolillas.add(bolilla);
    }

    public void cargarBolillas(T[] bolillas) {

        for (int i = 1; i < bolillas.length; i++) {
            agregarBolilla(bolillas[i]);
        }

    }

    public T getBolillaRepo() {
        validarBolillas();
        return bolillas.get(nextRandomIndex());
    }

    public T getBolillaSinRepo() {
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

    public static <T> void cargarBolillero(Bolillero<T> bolillero, T[] bolillas) {

        for (int i = 1; i < bolillas.length; i++) {
            bolillero.agregarBolilla(bolillas[i]);
        }

    }

}
