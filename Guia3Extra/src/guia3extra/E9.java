package guia3extra;

import java.util.Scanner;


public class E9 {

    /*
    Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
    realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
    Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
    este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Division usando solamente resta");
        System.out.println("Ingrese un numero fijo con el que se restara");
        int a = sc.nextInt();
        
        System.out.println("Ingrese el numero que quieres que se reste");
        int b = sc.nextInt();
        
        int cons = 0;
        do{
            a-=b;
           cons++;
        }while(a>=b);
           
        System.out.println("resta" + a);
        System.out.println("cociente" + cons);
       
        
        
        
        
    }
    
}
