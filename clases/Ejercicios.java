
package clases;

import java.util.Scanner;

//public class Ejercicios {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int edad;
//
//        while (true) {
//            System.out.print("Ingrese su edad: ");
//            edad = scanner.nextInt();
//
//            if (edad >= 0 && edad < 130) {
//                if (edad >= 18) {
//                    System.out.println("Es mayor de edad");
//                } else {
//                    System.out.println("No es mayor de edad");
//                }
//
//                System.out.println("Hola, tenes " + edad + " años.");
//                break; // salgo del bucle una vez que todo salió bien
//            } else {
//                System.out.println("Edad inválida. Intente nuevamente.");
//            }
//        }
//
//        scanner.close(); // fuera del bucle
//    }
//}


// 1. Validar una contraseña
//Pedir al usuario que ingrese una contraseña. Si no es igual a "java123", volver a pedirla. Solo continuar si es correcta.


//public class Ejercicios {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String contraseña = "java123";
//        String contraseñausuario;
//        
//        System.out.println("Ingrese la contraseñá: ");
//        contraseñausuario = scanner.nextLine();
//        
//        if (contraseñausuario.equals(contraseña)){
//            System.out.println("Contraseña correcta");
//    }   else{
//            System.out.println("Incorrecto");
//        }
//         
//        scanner.close();
//                
//    }
//}


// 2. Pedir un número del 1 al 10
//Pedir al usuario un número entre 1 y 10. Repetir hasta que ingrese un número válido.
//
//Extra: Decir si el número es par o impar.
//
//Objetivos: int, validación, operador %.

//public class Ejercicios{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner (System.in);
//        int numero_usuario;
//        
//        
//        while (true){
//            System.out.println("Ingrese su numero del 1 al 10: ");
//            numero_usuario = scanner.nextInt();
//            
//            if (numero_usuario > 0 && numero_usuario < 11){
//                System.out.println("Numero valido");
//                if (numero_usuario % 2 == 0){
//                    System.out.println("Es par");
//                } else{
//                    System.out.println("Es impar");
//                }
//                break;
//            }
//            else{
//                System.out.println("Numero invalido, ingrese nuevamente... ");
//            }
//   
//        
//        
//        }
//       scanner.close();
//    }
//}


//3. Calcular el promedio de notas
//Pedir al usuario cuántas notas va a ingresar. Luego pedir cada nota y calcular el promedio. Validar que las notas estén entre 0 y 10.
//
//Objetivos: for, acumuladores, promedio.

//
//public class Ejercicios{
//    public static void main(String[] args) {
//        
//        Scanner scanner = new Scanner (System.in);
//        int numero_veces;
//        int notas;
//        int contador = 0;
//        int acumulador_notas = 0;
//        
//        System.out.println("Cuantas notas va a ingresar?: ");
//        numero_veces = scanner.nextInt();
//        for (contador = 1; contador <= numero_veces; contador++) {
//            System.out.print("Nota número " + contador + ": ");
//            notas = scanner.nextInt();
//
//            if (notas > 0 && notas < 11) {
//                acumulador_notas += notas;
//            } else {
//                System.out.println("Nota inválida. Debe estar entre 1 y 10.");
//                contador--; 
//            }
//        }
//        
//        System.out.println("Nota total es : " + acumulador_notas);
//        double promedio = acumulador_notas / numero_veces;
//        System.out.println("El promedio es: " + promedio);
//
//            
//            
//            
//         scanner.close();
//    }
//}



// FUNCIONES

// Nivel 1 - Básico
//EsPar
//Crear una función esPar(int numero) que devuelva true si el número es par y false si no.

//Mayor de dos números
//Crear una función mayor(int a, int b) que devuelva el mayor de los dos números.
    public class Ejercicios{
        
        public static boolean espar (int a){
            boolean par = true;   
            
            if (a % 2 == 0){
                return par;
            }else{
                par = false;
                return par;
            }
            
        }
        
        public static int calcular_mayor(int a,int b){
            
            if(a>b){
                return a;
            }else{
                return b;
            }
            
            
        }
//Saludo personalizado
//Crear una función saludar(String nombre) que imprima: Hola, [nombre]!.
        public static String saludar (String nombre){
            
            return "Hola," + nombre;
            
            
        }
//Calcular área de un círculo
//Crear una función areaCirculo(double radio) que devuelva el área (usar Math.PI).
    
        public static double areaCirculo (double radio){
            
            return Math.PI * radio * radio;
            
            
        }
// Nivel 2 - Intermedio
//Número primo
//Crear una función esPrimo(int numero) que devuelva true si es primo.
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;
        }
//Factorial
//Crear una función factorial(int n) que devuelva el factorial de n.
        public static int factorial(int n){
            int resultado = 1;
            
            for (int i = 2; i <= n; i++){
                
                resultado *= i;
                
                
            }
            
            return resultado;
            
        }
        
//Contar vocales
//Crear una función contarVocales(String texto) que devuelva cuántas vocales tiene un texto.
        public static String contarVocales (String texto){
            int vocales;
            String mensaje;
            vocales = texto.length();
            mensaje = "La palabra " + texto + " tiene " + vocales + " letras";
            
            return mensaje;
            
            
            
        }
//Inverso de una cadena
//Crear una función invertirCadena(String texto) que devuelva la cadena invertida.
        public static String invertirCadena (String texto){
            
            texto = new StringBuilder(texto).reverse().toString();
            
            return texto;
            
            
        }
        
        public static void main(String[] args) {
            
            
            boolean resultado = espar(14);
            
            System.out.println(resultado);
            
            int mayor = calcular_mayor(3,5);
            System.out.println(mayor);
            
            
            String nombre = saludar("Carlos");
            
            System.out.println(nombre);
            
            double radio = areaCirculo(5);
            
            System.out.println(radio);
            
            
            boolean numero_primo = esPrimo(7);
            
            System.out.println(numero_primo);
            
            int factor = factorial(5);
            
            System.out.println(factor);
            
            String palabra = contarVocales("computadora");
            System.out.println(palabra);
            

            String palabra_invertida = invertirCadena("Pedro");
            System.out.println(palabra_invertida);
          
            //Cuenta regresiva
            //Mostrá los números del 10 al 1 usando un bucle for.
            int inicio = 1;
            for (int i = 10; i >= inicio; i--){
                System.out.println(i);
                
            }
            
            //Suma de los primeros N números
            //El usuario ingresa un número N. Sumá todos los enteros del 1 a N.
            int numero_usuario = 20;
            int resultado_suma_numeros = 0;  
            for (int i = 1; i <= numero_usuario; i++ ){
                
                resultado_suma_numeros += i;
                
            }
            System.out.println("El resultado de la suma de todos los enteros del 1 al " +numero_usuario+ " es " + resultado);
            
            
            //Tabla de multiplicar
            //Ingresás un número y mostrás su tabla del 1 al 10.
            
            
            int numero_ingresado = 7;
            int resultado_tablas = 1;
            for (int i = 1; i <= 10; i++){
                
                resultado_tablas = numero_ingresado * i;
                
                System.out.println(resultado);
                
            }


            
            
            
            
            
            
            
            
        }
    }








