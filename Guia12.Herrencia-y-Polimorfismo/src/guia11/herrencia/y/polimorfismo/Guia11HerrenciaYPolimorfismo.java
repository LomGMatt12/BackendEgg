package guia11.herrencia.y.polimorfismo;


public class Guia11HerrenciaYPolimorfismo {


    public static void main(String[] args) {
        
        
        //Declaracion del obejecto Perro
        Animal perro1 = new Perro("stich", "Canivoro", 15, "Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("teddy", "croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto",25, "Fino");
        caballo1.Alimentarse();
        
       
       
        
        
    }
}
        
        
        
       /**ArrayList <Animal> animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        Animal d = new Caballo();
        
        a.hacerRuido();        
        b.hacerRuido();  
        c.hacerRuido();
        d.hacerRuido();
      
        for (Animal animals : animales) {
            System.out.println(animals);
        }*/
       
        

