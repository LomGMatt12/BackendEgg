package guia3;

import java.util.Scanner;


public class E3 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase no mas de 8 caracteres");
        String frase;
        frase=leer.next();
        if(frase.length()<=8){
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
