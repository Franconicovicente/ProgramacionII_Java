package clases.Television;


public class main {
        public static void main(String[] args) {
            
            try {
                Televisor tv1 = new Televisor("Sony", 55);
                Televisor tv2 = new Televisor("Samsung", 33);
                
                tv1.encender();
                tv1.mostrarInfo();
                System.out.println("##############################");
                tv2.encender();
                tv2.mostrarInfo();
                
                
//                for (int i = 0; i < 100; i++){
//                    tv1. subirCanal();
//                }
                
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            } catch (IllegalStateException ex){
                System.out.println(ex.getMessage());
            }
            
            
        
            
            
            
            
            
            
            
            
            
            
            
                  
    }
}
