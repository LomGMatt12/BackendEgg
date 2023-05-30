package guia11ext03;

import guia11ext03.entidades.*;
import guia11ext03.servicios.Service;




public class Guia11ext03 {


    public static void main(String[] args) {
        
        Service s1 = new Service();
        
        Cliente c1 = s1.cargarCliente();
        Vehiculo v1 = s1.cargarVehiculo();
        Poliza p1 = s1.cargarPoliza(c1, v1);
        Cuota co = s1.cargarCuota(p1);
        System.out.println(co.toString());
    }
        
        
        
    }
    

