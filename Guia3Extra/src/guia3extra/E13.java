package guia3extra;

import java.util.Scanner;

public class E13 {

    /*
    Crear un programa que dibuje una escalera de números,
    donde cada línea de números comience en uno y termine 
    en el número de la línea. Solicitar la altura de la 
    escalera al usuario al comenzar. Ejemplo: si se ingresa 
    el número 3:
1
12
123

     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la cantidad de filas");
        int filas = teclado.nextInt();
        
        int num = 0;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            num++;
            System.out.println("");
        }

    }

}
