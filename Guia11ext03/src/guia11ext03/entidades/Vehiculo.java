/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ext03.entidades;

/**
 *
 * @author Matias
 */
public class Vehiculo {
    
    private String marca, modelo, color;
    private Tipo tipo;
    private int year,motor,chasis;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, Tipo tipo, int year, int motor, int chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.year = year;
        this.motor = motor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", year=" + year + ", motor=" + motor + ", chasis=" + chasis + '}';
    }
}
