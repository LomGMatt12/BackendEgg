package guia3;

import java.util.Scanner;

public class E5 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un valor limite positivo");
        int limite;
        limite = sc.nextInt();//se ingrese el valor
        
        
        int aux, suma;
        
        suma = 0;//para iniciar el contador
        
       do{
           System.out.println("ingresar numero");
           aux=sc.nextInt();
/**el usuario ingrese otro numero que se sumara 
 * con otro que ingrese el usuario para superar 
 * el valor inicial*/
           suma = suma + aux;//suma guarda el primer numero que el usuario ingrese y se le sumara el otro
           
       }while(limite>suma);
        System.out.println("se supero el valor inicial");
       
                
        
    }
    
}
