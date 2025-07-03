package interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface Almacenable<T> extends Iterable<T> {

    void agregar(T elemento);

    List<T> obtenerTodos();

    List<T> filtrar(Predicate<? super T> criterio);
    
    void paraCadaElemento(Consumer<? super T> accion);
}
