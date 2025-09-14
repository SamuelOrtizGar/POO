
package HelloWorld;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucles {
    
    public static void main(String[] args) {
        
        //for
        
        for(int n = 0; n < 5; n++){
            System.out.println("HELLO, JAVA WORLD");
        }
        
        String[] names = {"SAMUEL", "ESTEBAN", "ORTIZ", "GARCIA"};
        System.out.println(names.length);
        
        for(int n = 0; n < names.length; n++){
            System.out.println(names[n]);
        }
        
        //for-each
        
        for (String n: names){
            System.out.println(n);
        }
    
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(45);
        numbers.add(78);
        numbers.add(10);
        numbers.add(63);
        
        for(Integer number:numbers){
            System.out.println(number);    
        }
        
      HashMap<String, Integer> contactos = new HashMap<>();
      contactos.put("Samuel", 321327);
      contactos.put("Paola", 31423738);
      
      for(Map.Entry<String, Integer> n2: contactos.entrySet()){
          System.out.println(n2);
          System.out.println(n2.getKey());
          System.out.println(n2.getValue());
          
          //while
          
          int n = 0;
          while(n<5){
              System.out.println("HELLO, JAVA WORLD");
              n++;
          }
          
          n = 0;
          while(n < names.length){
              System.out.println(names[n]);
              n++;
          }
          
          n = 0;
          while(n < names.length){
              System.out.println(names[n]);
              if(names[n].equals("ORTIZ")){
                  n+=2;
              }
              n++;
              
          }
          
          //do-while
          n = 0;
          do{
              System.out.println("HELLO, JAVA");
              n++;
          }while(n < 0);
      
          ///Control de bucles
          
          //Break
          
          for(String name: names){
              if(name.equals("ORTIZ")){
               break;   
              }
                 System.out.println(name);
                  
          }
          
          //Continue
          
          for(int A = 0; A <= 5; A++){
              if(A == 3){
                  continue;
              }
                
              System.out.println(A);
          }
          
          }
        
    }   
 
}
