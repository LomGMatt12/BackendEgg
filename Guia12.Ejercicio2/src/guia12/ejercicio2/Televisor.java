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
public class Televisor {
    private int pulgadas;
    private boolean sintonizadorTDT = false;

    public Televisor() {
    }

    public Televisor(int pulgadas, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del Televisor");
        this.pulgadas = sc.nextInt();
        System.out.println("El Televisor cuenta con sintonizador TDT? s/n");
        char op = sc.next().toLowerCase().charAt(0);
        if (op == 's') {
            sintonizadorTDT = true;
        }
    }
    /* Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio.*/
    @Override
    public double precioFinal(){
        super.precioFinal();
        if (pulgadas>40) {
            precio = precio*1.3;
        }
        if (sintonizadorTDT) {
            precio+=500;
        }
        return precio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

}
}
