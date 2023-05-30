package guia12.ejercicio2;

import java.util.ArrayList;

public class Guia12Ejercicio2 {

    public static void main(String[] args) {

        //        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        System.out.println("Precio final lavadora: $" + lavadora.precioFinal());
//        Televisor tele = new Televisor();
//        tele.crearTelevisor();
//        System.out.println("Precio final tele: $" + tele.precioFinal());
        ArrayList<Electrodomestico> elec = new ArrayList<>();
        Electrodomestico lava1 = new Lavadora(20, "Rojo", 'A', 50, 1000);
        Electrodomestico lava2 = new Lavadora(35, "blanco", 'C', 30, 1000);
        Electrodomestico tele1 = new Televisor(45, "negro", 'D', 20, 1000);
        Electrodomestico tele2 = new Televisor(35, "gris", 'F', 15, 1000);
        elec.add(lava1);
        elec.add(lava2);
        elec.add(tele1);
        elec.add(tele2);
        double precioLavad = 0;
        double precioTele = 0;
        for (Electrodomestico el : elec) {
            System.out.println(el.precioFinal());
            if (el instanceof Lavadora) {
                precioLavad += el.precioFinal();
            }
            if (el instanceof Televisor) {
                precioTele += el.precioFinal();
            }
        }
        System.out.println("El precio total de todos los productos es: $" + (precioLavad + precioTele));
        System.out.println("El precio de los televisores es: $" + precioTele);
        System.out.println("El precio de las lavadoras es: $" + precioLavad);
    }
}

}
    
}
