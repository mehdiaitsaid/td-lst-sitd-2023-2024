package sanaaazza.td2;

public class exo4 {


    class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    // Constructeurs
    public Temps() {
        this(0, 0, 0);
    }

    public Temps(int heures) {
        this(heures, 0, 0);
    }

    public Temps(int heures, int minutes) {
        this(heures, minutes, 0);
    }

    public Temps(int heures, int minutes, int secondes) {
        setTemps(heures, minutes, secondes);
    }



    public Temps(Temps autreTemps) {
        this(autreTemps.heures, autreTemps.minutes, autreTemps.secondes);
    }

    // Accesseurs et mutateurs
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures >= 0 && heures <= 23) {
            this.heures = heures;
        } else {
            System.out.println("Erreur : Heures doivent être entre 0 et 23.");
        }
    }

    public int getMinutes() {
        return minutes;
    }
        private void setTemps(int heures, int minutes, int secondes) {
            this.heures=heures;
            this.minutes=minutes;
            this.secondes=secondes;
        }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Erreur : Minutes doivent être entre 0 et 59.");
        }
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            System.out.println("Erreur : Secondes doivent être entre 0 et 59.");
        }
    }

    // Méthodes
    public void ajouterHeures(int heures) {
        this.heures = (this.heures + heures) % 24;
    }

    public void ajouterMinutes(int minutes) {
        this.heures = (this.heures + (this.minutes + minutes) / 60) % 24;
        this.minutes = (this.minutes + minutes) % 60;
    }

    public void ajouterSecondes(int secondes) {
        this.minutes = (this.minutes + (this.secondes + secondes) / 60) % 60;
        this.secondes = (this.secondes + secondes) % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }

}

    public void main(String[] args) {
        // Tester la classe Temps
        Temps temps1 = new Temps(12, 30, 45);
        System.out.println("Temps 1: " + temps1);

        Temps temps2 = new Temps(); // Temps par défaut (00:00:00)
        System.out.println("Temps 2: " + temps2);

        temps2.ajouterHeures(2);
        temps2.ajouterMinutes(15);
        temps2.ajouterSecondes(30);
        System.out.println("Temps 2 après ajout : " + temps2);

        Temps temps3 = new Temps(23, 45, 59);
        Temps temps4 = new Temps(temps3);

        System.out.println("Temps 3: " + temps3);
        System.out.println("Temps 4 (copie de temps3): " + temps4);
    }


}
