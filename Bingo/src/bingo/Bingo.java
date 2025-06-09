package bingo;

public class Bingo {
    
    public static void main(String[] args) {
        
        int tiempoEspera = 1;
        
        Bolillero<Integer> bolilleroInt = new Bolillero<>();
        Bolillero<String> bolilleroNombre = new Bolillero<>();
        Bolillero<FormulaUno> bolilleroFormula = new Bolillero<>();
//        
//        cargarBolilleroString(bolillero, nombres);
        Bolillero.cargarBolillero(bolilleroInt, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8,});
        Bolillero.cargarBolillero(bolilleroNombre, new String[]{"Juan", "Maria", "Marta", "Luis", "Lucia", "Gloria"});
        
        Bolillero.cargarBolillero(bolilleroFormula, new FormulaUno[]{
        new FormulaUno("Franco", Escuderia.WILLIAMS),
        new FormulaUno("Max", Escuderia.REDBULL),
        new FormulaUno("Leclerc", Escuderia.FERRARI),
        new FormulaUno("Hamilton", Escuderia.FERRARI),
        new FormulaUno("Stroll", Escuderia.ASTONMARTIN),});
        
        /*bolilleroFormula.cargarBolillas(new FormulaUno[]{
        new FormulaUno("Franco", Escuderia.WILLIAMS),
        new FormulaUno("Max", Escuderia.REDBULL),
        new FormulaUno("Leclerc", Escuderia.FERRARI),
        new FormulaUno("Hamilton", Escuderia.FERRARI),
        new FormulaUno("Stroll", Escuderia.ASTONMARTIN),});
        */
        System.out.println("Iniciar bingo");
        
        while (bolilleroFormula.quedanBolillas()) {
            System.out.println(bolilleroFormula.getBolillaSinRepo());
            esperar(tiempoEspera);
        }
        
        System.out.println("Fin del bingo");
        
    }

    /*public static <T> void cargarBolillero(Bolillero bolillero, T[] bolillas) {
    
    for (int i = 1; i < bolillas.length; i++) {
    bolillero.agregarBolilla(bolillas[i]);
    }
    
    }*/
    
    
    public static void esperar(int segundos) {
        
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
