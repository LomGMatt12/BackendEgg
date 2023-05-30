package guia12.ejercicio4;

import java.util.Scanner;


public class Guia12Ejercicio4 {


    public static void main(String[] args) {
        
        
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        Circulo redondo = new Circulo(sc.nextDouble());
        System.out.println("El perimetro del circulo es: " + redondo.perimetro());
        System.out.println("El area total del circulo es: " + redondo.calcularArea());
        System.out.println("Ingrese la base del rectangulo");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        Rectangulo poligono = new Rectangulo(base, sc.nextDouble());
        System.out.println("El perimetro del rectangulo es: " + poligono.perimetro());
        System.out.println("El area del rectangulo es: " + poligono.calcularArea()); 
        
        
    }
    
}
