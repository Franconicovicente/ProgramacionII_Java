
package Ejercitacion;

//    Clase Rectángulo:



//o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
//o Implementa métodos para calcular el área y el perímetro del rectángulo.
//o Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
//ancho y alto son iguales
public class Rectangulo {
    private final double ancho;
    private final double alto;
    private double areaRectangulo;
    private double perimetroRectangulo;
    private boolean esCuadrado;
    private static final String ANCHO_ERROR = "No se puede tener 0 o un valor negativo en el valor de ancho";
    private static final String ALTO_ERROR = "No se puede tener 0 o un valor negativo en el valor de alto";
    
    
    public Rectangulo (double ancho, double alto){
        validarDatos(ancho, alto);
        this.ancho = ancho;
        this.alto = alto;
       
    }
    
    public double calcularArea(){
        areaRectangulo = (ancho * alto);
        return areaRectangulo;
    }
    
     private void validarDatos(double ancho, double alto){
        
        if (ancho <= 0){
            throw new IllegalArgumentException(ANCHO_ERROR);
        }
        if (alto <= 0){
            throw new IllegalArgumentException(ALTO_ERROR);
        }
    }
    
    public double calcularPerimetro(){
        perimetroRectangulo = (2 * alto) + (2 * ancho);
        return perimetroRectangulo;
    }
    
    public boolean esCuadrado(){
        if (alto == ancho){
            esCuadrado = true;
        }else{
            esCuadrado = false;
        }
        return esCuadrado;
    }
    
    public void mostrarInfo(){
        System.out.println("Ancho: "+ ancho);
        System.out.println("Alto: "+ alto);
        System.out.println("Area Rectangulo: "+ areaRectangulo);
        System.out.println("Perimetro Rectangulo: " + perimetroRectangulo);
        System.out.println(esCuadrado);
    }
    
}
