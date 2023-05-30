package guia12.ejercicio4;


public class Circulo implements calculosFormas {

  
    
    private double area;
    private double diametro;
    private double perimetro;
    private double radio;


    public Circulo(double radio) {
        this.diametro = radio*2;
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        return area = PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return perimetro= PI*diametro;
    }
    
}
    

