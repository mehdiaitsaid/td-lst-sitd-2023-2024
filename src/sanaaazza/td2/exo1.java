package sanaaazza.td2;

public class exo1 {
    class Point {
    private char nom;
    private double abscisse;

    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void affiche() {
        System.out.println("Point " + nom + " : Abscisse = " + abscisse);
    }

    public void translate(double valeur) {
        abscisse += valeur;
    }

    public void main(String[] args) {
        Point point = new Point('A', 3.5);
        point.affiche();

        point.translate(2.0);
        point.affiche();
    }
}
}
