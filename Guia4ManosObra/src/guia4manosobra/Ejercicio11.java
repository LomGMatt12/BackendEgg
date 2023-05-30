package guia4manosobra;

import java.util.Scanner;


public class Ejercicio11 {

 
    public static void main(String[] args) {
        
  String cadena, cadena2 = "";
        int largo;
        char s;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una frase que termine con un (.)");
        cadena = sc.nextLine();

        do {
            System.out.println("");
        } while (!".".equals(cadena.substring(cadena.length() - 1, cadena.length())));

        largo = cadena.length();
        for (int i = 0; i < largo; i++) {
            s = cadena.charAt(i);
            if (s == 'a') {
                s = '@';
            }
            if (s == 'e') {
                s = '#';

            }
            if (s == 'i') {
                s = '$';

            }
            if (s == 'o') {
                s = '%';

            }
            if (s == 'u') {
                s = '*';
                cadena2 = cadena2 + s;
            } else {
                cadena2 = cadena2 + s;
            }
        }

        System.out.println(cadena2);

}
}
