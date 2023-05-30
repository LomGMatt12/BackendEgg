package guia3;

import java.util.Scanner;


public class E6 {

  
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido a la Calculadora JAVA!!");
        
        System.out.println("Ingrese los numero para realizar la ecuacion");
                double num = sc.nextDouble();
                double num1 = sc.nextDouble();
        
        System.out.println("ingrese la opcion que le gustaria hacer la ecuacion");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        
        
        
        int opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("La suma de los dos numero es:" + (num+num1));
                break;
            case 2:
                System.out.println("La resta de los numero es:" + (num-num1));
                break;
            case 3:
                System.out.println("La multiplicacion de los numero es: " + (num*num1));
                break;
            case 4:
                System.out.println("La Division de los numero es: " + (num/num1));
                break;
            case 5:
                System.out.println("Gracias por usar la calculadora JAVA");
                break;
        default:
        System.out.println("la opcion fue incorrecta");
    }
    }
}
