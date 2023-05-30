package guia2;

import java.util.Scanner;


public class Guia2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese dos numeros");
        int x,b;
        x=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        b=leer.nextInt();
        int aux = x + b;
        System.out.println("La suma de los numero es:" + aux);
        
        
    }
    
}
