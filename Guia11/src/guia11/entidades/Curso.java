package guia11.entidades;

public class Curso {
    
   private int año;
   private char division;
   private Profesor profesor;
   
   public Curso(){
       
   }
   
   public Profesor getProfesor(){
       return profesor;
   }
   
   public void setProfesor(Profesor p){
       this.profesor = p;
   }

    public Curso(int año, char division, Profesor profesor) {
        this.año = año;
        this.division = division;
        this.profesor = profesor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }
   
   

    
}
