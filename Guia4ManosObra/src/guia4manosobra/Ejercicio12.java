package guia4manosobra;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
       
        Scanner datos = new Scanner(System.in);

     System.out.println("ingrese un numero");
     int numero = datos.nextInt();

     System.out.println("ingrese un multiplo");
     int multiplo = datos.nextInt();

     mostrarDatos(numero, multiplo);
    }

    public static void mostrarDatos(int numero, int multiplo){

    if (numero % multiplo == 0){
        System.out.println("el numero  " + numero + " es multiplo de " + multiplo);
    } else {
    System.out.println("El numero " + numero + " no es multiplo de " + multiplo);
    }
    }
    }
    

