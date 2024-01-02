package sanaaazza.td3;

public class exo2 {
    public static void main(String [] args){

        Point p1 = new Point(2 , 3);

        PointNom p2 = new PointNom(5, 6, 'A');

        p1.aff();
        System.out.println("==================================");
        p2.affCoordNom();
        p2.setPointNom(9, 7, 'E');
        System.out.println("=====================");
        p2.affCoordNom();
    }
}
class PointNom extends Point{
    private char nom;
    public PointNom(int x, int y, char nom){
        super(x,y);
        this.nom = nom;
    }
    public void setPointNom(int x, int y, char nom){
        super.deplace(x - this.getX(), y - this.getY());
        this.nom = nom;
    }
    public void setNom(char nom){
        this.nom = nom;
    }
    public char getNom(){
        return this.nom;
    }
    public void affCoordNom(){
        System.out.println("Point : " + this.nom + " ,est de coordonnes X = " + super.getX() + " et de Y = " + super.getY());
    }
}
