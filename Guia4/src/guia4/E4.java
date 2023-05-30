package guia4;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero primo");
        int numero = sc.nextInt();

        /*if(numero % 2 == 0){
            System.out.println("es primo");
        }else if(numero == 0 || numero == 1 || numero == 4){
            System.out.println("no es primo");
        }else{
            System.out.println("dije numero primo culero");
        }*/
        
        numPrimos(numero);

    }

    public static void numPrimos(int numero) {

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es primo");
        } else if (numero == 0 || numero == 1 || numero == 4) {
            System.out.println("El numero ingresado no es primo");
        }else{
            System.out.println("Dije numeros primos salamin");
        }

}
}
