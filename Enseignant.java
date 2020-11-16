/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1alinfo3collections.entities;

/**
 *
 * @author ali
 */
public class Enseignant {
    private int id;
     private String nom, prenom;
    
    public Enseignant () {
        
    }
    public Enseignant (int id, String prenom, String nom ) {
        this.id=id;
        this.prenom=prenom;
        this.nom=nom;
    }
   
    public int getId() {
        return this.id;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getNom(){
        return this.nom;
    }
    
   public void setId(int id){
       this.id=id;
   }
   public void setPrenom(String prenom) {
       this.prenom=prenom;
   }
   public void setNom(){
       this.nom=nom;
   }
   public boolean equals(Object o){
         /*  if (o == null){
       return false;
           }
       if (o.getClass() != Enseignant.class){
               return false;
           }*/
   
           if (!(o instanceof Enseignant)){
    return false;
}
           final Etudiant other = (Etudiant) o;
        return this.id == other.getId();
}
   
   
   }
