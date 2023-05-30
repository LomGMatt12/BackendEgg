package guia3;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int aux= 0, aux1=0, correcta = 0, incorrecta = 0;

        System.out.println("Ingrese una cadena");
        String caracteres = sc.nextLine();

        while (!caracteres.equals("&&&&&")) {//mietras que la cadena sea distinto que &&&&& continua ejecutandose, cuando sea igual se termina
            int longitud = caracteres.length();

            if (caracteres.length() == 5 && caracteres.substring(0, 1).equals("x") && caracteres.endsWith("o") && longitud == 5) {
                correcta++;
            } else {
                incorrecta++;
            }
            System.out.println("Ingrese una cadena");
         caracteres = sc.nextLine();
        }
        System.out.println("cadenas correctas"+ correcta);
        System.out.println("cadenas incorrectas" + incorrecta);
    }
    
}

