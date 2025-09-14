
package HelloWorld;

import java.util.Scanner;

public class ConditionalsExercises {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
        //1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        System.out.println("Digame su edad porfa");
        int edad = sc.nextInt();
        
        if (edad >= 18){
            System.out.println("Felicidades, usted es mayor de edad por lo que puede votar :) ");
        }
        else {
            System.out.println("Lo siento, no puede votar porque es menor de edad :( ");
        }
    
        //2. Declara 2 numeros y muestra cual es mayor, o si son iguales.
        
        System.out.println("Digame un numero");
        int n1 = sc.nextInt();
        System.out.println("Digame otro numero");
        int n2 = sc.nextInt();
        
        if (n1>n2){
            System.out.println("El numero mayor es: " + n1);
        }
        else if (n1<n2){
            System.out.println("El numero mayor es: " + n2);
        }
        else if (n1==n2){
            System.out.println("Los dos numeros que selecciono sumerce son iguales: "+ n1 + ", " + n2);
        }
        
        //3. Dado un numero verifica si es positivo, negativo o cero.
        
        System.out.println("Digite un numero");
        double n3 = sc.nextDouble();
        if (n3 == 0){
            System.out.println("Este numero es cero");
        }
        else if (n3>0){
            System.out.println("Este numero es positivo");
        }
        else if (n3<0){
            System.out.println("Este numero es negativo");
        }
        
        
    }
    
    
    
}
