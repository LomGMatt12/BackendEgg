package guia4;

import java.util.Scanner;

public class Guia4 {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Agrega los numero que le gustaria para resolver");
        System.out.println("Ingrese el primer numeros");
        int num1 = sc.nextInt();
        System.out.println("ahora el segundo");
        int num2 = sc.nextInt();

        opciones(num1, num2);
    }

    public static int opciones(int num1, int num2) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("menu");
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-salir");
         System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma entre los dos numero es:" + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta entre los dos numero es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La resta entre los dos numero es: " + (num1*num2));
                break;
            case 4:
                System.out.println("La division entre los dos numero es: " + (num1/num2));
                break;
            default:
                System.out.println("Adios!!!");
                

        }return opcion;
    }

}
