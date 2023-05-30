package guia3extra;

import java.util.Scanner;


public class E5 {

  /*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y
determine el importe en efectivo a pagar por dicho socio
    */
    public static void main(String[] args) {
        
        
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("que tipo de socio eres?");
        System.out.println("Socio A");
        System.out.println("Socio B");
        System.out.println("Socio C");
        
        String socio = teclado.next();
   
        
        
        
        if("a".equals(socio)){
            System.out.println("Ingrese el monto a pagar");
            int monto = teclado.nextInt();
            System.out.println("Total pagado es de:" + (monto*0.50));
        }else if("b".equals(socio)){
            System.out.println("Ingrese el monto a pagar");
            int monto = teclado.nextInt();
            System.out.println("Total pagado es de:" + (monto*0.35));     
        }else if("c".equals(socio)){
            System.out.println("Ingrese el monto a pagar");
            int monto = teclado.nextInt();
            System.out.println("Total pagado es de:" + (monto/0));
        }
        System.out.println("Gracias por abonaar, Que tenga un buen dia");
        
    }
    
}
