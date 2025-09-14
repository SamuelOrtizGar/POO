
package HelloWorld;

public class Strings {
    public static void main(String[] args) {
        
        //Cadenas de texto
        
        String myName = "SAMUEL";
        var secondName = new String ("ESTEBAN");
        
        //Operaciones basicas
        
        //Concatenacion
        
        System.out.println(myName + " " + secondName);
        
        //Longitud
        
        System.out.println(myName.length());
        
        //Obtener caracter
        
        System.out.println(myName.charAt(0));
        
        //Subcadena
        
        System.out.println(myName.substring(2));
        System.out.println(myName.substring(0 , 3));
        
        //Mayusculas y minusculas
        
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        
        myName = "SAMUEL";
        System.out.println(myName);
        
        System.out.println("Hola, Samuel".contains("Java"));
        System.out.println("Hola, Samuel".contains("muel"));
        System.out.println("Samuel".toUpperCase().contains("SAMU"));
        System.out.println(myName);
        //Comparacion
        
        System.out.println(myName == "SAMUEL");
        System.out.println(myName.equals("sAMUEL"));
        System.out.println(myName.equalsIgnoreCase("sAMUEL"));
        
        //Trim
        
        System.out.println(" Hola, me llamo Samuel ");
        System.out.println(" Hola, me llamo Samuel ".trim());
        
        //Replace
        
        System.out.println(" Hola, Me Llamo Samuel ".replace("Hola", "Adios"));
        System.out.println("Adios".replace("Adios", "Hola"));
        
        //Format
        int edad = 18;
        System.out.println(String.format("Mi nombre es Samuel %d, tengo 17 %d", edad, edad));
        
        
     }
}