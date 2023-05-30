package guia12.guiapracticamao;


public interface Interface {
 
    public void metodo();
    public int sumar();
    public final int CONSTANTE = 10;
}

class Clase implements Interface{
    
    @Override
    public void metodo(){
        System.out.println("Implementacio del metodo");
        System.out.println("La constante tiene un valor de " + CONSTANTE);
        
    }
    
    @Override
    public int sumar(){
        int suma = 2 + 2;
        return suma;
    }
}
