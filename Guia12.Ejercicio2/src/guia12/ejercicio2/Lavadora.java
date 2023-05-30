/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejercicio2;

/**
 *
 * @author Matias
 */
public class Lavadora {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la carga");
        this.carga = sc.nextDouble();
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
     */
    @Override
    public double precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
        return precio;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}

