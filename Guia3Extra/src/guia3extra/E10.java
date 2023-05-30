package guia3extra;

import java.util.Scanner;

public class E10 {//e11

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n numeros");
        int num = sc.nextInt();

        //primero metodo
        System.out.println("la cantidad de numero " + num + " es: " + Integer.toString(num).length());

        //segundo metodo
        int digitos = 0;
        //digitos = (int)(Math.log10(num)+1););

        //tercer metodo
        while (num != 0) {

            num = num / 10;
            digitos++;
        }
       

    }

}
