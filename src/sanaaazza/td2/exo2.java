package sanaaazza.td2;

public class exo2 {
     class Point {
        private double abscisse;
        private double ordonnee;

        public Point() {
            // Constructeur par défaut
        }

        public Point(double abscisse, double ordonnee) {
            this.abscisse = abscisse;
            this.ordonnee = ordonnee;
        }

        // Getters et Setters
        public double getAbscisse() {
            return abscisse;
        }

        public void setAbscisse(double abscisse) {
            this.abscisse = abscisse;
        }

        public double getOrdonnee() {
            return ordonnee;
        }

        public void setOrdonnee(double ordonnee) {
            this.ordonnee = ordonnee;
        }

        public double norme() {
            return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        }

        public void main(String[] args) {
            Point point = new Point(3.0, 4.0);
            System.out.println("Norme du point : " + point.norme());
        }
    }
}
