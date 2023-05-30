
package guia12.ejercicio2;

import java.util.Scanner;


public abstract class Electrodomestico {
       
protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    protected Scanner sc = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                break;
            default:
                letra = 'F';
                break;
        }
        return letra;
    }

    private String comprobarColor(String color) {
        color = color.toUpperCase();
        switch (color) {
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS":
                break;
            default:
                color = "BLANCO";
                break;
        }
        return color;
    }

    public void crearElectrodomestico() {
        System.out.println("Configure el electrodomestico");
        System.out.println("Ingrese el color del producto: ");
        color = comprobarColor(sc.next());
        System.out.println("Ingrese el consumo del producto: ");
        consumo = comprobarConsumoEnergetico(sc.next().toUpperCase().charAt(0));
        System.out.println("Ingrese el peso del producto");
        peso = sc.nextDouble();
        precio = 1000;
    }

    protected double precioFinal() {
        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }
        if (peso < 20) {
            precio += 100;
        }
        if (peso >= 20 && peso < 50) {
            precio += 500;
        }
        if (peso >= 50 && peso < 80) {
            precio += 800;
        }
        if (peso >= 80) {
            precio += 1000;
        }
        return precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}

 
    
    
    
    
    
    

