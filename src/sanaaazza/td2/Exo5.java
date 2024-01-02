package sanaaazza.td2;

public class Exo5 {
    public class Rectangle {
        private double longueur;
        private double largeur;

        // Constructeurs
        public Rectangle() {
            this(1.0, 1.0);  // Valeurs par défaut
        }

        public Rectangle(double longueur, double largeur) {
            setLongueur(longueur);
            setLargeur(largeur);
        }

        public Rectangle(Rectangle autreRectangle) {
            this(autreRectangle.getLongueur(), autreRectangle.getLargeur());
        }

        // Accesseurs et mutateurs
        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur > 0) {
                this.longueur = longueur;
            } else {
                System.out.println("Erreur : La longueur doit être positive.");
            }
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur > 0) {
                this.largeur = largeur;
            } else {
                System.out.println("Erreur : La largeur doit être positive.");
            }
        }

        // Méthodes
        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        public double aire() {
            return longueur * largeur;
        }

        public boolean isCarre() {
            return longueur == largeur;
        }

        @Override
        public String toString() {
            return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
        }
    }
    public void main(String[] args) {
        // Tester la classe Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1: " + rectangle1);

        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle 2: " + rectangle2);

        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println("Rectangle 3 (copie de rectangle2): " + rectangle3);

        rectangle1.setLongueur(4.0);
        rectangle1.setLargeur(4.0);

        System.out.println("Rectangle 1 après modification : " + rectangle1);
        System.out.println("Périmètre de Rectangle 1: " + rectangle1.perimetre());
        System.out.println("Aire de Rectangle 1: " + rectangle1.aire());
        System.out.println("Est-ce que Rectangle 1 est un carré ? " + rectangle1.isCarre());
    }

}
