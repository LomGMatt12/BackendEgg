package guia12.ejercicio4;


public class Rectangulo implements calculosFormas {

    @Override
    public void perimetro() {
    }
    
    
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return area = base * altura;
    }

    public double perimetro() {
        return perimetro = (base + altura) * 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    

}
    
    
    

