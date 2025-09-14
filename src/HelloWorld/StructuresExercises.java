
package HelloWorld;

import java.util.ArrayList;

public class StructuresExercises {
    public static void main(String[] args) {
        
        //Array 5 valores y hallar longitud
        
        int[] random = new int[5];
        System.out.println(random.length);
        random[0] = 54;
        random[1] = 10;
        random[2] = 45;
        System.out.println(random[2]);
        random[3] = 78;
        random[4] = 63;
        random[2] = 0;
        System.out.println(random[2]);
        System.out.println(random.length);
        
        
        String[] name = new String[2];
        System.out.println(name.length);
        
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();
        
        System.out.println(names);
        names.add("Samuel");
        System.out.println(names);
        names.add("SEOG");
        numbers.add(0);
        System.out.println(numbers);
        
    }
}
