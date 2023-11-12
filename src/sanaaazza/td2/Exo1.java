package sanaaazza.td2;
public class Exo1 {
    class chaffeur{
        public static void main(String[] args){
            voiture voiture1 = new voiture();
           String k= voiture1.getMarque();
            System.out.println( k);
            String k1= voiture1.getModele();
            System.out.println( k1);
            String k2= voiture1.getAnnee();
            System.out.println( k2);
            double k3=  voiture1.getVitesse();
            System.out.println( k3);
            voiture1.setMarque("bmw");
            voiture1.setModele("2023");
            voiture1.setAnnee("2024");
            voiture1.setVitesse(50);
           System.out.println( voiture1.toString());

        }  }}


   class voiture{
 private String marque;
        private String modele;
        private String annee;
        private double vitesse;
       public  voiture(){}
public voiture(String marque,String modele,String anne,double vitesse){vitesse=0;
    this.marque=marque;
    this.modele=modele;
    this.annee=anne;
    this.vitesse=vitesse;

}

        public String getMarque() {
            return marque;
        }

        public String getModele() {
            return modele;
        }

        public String getAnnee() {
            return annee;
        }

        public double getVitesse() {
            return vitesse;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public void setModele(String modele) {
            this.modele = modele;
        }

        public void setAnnee(String annee) {
            this.annee = annee;
        }

        public void setVitesse(double vitesse) {
            this.vitesse = vitesse;
        }

        @Override
        public String toString() {
            return "voiture{" +
                    "marque='" + marque + '\'' +
                    ", modele='" + modele + '\'' +
                    ", annee='" + annee + '\'' +
                    ", vitesse=" + vitesse +
                    '}';
        }
        public double accelere( double v){
    this.vitesse+=5;
    return v;
        }
        public double relantir(double v){
    this.vitesse-=5;
    return v;
        }
        public void arret( ){
    if(this.vitesse==0) System.out.println("true");
    else System.out.println("false");
        }



    }


