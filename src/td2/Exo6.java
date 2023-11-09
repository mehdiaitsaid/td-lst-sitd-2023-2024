package td2;

public class Exo6 {
    public static void main(String[] args) {

    }
}

class Banque{
    int NCompte;
    double solde;
    String cin;

    public Banque(int NCompte, double solde, String cin) {
        this.NCompte = NCompte;
        this.solde = solde;
        this.cin = cin;
    }

    public void diposer(double somme){
        this.solde += somme;
    }
    public boolean retirer(double somme){
        if((solde - somme)>= 0) {
            solde -= somme;
            return  true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "NCompte=" + NCompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
}
