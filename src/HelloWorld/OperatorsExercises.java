
package HelloWorld;

public class OperatorsExercises {
    public static void main(String[] args) {
        //1. Crea variable con resultado de cada operacion aritmetica.
        
        int a = 5;
        int b = 10;
        int c = 14;
        int d = 7;
        System.out.println(a+b);       
        System.out.println(c+d);
        System.out.println(a*d);
        System.out.println(b/a);
        System.out.println(d%a);
        
        //2. Crea variable para cada operacion de asignacion.
        
        c=c+5;
        System.out.println(c);
        a+=1;
        System.out.println(a);
        d=d-10;
        System.out.println(d);
        b=d+3;
        System.out.println(b);
        
        //3. Imprime 3 comparaciones verdaderas con diferentes operadores de asignacion
        
        System.out.println(a!=b);
        System.out.println(c>a);
        System.out.println(a<=c);
        
        //4. Imprime 3 comparaciones falsas con diferentes operadores de asignacion
        
        System.out.println(c<d);
        System.out.println(a==d);
        System.out.println(b>=a);
        
        //5. Utiliza operador logico AND
        System.out.println(true && true);
        
        //6. Utiliza operador logico OR
        System.out.println(false || false);
        
        //7. Combina ambos operadores logicos
        System.out.println((true || false && true));
        
        //8. Añade alguna negacion.
        System.out.println(!(true && true));
        
        //9. Imprime 3 ejemplos de operadores unarios
        int z = 5;
        System.out.println(z);
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);
        System.out.println(--z);
        System.out.println(z--);
        System.out.println(z);
                
    }
    
}
