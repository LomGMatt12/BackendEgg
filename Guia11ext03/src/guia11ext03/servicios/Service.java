package guia11ext03.servicios;

import guia11ext03.entidades.*;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Service {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cliente cargarCliente() {

        System.out.println("ingrese su nombre y apellido");
        String nombre = input.next();
        System.out.println("ingrese su Email");
        String email = input.next();
        System.out.println("ingrese su domicilio");
        String domicilio = input.next();
        System.out.println("ingrese su telefono");
        int telefono = input.nextInt();
        System.out.println("ingrese su dni");
        int dni = input.nextInt();

        return new Cliente(nombre, email, domicilio, telefono, dni);

    }

    public Vehiculo cargarVehiculo() {

        System.out.println("ingrese la marca del auto");
        String marca = input.next();
        System.out.println("ingrese el modelo del auto");
        String modelo = input.next();
        System.out.println("ingrese el color del auto");
        String color = input.next();
        System.out.println("especifique el tipo de vehiculo \n 1. Sedan \n 2. Utilitario \n 3. SUV \n 4. 5 puertas \n 5. Camioneta");
        int op = input.nextInt();

        Tipo tipo = null;
        switch (op) {
            case 1:
                tipo = Tipo.SEDAN;
            case 2:
                tipo = Tipo.UTILITARIO;
            case 3:
                tipo = Tipo.SUV;
            case 4:
                tipo = Tipo.CINCOPUERTAS;
            case 5:
                tipo = Tipo.CAMIONETA;

        }
        System.out.println("ingrese el año del vehiculo");
        int year = input.nextInt();
        System.out.println("ingrese el numero del motor");
        int motor = input.nextInt();
        System.out.println("ingrese el numero de chasis");
        int chasis = input.nextInt();

        return new Vehiculo(marca, modelo, color, tipo, year, motor, chasis);

    }

    public Poliza cargarPoliza(Cliente c1, Vehiculo v1) {
        //Cliente cliente, Vehiculo vehiculo,  int cantCuotas, int montoAsegurado, int maxGranizo, Pagos pago, Cobertura cobertura, boolean granizo) {

        System.out.println("ingrese la cantidad de cuotas");
        int cantCuotas = input.nextInt();
        System.out.println("ingrese el monto para asegurar");
        int monto = input.nextInt();
        System.out.println("desea asegurar por granizo? \n 1. si \n 2.no");
        int op = input.nextInt();
        int montoGranizo = 0;
        boolean granizo;
        if (op == 1) {
            granizo = true;
            System.out.println("ingrese el monto a asegurar por granizo");
            montoGranizo = input.nextInt();

        } else {
            granizo = false;
        }

        //   EFECTIVO,TARJETA,DEPOSITO,MERCADOPAGO
        System.out.println("elija un medio de pago \n 1. Efectivo \n 2. Tarjeta de Credito \n 3. Deposito bancario \n 4. Mercado Pago ");
        int op1 = input.nextInt();
        Pagos pago = null;
        switch (op1) {
            case 1:
                pago = Pagos.EFECTIVO;
            case 2:
                pago = Pagos.TARJETA;
            case 3:
                pago = Pagos.DEPOSITO;
            case 4:
                pago = Pagos.MERCADOPAGO;
        }

        // ROSPONSABILIDADCIVIL,TERCEROSCOMPLETO,TOTAL
        System.out.println("elija el tipo de cobertura \n 1. Responsabilidad Civil \n 2. Terceros Completo \n 3. Seguro Total");
        int op2 = input.nextInt();
        Cobertura cob = null;

        switch (op2) {
            case 1:
                cob = Cobertura.ROSPONSABILIDADCIVIL;
            case 2:
                cob = Cobertura.TERCEROSCOMPLETO;
            case 3:
                cob = Cobertura.TOTAL;

        }

        return new Poliza(c1, v1, cantCuotas, monto, montoGranizo, pago, cob, granizo);

    }

    public Cuota cargarCuota(Poliza p1) {

        //(Poliza poliza, int numCuota, double montoCuota, boolean pagado, Date vencimiento) 
        System.out.println("desea pagar la cuota en este momento. S/N");
        String op = input.next();
        boolean pago = false;
        if (op.equalsIgnoreCase("s")) {
            pago = true;

        }

        return new Cuota(p1, pago);
    }

}
