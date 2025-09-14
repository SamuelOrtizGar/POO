
package HelloWorld;

import java.util.Scanner;

public class FunctionsExercises {
    public static void main(String[] args) {
       
        //1.
        
        holaMundo();
        
        //2.
        
        hola("SAMUEL");
        
        //3.
        operacion();
        
    }

   //funcion que imprima una bienvenida 1.
    
    public static void holaMundo(){
        String hello = ("Hola, bienvenido a java");
        System.out.println(hello);
    }

   //funcion que reciba un nombre como parametro y salude a esa persona
    
    public static void hola(String name){
        System.out.println("Hola "+name);
    }

    public static int operacion(){
    Scanner sc = new Scanner (System.in);
        System.out.println("Elija un numero");
        int n1 = sc.nextInt();
        System.out.println("Elija otro numero");
        int n2 = sc.nextInt();
        int resta = n1-n2;
        System.out.println("El resultado de la resta es: "+resta);
        return resta;
    }
       
    
 }



