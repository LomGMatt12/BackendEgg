package guia3extra;

import java.util.Scanner;

public class E2 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un valor para cuatros variables");

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        int aux = c;
        int aux1 = a;
        int aux2 = d;
        int aux3 = b;

        b = aux;//b valor de c
        aux = a;//c valor de a
        aux1 = d;//a valor de d
        aux2 = aux3;//d valor de b

        System.out.println("B valor de C: " + b);
        System.out.println("C valor de A: " + aux);
        System.out.println("A valor de D: " + aux1);
        System.out.println("D valor de B: " + aux2);

    }

}
