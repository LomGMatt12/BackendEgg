package guia3;

import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero");
        int num = sc.nextInt();

            //linea superior
            for (int i = 0; i < num; i++) {
                System.out.println("*");
            }
            System.out.println("");
            
            //centro de la forma
            for (int i = 0; i < num-2; i++) {
                System.out.println("*");
                for (int j = 0; j < num-2; j++) {
                    System.out.println("");
                }
            }
            //linea inferior
            for (int i = 0; i < num; i++) {
                System.out.println("*");
            }
    
    }
}