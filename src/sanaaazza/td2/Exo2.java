package sanaaazza.td2;

 class Exo2 { public void main(String[] args){
  Lampe  ant = new Lampe("hv");
  ant.setNom("ahmed");

 }}

   abstract class Dispositif {
   protected String nom;
   abstract boolean aute();
   Dispositif(){}

   public String getNom() {
    return nom;
   }

   public void setNom(String nom) {
    this.nom = nom;
   }


  }
class Lampe extends Dispositif {


 @Override
 boolean aute() {
  return false;
 }

 Lampe(String nom) {
  super();
 }

 @Override
 public String getNom() {
  return super.getNom();
 }
 @Override
 public void setNom(String nom) {
  super.setNom(nom);
 }

 @Override
 public String toString() {
  return super.toString();
 }}



