package sanaaazza.td3;

public class exo1 {

    public static void main(String[] args){
        Point p1 = new Point(2, 3);
        PointA p2 = new PointA(4, 5);

        p1.aff();
        System.out.println("==============================");
        p2.affihe();
        System.out.println("========================");
        p2.aff();
    }
}
class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //methode ajouter a partire de moi.
    public void aff(){
        System.out.println("Cordonnees : X = " + this.x + "Y = " + this.y );
    }
}

class PointA extends Point{
    public PointA(int x, int y){
        super(x, y);
    }

    public void affihe(){
        System.out.println("votre coordonne est : \n X = " + super.getX() + "et  Y = " + super.getY());
    }
}
