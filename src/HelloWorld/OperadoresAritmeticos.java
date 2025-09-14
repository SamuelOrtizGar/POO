
package HelloWorld;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        //Operadores Aritmeticos
        
        double a=5;
        double b=7;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        int c = 10;
        int d = 15;
        int f = c+d;
        System.out.println(f);
        
        //Operadores de Asignacion
        
        a = b;
        System.out.println(a);
        d = c*3;
        System.out.println(d);
        
        d+=2; /// esto es lo mismo que: d = d+2
        System.out.println(d);
        d-=2;
        System.out.println(d);
        d*=2;
        System.out.println(d);
        d/=2;
        System.out.println(d);
        d%=2;
        System.out.println(d);
        
        //Comparacion
        
        System.out.println(a == b);
        System.out.println(d == 1);
        
        System.out.println(a != b);
        System.out.println(d != 1);
        
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
               
        //Logicos
        
        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(10==10 && 5==5);
        System.out.println(1==0 && 845<900);
        
        // O (OR)
        
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(10!=12 || 5<1);
        System.out.println(10>48 || 5!=5);
        
        // NO (NOT
        
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(10==10) || 5<2);
        
        //Unarios
        
        System.out.println(d);
        System.out.println(++d);
        System.out.println(d++);
        System.out.println(d);
        System.out.println(--d);
        System.out.println(d--);
        System.out.println(d);
        
        
    }
    
}
