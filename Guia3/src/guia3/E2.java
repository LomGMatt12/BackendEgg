package guia3;

import java.util.Scanner;


public class E2 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la frase correcta");
        String frase  = "";
        frase=leer.next();
        if(frase.equals("eureka")){
            System.out.println("La frase es la correcta");
        }else{
            System.out.println("La frase ingresada es Incorrecta");
        }
    }
    
}
