package guia3extra;

import java.util.Scanner;


public class E6 {


    public static void main(String[] args) {
       
      Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su estatura");
        double estatura = teclado.nextDouble();
        
        if(estatura <= 1.60){
            System.out.println("Usted se encuentra por debajo de la estura");
        }else{
            System.out.println("Usted se encuntra en una estatura general");
        }
    
    
        
        
    }
    
}
