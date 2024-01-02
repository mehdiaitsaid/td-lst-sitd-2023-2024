package sanaaazza.td3;

public class exo3 {
    public static void main(String [] args){
        Centre c1 = new Centre(2, 3, 'W');

        c1.affNom();
        c1.affiche();

        Cercle crl = new Cercle(1, 5, 'R', 4.0);
        crl.affiche();
        crl.affRay();
    }
}

class Centre extends PointNom{
    public  Centre(int x, int y, char nom){
        super(x,y,nom);
    }
    public void affNom(){
        System.out.println("le nom du point est : " + super.getNom());
    }
    public void affiche(){
        System.out.println("Nom du Point : " + super.getNom() + " , sa coordonnees sont : X = " + super.getX() + " , Y = " + super.getY());
    }
}

class Cercle extends Centre {
    private double rayon;
    public Cercle(int x, int y, char nom, double rayon){
        super(x,y,nom);
        this.rayon = rayon;
    }
    public void affRay(){
        System.out.println("le rayon est : R = " + this.rayon);
    }
}
