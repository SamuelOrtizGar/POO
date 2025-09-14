
package HelloWorld;

public class BuclesExercises {
    public static void main(String[] args) {
        
        //Imprime numeros del uno al 10 usando while
        
        int n = 1;
        while(n <= 10){
            System.out.println(n);
            n++;
        }
        
        System.out.println("Los multiplos de 5 son los siguientes: ");
        for(n = 5;n <= 50;n+=5){
            System.out.println(n);
        }
        
        int[] number = new int[5];
        number[0] = 20;
        number[1] = 45;
        number[2] = 78;
        number[3] = 14;        
        number[4] = 9;    
                System.out.println(number[0]);
                System.out.println(number[1]);
                System.out.println(number[2]);
                System.out.println(number[3]);
                System.out.println(number[4]);
                int total = number[0]+number[1]+number[2]+number[3]+number[4];
                System.out.println(total);
    }
}
