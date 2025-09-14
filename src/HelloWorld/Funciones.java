
package HelloWorld;

import java.util.ArrayList;

public class Funciones {
    public static void main(String[] args) {
        
        //funciones
        
        for(int n = 1; n <= 5;  n++){
            sendEmail();
        }
        sendEmail();
        sendEmailToUser("ortizsamuel2as@gmail.com");
        sendEmailToUser("ortizsamuel2as@gmail.com", "samuelortizgar");
        
        sendEmailWithState("ortizsamuel2as@gmail.com");
        var state = sendEmailWithState("ortizsamuel2as@gmail.com");
        System.out.println(state);
        
        System.out.println(sendEmailWithState(""));
    }
    
    //Funcion sin parametros ni retorno
    
    public static void sendEmail(){
        System.out.println("Se envia el email");
    }

//Funcion con parametros
    
    public static void sendEmailToUser(String email){
        System.out.println("Se envia el email a: "+email);
    }
 
    //Sobre carga de funciones
    
    public static void sendEmailToUser(String email, String user){
        System.out.println("Se envia el email a: " + user + "(" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails){
        for(String email: emails){
            System.out.println("Se envia el email a: "+email);
        }
        
    }
    
    //Funcion con retorno
    
    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("Se envia el email a: "+email);
        return true;
    }
   
}
