package sanaaazza.td2;

public class Exo3 {
    class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

        public Livre(String titre, String auteur, double v, int i) {
        }

        // Constructeurs

    // Accesseurs et mutateurs

    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }

    public void main(String[] args) {
        Livre livre = new Livre("Titre", "Auteur", 29.99, 2022);
        System.out.println(livre);
    }
}
}
