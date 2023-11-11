package td2;

public class Exo5 {
    public static void main(String[] args){
        rectangle p= new rectangle(2.5,3);
            System.out.println(p.toString());

    } }
     class rectangle {

        double longueur;
        double largeur;
        public  rectangle(){

        }
        public  rectangle(double longueur, double largeur){
            this.longueur=longueur;
            this.largeur=largeur;
        }
        public rectangle(rectangle rectangle){
           this.longueur=rectangle.getLongueur();
           this.largeur=rectangle.getLargeur();
        }

        public double getLargeur() {
            return largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLargeur(double largeur) {
            if(largeur>0)
                this.largeur = largeur;
        }

        public void setLongueur(double longueur) {
            if(longueur>0)
                this.longueur = longueur;
        }
        public double perimetre(){
            double p=2*(this.longueur+this.largeur);
            return p;
        }
        public  double air(){ double a=this.largeur*this.longueur;
            return a;}
        public void  iscarre(){

            if(this.largeur==this.longueur)
                System.out.println("true");
            else System.out.println("false");
        }

        @Override
        public String toString() {
            return "rectangle{" +
                    "longueur=" + longueur +
                    ", largeur=" + largeur +"p= "+perimetre()+"a= "+air()+
                    '}';
        }
    }


