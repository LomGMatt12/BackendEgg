package guia11.herrencia.y.polimorfismo;


public class Gato extends Animal{

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
        super();
    }
    
  
    
    @Override
    public  void  Alimentarse(){
        System.out.println("El gato se llama " + nombre + ", se alimenta de " + alimento + " tiene " + edad+ " años  y es de la raza " + raza);
    }
        
    
} 
    
   






















           /* @Override
            public void hacerRuido(){
                System.out.println("MIAU");
            }*/
        
    
    

