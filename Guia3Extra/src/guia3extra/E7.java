package guia3extra;

import java.util.Scanner;


public class E7 {


    /*
    Realice un programa que calcule y visualice el valor máximo, 
    el valor mínimo y el promedio de n números (n>0). El valor 
    de n se solicitará al principio del programa y los números 
    serán introducidos por el usuario. Realice dos versiones 
    del programa, una usando el bucle “while” y otra con el bucle “do - while”.
    */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
       //primera version
        System.out.println("Ingrese n numeros");
        int n = teclado.nextInt(), valor, suma = 0;
        
        while(n<=15){
            System.out.println("Ingrese n numeros");
            valor = teclado.nextInt();
            n++;
            suma+=valor;
            
        }
        System.out.println("El promedio de los numeros ingresados es de: " + (suma/n));
        
      //segunda version
        System.out.println("-----------------------segunda version-------------------------");
        
        
        System.out.println("Ingrese la cantida de numero que le gustaria agregar");
            int num = teclado.nextInt(), max = 0;
            
        do{
            System.out.println("Ingrese ln numeros");
            int nu = teclado.nextInt();
            num++;
            max+=nu;
        }while(num<=10);
        System.out.println("El promedio de los numero es: " + max/num );
    }
    
}
