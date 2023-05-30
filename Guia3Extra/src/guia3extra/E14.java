package guia3extra;

import java.util.Scanner;


public class E14 {

    
    /*
    Se dispone de un conjunto de N familias,
    cada una de las cuales tiene una M cantidad 
    de hijos. Escriba un programa que pida la 
    cantidad de familias y para cada familia la 
    cantidad de hijos para averiguar la media 
    de edad de los hijos de todas las familias.
    */

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de familias");
        int familias = sc.nextInt();
        int hijos = 0;
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos");
            hijos = sc.nextInt();
             
        }
        System.out.println("");
        System.out.println("la media de hijos entre familias es: " + familias/hijos);
        
    }
    
}
