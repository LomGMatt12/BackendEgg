package guia4;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CAJA DE CAMBIO");
        System.out.println("Cuanto dinero desea cambiar-(solo se aceptan EUROS)");
        double cambio = sc.nextInt();
        System.out.println("Eliga la monena que le gustatia cambiar");
        
        
        Monedas(cambio);

    }

    public static int Monedas(double cambio) {
        
        
        double libra = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;
        Scanner sc = new Scanner(System.in);

        System.out.println("menu");
        System.out.println("1-Libra ------------- valor(0.86)");
        System.out.println("2-Dolar ------------- valor(1.28611)");
        System.out.println("3-Yenes ------------- valor(129.852)");

        System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Usted a recibido un total de " + (cambio * libra) + " en Libra");
                break;
            case 2:
                System.out.println("Usted a recibido a valor Dolar" + (cambio * dolar));
                break;
            case 3:
                System.out.println("Usted a recibido la cantidad de " + (cambio * yenes) + "Yenes");
                break;
            default:
                System.out.println("Adios!!!");

        }
        return opcion;

    }

}
