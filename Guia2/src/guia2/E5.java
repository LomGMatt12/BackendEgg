package guia2;

import java.util.Scanner;


public class E5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que numero desea saber la raiz cuadrada");
        int num;
        num=leer.nextInt();
        System.out.println("La raiz cuadrada de "+ num + " es: " + Math.sqrt(num));
    }
    
}
