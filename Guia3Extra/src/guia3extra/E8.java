package guia3extra;

import java.util.Scanner;


public class E8 {

/*
    Escriba un programa que lea números enteros. 
    Si el número es múltiplo de cinco debe detener 
    la lectura y mostrar la cantidad de números leídos, 
    la cantidad de números pares y la cantidad de números impares. 
    Al igual que en el ejercicio anterior los números negativos no 
    deben sumarse. Nota: recordar el uso de la sentencia break
 */
    
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese n numero");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese numeros que sean multiplo de 5");
            int numero = sc.nextInt();
            
            if(numero % 5 == 0){
                System.out.println("es multiplo de 5");
            }else{
                System.out.println("no es multiplo de 5");
            }
           
        }
      
        //hacerlo con un do while
        
    }
    
}
