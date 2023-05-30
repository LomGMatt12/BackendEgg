package guia2;

import java.util.Scanner;


public class E2 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre;
        nombre = leer.next();
        System.out.println("Hola, como estas? " + nombre);
    }
    
}
