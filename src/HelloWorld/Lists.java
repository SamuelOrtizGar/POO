
package HelloWorld;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        
        //Declaracion y Creacion
        
        ArrayList<String> names = new ArrayList<>(); //Metodo 1
        var numbers = new ArrayList<Integer>();
        
        //Tamaño
        
        System.out.println(names.size());
        
        //Añadir elementos
        
        names.add("SAMUEL");
        names.add("ESTEBAN");
        names.add("ORTIZ");
        names.add("GARCIA");
        System.out.println(names.size());
        
        //Acceder a los elementos
        
        System.out.println(names.getFirst());
        System.out.println(names.get(2));
        System.out.println(names.getLast());
        
        //Modificar elementos
        
        names.set(1, "SEOG");
        System.out.println(names.get(1));
        
        //Eliminar elementos
        
        names.remove(3);
        //System.out.println(names.get(3));  LO ELIMINA
        System.out.println(names.getLast());
        System.out.println(names.size());
        
        //Buscar elementos
        
        System.out.println(names.contains("SAMUEL"));
        System.out.println(names.contains("GARCIA"));
        
        //Limpiar ArrayList
        
        names.clear();
        System.out.println(names.size());
        
    }
    
}
