package sanaaazza.td3;

public class Exo4 {
    public static void main(String[] args){
        //batiment batiment1= new batiment();
        //batiment1.setAdresse("settat");
        // System.out.println(batiment1.getAdresse());
       maison m= new maison();
        m.setNbrchambre(52);
        System.out.println(m.getNbrchambre());
        System.out.println(m.toString());

    }



}
class batiment{  private String adresse;

    public batiment(){

    }
    public batiment(String adresse){
        this.adresse=adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }   }
class maison  extends batiment {
    private  int nbrchambre;
    public  maison(){}
    public maison(int nbrchambre){
        this.nbrchambre=nbrchambre;
    }
    public maison (String adresse , int nbrchambre ){
        super(adresse);
        this.nbrchambre=nbrchambre;
    }

    public int getNbrchambre() {
        return nbrchambre;
    }

    public void setNbrchambre(int nbrchambre) {
        this.nbrchambre = nbrchambre;
    }

    @Override
    public String toString() {
        return "maison{" +
                "nbrchambre=" + nbrchambre +
                '}';
    }

}
class immeuble extends batiment {
    private int nbrappartement ;
    public immeuble(){

    }
    public immeuble(int nbrappartement, String adresse){
        super(adresse);
        this.nbrappartement=nbrappartement;
    }


    public int getNbrappartement() {
        return nbrappartement;
    }

    public void setNbrappartement(int nbrappartement) {
        this.nbrappartement = nbrappartement;
    }
}

