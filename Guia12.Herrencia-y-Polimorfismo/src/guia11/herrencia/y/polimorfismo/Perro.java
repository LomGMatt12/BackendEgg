package guia11.herrencia.y.polimorfismo;


public class Perro extends Animal {
    
    
    public Perro(){
        super();
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
    
           @Override
           public void Alimentarse(){
                       System.out.println("El perro se llama " + nombre + ", se alimenta de " + alimento + " tiene " + edad+ "años" + " y es de la raza " + raza);

           } 
               
   
    
           
}



































          /** public void hacerRuido(){
                System.out.println("GUAO");
            }*/
    
        

