
package HelloWorld;

public class exercisesStrings {
    public static void main(String[] args) {
        
        //1. Concatena dos cadenas de texto
        
        String name = "SAMUEL";
        System.out.println(name + " " + "ORTIZ");
        
        //2. Muestra la longitud de una cadena de texto
        
        System.out.println(name.length());
        
        //3. Muestra el primer y ultimo caracter de un String
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(5));
        
        //4. Convierte a mayusculas y minusculas un String
        
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        
        //5. Comprueba si una cadena de texto contiene una palabra concreta
        String S_H = "Hola, soy Samuel Y amo a Valeria";
        System.out.println(S_H.contains("Samuel"));
        
        //6. formatea un String con un entero
        int edad = 18;
        System.out.println(String.format("SEOG %d", edad));
        
        //7. elimina los espacios en blanco al principio y final de un String
        
        System.out.println(" SAMUEL ".trim());
        
        //8. Sustituye todos los espacios en blanco por un guion (-)
        
        System.out.println("Hola Samuel tengo 18".replace(" ", "-"));
        
        //9. Comprueba si dos Strings son iguales
        
        String secondName = "ESTEBAN";
        String apellido = new String ("ORTIZ");
        System.out.println(secondName.equals(apellido));
        
    }
}
