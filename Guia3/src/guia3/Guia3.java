package guia3;

import java.util.Scanner;


public class Guia3 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero que quiera saber si es par o impar");
        int num;
        num=leer.nextInt();
        if(num % 2 == 0){
            System.out.println("Par");
        }else{
                System.out.println("ES imPar");
                }
    }
    
}
