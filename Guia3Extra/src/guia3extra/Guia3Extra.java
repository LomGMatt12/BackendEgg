package guia3extra;

import java.util.Scanner;


public class Guia3Extra {

    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, 
    el sistema debe calcular su equivalente: 1 día, 2 horas*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = teclado.nextInt();
         int segundos =  60, horas = 60, dias = 1440;

         int aux = minutos * segundos;
         int aux1 = minutos * dias;
         int aux2 = minutos * horas;
         
        System.out.println("MINUTOS ingresados " + minutos);
        System.out.println("Convertido en segundos " + aux);
        System.out.println("Convertido en horas " + aux2);
        System.out.println("Convertido en dias " + aux1);
   
                 
                 
                 
}
}

