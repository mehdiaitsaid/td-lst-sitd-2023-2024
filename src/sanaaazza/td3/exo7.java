package sanaaazza.td3;

public class exo7 {public static void main(String [] args){

    Patron patron1 = new Patron();
    Patron patron2 = new Patron("Dupont", "Jean", 5000.0);

    System.out.println(patron1);
    System.out.println("Gains du patron1 : " + patron1.gains());

    System.out.println(patron2);
    System.out.println("Gains du patron2 : " + patron2.gains());

    TravailleurCommission travailleurCommission1 = new TravailleurCommission();
    TravailleurCommission travailleurCommission2 = new TravailleurCommission("Yoji", "Itadori", 2000.0, 0.1, 100);

    System.out.println(travailleurCommission1);
    System.out.println("Gains du travailleurCommission1 : " + travailleurCommission1.gains());

    System.out.println(travailleurCommission2);
    System.out.println("Gains du travailleurCommission2 : " + travailleurCommission2.gains());

    TravailleurHoraire travailleurHoraire1 = new TravailleurHoraire();
    TravailleurHoraire travailleurHoraire2 = new TravailleurHoraire("Gojo", "Satoru", 20.0, 160);

    System.out.println(travailleurHoraire1);
    System.out.println("Gains du travailleurHoraire1 : " + travailleurHoraire1.gains());

    System.out.println(travailleurHoraire2);
    System.out.println("Gains du travailleurHoraire2 : " + travailleurHoraire2.gains());

}
}

abstract class Employee {
    private String nom;
    private String prenom;

    public Employee(){}

    public Employee(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    public abstract double gains();

}

class Patron extends Employee {
    private double salaire;

    public Patron(){}

    public Patron(String nom, String prenom, double salaire){
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Patron { " +
                ", Nom = " + super.getNom() +
                ", Prenom = " + super.getPrenom() +
                ", salaire = " + salaire +
                '}';
    }

    @Override
    public double gains() {
        return this.salaire;
    }
}

class TravailleurCommission extends Employee {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission, int quantite) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = quantite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }

    @Override
    public String toString() {
        return "TravailleurCommission { " +
                " nom = " + super.getNom()+ '\'' +
                ", prenom = " + super.getPrenom() + '\'' +
                ", salaire = " + salaire +
                ", commission = " + commission +
                ", quantite = " + quantite +
                '}';
    }
}

class TravailleurHoraire extends Employee {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
        super();
    }

    public TravailleurHoraire(String nom, String prenom, double retribution, int heures) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = heures;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                " nom = " + super.getNom() + '\'' +
                ", prenom = " + super.getPrenom() + '\'' +
                ", retribution = " + retribution +
                ", heures = " + heures +
                '}';
    }
}
