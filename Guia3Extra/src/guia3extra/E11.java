package guia3extra;

import java.util.Random;
import java.util.Scanner;



public class E11 {

//e10

    /*
    Realice un programa para que el usuario adivine el resultado de 
    una multiplicación entre dos números generados aleatoriamente 
    entre 0 y 10. El programa debe indicar al usuario si su respuesta
    es o no correcta. En caso que la respuesta sea incorrecta se debe
    permitir al usuario ingresar su respuesta nuevamente. Para realizar 
    este ejercicio investigue como utilizar la función Math.random() de Java.
     */
    public static void main(String[] arg) {

        int num, usuario, intentos = 0;
        Scanner sc = new Scanner(System.in);
        
        Random r = new Random();
        
        num = r.nextInt(20) +1 ;
        
        do{
            System.out.println("Ingrese el numero a adivinar de 1 a 20");
            usuario = sc.nextInt();
            if (num>usuario) {
                System.out.println("El numero es mayor");
            }else if(num<usuario){
                System.out.println("El numero es menor");
            }
            
        }while(num!= usuario);
    
        System.out.println("Correcto el numero era " + num);


}
}