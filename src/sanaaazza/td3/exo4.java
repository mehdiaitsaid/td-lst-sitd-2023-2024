package sanaaazza.td3;

public class exo4 {
    public static void main(String [] args){

        Batiment batiment1 = new Batiment();
        Batiment batiment2 = new Batiment("123 Rue de la Test");

        System.out.println(batiment1);
        System.out.println(batiment2);

        Maison maison1 = new Maison();
        Maison maison2 = new Maison("456 Avenue de la Maison", 3);

        System.out.println(maison1);
        System.out.println(maison2);

        Immeuble immeuble1 = new Immeuble();
        Immeuble immeuble2 = new Immeuble("789 Boulevard de l'Immeuble", 10);

        System.out.println(immeuble1);
        System.out.println(immeuble2);

    }
}

class Batiment{
    private String adresse;

    public Batiment(){

    }
    public Batiment(String adresse){
        this.adresse = adresse;
    }
    public void setAdress(String adresse){
        this.adresse = adresse;
    }
    public String getAdress(){
        return this.adresse;
    }

    @Override
    public String toString() {
        return "Batiment de : " +
                " Adresse='" + adresse ;
    }
}

class Maison extends Batiment{
    private  int nbrChambre;

    public Maison(){

    }

    public Maison(String adresse ,int nbrChambre){
        super(adresse);
        this.nbrChambre = nbrChambre;
    }

    public int getNbrChambre() {
        return nbrChambre;
    }

    public void setNbrChambre(int nbrChambre) {
        this.nbrChambre = nbrChambre;
    }

    @Override
    public String toString() {
        return "Maison : " +
                "Adress : " + super.getAdress() +
                " nbrChambre = " + nbrChambre;
    }
}

class Immeuble extends Batiment{
    private int nbAppart;

    public Immeuble(){

    }
    public Immeuble(String adresse, int nbAppart){
        super(adresse);
        this.nbAppart = nbAppart;
    }
    public void setNbAppart(int nbAppart){
        this.nbAppart = nbAppart;
    }
    public int getNbAppart(){
        return this.nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble est de : " +
                " Adresse : "+ super.getAdress() +
                " nbAppart = " + nbAppart ;
    }
}
