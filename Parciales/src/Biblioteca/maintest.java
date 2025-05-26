package Biblioteca;

public class maintest {
    
    public static void main(String[] args) {
        Bibliotecario b1 = new Bibliotecario("Juan");
        
        cargarLibreria(b1);
        
    }
    
    public static void cargarLibreria(Bibliotecario b) {
        
        Documentales d1 = new Documentales("ASD", 2005, TipoConservacion.REGULAR, 150, "Terror");
        Revistas r1 = new Revistas(20, "Junio", "DFG", 3004, TipoConservacion.BUENO);
        Libros L1 = new Libros("JKS", 300, "KDKAS", 3000, TipoConservacion.MALO);
        
        try {
            
            b.agregarMaterial(L1);
            b.agregarMaterial(r1);
            b.agregarMaterial(d1);
            
            b.mostrarMaterial();
            b.digitalizarMateriales(d1);
            
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
