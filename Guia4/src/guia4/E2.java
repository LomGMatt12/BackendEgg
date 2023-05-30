package guia4;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n cantidad de personas con su nombre y edad");
        int personas = sc.nextInt();

        Edades(personas);
    }

    public static int Edades(int personas) {
        int edadMayor = 18;
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < personas; i++) {
            System.out.println("ingrese el nombre de la persona");
            nombre = sc.next();
            System.out.println("Ingrese la edad de la persona");
            edad = sc.nextInt();
            if (edad > 18) {
                System.out.println("La persona es mayor de edad ");
            } else {
                System.out.println("La persona es menor de edad");
            }
            System.out.println("Su nombre es " + nombre + " y su edad " + edad);
        }

        return personas;
    }

}
