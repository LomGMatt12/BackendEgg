package guia2;

import java.util.Scanner;


public class E4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dada una cantidad de grando en centrigrado, ingrese la cantidad que quiera saber");
        double cen;
        cen=leer.nextDouble();
        
        System.out.println("El grado centrigado es: " + (32+(9*cen/5)));
    }
    
}
