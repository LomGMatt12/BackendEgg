package guia3extra;

import java.util.Scanner;


public class E4 {

    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
    */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero entero que sera convertido en numero romano");
        int romano = teclado.nextInt();
        
       switch (romano){
           case 1 -> System.out.println("I");
           case 2 -> System.out.println("II");
           case 3 -> System.out.println("III");
           case 4 -> System.out.println("IV");
           case 5 -> System.out.println("V");
           case 6 -> System.out.println("VI");
           case 7 -> System.out.println("VII");
           case 8 -> System.out.println("VIII");
           case 9 -> System.out.println("IX");
           case 10 -> System.out.println("X");
           default -> System.out.println("Estamo en proceso de agregar mas numero romanos");
           
            }
               
       }
        
    }
    

