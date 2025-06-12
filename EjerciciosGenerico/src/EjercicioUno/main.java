package EjercicioUno;

import java.util.Arrays;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
        
        contarElementos<Integer> elementosInteger = new contarElementos<>();
        
        elementosInteger.setDatos(Arrays.asList(1, 2, 3, 4, 5));
        
        System.out.println(contarElementos(elementosInteger.getDatos()));
    }
    
    public static int contarElementos(List<?> dato) {
        return dato.size();
    }
    
}
