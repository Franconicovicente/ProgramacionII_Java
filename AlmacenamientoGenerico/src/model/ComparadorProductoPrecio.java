package model;

import java.util.Comparator;

public class ComparadorProductoPrecio implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {
        return Double.compare(p1.getPrecio(), p2.getPrecio());
    }

}
