package guia5manosobra;

import java.util.Scanner;


public class Ejercicio13 {


    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String[] equipo = new String[9];
        
        
        System.out.println("Ingrese el nombre de tu equipo");
        for (int i = 0; i < equipo.length; i++) {
            equipo[i]=sc.nextLine();   
        }
        System.out.println("");
        
    }
    
}
