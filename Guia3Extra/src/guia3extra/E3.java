package guia3extra;

import java.util.Scanner;

public class E3 {

/*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una vocal");
        String vocal = teclado.next();
        
        if(vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")){
            System.out.println("La letra " +"("+ vocal +")" + " es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
