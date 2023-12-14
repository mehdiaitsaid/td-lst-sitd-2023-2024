package td3;

public class Exo6 {
    public static void main(String[] args) {
        Disque d = new Disque(new Point(1,2), 3);
        Rectangle r = new Rectangle(5, 3);
        showDisque(d);
        showRectange(r);

        show(d);
        show(r);


    }
    static void show(Figure f){
        System.out.println("Perimeter: "+ f.getPerimeter() + " Air:"+ f.getAir());

    }

    static  void showDisque(Disque disque){
        System.out.println("Perimeter: "+ disque.getPerimeter() + " Air:"+ disque.getAir());
    }
    static  void showRectange(Rectangle  rectangle){

        System.out.println("Perimeter: "+ rectangle.getPerimeter() + " Air:"+ rectangle.getAir());

    }
}

abstract class Figure {
    String nom;

    public abstract double getPerimeter();
    public abstract double getAir();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                '}';
    }
}

class Disque extends Figure{
    Point centre;
    double rayon;

    public Disque() {
    }

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    public Disque(Point centre, double rayon,String nom) {
        this(centre,rayon);
        this.nom = nom;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*this.rayon;
    }

    @Override
    public double getAir() {
        return Math.pow(this.rayon, 2) * 3.24;
    }


}

class Rectangle extends Figure{
    double longueur;
    double largeur;

    public Rectangle() {
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle(double longueur, double largeurn, String nom) {
        this(longueur,largeurn);
        this.nom = nom;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.longueur+ this.largeur);
    }

    @Override
    public double getAir() {
        return this.longueur * this.largeur;
    }
}


class Point{
    private double x,y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
