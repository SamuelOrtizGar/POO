
package HelloWorld;

public class Arrays {
    public static void main(String[] args) {
        
        //Declaracion y Creacion
        
        int[] numbers = new int[3];
        System.out.println(numbers);
        System.out.println(numbers.length);
       
        String[] names = {"Samuel", "Esteban", "Ortiz", "Garcia"};
        System.out.println(names);
        
        //Acceso
        
        System.out.println(names[0]);
        System.out.println(numbers[2]);
        
        System.out.println(new String[3]);
        
        //Modificacion
        
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 100;
        
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        
        System.out.println(names[2]);
        names[2] = "SEOG";
        System.out.println(names[2]);
        
        boolean[] booleans = new boolean[2];
        booleans[1] = true;
        booleans[0] = false;
        System.out.println(booleans[1]);
        System.out.println(booleans[0]);
       
    }
}
