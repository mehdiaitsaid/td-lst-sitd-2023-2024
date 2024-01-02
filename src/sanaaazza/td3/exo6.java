package sanaaazza.td3;

public class exo6 {public static void main(String [] args){

    Disque d1 = new Disque(new Point(1,3), 2, "disque1");
    Disque d2 = new Disque(new Point(4,4), 5, "disque2");
    Disque d3 = new Disque(new Point(2,2), 6, "disque3");

    System.out.println(d1.affich());

    System.out.println(d2.affich());

    System.out.println(d3.affich());

    Rectangle r1 = new Rectangle(1, 2, "rectangle1");
    Rectangle r2 = new Rectangle(3, 5, "rectangle2");
    Rectangle r3 = new Rectangle(2, 6, "rectangle3");

    System.out.println(r1.toString());
    System.out.println("========================================");
    System.out.println(r2.toString());
    System.out.println("========================================");
    System.out.println(r3.toString());
    System.out.println("========================================\n");

}
}

abstract class Figure {
    protected String nom;

    public abstract double getPerimeter();
    public abstract  double getAire();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Figure : " +
                "nom = " + nom +
                " }";
    }
}

class Disque extends figure {
    private Point centre;
    private int rayon;

    public Disque(){
    }
    public Disque(Point centre, int rayon){
        this.centre = centre;
        this.rayon = rayon;
    }
    public Disque(Point centre, int rayon,String nom){
        this(centre,rayon);
        super.nom = nom;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public String affich() {
        return "Disque { " +
                " Nom = " + super.nom +
                " Perimetre = " + this.getPerimeter() +
                " L'aire = " + this.getAire() +
                '}';
    }

}

class Rectangle extends figure {
    private double longeur;
    private double largeur;

    public Rectangle(){

    }

    public Rectangle(double longeur, double largeur){
        this.largeur= largeur;
        this.longeur = longeur;
    }

    public Rectangle(double longeur, double largeur, String nom){
        this(longeur, largeur);
        super.nom = nom;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( this.largeur + this.longeur);
    }

    @Override
    public double getAire() {
        return this.longeur * this.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle { " +
                " Nom = " + super.nom +
                " longeur = " + this.longeur +
                " largeur = " + this.largeur +
                " Perimetre = " + this.getPerimeter() +
                " L'aire = " + this.getAire() +
                '}';
    }
}
