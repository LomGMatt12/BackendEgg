package guia3;

import java.util.Scanner;


public class E4 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabro o frase");
        String frase;
        String letra = "a";
        frase=leer.nextLine();//ingreso la frase
        letra = frase.substring(0,1);//letra es igual al primer caracter de la frase
        
        if(letra.equals("a")== true){//si la primera letra de la frase es igual a "A"
            System.out.println("correcta");
        }else{
            System.out.println("incorrecto");
        }
        
    }
    
}
