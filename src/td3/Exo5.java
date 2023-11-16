package td3;

public class Exo5 {
    public static void main(String[] args) {

    }
}

class Vehicule{
    private int nbrPassager;

    public Vehicule(int n) {
        this.nbrPassager = n;
    }


}

class Moto extends Vehicule{
    private int nbrRoues = 2;

    public Moto(int n, int nbrRoues) {
        super(n);
        this.nbrRoues = nbrRoues;
    }

    public Moto(int n) {
        super(n);
    }
}


class Avion extends Vehicule{
    private int nbrMoteur;

    public Avion(int nPr) {
        super(nPr);
    }

    public Avion(int nPr, int nbrMoteur) {
//        super(nPr);
        this(nPr);
        this.nbrMoteur = nbrMoteur;
    }
}

class Triporteur extends Moto {
    public Triporteur(int n) {
        super(n, 3);
    }
}
