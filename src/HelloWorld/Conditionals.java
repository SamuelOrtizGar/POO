
package HelloWorld;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Condicionales
        
        System.out.println("Digame su edad");
        int edad = sc.nextInt();
        System.out.println(edad >= 18);
        
        if (edad > 18){
        System.out.println("Usted es mayor de edad por lo que puede continuar con el registro");
        }
        else if (edad == 18){
            System.out.println("Usted acabo de cumplir 18");
        }
        else
        {
        System.out.println("Usted no es mayor de edad por lo que no puede continuar con el proceso");
        }
        
        //Switch
        
        System.out.println("Digame un dia de la semana representado por numeros");
        int day = sc.nextInt();
        
        switch(day){
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Eligiste mal el número del día");
        
         }
        
     }  
 }
