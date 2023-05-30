package guia11.ejercicio01;

import guia11.ejercicio01.entidades.Perro;
import guia11.ejercicio01.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guia11Ejercicio01 {

    public static void main(String[] args) {
        Perro perro1 = new Perro("pepe", "dogo", 12, 15.3);
        Perro perro2 = new Perro("pepa", "doberman", 5, 20.6);

        Persona p1 = new Persona("Carlos", "Lem", 25, 34568587);
        Persona p2 = new Persona("Cacho", "jjj", 45, 40568587);

        p1.setPerro(perro2);
        p2.setPerro(perro1);

        System.out.println(p1);
        System.out.println("-----------");
        System.out.println(p2);

        System.out.println("-------------------------------");

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        List <String> adopcion = new ArrayList();
        System.out.println("ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("ingrese su apellido");
        String apellido = teclado.nextLine();
        System.out.println("ingrese su DNI");
        long documento = teclado.nextInt();
        
        adopcion.add(nombre);
        adopcion.add(apellido);
        
        /*
        private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private boolean adopcion;   

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adopcion = true;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    @Override
    public String toString() {
        return "Perro{Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamanio: " + tamanio +"Puede adoptarse: "+adopcion+ '}';
    }
}
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
