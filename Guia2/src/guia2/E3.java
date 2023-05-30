package guia2;

import java.util.Scanner;


public class E3 {

  
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrse una frase que mas le guste, y se lo mostrara en minuscula");
        String frase;
        frase = leer.next();
        System.out.println(frase.toLowerCase());
        System.out.println("------------------");
        System.out.println(frase.toUpperCase());
    }
    
}
