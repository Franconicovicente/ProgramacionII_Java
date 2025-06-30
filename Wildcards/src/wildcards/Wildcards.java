package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
    
    public static void main(String[] args) {
        
        List<Animal> animales = new ArrayList<>(Arrays.asList(new Animal("Elefante"),
                new Animal("Ballena"),
                new Animal("Tigre"),
                new Animal("Leon")));
        
        List<Mascota> mascotas = new ArrayList<>(Arrays.asList(new Mascota("Loro", "Lorito"),
                new Mascota("Carpincho", "Carpinchito"),
                new Mascota("Perro", "Perrito"),
                new Mascota("Gato", "Gatito")));
        
        animales.addAll(mascotas);
        
        List<Perro> perros = new ArrayList<>();
        List<Persona> personas = new ArrayList<>();
        List<Amigable> amigables = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> nombres = new ArrayList<>(List.of("Pedro", "Juan", "Morena", "Lucia", "Franco"));

//        GestionListas.imprimirLista(animales);
//        GestionListas.imprimirListaAnimales(mascotas);
//        GestionListas.alimentarAnimales(animales);
//        GestionListas.vacunarAnimales(mascotas);
//        GestionListas.agregarPerro(animales, new Perro("Perro", "Murdock", "Labrador"));
//        GestionListas.imprimirListaAnimales(animales);
//        GestionListas.agregarElemento(numeros, 32);
//        GestionListas.imprimirLista(numeros);
//        GestionListas.agregarElemento(animales, new Mascota("Ejemplo", "EJemplo"));
//        GestionListas.imprimirLista(animales);

//        CajaGenerica<Animal> cajaAnimal = new CajaGenerica<>();
//        CajaGenerica<Mascota> cajaMascota = new CajaGenerica<>();
//        CajaGenerica<Persona> cajaPersona = new CajaGenerica<>();
//        CajaGenerica<Perro> cajaPerro = new CajaGenerica<>();
//        CajaGenerica<Amigable> cajaAmigable = new CajaGenerica<>();
//        Animal animal = new Animal("Vaca");
//        Mascota mascota = new Mascota("Gato", "Garfield");
//        Persona persona = new Persona("Pedro", 32);
//        Perro perro = new Perro("Canino", "Murdock", "Labrador");
//        cajaAmigable.setElemento(mascota);
//        cajaAnimal.setElemento(animal);
//        cajaMascota.setElemento(mascota);
//        cajaPerro.setElemento(perro);
//        cajaPersona.setElemento(persona);
//        unBoxing(cajaMascota);
//        boxing(cajaAnimal, new Mascota("Elefante", "Dumbo"));
//        boxing(cajaPersona, new Persona("Juan", 33));
//        unBoxing(cajaPersona);
    }
    
}
