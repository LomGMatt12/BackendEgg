package guia11.herrencia.y.polimorfismo;


public class Caballo extends Animal{
    
    public Caballo(){
        super();
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
         

        @Override
        public void Alimentarse(){
                    System.out.println("El caballo se llama " + nombre + ", se alimenta de " + alimento + " tiene " + edad+ "años" + " y es de la raza " + raza);

        }
        
}      
 






















           /* public void hacerRuido(){
                System.out.println();
            }*/
    
    

