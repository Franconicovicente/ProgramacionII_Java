
package Ejercitacion;

//    Clase Rectángulo:



//o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
//o Implementa métodos para calcular el área y el perímetro del rectángulo.
//o Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
//ancho y alto son iguales
public class Rectangulo {
    private final double ancho;
    private final double alto;
    private static final String ANCHO_ERROR = "No se puede tener 0 o un valor negativo en el valor de ancho";
    private static final String ALTO_ERROR = "No se puede tener 0 o un valor negativo en el valor de alto";
    
    
    public Rectangulo (double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public Rectangulo sumarRectangulos(Rectangulo r){
        return new Rectangulo (this.ancho + r.ancho, this.alto + r.alto);
    }
    public static Rectangulo sumarRectangulos(Rectangulo r, Rectangulo r1){
        return new Rectangulo (r.ancho + r1.ancho, r.alto + r1.alto);
    }
    
    public double calcularArea(){
        return ancho * alto;
    }
    
    private void validarAncho(double ancho){
        if (ancho <= 0){
            throw new IllegalArgumentException(ANCHO_ERROR);
        }
    }
    
    public double getAncho(){
        return ancho;
    }
    public double getAlto(){
        return ancho;
    }
    
    private void validarAlto(double alto){
        if (alto <= 0){
            throw new IllegalArgumentException(ALTO_ERROR);
        }
    }
    
    public void validarDatos(){
        validarAlto(alto);
        validarAncho(ancho);
    }
    
    public double calcularPerimetro(){
        return 2 * (ancho + alto) ;
    }
    
    public boolean esCuadrado(){
        return alto == ancho;
    }
    
    public void mostrarInfo(){
        System.out.println("Ancho: "+ ancho);
        System.out.println("Alto: "+ alto);
        System.out.println(calcularArea());
        System.out.println(calcularPerimetro());
        System.out.println(esCuadrado());
    }
    
}
